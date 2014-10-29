package vista;

import controlador.Funciones;
import controlador.FuncionesEquipo;
import controlador.FuncionesLaboratorio;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import modelo.Laboratorios;

/**
 * @web http://www.diegoacuario.blogspot.com
 * @author diegoacuario
 */
public class RegistraEquipo extends javax.swing.JDialog {

    private final MenuAdministrador m;
    private final Funciones fe;
    private final FuncionesEquipo fEqp;
    private final FuncionesLaboratorio fl;

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
        fe = new Funciones();
        fEqp = new FuncionesEquipo();
        fl = new FuncionesLaboratorio();
        Laboratorios lab[] = fl.arrayToMatriz(fl.obtieneDatosLaboratorios(fe.obtieneJson(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.laboratorios/")));
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
        jButton2 = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbLaboratorios = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ip: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel1, gridBagConstraints);

        txtiP.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtiP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiPActionPerformed(evt);
            }
        });
        txtiP.addKeyListener(new java.awt.event.KeyAdapter() {
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
        jLabel3.setText("Laboratorio: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel3, gridBagConstraints);

        txtMac.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtMac.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 2;
        jPanel1.add(jButton2, gridBagConstraints);

        txtNumero.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
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
        jcbLaboratorios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jcbLaboratorios, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(678, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtiPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiPActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String reg, men = "guardados", men1 = "guardar";
        try {

            reg = fEqp.registrarEquipo(Funciones.getFileProperties("classes/confi.properties").getProperty("servicio_web") + "webresources/modelo.equipos/registro/",
                    txtiP.getText(), txtMac.getText(), Integer.parseInt(txtNumero.getText()), Integer.parseInt(jcbLaboratorios.getSelectedItem().toString().split(":")[0]));
        } catch (Exception ex) {
            System.out.println(ex);
            reg = "false";
        }
        if (reg.equals("true")) {
            JOptionPane.showMessageDialog(rootPane, "Datos " + men + " correctamente");
            dispose();
            if (m != null) {
                m.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbLaboratorios;
    private javax.swing.JTextField txtMac;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtiP;
    // End of variables declaration//GEN-END:variables
}
