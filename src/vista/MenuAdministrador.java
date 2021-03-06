package vista;

import java.awt.Frame;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import modelo.Usuarios;

/**
 * @web http://www.diegoacuario.blogspot.com
 * @author diegoacuario
 */
public class MenuAdministrador extends javax.swing.JFrame {

    public Usuarios u;
    public ReporteSesiones rs=null;

    /**
     * Creates new form MenuAdministrador
     *
     * @param parent
     * @param modal
     * @param u
     */
    public MenuAdministrador(Frame parent, boolean modal, Usuarios u) {
        this.u = u;
        setTitle("Bienvenido "+u.getNombres()+" "+u.getApellidos());
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        btnLab = new javax.swing.JButton();
        btnEqp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 14, 2);
        jPanel1.add(jButton1, gridBagConstraints);

        btnLab.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnLab.setText("Administrar laboratorios");
        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 14, 2);
        jPanel1.add(btnLab, gridBagConstraints);

        btnEqp.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnEqp.setText("Administrar equipos");
        btnEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 14, 2);
        jPanel1.add(btnEqp, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jButton2.setText("Reporte de sesiones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 14, 2);
        jPanel1.add(jButton2, gridBagConstraints);

        btnUser.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnUser.setText("Administrar usuarios");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 14, 2);
        jPanel1.add(btnUser, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login(0).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        this.setVisible(false);
        new RegistraLaboratorio(null, rootPaneCheckingEnabled, this).setVisible(true);
    }//GEN-LAST:event_btnLabActionPerformed

    private void btnEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqpActionPerformed
        this.setVisible(false);
        new RegistraEquipo(null, rootPaneCheckingEnabled, this).setVisible(true);
    }//GEN-LAST:event_btnEqpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        if (rs == null) {
            rs = new ReporteSesiones(null, rootPaneCheckingEnabled, this);
        }
        rs.recargarEstudiantes();
        rs.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        this.setVisible(false);
        new RegistraUsuario(null, rootPaneCheckingEnabled, this, u,null).setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                MenuEstudiante dialog = new MenuEstudiante(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEqp;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
