package Page;

import Connection.ConnectionDatabase;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import static Page.dashboard_kasir.namaotomatiskais;

public class login_kasir extends javax.swing.JFrame {
    static String idkasr;
    public login_kasir() {
        initComponents();
        setTitle("LOGIN KASIR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PasswordFiled = new javax.swing.JPasswordField();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setText("Welcome to,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KASIR.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel6.setText("Login Aplikasi Sebagai");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel7.setText("Pegawai Kasir.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Jika Anda Ingin");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setText("Login Admin, ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 82, 240));
        jLabel10.setText("Klik Disini!");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel11.setText("Login. ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Username");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        idkasir.setBorder(null);
        idkasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idkasirActionPerformed(evt);
            }
        });
        jPanel1.add(idkasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 152, 170, 30));

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, -1, -1));

        PasswordFiled.setBorder(null);
        jPanel1.add(PasswordFiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 170, 20));

        kButton1.setText("Login");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton1.setkHoverColor(new java.awt.Color(133, 168, 236));
        kButton1.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton1.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 110, 40));

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel14.setText("Kembali laman");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel15.setText("Login?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(22, 82, 240));
        jLabel16.setText("Klik Disini !");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/bg_login_kasir.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        login_admin lgAdmin = new login_admin();
        lgAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void idkasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idkasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idkasirActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
//        String akses = "kasir";
//        try {
//            String sql = "SELECT * FROM user WHERE username = '" + idkasir.getText()
//            +"' AND password='" + PasswordFiled.getText()+"' AND akses ='" + akses +"'";
//            java.sql.Connection conn = (Connection)ConnectionDatabase.configDB();
//            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
//            java.sql.ResultSet rs = pst.executeQuery(sql);
//            if (rs.next()){
//                if (idkasir.getText().equals(rs.getString("username"))
//                    && PasswordFiled.getText().equals(rs.getString("password"))
////                    && HakAkses.getSelectedItem().equals(rs.getString("akses"))
//                        ) {
//                     this.idkaser=rs.getString("id_user");
//                    JOptionPane.showMessageDialog(null, "Berhasil Login");
//                    this.setVisible(false);
//                    new dashboard_kasir().setVisible(true);
//                } else {
//                    
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Hanya Untuk Hak Akses Kasir, Silahkan Masukkan Username dan Password Yang Benar");
//            }
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
        String akses = "kasir";
        try {
            String sql = "SELECT * FROM user WHERE username = '" + idkasir.getText()
                    + "' AND password='" + PasswordFiled.getText() + "' AND akses ='" + akses + "'"; //+  HakAkses.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) ConnectionDatabase.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                if (idkasir.getText().equals(rs.getString("username"))
                        && PasswordFiled.getText().equals(rs.getString("password")) //                    && HakAkses.getSelectedItem().equals(rs.getString("akses"))
                        ) {
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    this.setVisible(false);
                    new dashboard_kasir().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hanya Untuk Hak Akses Kasir, Silahkan Masukkan Username dan Password Yang Benar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        String nama;
        nama = idkasir.getText();
        namaotomatiskais.setText(nama);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        choose_login lg = new choose_login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(login_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordFiled;
    public static final javax.swing.JTextField idkasir = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
