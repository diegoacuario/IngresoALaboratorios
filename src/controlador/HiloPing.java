/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import modelo.Equipos;
import vista.SeleccioneEquipo;

/**
 * @web http://www.diegoacuario.blogspot.com
 * @author diegoacuario
 */
public class HiloPing extends Thread {

    private SeleccioneEquipo s;
    private final FuncionesEquipo fEqp;
    private Funciones f;

    public HiloPing(SeleccioneEquipo s) {
        //s.getBotones()[0][0].setBackground(Color.blue);
        this.s = s;
        fEqp = new FuncionesEquipo();
        f = new Funciones();
    }

    @Override
    public void run() {
        while (true) {
            try {
                int c = 0;
                for (JButton[] filaBotones : s.getBotones()) {
                    for (JButton cadaBtn : filaBotones) {
                        try {
                            String texto = ((JLabel) cadaBtn.getComponent(0)).getText();
                            String ip = texto.split(" ")[3];
                            Equipos eqp = fEqp.obtieneDatosEquipo(f.obtieneJsonGet(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/ip=" + ip));
                            int estado = eqp.getEstado();
                            if (estado == 0) {
                                 cadaBtn.setBackground(Color.GREEN);
                                if (!f.ping(ip)) {
                                    String res;
                                    try {
                                        res = fEqp.editarEquipoEstado(
                                                Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/editar/",
                                                s.getEquipos()[c].getIdEquipo(), 2);
                                    } catch (Exception ex) {
                                        res = "false";
                                    }
                                    if (res.equals("true")) {
                                        cadaBtn.setBackground(Color.YELLOW);
                                        cadaBtn.setToolTipText("Equipo no disponible");
                                    }
                                }
                            } else if (estado == 1) {
                                cadaBtn.setBackground(Color.RED);
                            } else if (estado == 2) {
                                cadaBtn.setBackground(Color.YELLOW);
                            }
                            c++;
                        } catch (NullPointerException e) {
                            
                        }
                    }
                }
                sleep(2000);
            } catch (InterruptedException ex) {
               
            }
        }
    }

}
