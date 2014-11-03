package vista;

import controlador.Funciones;
import controlador.FuncionesEquipo;
import controlador.FuncionesSesiones;
import javax.swing.JOptionPane;
import modelo.Equipos;
import modelo.Sesiones;
import modelo.Usuarios;

/**
 * @web http://www.diegoacuario.blogspot.com
 * @author diegoacuario
 */
public class Menu extends javax.swing.JFrame {

    private MenuEstudiante m;
    private FuncionesSesiones fs;
    private Funciones f;
    private FuncionesEquipo fe;
    private final Usuarios u;
    private int idSesion = 0;
    private Sesiones s;

    /**
     * Creates new form NewJFrame
     *
     * @param m
     * @param u
     * @param s
     */
    public Menu(MenuEstudiante m, Usuarios u, Sesiones s, Equipos eqp) {
        this.u = u;
        fs = new FuncionesSesiones();
        fe = new FuncionesEquipo();
        f = new Funciones();
        this.s = s;
        if (s != null) {
            idSesion = s.getIdSesion();
        } else {
            String res1;

            try {
                res1 = fs.registrarSesion(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.sesiones/registro/",
                        eqp.getIdEquipo(), u.getIdUsuario());
            } catch (Exception ex) {
                res1 = "false";
            }
            if (res1.equals("false")) {
                dispose();
                new Login(0).setVisible(true);
            } else {
                String res;
                try {
                    //Poner equipo como ocupado
                    res = fe.editarEquipo(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/editar/",
                            eqp.getIdEquipo(), 1);
                } catch (Exception ex) {
                    res = "false";
                }
            }
            try {
                idSesion = Integer.parseInt(res1);
                s = new Sesiones();
                s.setIdSesion(idSesion);
                s.setIdEquipo(eqp);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Equipo no registrado");
                System.exit(0);
            }
        }
        if (m == null) {
            this.m = new MenuEstudiante(this, rootPaneCheckingEnabled, this, this.u, s);
        }
        setUndecorated(true);//quita bordes a jframe
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);//maximizado        
        setVisible(true);
        setBounds(getWidth() - 120, (getHeight() / 2) - 20, 120, 40);
        setAlwaysOnTop(true);//siempre al frente   
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jButton1.setText("Menú");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setPreferredSize(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 259, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
