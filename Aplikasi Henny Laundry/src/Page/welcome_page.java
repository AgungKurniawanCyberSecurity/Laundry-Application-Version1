package Page;
public class welcome_page extends javax.swing.JFrame {
    public welcome_page() {
        initComponents();
        setTitle("WELCOME APPLICATION");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        go_home = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo_heny_laundry.png"))); // NOI18N
        jLabel3.setText("Laundry.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel4.setText("SELAMAT DATANG");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, 60));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel5.setText("APP LAUNDRY !");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Admin & Kasir Management");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        go_home.setText("GO HOME");
        go_home.setBorderPainted(false);
        go_home.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        go_home.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        go_home.setkEndColor(new java.awt.Color(22, 82, 240));
        go_home.setkHoverEndColor(new java.awt.Color(255, 65, 85));
        go_home.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        go_home.setkHoverStartColor(new java.awt.Color(255, 65, 85));
        go_home.setkPressedColor(new java.awt.Color(22, 82, 240));
        go_home.setkSelectedColor(new java.awt.Color(22, 82, 240));
        go_home.setkStartColor(new java.awt.Color(22, 82, 240));
        go_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_homeActionPerformed(evt);
            }
        });
        jPanel1.add(go_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/background_welcome.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void go_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_homeActionPerformed
        // TODO add your handling code here:
        form_login_akses clg = new form_login_akses();
        clg.setVisible(true);
        dispose();
    }//GEN-LAST:event_go_homeActionPerformed

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
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton go_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
