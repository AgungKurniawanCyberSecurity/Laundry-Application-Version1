package Page;

import Connection.ConnectionDatabase;
import static Page.dashboard_kasir.tabel_data_pelanggan;
import static Page.dashboard_kasir.tabel_data_pelanggan_2;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tambah_data_pelanggan extends javax.swing.JFrame {

    public tambah_data_pelanggan() {
        initComponents();
        tampil_data_pelanggan();
        id_otomatis_pelanggan();
        setTitle("TAMBAH DATA PELANGGAN");
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
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(113, 144, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAMBAH DATA PELANGGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
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

        field_id_pelanggan.setEnabled(false);

        field_nomor_telfon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_nomor_telfonKeyReleased(evt);
            }
        });

        kButton1.setText("Tambah");
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
                    .addComponent(field_id_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(field_nama_pelanggan)
                    .addComponent(field_alamat_pelanggan)
                    .addComponent(field_nomor_telfon)
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
                    .addComponent(field_id_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(field_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(field_alamat_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(field_nomor_telfon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

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

    void reset_pengisian_data_pelanggan() {
        field_id_pelanggan.setText("");
        field_nama_pelanggan.setText("");
        field_alamat_pelanggan.setText("");
        field_nomor_telfon.setText("");
    }

    void id_otomatis_pelanggan() {
        try {
            String sql = "SELECT * from pelanggan ORDER BY id_pelanggan DESC";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet res = st.executeQuery(sql);
            if (res.next()) {
                String Noplg = res.getString("id_pelanggan").substring(2);
                String AN = "" + (Integer.parseInt(Noplg) + 1);
                String Nol = "";
                if (AN.length() == 1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if (AN.length() == 3) {
                    Nol = "0";
                } else if (AN.length() == 4) {
                    Nol = "";
                }
                field_id_pelanggan.setText("PL" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                field_id_pelanggan.setText("PL0001");//sesuaikan dengan variable namenya
            }
            res.close();
//            con.close();
        } catch (Exception e) {
            //penanganan masalah
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String ID = field_id_pelanggan.getText();
        String Nama = field_nama_pelanggan.getText();
        String Alamat = field_alamat_pelanggan.getText();
        String noTel = field_nomor_telfon.getText();
        
        try {
              Long.parseLong(field_nomor_telfon.getText());
              if ((field_nomor_telfon.getText().length() > 13 )||(field_nomor_telfon.getText().length() < 11 ) ) {
        JOptionPane.showMessageDialog(null, "harap masukkan jumlah telfon dengan benar");
    }else{
                   try {
             String sql = "INSERT INTO pelanggan VALUES('" + ID + "', '" + Nama + "', '" + Alamat + "','" + noTel + "')";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil di tambah");
            reset_pengisian_data_pelanggan();
            tampil_data_pelanggan();
            id_otomatis_pelanggan();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di tambah");
        }
              }
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"harap masukkan no telfon dengan benar");
        }
           
    }//GEN-LAST:event_kButton1ActionPerformed
public void jumlahnotel(){
    
}
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void field_nomor_telfonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_nomor_telfonKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_field_nomor_telfonKeyReleased

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
            java.util.logging.Logger.getLogger(tambah_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_data_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_data_pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JTextField field_alamat_pelanggan = new javax.swing.JTextField();
    public static final javax.swing.JTextField field_id_pelanggan = new javax.swing.JTextField();
    public static final javax.swing.JTextField field_nama_pelanggan = new javax.swing.JTextField();
    public static final javax.swing.JTextField field_nomor_telfon = new javax.swing.JTextField();
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
