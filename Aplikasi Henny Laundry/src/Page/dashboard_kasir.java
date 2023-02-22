package Page;

import Connection.ConnectionDatabase;
import static Page.dashboard_admin.table_data_transaksi2;
import static Page.edit_data_pelanggan.edit_field_alamat_pelanggan;
import static Page.edit_data_pelanggan.edit_field_id_pelanggan;
import static Page.edit_data_pelanggan.edit_field_nomortelfon;
import static Page.edit_data_pelanggan.edit_nama_pelanggan;
import static Page.lanjut_transaksi.tabel_barang;
import static Page.lanjut_transaksi.tabel_penjualan;
import static Page.tambah_data_pelanggan.field_alamat_pelanggan;
import static Page.tambah_data_pelanggan.field_id_pelanggan;
import static Page.tambah_data_pelanggan.field_nama_pelanggan;
import static Page.tambah_data_pelanggan.field_nomor_telfon;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class dashboard_kasir extends javax.swing.JFrame {

    static String selected_pelanggan_id;
    static String selectedkdtrs;
    DefaultTableModel modelpj;

    public dashboard_kasir() {
        initComponents();
        tanggal_otomatis_buka_aplikasi();
        this.selected_pelanggan_id = null;
        tampil_data_pelanggan();
        id_otomatis_pelanggan();
        tampil_data_barang();
        tampil_datatabel_datatransaksi();
        this.selectedkdtrs = null;
        id_kasir();
        lprtrs();
        tentukan1();
    }

    Connection con;
    PreparedStatement pst;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tanggal_laman_dashboard = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        data_jumlah_pelanggan_dashboard = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jumlah_laporan = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel39 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kButton8 = new com.k33ptoo.components.KButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        kButton5 = new com.k33ptoo.components.KButton();
        tgl_akhir = new com.toedter.calendar.JDateChooser();
        tgl_awl = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        status_ambl = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        kButton9 = new com.k33ptoo.components.KButton();
        kButton10 = new com.k33ptoo.components.KButton();
        kButton11 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo_heny_laundry.png"))); // NOI18N
        jLabel2.setText("Laundry.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 36));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dashboard_icon_menu.png"))); // NOI18N
        jLabel3.setText("Dashboard");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setIconTextGap(15);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/data_pelanggan.png"))); // NOI18N
        jLabel4.setText("Data Pelanggan");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setIconTextGap(15);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/transaksi.png"))); // NOI18N
        jLabel5.setText("Data Paket");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setIconTextGap(15);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/laporan.png"))); // NOI18N
        jLabel6.setText("Laporan Transaksi");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setIconTextGap(15);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jLabel7.setText("Logout");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setIconTextGap(15);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Dashboard > Utama");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        tanggal_laman_dashboard.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tanggal_laman_dashboard.setForeground(new java.awt.Color(254, 97, 111));
        tanggal_laman_dashboard.setText("2022-13-14");
        jPanel8.add(tanggal_laman_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        tabel_data_pelanggan_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabel_data_pelanggan_2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_data_pelanggan_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_data_pelanggan_2.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_data_pelanggan_2.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tabel_data_pelanggan_2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabel_data_pelanggan_2);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 890, 220));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setText("Data Pelanggan");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Jumlah Data Pelanggan");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        data_jumlah_pelanggan_dashboard.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        data_jumlah_pelanggan_dashboard.setText("5");
        jPanel8.add(data_jumlah_pelanggan_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        kButton1.setText("Kunjungi");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton1.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton1.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton1.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton1.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 180, 30));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setText("Transaksi");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setText("Jumlah Data Transaksi");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jumlah_transaksi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jumlah_transaksi.setText("10");
        jPanel8.add(jumlah_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 20, 20));

        kButton2.setText("Kunjungi");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton2.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton2.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton2.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton2.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 330, 180, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setText("Laporan Transaksi");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Jumlah Data Laporan");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jumlah_laporan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jumlah_laporan.setText("10");
        jPanel8.add(jumlah_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, -1, -1));

        kButton3.setText("Kunjungi");
        kButton3.setBorderPainted(false);
        kButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton3.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton3.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton3.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton3.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, 30));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel31.setText("Date :");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/bg dashboard panel.png"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.add(jPanel8, "card2");

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setText("Dashboard > Data Pelanggan");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tabel_data_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabel_data_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "Nama Pelanggan", "Alamat Pelanggan", "Nomor Telfon"
            }
        ));
        tabel_data_pelanggan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_data_pelanggan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_data_pelanggan.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tabel_data_pelanggan.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabel_data_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_data_pelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_data_pelanggan);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 910, 450));

        tombol_cari_data_pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        tombol_cari_data_pelanggan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombol_cari_data_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol_cari_data_pelangganMouseClicked(evt);
            }
        });
        jPanel9.add(tombol_cari_data_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 30));

        field_cari_data_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        field_cari_data_pelanggan.setText("Cari");
        field_cari_data_pelanggan.setBorder(null);
        field_cari_data_pelanggan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_cari_data_pelangganFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_cari_data_pelangganFocusLost(evt);
            }
        });
        field_cari_data_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_cari_data_pelangganActionPerformed(evt);
            }
        });
        jPanel9.add(field_cari_data_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 130, 30));

        tombol_alih_tambah_data_pelanggan.setText("Tambah");
        tombol_alih_tambah_data_pelanggan.setBorderPainted(false);
        tombol_alih_tambah_data_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tombol_alih_tambah_data_pelanggan.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        tombol_alih_tambah_data_pelanggan.setkEndColor(new java.awt.Color(113, 144, 245));
        tombol_alih_tambah_data_pelanggan.setkHoverEndColor(new java.awt.Color(255, 30, 30));
        tombol_alih_tambah_data_pelanggan.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        tombol_alih_tambah_data_pelanggan.setkHoverStartColor(new java.awt.Color(255, 30, 30));
        tombol_alih_tambah_data_pelanggan.setkPressedColor(new java.awt.Color(113, 144, 245));
        tombol_alih_tambah_data_pelanggan.setkSelectedColor(new java.awt.Color(113, 144, 245));
        tombol_alih_tambah_data_pelanggan.setkStartColor(new java.awt.Color(113, 144, 245));
        tombol_alih_tambah_data_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_alih_tambah_data_pelangganActionPerformed(evt);
            }
        });
        jPanel9.add(tombol_alih_tambah_data_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        tombol_lanjut_transaksi.setText("Lanjut Transaksi");
        tombol_lanjut_transaksi.setBorderPainted(false);
        tombol_lanjut_transaksi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tombol_lanjut_transaksi.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        tombol_lanjut_transaksi.setkEndColor(new java.awt.Color(113, 144, 245));
        tombol_lanjut_transaksi.setkHoverEndColor(new java.awt.Color(255, 30, 30));
        tombol_lanjut_transaksi.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        tombol_lanjut_transaksi.setkHoverStartColor(new java.awt.Color(255, 30, 30));
        tombol_lanjut_transaksi.setkPressedColor(new java.awt.Color(113, 144, 245));
        tombol_lanjut_transaksi.setkSelectedColor(new java.awt.Color(113, 144, 245));
        tombol_lanjut_transaksi.setkStartColor(new java.awt.Color(113, 144, 245));
        tombol_lanjut_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_lanjut_transaksiActionPerformed(evt);
            }
        });
        jPanel9.add(tombol_lanjut_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        tombol_alih_hapus_data_pelanggan.setText("Hapus");
        tombol_alih_hapus_data_pelanggan.setBorderPainted(false);
        tombol_alih_hapus_data_pelanggan.setFocusable(false);
        tombol_alih_hapus_data_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tombol_alih_hapus_data_pelanggan.setkBackGroundColor(new java.awt.Color(255, 30, 30));
        tombol_alih_hapus_data_pelanggan.setkEndColor(new java.awt.Color(255, 30, 30));
        tombol_alih_hapus_data_pelanggan.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        tombol_alih_hapus_data_pelanggan.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        tombol_alih_hapus_data_pelanggan.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        tombol_alih_hapus_data_pelanggan.setkPressedColor(new java.awt.Color(255, 30, 30));
        tombol_alih_hapus_data_pelanggan.setkSelectedColor(new java.awt.Color(255, 30, 30));
        tombol_alih_hapus_data_pelanggan.setkStartColor(new java.awt.Color(255, 30, 30));
        tombol_alih_hapus_data_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_alih_hapus_data_pelangganActionPerformed(evt);
            }
        });
        jPanel9.add(tombol_alih_hapus_data_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, -1));

        tombol_alih_edit_data_pelanggan.setText("Edit");
        tombol_alih_edit_data_pelanggan.setBorderPainted(false);
        tombol_alih_edit_data_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tombol_alih_edit_data_pelanggan.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        tombol_alih_edit_data_pelanggan.setkEndColor(new java.awt.Color(113, 144, 245));
        tombol_alih_edit_data_pelanggan.setkHoverEndColor(new java.awt.Color(255, 30, 30));
        tombol_alih_edit_data_pelanggan.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        tombol_alih_edit_data_pelanggan.setkHoverStartColor(new java.awt.Color(255, 30, 30));
        tombol_alih_edit_data_pelanggan.setkPressedColor(new java.awt.Color(113, 144, 245));
        tombol_alih_edit_data_pelanggan.setkSelectedColor(new java.awt.Color(113, 144, 245));
        tombol_alih_edit_data_pelanggan.setkStartColor(new java.awt.Color(113, 144, 245));
        tombol_alih_edit_data_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_alih_edit_data_pelangganActionPerformed(evt);
            }
        });
        jPanel9.add(tombol_alih_edit_data_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel39.setText("Refresh Data");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/cari menu dashboard utama.png"))); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.add(jPanel9, "card3");

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel26.setText("Dashboard > Data paket");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tabel_barang_two.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabel_barang_two.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Paket", "Nama Paket", "Jenis Paket", "Harga"
            }
        ));
        tabel_barang_two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_barang_two.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_barang_two.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tabel_barang_two.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tabel_barang_two);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 920, 430));

        kButton8.setText("Lakukan Transaksi");
        kButton8.setBorderPainted(false);
        kButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton8.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton8.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton8.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton8.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton8.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton8.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 210, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/cari menu dashboard utama.png"))); // NOI18N
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.add(jPanel11, "card4");

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel30.setText("Dashboard > Laporan Transaksi");
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lpr_transksi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lpr_transksi.setModel(new javax.swing.table.DefaultTableModel(
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
        lpr_transksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lpr_transksi.setGridColor(new java.awt.Color(255, 255, 255));
        lpr_transksi.setSelectionBackground(new java.awt.Color(51, 51, 255));
        lpr_transksi.setSelectionForeground(new java.awt.Color(255, 255, 255));
        lpr_transksi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lpr_transksiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(lpr_transksi);

        jPanel12.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 920, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 250, 70));

        kButton5.setText("Filter");
        kButton5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton5.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton5.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton5.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton5.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton5.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel12.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 360, 23));

        tgl_akhir.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.add(tgl_akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 150, -1));

        tgl_awl.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.add(tgl_awl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 150, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel25.setText("<=======>");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, 22));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/cari menu dashboard utama.png"))); // NOI18N
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 660));

        jPanel7.add(jPanel12, "card5");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setText("Dashboard > Data Transaksi");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        table_data_transaksi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        table_data_transaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        table_data_transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_data_transaksi.setGridColor(new java.awt.Color(255, 255, 255));
        table_data_transaksi.setSelectionBackground(new java.awt.Color(51, 51, 255));
        table_data_transaksi.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_data_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_transaksiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_data_transaksi);

        jPanel14.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, 924, 220));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("Kode Struk");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 338, -1, -1));

        kd_strk.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_strk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kd_strk.setEnabled(false);
        jPanel14.add(kd_strk, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 336, 187, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel22.setText("ID Pelanggan");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 378, -1, -1));

        id_pelgn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        id_pelgn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        id_pelgn.setEnabled(false);
        jPanel14.add(id_pelgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 375, 187, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel23.setText("ID Kasir");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 418, -1, -1));

        id_ksr.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        id_ksr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        id_ksr.setEnabled(false);
        jPanel14.add(id_ksr, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 415, 187, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel24.setText("Tanggal Pesan");
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, -1, -1));

        tgl_pesan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tgl_pesan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tgl_pesan.setEnabled(false);
        jPanel14.add(tgl_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 455, 187, -1));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel32.setText("Tanggal Selesai");
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 498, -1, -1));

        tgl_sls.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tgl_sls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tgl_sls.setEnabled(false);
        jPanel14.add(tgl_sls, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 495, 187, -1));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel33.setText("Status Ambil");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 535, -1, -1));

        status_ambl.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_ambl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sudah di ambil" }));
        status_ambl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        status_ambl.setEnabled(false);
        jPanel14.add(status_ambl, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 535, 187, -1));

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel34.setText("Jumlah  Bayar");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 338, -1, -1));

        byr.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        byr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        byr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                byrKeyReleased(evt);
            }
        });
        jPanel14.add(byr, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 335, 187, -1));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel35.setText("Total Harga");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 378, -1, -1));

        total_byr.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        total_byr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(total_byr, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 375, 187, -1));

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel36.setText("Kembalian");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 418, -1, -1));

        kembalian.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kembalian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 415, 187, -1));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel37.setText("Status Bayar");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 458, -1, -1));

        sts_byr.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sts_byr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(sts_byr, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 455, 187, -1));

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel38.setText("Sisa Harus Dibayar");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 498, -1, -1));

        sis_byr.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sis_byr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(sis_byr, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 495, 187, -1));

        kButton9.setText("Tentukan");
        kButton9.setBorderPainted(false);
        kButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton9.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton9.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton9.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton9.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton9.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton9.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        jPanel14.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 535, 302, 36));

        kButton10.setText("Simpan");
        kButton10.setBorderPainted(false);
        kButton10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton10.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton10.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton10.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton10.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton10.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton10.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        jPanel14.add(kButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 160, 40));

        kButton11.setText("Detail");
        kButton11.setBorderPainted(false);
        kButton11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton11.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton11.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton11.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton11.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton11.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton11.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton11.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton11.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton11ActionPerformed(evt);
            }
        });
        jPanel14.add(kButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 160, 40));

        kButton4.setText("Cetak");
        kButton4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton4.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton4.setkHoverEndColor(new java.awt.Color(133, 168, 236));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(133, 168, 236));
        kButton4.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton4.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton4.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 160, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 130, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, 30));

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel40.setText("Refresh Data");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 30));

        jPanel7.add(jPanel14, "card6");

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 950, 660));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/monitor (1).png"))); // NOI18N
        jLabel10.setText("Data Transaksi");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setIconTextGap(15);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        namaotomatiskais.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        namaotomatiskais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        namaotomatiskais.setText("jLabel21");
        namaotomatiskais.setIconTextGap(15);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(namaotomatiskais, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namaotomatiskais, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/bg_dashboard_kasir.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tampil_data_penjualan() {

        String[] judul = {"ID", "Nama paket", "Harga", "jumlah", " subtotal", "keterangan"};
        modelpj = new DefaultTableModel(judul, 0);
        tabel_penjualan.setModel(modelpj);

    }
//laporan transaksi

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
        String status = "belum di ambil";
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
        table_data_transaksi.setModel(tbl);
        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tbl_order join pelanggan on pelanggan.id_pelanggan=tbl_order.id_pelanggan join user on user.id_user=tbl_order.id_user where tbl_order.status_ambil='" + status + "'");
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

    public void id_kasir() {
        String id = form_login_akses.idkaser;
        id_ksr.setText(id);
    }

    public void tanggal_otomatis_buka_aplikasi() {

        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
//      detik = date.get(Calendar.SECOND);
//      menit = date.get(Calendar.MINUTE);
//      jam =  date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH) + 1;
        tahun = date.get(Calendar.YEAR);
        tanggal_laman_dashboard.setText("" + tahun + "-" + bulan + "-" + hari);
    }

    void reset_pengisian_data_pelanggan() {
        field_id_pelanggan.setText("");
        field_nama_pelanggan.setText("");
        field_alamat_pelanggan.setText("");
        field_nomor_telfon.setText("");
    }

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
            data_jumlah_pelanggan_dashboard.setText("" + b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
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

    void cari_data_pelanggan() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID_PELANGGAN");
        tbl.addColumn("NAMA");
        tbl.addColumn("ALAMAT");
        tbl.addColumn("NO TELFON");
        try {
            String sql = "SELECT * FROM pelanggan WHERE nama_pelanggan like'%" + field_cari_data_pelanggan.getText() + "%' || id_pelanggan like'%" + field_cari_data_pelanggan.getText() + "%' || alamat like'%" + field_cari_data_pelanggan.getText() + "%'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id_pelanggan"),
                    rs.getString("nama_pelanggan"),
                    rs.getString("alamat"),
                    rs.getString("no_telp"),});
                tabel_data_pelanggan.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel8);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_jLabel3MouseClicked

    public void tampil_data_barang() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Paket");
        tbl.addColumn("Nama Paket");
        tbl.addColumn("Jenis Paket");
        tbl.addColumn("Harga");
        tabel_barang_two.setModel(tbl);

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
                tabel_barang_two.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }
    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        setColor(jPanel2);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        setColor(jPanel3);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        resetColor(jPanel3);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        setColor(jPanel4);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        resetColor(jPanel4);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        setColor(jPanel5);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        resetColor(jPanel5);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        resetColor(jPanel2);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        setColor(jPanel6);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        resetColor(jPanel6);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel9);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void tombol_lanjut_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_lanjut_transaksiActionPerformed
        // TODO add your handling code here:
        if (selected_pelanggan_id != null) {
            new form_lanjut_transaksi().setVisible(true);
//            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Harap pilih pelanggan yang akan melakukan transaksi");
        }
    }//GEN-LAST:event_tombol_lanjut_transaksiActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel11);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel12);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel9);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel14);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel12);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Keluar Dari Dashboard Kasir?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            new form_login_akses().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void tabel_data_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_data_pelangganMouseClicked
        // TODO add your handling code here:
        int baris = tabel_data_pelanggan.rowAtPoint(evt.getPoint());
        String tid = tabel_data_pelanggan.getValueAt(baris, 0).toString();
//        field_id_pelanggan.setText(tid);
        edit_field_id_pelanggan.setText(tid);
        this.selected_pelanggan_id = tid;
        String tnama = tabel_data_pelanggan.getValueAt(baris, 1).toString();
//        field_nama_pelanggan.setText(tnama);
        edit_nama_pelanggan.setText(tnama);
        String talamat = tabel_data_pelanggan.getValueAt(baris, 2).toString();
//        field_alamat_pelanggan.setText(talamat);
        edit_field_alamat_pelanggan.setText(talamat);
        String tno = tabel_data_pelanggan.getValueAt(baris, 3).toString();
//        field_nomor_telfon.setText(tno);
        edit_field_nomortelfon.setText(tno);
    }//GEN-LAST:event_tabel_data_pelangganMouseClicked

    private void tombol_alih_tambah_data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_alih_tambah_data_pelangganActionPerformed
        // TODO add your handling code here:
        tambah_data_pelanggan tdp = new tambah_data_pelanggan();
        tdp.setVisible(true);
    }//GEN-LAST:event_tombol_alih_tambah_data_pelangganActionPerformed

    private void tombol_alih_edit_data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_alih_edit_data_pelangganActionPerformed
        // TODO add your handling code here:
        if (selected_pelanggan_id != null) {
            new edit_data_pelanggan().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Harap pilih/klik salah satu data di tabel");
        }
    }//GEN-LAST:event_tombol_alih_edit_data_pelangganActionPerformed

    private void tombol_alih_hapus_data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_alih_hapus_data_pelangganActionPerformed
        // TODO add your handling code here: 
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin menghapus?", "Apakah ingin mengahpus", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM pelanggan WHERE id_pelanggan='" + selected_pelanggan_id + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
                pst.execute();
//                reset();
                tampil_data_pelanggan();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
            }
        }
    }//GEN-LAST:event_tombol_alih_hapus_data_pelangganActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Klik Pada Data Pelanggan untuk lakukan Transaksi dengan Klik Tombol Lanjut Transaksi Pada Menu Data Pelanggan", "Tips", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            jPanel7.removeAll();
            jPanel7.repaint();
            jPanel7.revalidate();
            jPanel7.add(jPanel9);
            jPanel7.repaint();
            jPanel7.revalidate();
        }

//        JOptionPane.showConfirmDialog(null, "Klik Pada Data Pelanggan dan Lanjut Transaksi dengan Klik Tombol Lanjut Transaksi Pada Menu Data Pelanggan");
//        jPanel7.removeAll();
//        jPanel7.repaint();
//        jPanel7.revalidate();
//        jPanel7.add(jPanel9);
//        jPanel7.repaint();
//        jPanel7.revalidate();
    }//GEN-LAST:event_kButton8ActionPerformed

    private void field_cari_data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_cari_data_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_cari_data_pelangganActionPerformed

    private void tombol_cari_data_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_cari_data_pelangganMouseClicked
        // TODO add your handling code here:
        cari_data_pelanggan();
        field_cari_data_pelanggan.setText("");
    }//GEN-LAST:event_tombol_cari_data_pelangganMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel14);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        setColor(jPanel13);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        resetColor(jPanel13);
    }//GEN-LAST:event_jLabel10MouseExited

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        try {
            int bayr = Integer.parseInt(byr.getText());
            int sis = Integer.parseInt(sis_byr.getText());
            int fungsi = sis - bayr;
            int lain = bayr - sis;
            if (fungsi == 0) {
                sts_byr.setText("lunas");
                sis_byr.setText("" + fungsi);
                kembalian.setText("" + fungsi);
            } else if (bayr > sis) {
                sts_byr.setText("lunas");
                sis_byr.setText("" + 0);
                kembalian.setText("" + lain);
            } else if (fungsi == sis) {
                sts_byr.setText("belum bayar");
                sis_byr.setText("" + fungsi);
                kembalian.setText("0");
            } else if (fungsi < sis) {
                sts_byr.setText("kurang");
                sis_byr.setText("" + fungsi);
                kembalian.setText("" + 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Harap masukkan jumlah bayar dengan benar");
        }
    }//GEN-LAST:event_kButton9ActionPerformed
    public void tentukan1() {
        if (sts_byr.getText().equals("lunas")) {
            kButton9.disable();
        } else {
            kButton9.enable();
        }
    }
    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        // TODO add your handling code here:
        java.sql.Connection conn = null;
        String KD = kd_strk.getText();
//            int grand_total=Integer.parseInt(total.getText());
        int kembaliann = Integer.parseInt(kembalian.getText());
        int majer = Integer.parseInt(byr.getText());
        int sisa_byr = Integer.parseInt(sis_byr.getText());
//            String idplga=idplg.getText();
        String status_byr = sts_byr.getText();
//            String tanggal_selesai=tgl_sl.getText();
        String status_ambil = (String) status_ambl.getSelectedItem();
        String id_kasir = id_ksr.getText();
        try {
            String sql = "UPDATE tbl_order SET id_user='" + id_kasir + "',bayar='" + majer + "',kurang_bayar='" + sisa_byr + "',status_bayar='" + status_byr + "',kembalian='" + kembaliann + "',status_ambil='" + status_ambil + "' WHERE kode_order='" + KD + "'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil di EDIT");
            pst.execute();
            tampil_datatabel_datatransaksi();
            reset_pengisian_data_transaksi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            String jdbcDriver = "com.mysql.jdbc.Driver";
            Class.forName(jdbcDriver);
            String url = "jdbc:mysql://localhost:3306/aplikasi_laundry_main";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            java.sql.Statement stm = conn.createStatement();
            try {

                String report = ("C:\\Users\\Deny Mariyono\\OneDrive\\Documents\\NetBeansProjects\\Aplikasi Laundry Sub\\src\\Page\\ceta_data_transaksi.jrxml");
                HashMap hash = new HashMap();
                //Mengambil parameter dari ireport
                hash.put("nota_data_transaksi", kd_strk.getText());
                JasperReport JRpt = JasperCompileManager.compileReport(report);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, conn);
                JasperViewer.viewReport(JPrint, false);
            } catch (Exception rptexcpt) {
                System.out.println("Report Can't view because : " + rptexcpt);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_kButton10ActionPerformed

    void reset_pengisian_data_transaksi() {
        byr.setText("");
        total_byr.setText("");
        kembalian.setText("");
        sts_byr.setText("");
        sis_byr.setText("");

    }
    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
        // TODO add your handling code here:
        if (selectedkdtrs != null) {
            new detail_transaksi().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Harap pilih/klik salah satu data di tabel");
        }
    }//GEN-LAST:event_kButton11ActionPerformed

    private void table_data_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_transaksiMouseClicked
        // TODO add your handling code here:
        int baris = table_data_transaksi.rowAtPoint(evt.getPoint());
        String tid = table_data_transaksi.getValueAt(baris, 0).toString();
        kd_strk.setText(tid);
        jTextField1.setText(tid);
        this.selectedkdtrs = tid;
        String tidpl = table_data_transaksi.getValueAt(baris, 1).toString();
        id_pelgn.setText(tidpl);
//String tidusr=table.getValueAt(baris,3).toString();
//        id_ksr.setText(tidusr);
        String tg_psn = table_data_transaksi.getValueAt(baris, 5).toString();
        tgl_pesan.setText(tg_psn);
        String tg_sl = table_data_transaksi.getValueAt(baris, 6).toString();
        tgl_sls.setText(tg_sl);
        String grnt = table_data_transaksi.getValueAt(baris, 7).toString();
        total_byr.setText(grnt);
        String jmlhby = table_data_transaksi.getValueAt(baris, 8).toString();
        byr.setText(jmlhby);
        String sisabayar = table_data_transaksi.getValueAt(baris, 9).toString();
        sis_byr.setText(sisabayar);
        String st_byr = table_data_transaksi.getValueAt(baris, 10).toString();
        sts_byr.setText(st_byr);
        String kembaln = table_data_transaksi.getValueAt(baris, 11).toString();
        kembalian.setText(kembaln);
    }//GEN-LAST:event_table_data_transaksiMouseClicked

    private void byrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_byrKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_byrKeyReleased

    private void lpr_transksiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lpr_transksiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lpr_transksiAncestorAdded

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        java.sql.Connection conn = null;
        if (selectedkdtrs != null) {
            try {
                String jdbcDriver = "com.mysql.jdbc.Driver";
                Class.forName(jdbcDriver);
                String url = "jdbc:mysql://localhost:3306/aplikasi_laundry_main";
                String user = "root";
                String pass = "";
                conn = DriverManager.getConnection(url, user, pass);
                java.sql.Statement stm = conn.createStatement();
                try {

                    String report = ("C:\\Users\\Deny Mariyono\\OneDrive\\Documents\\NetBeansProjects\\Aplikasi Laundry Sub\\src\\Page\\ceta_data_transaksi.jrxml");
                    HashMap hash = new HashMap();
                    //Mengambil parameter dari ireport
                    hash.put("nota_data_transaksi", kd_strk.getText());
                    JasperReport JRpt = JasperCompileManager.compileReport(report);
                    JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, conn);
                    JasperViewer.viewReport(JPrint, false);
                } catch (Exception rptexcpt) {
                    System.out.println("Report Can't view because : " + rptexcpt);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Harap pilih/klik salah satu data di tabel");
        }
    }//GEN-LAST:event_kButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
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
//        table_data_transaksi.setModel(tbl);
        try {
            String sql = "select * from tbl_order join pelanggan on pelanggan.id_pelanggan=tbl_order.id_pelanggan join user on user.id_user=tbl_order.id_user where tbl_order.kode_order like '%" + jTextField1.getText() + "%' OR pelanggan.nama_pelanggan like '%" + jTextField1.getText() + "%'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kode_order"),
                    rs.getString("id_pelanggan"),
                    rs.getString("nama_pelanggan"),
                    rs.getString("id_user"),
                    rs.getString("nama"),
                    rs.getString("tgl_pesan"),
                    rs.getString("tgl_selesai"),
                    rs.getString("grand_total"),
                    rs.getString("bayar"),
                    rs.getString("kurang_bayar"),
                    rs.getString("status_bayar"),
                    rs.getString("kembalian"),
                    rs.getString("status_ambil"),
                    rs.getString("musim"),});
                table_data_transaksi.setModel(tbl);
            }
//            tampil_datatabel_datatransaksi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String awal = String.valueOf(fm.format(tgl_awl.getDate()));
        String sampai = String.valueOf(fm.format(tgl_akhir.getDate()));
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
                    + "join tbl_detail_order on tbl_order.kode_order=tbl_detail_order.kode_order join paket on paket.kd_paket=tbl_detail_order.kd_paket where tbl_order.tgl_pesan between '" + awal + "' and '" + sampai + "'");
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
            int b = lpr_transksi.getRowCount();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) tabel_data_pelanggan.getModel();
        mdl.setRowCount(0);
        tampil_data_pelanggan();
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) lpr_transksi.getModel();
        mdl.setRowCount(0);
        lprtrs();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) table_data_transaksi.getModel();
        mdl.setRowCount(0);
        tampil_datatabel_datatransaksi();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        byr.setText("");
    }//GEN-LAST:event_jLabel41MouseClicked

    private void field_cari_data_pelangganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_cari_data_pelangganFocusGained
        // TODO add your handling code here:
        if (field_cari_data_pelanggan.getText().equals("Cari")) {
            field_cari_data_pelanggan.setText("");
            field_cari_data_pelanggan.setForeground(Color.black);
        }
    }//GEN-LAST:event_field_cari_data_pelangganFocusGained

    private void field_cari_data_pelangganFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_cari_data_pelangganFocusLost
        // TODO add your handling code here:
        if (field_cari_data_pelanggan.getText().equals("")) {
            field_cari_data_pelanggan.setText("Cari");
            field_cari_data_pelanggan.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_field_cari_data_pelangganFocusLost

    public void setColor(JPanel p) { // HOVER MENU
        p.setBackground(new Color(113, 144, 245));
    }

    public void resetColor(JPanel pl) { //HOVER MENU
        pl.setBackground(new Color(255, 255, 255));
    }

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
            java.util.logging.Logger.getLogger(dashboard_kasir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_kasir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_kasir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_kasir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JTextField byr = new javax.swing.JTextField();
    private javax.swing.JLabel data_jumlah_pelanggan_dashboard;
    public static final javax.swing.JTextField field_cari_data_pelanggan = new javax.swing.JTextField();
    public static final javax.swing.JTextField id_ksr = new javax.swing.JTextField();
    public static final javax.swing.JTextField id_pelgn = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    public static final javax.swing.JPanel jPanel14 = new javax.swing.JPanel();
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static final javax.swing.JPanel jPanel9 = new javax.swing.JPanel();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jumlah_laporan;
    public static final javax.swing.JLabel jumlah_transaksi = new javax.swing.JLabel();
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton11;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    public static final javax.swing.JTextField kd_strk = new javax.swing.JTextField();
    public static final javax.swing.JTextField kembalian = new javax.swing.JTextField();
    public static final javax.swing.JTable lpr_transksi = new javax.swing.JTable();
    public static final javax.swing.JLabel namaotomatiskais = new javax.swing.JLabel();
    public static final javax.swing.JTextField sis_byr = new javax.swing.JTextField();
    private javax.swing.JComboBox<String> status_ambl;
    public static final javax.swing.JTextField sts_byr = new javax.swing.JTextField();
    public static final javax.swing.JTable tabel_barang_two = new javax.swing.JTable();
    public static final javax.swing.JTable tabel_data_pelanggan = new javax.swing.JTable();
    public static final javax.swing.JTable tabel_data_pelanggan_2 = new javax.swing.JTable();
    public static final javax.swing.JTable table_data_transaksi = new javax.swing.JTable();
    private javax.swing.JLabel tanggal_laman_dashboard;
    private com.toedter.calendar.JDateChooser tgl_akhir;
    private com.toedter.calendar.JDateChooser tgl_awl;
    public static final javax.swing.JTextField tgl_pesan = new javax.swing.JTextField();
    public static final javax.swing.JTextField tgl_sls = new javax.swing.JTextField();
    public static final com.k33ptoo.components.KButton tombol_alih_edit_data_pelanggan = new com.k33ptoo.components.KButton();
    public static final com.k33ptoo.components.KButton tombol_alih_hapus_data_pelanggan = new com.k33ptoo.components.KButton();
    public static final com.k33ptoo.components.KButton tombol_alih_tambah_data_pelanggan = new com.k33ptoo.components.KButton();
    public static final javax.swing.JLabel tombol_cari_data_pelanggan = new javax.swing.JLabel();
    public static final com.k33ptoo.components.KButton tombol_lanjut_transaksi = new com.k33ptoo.components.KButton();
    public static final javax.swing.JTextField total_byr = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
