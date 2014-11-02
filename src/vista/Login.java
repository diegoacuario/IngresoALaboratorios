package vista;

import controlador.Funciones;
import controlador.FuncionesUsuario;
import controlador.Hilo;
import java.awt.Component;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import javax.swing.JButton;
import modelo.Bloquea;
import javax.swing.JOptionPane;
import modelo.Usuarios;

/**
 * @web http://www.diegoacuario.blogspot.com
 * @author diegoacuario
 */
public final class Login extends javax.swing.JFrame {

    public final Properties fileConfig;
    private final String ip;
    private Usuarios u;
    private String thisIp = null;
    private String rest = null;
    private String ipServicioWeb = null;
    private Hilo hiloVerificaSesiones = null;
    private int x = 0;
    boolean isConected = false;
    private Funciones f;

    /**
     * Creates new form jFrameBlocked
     */
    public Login() {
        f = new Funciones();
        fileConfig = Funciones.getFileProperties("classes/confi.properties");
        this.ip = fileConfig.getProperty("ip_servidor");
        this.rest = fileConfig.getProperty("servicio_web");

        this.setUndecorated(true);//quita bordes a jframe

        try {
            thisIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {

        }
        initComponents();
        conectar();

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita cerra jframe con ALT+C
        this.setExtendedState(MAXIMIZED_BOTH);//maximizado
        this.setAlwaysOnTop(true);//siempre al frente       
        //nueva instancia de Bloquea pasando como parametros e este JFrame
        new Bloquea(this).block();

    }

    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public void setBtnEntrar(JButton btnEntrar) {
        this.btnEntrar = btnEntrar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public void conectar() {
        int port;
        try {
            port = Integer.parseInt(rest.split("/")[2].split(":")[1]);
        } catch (Exception e) {
            port = 80;
        }
        ipServicioWeb = rest.split("/")[2].split(":")[0];
        hiloVerificaSesiones = new Hilo(thisIp, this, null, ipServicioWeb, port);
        hiloVerificaSesiones.start();
        if (!ip.equals(thisIp)) {
            btnRegistrar.setVisible(false);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cédula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 10, 3);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel2.setText("Contraseña: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 10, 3);
        jPanel2.add(jLabel2, gridBagConstraints);

        txtCedula.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtCedula.setPreferredSize(new java.awt.Dimension(200, 32));
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 10, 22);
        jPanel2.add(txtCedula, gridBagConstraints);

        btnSalir.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 40, 8);
        jPanel2.add(btnSalir, gridBagConstraints);

        btnEntrar.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 40, 8);
        jPanel2.add(btnEntrar, gridBagConstraints);

        btnRegistrar.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 40, 8);
        jPanel2.add(btnRegistrar, gridBagConstraints);

        txtClave.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 10, 22);
        jPanel2.add(txtClave, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        new ClaveUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (txtCedula.getText().length() == 10 && !txtClave.getText().isEmpty() && btnEntrar.isEnabled()) {
            FuncionesUsuario fu = new FuncionesUsuario();
            String url = fileConfig.getProperty("servicio_web") + "webresources/modelo.usuarios/cedula=" + txtCedula.getText() + ",clave=" + txtClave.getText();
            String json = f.obtieneJson(url);
            System.out.println(json);
            if (json.charAt(0) == '{') {
                u = fu.obtieneDatosUsuario(json);
                if (u != null) {
                    hiloVerificaSesiones.stop();
                    if (u.getRolUsuario() == 1) {
                        dispose();
                        MenuAdministrador m = new MenuAdministrador(this, rootPaneCheckingEnabled, u);
                        m.setVisible(true);
                    } else {
                        if (ip.equals(thisIp)) {
                            SeleccioneLaboratorio d = new SeleccioneLaboratorio(u);
                            d.setVisible(true);
                            this.dispose();
                        } else {
                            Menu m = new Menu(null, u, null);
                            m.setVisible(true);
                            this.dispose();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña erróneos");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Servidor web no esta levantado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña erróneos");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistraUsuario(this, rootPaneCheckingEnabled, null, u).setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        int c = evt.getKeyChar();
        if (txtCedula.getText().length() == 10 && c == 10 && !txtClave.getText().isEmpty() && btnEntrar.isEnabled()) {
            FuncionesUsuario fu = new FuncionesUsuario();
            String url = fileConfig.getProperty("servicio_web") + "webresources/modelo.usuarios/cedula=" + txtCedula.getText() + ",clave=" + txtClave.getText();
            u = fu.obtieneDatosUsuario(f.obtieneJson(url));
            if (u != null) {
                hiloVerificaSesiones.stop();
                if (u.getRolUsuario() == 1) {
                    dispose();
                    MenuAdministrador m = new MenuAdministrador(this, rootPaneCheckingEnabled, u);
                    m.setVisible(true);
                } else {
                    if (ip.equals(thisIp)) {
                        SeleccioneLaboratorio d = new SeleccioneLaboratorio(u);
                        d.setVisible(true);
                        this.dispose();
                    } else {
                        Menu m = new Menu(null, u, null);
                        m.setVisible(true);
                        this.dispose();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña erróneos");
            }
        }
    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if (txtCedula.getText().length() == 9) {
            txtCedula.setText(f.completaDecimoDig(txtCedula.getText()));
            ((Component) evt.getSource()).transferFocus();
        }
        char c = evt.getKeyChar();
        if (txtCedula.getText().length() == 10 && c == 10 && !txtClave.getText().isEmpty()) {
            if (x == 2) {
                x = 0;
            }
            FuncionesUsuario fu = new FuncionesUsuario();
            String url = fileConfig.getProperty("servicio_web") + "webresources/modelo.usuarios/cedula=" + txtCedula.getText() + ",clave=" + txtClave.getText();
            u = fu.obtieneDatosUsuario(f.obtieneJson(url));
            if (u != null) {
                hiloVerificaSesiones.stop();
                if (u.getRolUsuario() == 1) {
                    dispose();
                    MenuAdministrador m = new MenuAdministrador(this, rootPaneCheckingEnabled, u);
                    m.setVisible(true);
                } else {
                    if (ip.equals(thisIp)) {
                        SeleccioneLaboratorio d = new SeleccioneLaboratorio(u);
                        d.setVisible(true);
                        this.dispose();
                    } else {
                        Menu m = new Menu(null, u, null);
                        m.setVisible(true);
                        this.dispose();
                    }
                }
            } else {
                if (x == 1) {
                    x = 2;
                }
                if (c == 10 && x == 0) {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña erróneos");
                    x = 1;
                }
            }
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) || txtCedula.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost

    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusGained

    }//GEN-LAST:event_txtCedulaFocusGained

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtClave;
    // End of variables declaration//GEN-END:variables
}
