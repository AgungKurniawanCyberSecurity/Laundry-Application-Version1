package Page;

import Connection.ConnectionDatabase;
import static Page.dashboard_kasir.jumlah_transaksi;
import static Page.dashboard_kasir.lpr_transksi;
import static Page.dashboard_kasir.table_data_transaksi;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.awt.Color;

public class form_lanjut_transaksi extends javax.swing.JFrame {

    DefaultTableModel modelpj;
    public int thotal;
    public int tot_brg;
    ArrayList<String> idlist = new ArrayList<String>();

    public form_lanjut_transaksi() {
        initComponents();
        tampil_data_barang();
        tampil_data_penjualan();
        kd_transaksi_otomatis();
        idkry();
        idplg();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_penjualan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        field_keterangan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        field_jumlah_barang = new javax.swing.JTextField();
        field_harga_paket = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        field_subtotal = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        field_bayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        field_total_harga = new javax.swing.JTextField();
        kButton4 = new com.k33ptoo.components.KButton();
        jLabel10 = new javax.swing.JLabel();
        field_status_bayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        field_sisa_bayar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        field_kembalian = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        field_kode_nota = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        field_id_kasir = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        field_id_pelanggan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        kButton5 = new com.k33ptoo.components.KButton();
        combox_status_ambil = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel3.setText("Form Transaksi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_barang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 390, 160));

        tabel_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabel_penjualan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 100, 530, 160));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Harga Paket :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Keterangan Barang :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        field_keterangan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_keterangan.setForeground(new java.awt.Color(204, 204, 204));
        field_keterangan.setText("Masukkan Keterangan");
        field_keterangan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_keterangan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_keteranganFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_keteranganFocusLost(evt);
            }
        });
        jPanel1.add(field_keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Jumlah Paket :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        field_jumlah_barang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_jumlah_barang.setForeground(new java.awt.Color(204, 204, 204));
        field_jumlah_barang.setText("Masukkan Jumlah Barang");
        field_jumlah_barang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_jumlah_barangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_jumlah_barangFocusLost(evt);
            }
        });
        jPanel1.add(field_jumlah_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 170, -1));

        field_harga_paket.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_harga_paket.setText("0");
        field_harga_paket.setEnabled(false);
        field_harga_paket.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_harga_paketFocusGained(evt);
            }
        });
        jPanel1.add(field_harga_paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, -1));

        kButton1.setText("Hitung Subtotal Barang");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton1.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 0, 51));
        kButton1.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton1.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton1.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 300, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Subtotal Harga :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        field_subtotal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_subtotal.setText("0");
        field_subtotal.setEnabled(false);
        jPanel1.add(field_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 170, -1));

        kButton2.setText("Tambahkan Barang");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton2.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 0, 51));
        kButton2.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton2.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton2.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 140, 30));

        kButton3.setText("Hapus Barang");
        kButton3.setBorderPainted(false);
        kButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton3.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 0, 51));
        kButton3.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton3.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton3.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 150, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Pembayaran :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        field_bayar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_bayar.setForeground(new java.awt.Color(204, 204, 204));
        field_bayar.setText("Masukkan Bayar Pelanggan");
        field_bayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_bayarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_bayarFocusLost(evt);
            }
        });
        jPanel1.add(field_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 170, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Total Harga Barang :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        field_total_harga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_total_harga.setText("0");
        field_total_harga.setEnabled(false);
        jPanel1.add(field_total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 170, -1));

        kButton4.setText("Bayar");
        kButton4.setBorderPainted(false);
        kButton4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton4.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton4.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 0, 51));
        kButton4.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton4.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton4.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 290, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Status Bayar :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        field_status_bayar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_status_bayar.setText("Ditentukan Ketika Bayar");
        field_status_bayar.setEnabled(false);
        jPanel1.add(field_status_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 170, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Sisa Harus Bayar :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        field_sisa_bayar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_sisa_bayar.setText("0");
        field_sisa_bayar.setEnabled(false);
        jPanel1.add(field_sisa_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 170, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Kembalian :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        field_kembalian.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_kembalian.setText("0");
        field_kembalian.setEnabled(false);
        jPanel1.add(field_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 170, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setText("Kode Transaksi :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        field_kode_nota.setEnabled(false);
        jPanel1.add(field_kode_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 130, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("ID Kasir :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        field_id_kasir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_id_kasir.setEnabled(false);
        jPanel1.add(field_id_kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 130, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setText("ID Pelanggan :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        field_id_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_id_pelanggan.setEnabled(false);
        jPanel1.add(field_id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 130, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Status Ambil :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        kButton5.setText("Simpan Transaksi");
        kButton5.setBorderPainted(false);
        kButton5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton5.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton5.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(255, 0, 51));
        kButton5.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton5.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton5.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 580, 30));

        combox_status_ambil.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combox_status_ambil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "belum di ambil" }));
        combox_status_ambil.setEnabled(false);
        jPanel1.add(combox_status_ambil, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/Desktop - 4form lanjut transaksi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tampil_data_penjualan() {

        String[] judul = {"ID", "Nama paket", "Harga", "jumlah", " subtotal", "keterangan"};
        modelpj = new DefaultTableModel(judul, 0);
        tabel_penjualan.setModel(modelpj);
    }

    public void lprtrs() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode struk");
        tbl.addColumn("Nama pelanggan");
        tbl.addColumn("no telfon");
        tbl.addColumn("id kasir");
        tbl.addColumn("nama paket");
        tbl.addColumn("harga paket");
        tbl.addColumn("jumlah yang di pesan");
        tbl.addColumn("subtotal");
        tbl.addColumn("tanggal masuk");
        tbl.addColumn("tanggal keluar");
        tbl.addColumn("total harga");
        tbl.addColumn("bayar");
        tbl.addColumn("kembalian");
        tbl.addColumn("keterangan");
        lpr_transksi.setModel(tbl);

        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();
//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tbl_order join pelanggan on pelanggan.id_pelanggan=tbl_order.id_pelanggan join user on user.id_user=tbl_order.id_user "
                    + "join tbl_detail_order on tbl_order.kode_order=tbl_detail_order.kode_order join paket on paket.kd_paket=tbl_detail_order.kd_paket");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("kode_order"),
                    res.getString("nama_pelanggan"),
                    res.getString("no_telp"),
                    res.getString("id_user"),
                    res.getString("nama_paket"),
                    res.getString("harga"),
                    res.getString("qty"),
                    res.getString("subtotal"),
                    res.getString("tgl_pesan"),
                    res.getString("tgl_selesai"),
                    res.getString("grand_total"),
                    res.getString("bayar"),
                    res.getString("kembalian"),
                    res.getString("keterangan"),});
                lpr_transksi.setModel(tbl);
            }
//            int b = table.getRowCount();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void tampil_datatabel_datatransaksi() {
        String sts="belum di ambil";
        DefaultTableModel tbl = new DefaultTableModel();

        tbl.addColumn("kode struk");
        tbl.addColumn("id pelanggan");
        tbl.addColumn("Nama pelanggan");
        tbl.addColumn("id kasir");
        tbl.addColumn("nama kasir");
        tbl.addColumn("tanggal pesan");
        tbl.addColumn("tanggal selesai");
        tbl.addColumn("Grand total");
        tbl.addColumn("bayar");
        tbl.addColumn("kurang bayar");
        tbl.addColumn("status bayar");
        tbl.addColumn("Kembalian");
        tbl.addColumn("Status ambil");
        tbl.addColumn("musim");
        table_data_transaksi.setModel(tbl);

        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tbl_order join pelanggan on pelanggan.id_pelanggan=tbl_order.id_pelanggan join user on user.id_user=tbl_order.id_user where tbl_order.status_ambil='" + sts+"'");

            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("kode_order"),
                    res.getString("id_pelanggan"),
                    res.getString("nama_pelanggan"),
                    res.getString("id_user"),
                    res.getString("nama"),
                    res.getString("tgl_pesan"),
                    res.getString("tgl_selesai"),
                    res.getString("grand_total"),
                    res.getString("bayar"),
                    res.getString("kurang_bayar"),
                    res.getString("status_bayar"),
                    res.getString("kembalian"),
                    res.getString("status_ambil"),});
                table_data_transaksi.setModel(tbl);
            }
            int b = table_data_transaksi.getRowCount();
            jumlah_transaksi.setText("" + b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void kd_transaksi_otomatis() {
        try {

            String sql = "SELECT * from tbl_order ORDER BY kode_order DESC";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet res = st.executeQuery(sql);
            if (res.next()) {
                String NoJual = res.getString("kode_order").substring(2);
                String AN = "" + (Integer.parseInt(NoJual) + 1);
//                String AN = "" + (Integer.parseInt(txt_idsupplier.getText()) + 1);
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
                field_kode_nota.setText("TR" + Nol + AN);//sesuaikan dengan variable namenya
//                jTextField1.setText("TR" + Nol + AN);
            } else {
                field_kode_nota.setText("TR0001");//sesuaikan dengan variable namenya
//                jTextField1.setText("TR0001");
            }
            res.close();
//            con.close();
        } catch (Exception e) {
            //penanganan masalah
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void reset_pengisian_transaksi() {
        int row = tabel_penjualan.getSelectedRow();//0
        idlist.remove(row);
        modelpj.removeRow(row);
        _settotal();
        field_kode_nota.setText("");
        field_status_bayar.setText("");
        field_total_harga.setText("");
        field_bayar.setText("");
        field_kembalian.setText("");
        field_sisa_bayar.setText("");
//        field_tanggal_selesai.setText("");
    }

    public void tampil_data_barang() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode paket");
        tbl.addColumn("NAMA paket");
        tbl.addColumn("jenis paket");
        tbl.addColumn("harga");
        tabel_barang.setModel(tbl);

        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from paket");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("kd_paket"),
                    res.getString("nama_paket"),
                    res.getString("jenis_paket"),
                    res.getString("harga")
                });
                tabel_barang.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void reset_nambah_krj() {
        field_subtotal.setText("");
        field_keterangan.setText("");
        field_jumlah_barang.setText("");
        field_harga_paket.setText("");

    }

    public void resetkrj() {
        //untuk menghapus data keranjang setelah menambah ke keranjang

        DefaultTableModel model = (DefaultTableModel) tabel_penjualan.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);

        }

    }

    public void idkry() {
        String id = form_login_akses.idkaser;
        field_id_kasir.setText(id);
    }

    private void _settotal() {
        int total_pjl = 0;
        int row = tabel_penjualan.getRowCount();
        int tuotal = 0;
        for (int i = 0; i < row; i++) {
            int sb = Integer.parseInt(tabel_penjualan.getValueAt(i, 4).toString()); //22000
            int tot = Integer.parseInt(tabel_penjualan.getValueAt(i, 3).toString());
            tuotal = tuotal + (sb);
            total_pjl = total_pjl + tot;
            //subtotal = 15000 + (23*11)
            //subtotal = 15000 + 253
            //subtotal = 15253
            //subtotal = 15253 + (22000*11)
            //subtotal = 15253 + 242000
            //subtotal = 257253
        }
        this.tot_brg = total_pjl;
        this.thotal = tuotal;
        field_total_harga.setText(String.valueOf(this.thotal));

    }

    public void idplg() {
        String idpl = dashboard_kasir.selected_pelanggan_id;
        field_id_pelanggan.setText(idpl);
    }
    private void field_harga_paketFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_harga_paketFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_field_harga_paketFocusGained

    private void field_keteranganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_keteranganFocusGained
        // TODO add your handling code here:
        if (field_keterangan.getText().equals("Masukkan Keterangan")) {
            field_keterangan.setText("");
            field_keterangan.setForeground(Color.black);
        }
    }//GEN-LAST:event_field_keteranganFocusGained

    private void field_keteranganFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_keteranganFocusLost
        // TODO add your handling code here:
        if (field_keterangan.getText().equals("")) {
            field_keterangan.setText("Masukkan Keterangan");
            field_keterangan.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_field_keteranganFocusLost

    private void field_jumlah_barangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_jumlah_barangFocusGained
        // TODO add your handling code here:
        if (field_jumlah_barang.getText().equals("Masukkan Jumlah Barang")) {
            field_jumlah_barang.setText("");
            field_jumlah_barang.setForeground(Color.black);
        }
    }//GEN-LAST:event_field_jumlah_barangFocusGained

    private void field_jumlah_barangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_jumlah_barangFocusLost
        // TODO add your handling code here:
        if (field_jumlah_barang.getText().equals("")) {
            field_jumlah_barang.setText("Masukkan Jumlah Barang");
            field_jumlah_barang.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_field_jumlah_barangFocusLost

    private void field_bayarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_bayarFocusGained
        // TODO add your handling code here:
        if (field_bayar.getText().equals("Masukkan Bayar Pelanggan")) {
            field_bayar.setText("");
            field_bayar.setForeground(Color.black);
        }
    }//GEN-LAST:event_field_bayarFocusGained

    private void field_bayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_bayarFocusLost
        // TODO add your handling code here:
        if (field_bayar.getText().equals("")) {
            field_bayar.setText("Masukkan Bayar Pelanggan");
            field_bayar.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_field_bayarFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        // TODO add your handling code here:
        int baris = tabel_barang.rowAtPoint(evt.getPoint());
        tabel_barang.rowAtPoint(evt.getPoint());
        tabel_barang.getValueAt(baris, 0).toString();
        String nm = tabel_barang.getValueAt(baris, 1).toString();
        tabel_barang.getValueAt(baris, 2).toString();
        String pr = tabel_barang.getValueAt(baris, 3).toString();
        field_harga_paket.setText(pr);
    }//GEN-LAST:event_tabel_barangMouseClicked

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        try {
            int byr = Integer.parseInt(field_bayar.getText());
            int tot = Integer.parseInt(field_total_harga.getText());
            int fungsi = tot - byr;
            int lain = byr - tot;
            if (fungsi == 0) {
                field_status_bayar.setText("lunas");
                field_sisa_bayar.setText("" + fungsi);
                field_kembalian.setText("" + fungsi);

            } else if (byr > tot) {
                field_status_bayar.setText("lunas");
                field_sisa_bayar.setText("" + 0);
                field_kembalian.setText("" + lain);
            } else if (fungsi == tot) {
                field_status_bayar.setText("belum bayar");
                field_sisa_bayar.setText("" + fungsi);
                field_kembalian.setText("0");
            } else if (fungsi < tot) {
                field_status_bayar.setText("kurang");
                field_sisa_bayar.setText("" + fungsi);
                field_kembalian.setText("" + 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "harap masukkan bayar dengan benar");
        }
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sfDate = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggal = new Date();

        int rows = tabel_penjualan.getRowCount();        // TODO add your handling code here:
        String KD = field_kode_nota.getText();
        int grand_total = Integer.parseInt(field_total_harga.getText());
        int kembalian = Integer.parseInt(field_kembalian.getText());
        int majer = Integer.parseInt(field_bayar.getText());
        int sisa_byr = Integer.parseInt(field_sisa_bayar.getText());
        String idplga = field_id_pelanggan.getText();
        String skr = "" + sfDate.format(tanggal);
        java.sql.Connection conn = null;

        try {
//            String sql = "select sum(tbl_detail_order.qty) as total_paket from tbl_detail_order join tbl_order on tbl_order.kode_order=tbl_detail_order.kode_order "
//                    + "where tbl_order.tgl_pesan='" + skr + "' group by tbl_order.tgl_pesan";
            Connection con = (Connection) ConnectionDatabase.configDB();
//            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//            rs.next();
//            String tot = (rs.getString("total_paket"));
//            int total = Integer.parseInt(tot);
//            String tanggal_selesai = "";
//            if (total > 25) {
//                Calendar cal = Calendar.getInstance();
//                Date sls = cal.getTime();
//                cal.add(Calendar.DATE, +4);
//                tanggal_selesai = "" + sfDate.format(sls);
//            } else {
//                Calendar cal = Calendar.getInstance();
//                cal.add(Calendar.DATE, +3);
//                Date sls = cal.getTime();
//                tanggal_selesai = "" + sfDate.format(sls);
//            }
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, +3);
            Date sls = cal.getTime();
            String tanggal_selesai = "" + sfDate.format(sls);
            String sql1 = "INSERT INTO tbl_order VALUES('" + KD + "','" + idplga + "','" + field_id_kasir.getText() + "',now(),'" + tanggal_selesai + "','" + grand_total + "','" + majer + "','" + sisa_byr + "','" + field_status_bayar.getText() + "','" + kembalian + "','" + combox_status_ambil.getSelectedItem() + "')";
            PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
            pst1.execute();
            for (int i = 0; i < rows; i++) {
                String sql2 = "INSERT INTO tbl_detail_order VALUES('" + KD + "', '" + tabel_penjualan.getValueAt(i, 0).toString() + "',"
                        + "'" + tabel_penjualan.getValueAt(i, 3).toString() + "','" + tabel_penjualan.getValueAt(i, 4).toString() + "', "
                        + "'" + tabel_penjualan.getValueAt(i, 5).toString() + "')";
                PreparedStatement pst2 = (PreparedStatement) con.prepareStatement(sql2);
                pst2.execute();
//                reset_pengisian_transaksi();
                dispose();
                tampil_datatabel_datatransaksi();
                lprtrs();
//                tampil_data_cetak();
            }
            JOptionPane.showMessageDialog(null, "Data berhasil di tambah");
            try {
                String jdbcDriver = "com.mysql.jdbc.Driver";
                Class.forName(jdbcDriver);
                String url = "jdbc:mysql://localhost:3306/aplikasi_laundry_main";
                String user = "root";
                String pass = "";
                conn = DriverManager.getConnection(url, user, pass);
                java.sql.Statement stm = conn.createStatement();
                try {

                    String report = ("C:\\Users\\Deny Mariyono\\OneDrive\\Documents\\NetBeansProjects\\Aplikasi Laundry Sub\\src\\Page\\cetak_struk.jrxml");
                    HashMap hash = new HashMap();
                    //Mengambil parameter dari ireport
                    hash.put("nota", field_kode_nota.getText());
                    JasperReport JRpt = JasperCompileManager.compileReport(report);
                    JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, conn);
                    JasperViewer.viewReport(JPrint, false);
                } catch (Exception rptexcpt) {
                    System.out.println("Report Can't view because : " + rptexcpt);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        int row = tabel_penjualan.getSelectedRow();//0
        idlist.remove(row);
        modelpj.removeRow(row);
        _settotal();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        int jumlah = Integer.parseInt(field_jumlah_barang.getText());
        try {
            int row = tabel_barang.getSelectedRow();
            if ((jumlah == 0) && (field_jumlah_barang.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "harap masukkan jumlah dengan benar");
            } else {
                boolean result = idlist.contains(tabel_barang.getValueAt(row, 0).toString());
                if (result == false) {
                    idlist.add(tabel_barang.getValueAt(row, 0).toString());
                    String data[] = {tabel_barang.getValueAt(row, 0).toString(), tabel_barang.getValueAt(row, 1).toString(),
                        tabel_barang.getValueAt(row, 2).toString(), field_jumlah_barang.getText(), field_subtotal.getText(), field_keterangan.getText()};
                    modelpj.addRow(data);
                    reset_nambah_krj();
                    _settotal();
                } else {
                    JOptionPane.showMessageDialog(null, "Data barang sudah terinput");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "harap masukkan jumlah dengan benar");

        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Integer.parseInt(field_jumlah_barang.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "harap masukkan jumlah dengan angka");
            field_jumlah_barang.setText("" + 0);
        }
        // TODO add your handling code here:
        int jml = Integer.parseInt(field_jumlah_barang.getText());
        int hrga = Integer.parseInt(field_harga_paket.getText());
//    int row = tb_barang.getRowCount();
        int sb = 0;
        sb = jml * hrga;

        field_subtotal.setText("" + sb);
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(form_lanjut_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_lanjut_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_lanjut_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_lanjut_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_lanjut_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combox_status_ambil;
    private javax.swing.JTextField field_bayar;
    private javax.swing.JTextField field_harga_paket;
    private javax.swing.JTextField field_id_kasir;
    private javax.swing.JTextField field_id_pelanggan;
    private javax.swing.JTextField field_jumlah_barang;
    private javax.swing.JTextField field_kembalian;
    private javax.swing.JTextField field_keterangan;
    private javax.swing.JTextField field_kode_nota;
    private javax.swing.JTextField field_sisa_bayar;
    private javax.swing.JTextField field_status_bayar;
    private javax.swing.JTextField field_subtotal;
    private javax.swing.JTextField field_total_harga;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTable tabel_penjualan;
    // End of variables declaration//GEN-END:variables
}
