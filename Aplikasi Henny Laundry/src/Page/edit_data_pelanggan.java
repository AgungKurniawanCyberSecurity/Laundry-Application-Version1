package Page;

import Connection.ConnectionDatabase;
import static Page.dashboard_kasir.tabel_data_pelanggan;
import static Page.dashboard_kasir.tabel_data_pelanggan_2;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class edit_data_pelanggan extends javax.swing.JFrame {

    public edit_data_pelanggan() {
        initComponents();
        tampil_data_pelanggan();
        setTitle("EDIT DAT PELANGGAN");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(113, 144, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT DATA PELANGGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("ID Pelanggan");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Nama Pelanggan");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Alamat Pelanggan");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Nomor Telfon");

        edit_field_id_pelanggan.setEnabled(false);

        edit_field_nomortelfon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edit_field_nomortelfonKeyReleased(evt);
            }
        });

        kButton1.setText("Edit");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 30, 30));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 30, 30));
        kButton1.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton1.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton1.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Batal");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton2.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 30, 30));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 30, 30));
        kButton2.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton2.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton2.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit_field_id_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(edit_nama_pelanggan)
                    .addComponent(edit_field_alamat_pelanggan)
                    .addComponent(edit_field_nomortelfon)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edit_field_id_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edit_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edit_field_alamat_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edit_field_nomortelfon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tampil_data_pelanggan() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID_PELANGGAN");
        tbl.addColumn("NAMA");
        tbl.addColumn("ALAMAT");
        tbl.addColumn("NO TELFON");
        tabel_data_pelanggan.setModel(tbl);
        tabel_data_pelanggan_2.setModel(tbl);
        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();
//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from pelanggan");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_pelanggan"),
                    res.getString("nama_pelanggan"),
                    res.getString("alamat"),
                    res.getString("no_telp"),});
                tabel_data_pelanggan.setModel(tbl);
                tabel_data_pelanggan_2.setModel(tbl);
            }
            int b = tabel_data_pelanggan.getRowCount();
//            data_jumlah_pelanggan_dashboard.setText("" + b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String ID = edit_field_id_pelanggan.getText();
        String Nama = edit_nama_pelanggan.getText();
        String Alamat = edit_field_alamat_pelanggan.getText();
        String No_tel = edit_field_nomortelfon.getText();
      
        try {
             Long.parseLong(edit_field_nomortelfon.getText());
             if ((edit_field_nomortelfon.getText().length() > 13 )||(edit_field_nomortelfon.getText().length() < 11 ) ) {
        JOptionPane.showMessageDialog(null, "harap masukkan jumlah telfon dengan benar");
    }else{
            try {
             String sql = "UPDATE pelanggan SET id_pelanggan='" + ID + "',nama_pelanggan='" + Nama + "',alamat='" + Alamat + "',no_telp='" + No_tel + "'WHERE id_pelanggan='" + ID + "'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil di EDIT");
            pst.execute();
            tampil_data_pelanggan();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data GAGAL di EDIT");
        } 
             }
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "harap masukkan no telfon dengan benar");
        }
           
    }//GEN-LAST:event_kButton1ActionPerformed
public void jumlahnotel(){
    
}
    private void edit_field_nomortelfonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edit_field_nomortelfonKeyReleased
        // TODO add your handling code here  
    }//GEN-LAST:event_edit_field_nomortelfonKeyReleased

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(edit_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_data_pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JTextField edit_field_alamat_pelanggan = new javax.swing.JTextField();
    public static final javax.swing.JTextField edit_field_id_pelanggan = new javax.swing.JTextField();
    public static final javax.swing.JTextField edit_field_nomortelfon = new javax.swing.JTextField();
    public static final javax.swing.JTextField edit_nama_pelanggan = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    // End of variables declaration//GEN-END:variables
}
