package vista;

import controlador.Funciones;
import controlador.FuncionesEquipo;
import controlador.FuncionesLaboratorio;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import modelo.Equipos;
import modelo.Laboratorios;

/**
 * @web http://www.diegoacuario.blogspot.com
 * @author diegoacuario
 */
public class RegistraEquipo extends javax.swing.JDialog {

    private final MenuAdministrador m;
    private final Funciones f;
    private final FuncionesEquipo fEqp;
    private final FuncionesLaboratorio fl;
    private Equipos eqp;

    /**
     * Creates new form RegistraPersona
     *
     * @param parent
     * @param modal
     * @param m
     */
    public RegistraEquipo(java.awt.Frame parent, boolean modal, MenuAdministrador m) {
        super(parent, modal);
        this.m = m;
        this.setUndecorated(true);//quita bordes a jframe

        initComponents();
        btnEli.setVisible(false);
        f = new Funciones();
        fEqp = new FuncionesEquipo();
        fl = new FuncionesLaboratorio();
        Laboratorios lab[] = fl.arrayToMatriz(fl.obtieneDatosLaboratorios(f.obtieneJsonGet(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.laboratorios/")));
        String nomLab[] = new String[lab.length];
        for (int i = 0; i < nomLab.length; i++) {
            nomLab[i] = lab[i].getIdLaboratorio() + ": " + lab[i].getNombre();
        }
        jcbLaboratorios.setModel(new DefaultComboBoxModel(nomLab));
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita cerra jframe con ALT+C
        this.setAlwaysOnTop(true);//siempre al frente       
        //nueva instancia de Bloquea pasando como parametros e este JFrame
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtiP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMac = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbLaboratorios = new javax.swing.JComboBox();
        jcbEstado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnEli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ip: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel1, gridBagConstraints);

        txtiP.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtiP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtiPFocusLost(evt);
            }
        });
        txtiP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtiPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtiPKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtiP, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("MAC: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estado: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel3, gridBagConstraints);

        txtMac.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtMac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMacKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtMac, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        jPanel1.add(jButton1, gridBagConstraints);

        btnGuardar.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 2;
        jPanel1.add(btnGuardar, gridBagConstraints);

        txtNumero.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtNumero, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Número: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel4, gridBagConstraints);

        jcbLaboratorios.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jcbLaboratorios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lab1", "lab2" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(jcbLaboratorios, gridBagConstraints);

        jcbEstado.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "No disponible" }));
        jcbEstado.setSelectedIndex(2);
        jcbEstado.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(jcbEstado, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Laboratorio: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel5, gridBagConstraints);

        btnEli.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnEli.setText("Bloquear");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(btnEli, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(678, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtiPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiPKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9') && c != '.') || txtiP.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtiPKeyTyped

    private void txtMacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMacKeyTyped
        char c = evt.getKeyChar();
        c = (c + "").toUpperCase().charAt(0);
        if (((c < 'A' || c > 'F') && (c < '0' || c > '9')) || txtMac.getText().length() >= 12) {
            evt.consume();
        }

    }//GEN-LAST:event_txtMacKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String reg, men = "guardados", men1 = "guardar";
        int numero = Integer.parseInt(txtNumero.getText());
        try {
            if (btnGuardar.getText().equals("Guardar")) {
                int estado = jcbEstado.getSelectedIndex();
                reg = fEqp.registrarEquipo(
                        Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/registro/",
                        txtiP.getText(),
                        txtMac.getText(),
                        numero,
                        Integer.parseInt(jcbLaboratorios.getSelectedItem().toString().split(":")[0]),
                        estado
                );

            } else {
                men = "actualizados";
                men1 = "actualizar";
                reg = fEqp.editarEquipoDatos(
                        Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/editarEquipoDatos/",
                        eqp.getIdEquipo(),
                        jcbEstado.getSelectedIndex(),
                        txtMac.getText(),
                        txtiP.getText(),
                        Integer.parseInt(jcbLaboratorios.getSelectedItem().toString().split(":")[0]),
                        numero);
            }

        } catch (Exception ex) {
            reg = ex + "";
        }
        switch (reg) {
            case "true":
                int x = JOptionPane.showConfirmDialog(rootPane, "Datos " + men + " correctamente,"
                        + "\ndesea salir de la administración de equipos.");
                if (x == 0) {
                    dispose();
                    if (m != null) {
                        m.setVisible(true);
                    }
                } else {
                    ((Component) evt.getSource()).transferFocus();
                }
                break;
            case "false":
                int y = JOptionPane.showConfirmDialog(rootPane, "No se pudo " + men1 + " la información,"
                        + "\ndesea salir de la administración de equipos.");
                if (y == 0) {
                    dispose();
                    if (m != null) {
                        m.setVisible(true);
                    }
                } else {
                    ((Component) evt.getSource()).transferFocus();
                }
                break;
            default:
                System.out.println(reg);
                break;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtiPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiPKeyReleased
        char c = evt.getKeyChar();
        String ip = txtiP.getText();
        if (c == 10) {
            eqp = fEqp.obtieneDatosEquipo(f.obtieneJsonGet(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/ip=" + ip));
            if (eqp != null) {
                if (eqp.getBloqueado() == 0) {
                    btnEli.setText("Bloquear");
                } else {
                    btnEli.setText("Desbloquear");
                }
                btnEli.setVisible(true);
                btnGuardar.setText("Actualizar");
                jcbEstado.setSelectedIndex(eqp.getEstado());
                jcbLaboratorios.setSelectedItem(eqp.getIdLaboratorio().getIdLaboratorio() + ": " + eqp.getIdLaboratorio().getNombre() + "");
                txtMac.setText(eqp.getMac());
                txtNumero.setText(eqp.getNumero() + "");
            } else {
                btnEli.setVisible(false);
                boolean ping = f.ping(ip);
                if (ping) {
                    jcbEstado.setSelectedIndex(0);
                } else {
                    jcbEstado.setSelectedIndex(2);
                }
                btnGuardar.setText("Guardar");
                txtMac.setText("");
                txtNumero.setText("");
                jcbLaboratorios.setSelectedIndex(0);
            }

        }
    }//GEN-LAST:event_txtiPKeyReleased

    private void txtMacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMacKeyReleased
        txtMac.setText(txtMac.getText().toUpperCase());
    }//GEN-LAST:event_txtMacKeyReleased

    private void txtiPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtiPFocusLost
        if (getContentPane().isVisible()) {
            String ip = txtiP.getText();
            eqp = fEqp.obtieneDatosEquipo(f.obtieneJsonGet(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/ip=" + ip));
            if (eqp != null) {
                if (eqp.getBloqueado() == 0) {
                    btnEli.setText("Bloquear");
                } else {
                    btnEli.setText("Desbloquear");
                }
                btnEli.setVisible(true);
                btnGuardar.setText("Actualizar");
                jcbEstado.setSelectedIndex(eqp.getEstado());
                jcbLaboratorios.setSelectedItem(eqp.getIdLaboratorio().getIdLaboratorio() + ": " + eqp.getIdLaboratorio().getNombre() + "");
                txtMac.setText(eqp.getMac());
                txtNumero.setText(eqp.getNumero() + "");
            } else {
                btnEli.setVisible(false);
                boolean ping = f.ping(ip);
                if (ping) {
                    jcbEstado.setSelectedIndex(0);
                } else {
                    jcbEstado.setSelectedIndex(2);
                }
                btnGuardar.setText("Guardar");
                txtMac.setText("");
                txtNumero.setText("");
                jcbLaboratorios.setSelectedIndex(0);
            }
        }

    }//GEN-LAST:event_txtiPFocusLost

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        String valor = "desbloque";
        if (btnEli.getText().equals("Bloquear")) {
            valor = "bloque";
        }
        int x = JOptionPane.showConfirmDialog(rootPane, "Seguro desea " + valor + "ar el equipo con ip:\n" + eqp.getIp());

        if (x == 0) {

            if (x == 0) {
                String url = Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/" + valor + "ar/" + eqp.getIp();
                String val = f.obtieneTexto(url);
                if (val.equals("true")) {
                    JOptionPane.showMessageDialog(rootPane, "Equipo " + valor + "ado correctamente");
                    btnEli.setVisible(false);
                    txtMac.setText("");
                    txtNumero.setText("");
                    btnGuardar.setText("Guardar");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo " + valor + "ar el equipo");
                }
            }

        }
    }//GEN-LAST:event_btnEliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbEstado;
    private javax.swing.JComboBox jcbLaboratorios;
    private javax.swing.JTextField txtMac;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtiP;
    // End of variables declaration//GEN-END:variables
}
