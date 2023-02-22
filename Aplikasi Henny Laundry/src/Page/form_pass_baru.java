package Page;

import Connection.ConnectionDatabase;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import javax.swing.JOptionPane;

public class form_pass_baru extends javax.swing.JFrame {

    public form_pass_baru() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        username = new javax.swing.JPasswordField();
        confirm = new javax.swing.JPasswordField();
        jk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/left-arrow_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 34, -1, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Password Baru");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Masukkan Password Baru");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Dan Masukkan Ulang Pada Field Confirm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 230, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/padlock (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/padlock.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        kButton1.setText("Simpan Perubahan");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton1.setkAllowTab(true);
        kButton1.setkBackGroundColor(new java.awt.Color(255, 0, 51));
        kButton1.setkEndColor(new java.awt.Color(255, 0, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton1.setkPressedColor(new java.awt.Color(255, 0, 51));
        kButton1.setkSelectedColor(new java.awt.Color(255, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(255, 0, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 280, 40));

        username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username.setText("mmmmmmmmmm");
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 442, 220, 30));

        confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm.setText("mmmmmmmmmm");
        confirm.setBorder(null);
        confirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmFocusLost(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 220, 30));

        jk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/Desktop - 4Form new password3.png"))); // NOI18N
        jPanel1.add(jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));
        jPanel1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 270, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        form_reset_password_1 rp = new form_reset_password_1();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        if (username.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password Tidak Boleh Lebih Sedikit Dari 8 Karakter !");
        } else if (username.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Password Tidak Boleh Lebih Dari 15 Karakter !");
        } else if ((username.getText().length() >= 8) && (username.getText().length() <= 15)) {
            if (!confirm.getText().equals(username.getText())) {
                JOptionPane.showMessageDialog(null, "Konfirmasi Password Salah, Harap Diteliti Kembali !");
            } else {
                try {
                    String sql = "UPDATE user SET password='" + confirm.getText() + "' where username='" + j.getText() + "'";
                    java.sql.Connection con = (java.sql.Connection) ConnectionDatabase.configDB();
                    PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                    JOptionPane.showMessageDialog(null, "Password Berhasil diubah");
                    pst.execute();
                    form_login_akses lgk = new form_login_akses();
                    lgk.setVisible(true);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if (username.getText().equals("mmmmmmmmmm")) {
            username.setText("");
            username.setForeground(Color.black);
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        if (username.getText().equals("")) {
            username.setText("mmmmmmmmmm");
            username.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void confirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFocusGained
        // TODO add your handling code here:
        if (confirm.getText().equals("mmmmmmmmmm")) {
            confirm.setText("");
            confirm.setForeground(Color.black);
        }
    }//GEN-LAST:event_confirmFocusGained

    private void confirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFocusLost
        // TODO add your handling code here:
        if (confirm.getText().equals("")) {
            confirm.setText("mmmmmmmmmm");
            confirm.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_confirmFocusLost

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
            java.util.logging.Logger.getLogger(form_pass_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_pass_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_pass_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_pass_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pass_baru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirm;
    public static final javax.swing.JTextField j = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jk;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JPasswordField username;
    // End of variables declaration//GEN-END:variables
}
