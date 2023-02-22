package Page;
import Connection.ConnectionDatabase;
import static Page.dashboard_admin.loginAdmin;
import static Page.dashboard_admin.nameAdminLogin2;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
public class login_admin extends javax.swing.JFrame {
    public login_admin() {
        initComponents();
        setTitle("LOGIN ADMIN");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        UsernameFiled = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(155, 128, 245));
        jLabel10.setText("Welcome");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 82, 240));
        jLabel4.setText("FORM LOGIN ADMIN.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 35)); // NOI18N
        jLabel5.setText("Login Aplikasi Sebagai");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 35)); // NOI18N
        jLabel6.setText("Seorang Admin.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 35)); // NOI18N
        jLabel7.setText("Seorang Admin.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Jika anda ingin Login ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setText("Jika anda ingin Login ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel11.setText("Seorang Kasir");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(22, 82, 240));
        jLabel12.setText("Login disini !");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 110, 20));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel13.setText("Login.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, -1, -1));

        UsernameFiled.setBackground(new java.awt.Color(245, 245, 245));
        UsernameFiled.setForeground(new java.awt.Color(102, 102, 102));
        UsernameFiled.setBorder(null);
        UsernameFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFiledActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameFiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 180, 40));

        PasswordField.setBackground(new java.awt.Color(245, 245, 245));
        PasswordField.setBorder(null);
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 180, 40));

        kButton1.setText("LOGIN");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton1.setkBorderRadius(45);
        kButton1.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton1.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton1.setkIndicatorColor(new java.awt.Color(133, 168, 236));
        kButton1.setkPressedColor(new java.awt.Color(133, 168, 236));
        kButton1.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 220, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Kembali kelaman pilihan Login?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("klik disini !");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/bg_login_admin.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code heree
        login_kasir lgk = new login_kasir();
        lgk.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void UsernameFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFiledActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String akses = "admin";
        try {
            String sql = "SELECT * FROM user WHERE username = '" + UsernameFiled.getText()
            +"' AND password='" + PasswordField.getText()+"' AND akses ='" + akses + "'"; //+  HakAkses.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)ConnectionDatabase.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()){
                if (UsernameFiled.getText().equals(rs.getString("username"))
                    && PasswordField.getText().equals(rs.getString("password"))
//                    && HakAkses.getSelectedItem().equals(rs.getString("akses"))
                        ){
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    this.setVisible(false);
                    new dashboard_admin().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hanya Untuk Hak Akses Admin, Silahkan Masukkan Username dan Password Yang Benar");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        String nama;
        nama = UsernameFiled.getText();
        loginAdmin.setText(nama);
        nameAdminLogin2.setText(nama);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        choose_login clg = new choose_login();
        clg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered

    }//GEN-LAST:event_jLabel3MouseEntered

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
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameFiled;
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
    private com.k33ptoo.components.KButton kButton1;
    // End of variables declaration//GEN-END:variables
}
