
/**
 *
 * @author UsuariO
 */
public class TelaCalc extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalc
     */
    public TelaCalc() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnZero = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnVirg = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnPorcent = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora Java");

        jPanel1.setForeground(new java.awt.Color(255, 0, 51));

        btnZero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zerrrooooo.png"))); // NOI18N
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ummm.png"))); // NOI18N
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dois.png"))); // NOI18N
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tres.png"))); // NOI18N

        btnQuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quatro.png"))); // NOI18N

        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seis.png"))); // NOI18N

        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cinco.png"))); // NOI18N

        btnSete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sete.png"))); // NOI18N

        btnOito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oito.png"))); // NOI18N

        btnNove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nove.png"))); // NOI18N

        btnVirg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/virgula.png"))); // NOI18N

        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resultado.png"))); // NOI18N

        btnMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // NOI18N

        btnMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menos.png"))); // NOI18N

        btnVezes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xisao.png"))); // NOI18N

        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dividir.png"))); // NOI18N

        btnPorcent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porcento.png"))); // NOI18N

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVirg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPorcent, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnDividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPorcent, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnOito)
                                    .addComponent(btnNove))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(btnTres))
                        .addComponent(btnDois))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnVirg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        txtNumero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNumero.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
        int z = 0;
        txtNumero.setText(integer.toString(z));
        
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        // TODO add your handling code here:
        int um = 1;
        txtNumero.setText(Integer.toString(um));
    }//GEN-LAST:event_btnUmActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPorcent;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnVezes;
    private javax.swing.JButton btnVirg;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtNumero;
    // End of variables declaration//GEN-END:variables
}
