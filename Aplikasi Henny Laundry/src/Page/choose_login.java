package Page;
public class choose_login extends javax.swing.JFrame {
    public choose_login() {
        initComponents();
        setTitle("PILHAN LOGIN ADMIN || KASIR");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel7.setText("Login Admin.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Apakah anda admin? jika admin");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("silahkan login dan tekan tombol.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        kButton2.setText("Login");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 104, 132));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 104, 132));
        kButton2.setkSelectedColor(new java.awt.Color(255, 104, 132));
        kButton2.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jPanel3.setBackground(new java.awt.Color(246, 246, 246));
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel10.setText("Login Kasir.");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 50, 160, 50);

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Apakah anda kasir? jika kasir");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 120, 180, 15);

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("silahkan login dan tekan login");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 140, 190, 16);

        kButton3.setText("Login");
        kButton3.setBorderPainted(false);
        kButton3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 104, 132));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 104, 132));
        kButton3.setkPressedColor(new java.awt.Color(255, 104, 132));
        kButton3.setkSelectedColor(new java.awt.Color(255, 104, 132));
        kButton3.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton3);
        kButton3.setBounds(40, 190, 160, 45);

        jLabel13.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel13.setText("Login Kasir.");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 50, 160, 50);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 230, 270));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 80, 228));
        jLabel2.setText("WELCOME LAMAN LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 290, 30));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel3.setText("PILIH LOGIN ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel4.setText("YANG SESUAI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel6.setText("PILIHAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Apakah ingin kembali ke laman utama?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, -1, -1));

        kButton1.setText("KEMBALI");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        kButton1.setkAllowTab(true);
        kButton1.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 104, 132));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 104, 132));
        kButton1.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/bg_choose_login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        login_admin lga = new login_admin();
        lga.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        login_kasir lgk = new  login_kasir();
        lgk.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        welcome_page wpg = new welcome_page();
        wpg.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(choose_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choose_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choose_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choose_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choose_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    // End of variables declaration//GEN-END:variables
}
