package Page;

import Connection.ConnectionDatabase;
import static Page.dashboard_kasir.id_pelgn;
import static Page.dashboard_kasir.jumlah_transaksi;
import static Page.dashboard_kasir.kd_strk;
import static Page.dashboard_kasir.kembalian;
import static Page.dashboard_kasir.selected_pelanggan_id;
import static Page.dashboard_kasir.sis_byr;
import static Page.dashboard_kasir.sts_byr;
import static Page.dashboard_kasir.tgl_pesan;
import static Page.dashboard_kasir.tgl_sls;
import static Page.dashboard_kasir.total_byr;
import static Page.edit_data_kasir.alamat1;
import static Page.edit_data_kasir.id_user1;
import static Page.edit_data_kasir.nama1;
import static Page.edit_data_kasir.notel1;
import static Page.edit_data_kasir.password1;
import static Page.edit_data_kasir.username10;
import static Page.tambah_data_kasir.alamat;
import static Page.tambah_data_kasir.id_user;
import static Page.tambah_data_kasir.nama;
import static Page.tambah_data_kasir.notel;
import static Page.tambah_data_kasir.password;
import static Page.tambah_data_kasir.username;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class dashboard_admin extends javax.swing.JFrame {

    static String selected_detail_transaksi;
    static String selected_data_kasir;
    static String KDpngl;
    static String select_pengeluaran;

    public dashboard_admin() {
        initComponents();
        tanggal_otomatis();
        tampil_data_kasir();
        datatabel_pengeluaran();
        total.disable();
        tanggl_pengel();
        kd_pngl_otomatis();
        tampil_datatabel_datatransaksi();
        kd_pmbk();
        this.KDpngl = null;
        tanggal_pmbk();
        total_pmsk();
        total_pngl();
        tampil_pembukuan();
        tampil_data_paket();
        buatkodpaket();
        jumlpgl();
        setTitle("DASHBOARD ADMIN");
        datatableHistory();
        labarg();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cariDataTransaksi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tanggal_laman_dashboard = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jumlah_data_kasir = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jumlah_data_paket_dsb = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel14 = new javax.swing.JLabel();
        cariDataKasir = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        kd_png = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        listrik = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        air = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        pewangi = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txt_tgl_pngl = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_pengeluaran = new javax.swing.JTable();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        jLabel32 = new javax.swing.JLabel();
        cariDataPengeluaranm = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kButton9 = new com.k33ptoo.components.KButton();
        tgl_awal = new com.toedter.calendar.JDateChooser();
        tgl_akhir = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        kButton13 = new com.k33ptoo.components.KButton();
        jLabel47 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        bln = new javax.swing.JLabel();
        total_pmsk = new javax.swing.JLabel();
        total_pngln = new javax.swing.JLabel();
        laba = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        rugii = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        tahun = new javax.swing.JLabel();
        bulann = new javax.swing.JComboBox<>();
        kButton10 = new com.k33ptoo.components.KButton();
        jLabel42 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        kd_paket = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        nama_paket = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        kButton15 = new com.k33ptoo.components.KButton();
        jPanel46 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_paket = new javax.swing.JTable();
        kButton16 = new com.k33ptoo.components.KButton();
        kButton17 = new com.k33ptoo.components.KButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        cariDataPaket = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        tgl_awal_ht = new com.toedter.calendar.JDateChooser();
        tgl_akhir_ht = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelhistory = new javax.swing.JTable();
        kButton8 = new com.k33ptoo.components.KButton();
        jLabel54 = new javax.swing.JLabel();
        kButton18 = new com.k33ptoo.components.KButton();
        jLabel58 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        kd_hist = new javax.swing.JTextField();

        cariDataTransaksi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cariDataTransaksi.setText("Cari");
        cariDataTransaksi.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo_heny_laundry.png"))); // NOI18N
        jLabel1.setText("Laundry.");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(152, 45));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dashboard_icon_menu.png"))); // NOI18N
        jLabel6.setText("Dashboard");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setIconTextGap(25);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/data_pelanggan.png"))); // NOI18N
        jLabel2.setText("Data Kasir");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setIconTextGap(25);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/money-bag.png"))); // NOI18N
        jLabel4.setText("Data Pengeluaran");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setIconTextGap(25);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/transaksi.png"))); // NOI18N
        jLabel5.setText("Data Transaksi");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setIconTextGap(25);
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/notes.png"))); // NOI18N
        jLabel7.setText("Data Pembukuan");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setIconTextGap(25);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logistics-delivery.png"))); // NOI18N
        jLabel8.setText("Data Paket");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setIconTextGap(25);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jLabel9.setText("Logout");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setIconTextGap(25);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        loginAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        loginAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        loginAdmin.setText("jLabel10");
        loginAdmin.setIconTextGap(25);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/history.png"))); // NOI18N
        jLabel52.setText("History Transaksi");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel52.setIconTextGap(25);
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.CardLayout());

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 97, 111));
        jLabel15.setText("Selamat Datang");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 97, 111));
        jLabel16.setText("Kembali");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        nameAdminLogin2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nameAdminLogin2.setForeground(new java.awt.Color(254, 97, 111));
        nameAdminLogin2.setText("Nama Admin");
        jPanel12.add(nameAdminLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 300, -1));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel19.setText("Bekerja Keras Boleh Tetapi Jangan Lupa Jaga Kesehatan,");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel21.setText("Kesehatan Lebih Penting Dan Luangkan Waktu Untuk Keluarga.");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel12.setText("Dashboard");
        jPanel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        tanggal_laman_dashboard.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tanggal_laman_dashboard.setForeground(new java.awt.Color(254, 97, 111));
        tanggal_laman_dashboard.setText("2022-12-31");
        jPanel12.add(tanggal_laman_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel17.setText("Data Kasir");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("Jumlah Data Kasir");
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jumlah_data_kasir.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jumlah_data_kasir.setText("10");
        jPanel12.add(jumlah_data_kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel22.setText("Data Transaksi");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setText("Jumlah Data Transaksi");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, -1, -1));

        jumlah_data_paket_dsb.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jumlah_data_paket_dsb.setText("10");
        jPanel12.add(jumlah_data_paket_dsb, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel24.setText("Date :");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/bg dashboard admin utama 3.png"))); // NOI18N
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 660));

        jPanel8.add(jPanel12, "card2");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel11.setText("Dashboard > Data Kasir");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        tabelkasir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabelkasir.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelkasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelkasir.setGridColor(new java.awt.Color(255, 255, 255));
        tabelkasir.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tabelkasir.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelkasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkasirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelkasir);

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 890, -1));

        kButton1.setText("Tambah");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton1.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton1.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton1.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton1.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel13.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        kButton2.setText("Hapus");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 30, 30));
        kButton2.setkEndColor(new java.awt.Color(255, 30, 30));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 100, 100));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 100, 100));
        kButton2.setkPressedColor(new java.awt.Color(255, 30, 30));
        kButton2.setkSelectedColor(new java.awt.Color(255, 30, 30));
        kButton2.setkStartColor(new java.awt.Color(255, 30, 30));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, -1));

        kButton3.setText("Update");
        kButton3.setBorderPainted(false);
        kButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton3.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton3.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton3.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton3.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton3.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 24, -1, 40));

        cariDataKasir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cariDataKasir.setForeground(new java.awt.Color(153, 153, 153));
        cariDataKasir.setText("Cari");
        cariDataKasir.setBorder(null);
        cariDataKasir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cariDataKasirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cariDataKasirFocusLost(evt);
            }
        });
        jPanel13.add(cariDataKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 130, 30));

        jLabel51.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel51.setText("Refresh");
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/cari menu dashboard utama.png"))); // NOI18N
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 950, 660));

        jPanel8.add(jPanel13, "card3");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel25.setText("Dashboard > Data Pengeluaran");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel15.setBackground(new java.awt.Color(113, 144, 245));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel26.setText("Kode Pengeluaran");

        kd_png.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_png.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kd_png.setEnabled(false);
        kd_png.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kd_pngKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(kd_png, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kd_png, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel27.setText("Biaya Listrik");

        listrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        listrik.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        listrik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listrikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                listrikFocusLost(evt);
            }
        });
        listrik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listrikKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(listrik, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel28.setText("Biaya Air");

        air.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        air.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        air.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                airFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                airFocusLost(evt);
            }
        });
        air.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                airKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(air, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(air, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel29.setText("Biaya Pewangi");

        pewangi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        pewangi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pewangi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pewangiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pewangiFocusLost(evt);
            }
        });
        pewangi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pewangiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(pewangi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pewangi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel30.setText("Tanggal Pengeluaran");

        txt_tgl_pngl.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txt_tgl_pngl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_tgl_pngl.setEnabled(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(txt_tgl_pngl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tgl_pngl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel31.setText("Total Kesuluruhan");

        total.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        total.setEnabled(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        kButton4.setText("Total");
        kButton4.setBorderPainted(false);
        kButton4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton4.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton4.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(255, 65, 85));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 65, 85));
        kButton4.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton5.setText("tambah");
        kButton5.setBorderPainted(false);
        kButton5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton5.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton5.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverEndColor(new java.awt.Color(255, 65, 85));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(255, 65, 85));
        kButton5.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 460));

        tabel_pengeluaran.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabel_pengeluaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_pengeluaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_pengeluaran.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_pengeluaran.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tabel_pengeluaran.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabel_pengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pengeluaranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_pengeluaran);

        jPanel14.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 610, 390));

        kButton6.setText("Hapus");
        kButton6.setBorderPainted(false);
        kButton6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton6.setkBackGroundColor(new java.awt.Color(255, 65, 85));
        kButton6.setkEndColor(new java.awt.Color(255, 65, 85));
        kButton6.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton6.setkPressedColor(new java.awt.Color(255, 65, 85));
        kButton6.setkSelectedColor(new java.awt.Color(255, 65, 85));
        kButton6.setkStartColor(new java.awt.Color(255, 65, 85));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        jPanel14.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 150, -1));

        kButton7.setText("Update");
        kButton7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton7.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton7.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton7.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton7.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton7.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton7.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 150, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, 30));

        cariDataPengeluaranm.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.add(cariDataPengeluaranm, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 30, 130, 30));

        jLabel49.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel49.setText("Refresh Data");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel38.setText("Refresh Field Input");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/cari menu dashboard utama.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 950, 660));

        jPanel8.add(jPanel14, "card4");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel34.setText("Dashboard > Data Transaksi");
        jPanel22.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        table_data_transaksi2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        table_data_transaksi2.setModel(new javax.swing.table.DefaultTableModel(
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
        table_data_transaksi2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_data_transaksi2.setGridColor(new java.awt.Color(255, 255, 255));
        table_data_transaksi2.setSelectionBackground(new java.awt.Color(51, 51, 255));
        table_data_transaksi2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_data_transaksi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_transaksi2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_data_transaksi2);

        jPanel22.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 890, -1));

        kButton9.setText("Detail");
        kButton9.setAutoscrolls(true);
        kButton9.setBorderPainted(false);
        kButton9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton9.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton9.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton9.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton9.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton9.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton9.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        jPanel22.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        tgl_awal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.add(tgl_awal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 120, 30));

        tgl_akhir.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.add(tgl_akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 110, 30));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel33.setText("<===>");
        jPanel22.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 39, -1, 30));

        kButton13.setText("Cari");
        kButton13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton13.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton13.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton13.setkHoverEndColor(new java.awt.Color(22, 82, 240));
        kButton13.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton13.setkHoverStartColor(new java.awt.Color(22, 82, 240));
        kButton13.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton13.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton13.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton13ActionPerformed(evt);
            }
        });
        jPanel22.add(kButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 250, 30));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        jPanel22.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, 30));

        jPanel8.add(jPanel22, "card5");

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel36.setText("Dashboard > Data Pembukuan");
        jPanel23.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        bln.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        bln.setText("Desember");
        jPanel23.add(bln, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        total_pmsk.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        total_pmsk.setText("1000000");
        jPanel23.add(total_pmsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        total_pngln.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        total_pngln.setText("1000000");
        jPanel23.add(total_pngln, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, -1, -1));

        laba.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        laba.setText("1000000");
        jPanel23.add(laba, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, -1, -1));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel35.setText("Laba Untung");
        jPanel23.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, -1, -1));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel37.setText("Rugi");
        jPanel23.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 40, -1));

        rugii.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        rugii.setText("1000000");
        jPanel23.add(rugii, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, -1));

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel39.setText("Total Pemasukan");
        jPanel23.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel40.setText("Total Pengeluaran");
        jPanel23.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 160, -1));

        jLabel50.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel50.setText("Bulan Sekarang");
        jPanel23.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        tahun.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        tahun.setText("2022");
        jPanel23.add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 210, 90, -1));

        bulann.setBackground(new java.awt.Color(0, 153, 153));
        bulann.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bulann.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember" }));
        bulann.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel23.add(bulann, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 270, -1));

        kButton10.setText("Filter Pembukuan");
        kButton10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton10.setkBackGroundColor(new java.awt.Color(22, 82, 240));
        kButton10.setkEndColor(new java.awt.Color(22, 82, 240));
        kButton10.setkHoverEndColor(new java.awt.Color(22, 82, 240));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverStartColor(new java.awt.Color(22, 82, 240));
        kButton10.setkPressedColor(new java.awt.Color(22, 82, 240));
        kButton10.setkSelectedColor(new java.awt.Color(22, 82, 240));
        kButton10.setkStartColor(new java.awt.Color(22, 82, 240));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        jPanel23.add(kButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 270, 30));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/Desktop - 5bg pembukuan.png"))); // NOI18N
        jPanel23.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 660));

        jPanel8.add(jPanel23, "card6");

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel45.setText("Dashboard > Data Paket");
        jPanel31.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel39.setBackground(new java.awt.Color(113, 144, 245));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel55.setText("Kode Paket");

        kd_paket.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_paket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kd_paket.setEnabled(false);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(kd_paket))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kd_paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel56.setText("Nama Paket");

        nama_paket.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nama_paket.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nama_paket))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nama_paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel57.setText("Harga Paket");

        harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hargaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(harga))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kButton15.setText("tambah paket");
        kButton15.setBorderPainted(false);
        kButton15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton15.setkBackGroundColor(new java.awt.Color(255, 65, 85));
        kButton15.setkEndColor(new java.awt.Color(255, 65, 85));
        kButton15.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton15.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton15.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton15.setkPressedColor(new java.awt.Color(255, 65, 85));
        kButton15.setkSelectedColor(new java.awt.Color(255, 65, 85));
        kButton15.setkStartColor(new java.awt.Color(255, 65, 85));
        kButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton15ActionPerformed(evt);
            }
        });

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel46.setText("Jenis Paket");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satuan", "Kiloan" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel31.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        table_paket.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        table_paket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Paket", "Nama Paket", "Jenis Paket", "Harga Paket"
            }
        ));
        table_paket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_paket.setGridColor(new java.awt.Color(255, 255, 255));
        table_paket.setSelectionBackground(new java.awt.Color(51, 51, 255));
        table_paket.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_paket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_paketMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_paket);

        jPanel31.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 640, 310));

        kButton16.setText("Hapus");
        kButton16.setBorderPainted(false);
        kButton16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton16.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton16.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton16.setkHoverEndColor(new java.awt.Color(255, 65, 85));
        kButton16.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton16.setkHoverStartColor(new java.awt.Color(255, 65, 85));
        kButton16.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton16.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton16.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton16ActionPerformed(evt);
            }
        });
        jPanel31.add(kButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        kButton17.setText("update");
        kButton17.setBorderPainted(false);
        kButton17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton17.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton17.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton17.setkHoverEndColor(new java.awt.Color(255, 65, 85));
        kButton17.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton17.setkHoverStartColor(new java.awt.Color(255, 65, 85));
        kButton17.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton17.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton17.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton17ActionPerformed(evt);
            }
        });
        jPanel31.add(kButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel31.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 270, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        jPanel31.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, 30));

        cariDataPaket.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cariDataPaket.setText("Cari");
        cariDataPaket.setBorder(null);
        jPanel31.add(cariDataPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 130, 30));

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel41.setText("Refresh Field");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel31.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBackground/cari menu dashboard utama.png"))); // NOI18N
        jPanel31.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 950, 660));

        jPanel8.add(jPanel31, "card7");

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel53.setText("Dashboard > History Transaksi");
        jPanel35.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 42, -1, -1));

        tgl_awal_ht.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.add(tgl_awal_ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 42, 121, 32));

        tgl_akhir_ht.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.add(tgl_akhir_ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 42, 121, 32));

        tabelhistory.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelhistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelhistoryMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabelhistory);

        jPanel35.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 156, 896, 419));

        kButton8.setText("Hapus");
        kButton8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton8.setkBackGroundColor(new java.awt.Color(255, 65, 85));
        kButton8.setkEndColor(new java.awt.Color(255, 65, 85));
        kButton8.setkHoverEndColor(new java.awt.Color(113, 144, 245));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(113, 144, 245));
        kButton8.setkPressedColor(new java.awt.Color(255, 65, 85));
        kButton8.setkSelectedColor(new java.awt.Color(255, 65, 85));
        kButton8.setkStartColor(new java.awt.Color(255, 65, 85));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        jPanel35.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 587, -1, 36));

        jLabel54.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel54.setText("<===>");
        jPanel35.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 42, -1, 32));

        kButton18.setText("Cari");
        kButton18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kButton18.setkBackGroundColor(new java.awt.Color(113, 144, 245));
        kButton18.setkEndColor(new java.awt.Color(113, 144, 245));
        kButton18.setkHoverEndColor(new java.awt.Color(255, 65, 85));
        kButton18.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton18.setkHoverStartColor(new java.awt.Color(255, 65, 85));
        kButton18.setkPressedColor(new java.awt.Color(113, 144, 245));
        kButton18.setkSelectedColor(new java.awt.Color(113, 144, 245));
        kButton18.setkStartColor(new java.awt.Color(113, 144, 245));
        kButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton18ActionPerformed(evt);
            }
        });
        jPanel35.add(kButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 80, 291, 30));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        jPanel35.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 80, -1, -1));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, -1, -1));

        kd_hist.setText("jTextField1");
        jPanel35.add(kd_hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 593, -1, -1));

        jPanel8.add(jPanel35, "card8");

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 960, 660));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void datatableHistory() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id history");
        tbl.addColumn("kode struk");
        tbl.addColumn("id kasir pertama");
        tbl.addColumn("jumlah bayar awal");
        tbl.addColumn("kurang bayar awal");
        tbl.addColumn("status bayar awal");
        tbl.addColumn("kembalian awal");
        tbl.addColumn("waktu perubahan");
        tabelhistory.setModel(tbl);
        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();
//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from history_transaksi");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_hist"),
                    res.getString("kode_order"),
                    res.getString("id_user_awl"),
                    res.getString("bayar_awl"),
                    res.getString("kurang_byr_awl"),
                    res.getString("status_byr_awl"),
                    res.getString("kembalian_awl"),
                    res.getString("waktu"),});
                tabelhistory.setModel(tbl);
            }
            int b = tabelhistory.getRowCount();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void tampil_data_paket() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode paket");
        tbl.addColumn("NAMA paket");
        tbl.addColumn("jenis paket");
        tbl.addColumn("harga");
        table_paket.setModel(tbl);
        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from paket");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("kd_paket"),
                    res.getString("nama_paket"),
                    res.getString("jenis_paket"),
                    res.getString("harga"),});
                table_paket.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void total_pmsk() {
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat bulan = new SimpleDateFormat("MMMM");
        SimpleDateFormat tahunn = new SimpleDateFormat("yyyy");
        Date bulanini = new Date();
        String monthh = month.format(bulanini);
        bln.setText("" + bulan.format(bulanini));
        tahun.setText("" + tahunn.format(bulanini));
        try {
            String sts = "sudah di ambil";
            String sql = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                    + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs.next();
            String tot = (rs.getString("total_pemasukan"));
            total_pmsk.setText(tot);
//         if (TOT_PEMASUKAN.getText().equals("")) {
//            JOptionPane.showMessageDialog(null,"maaf untuk sekarang data di tabel order dengan status sudah di ambil  masih belum ada");
//            TOT_PEMASUKAN.setText(""+0);
//        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "maaf untuk sekarang data dengan status sudah di ambil masih belum ada" + e.getMessage());
        }
    }

    public void rest_pmbk() {
//        kd_pmb.setText("");
//        lba.setText("");
    }

    public void total_pngl() {
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat bulan = new SimpleDateFormat("MMMM");
        Date bulanini = new Date();
        String monthh = month.format(bulanini);

        try {
            String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs.next();
            String tot = (rs.getString("total_pngl"));
            total_pngln.setText(tot);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }

    public void kd_pmbk() {
//        try {
//
//            String sql = "SELECT * from pembukuan ORDER BY kode_pembukuan DESC";
//            Connection con = (Connection) ConnectionDatabase.configDB();
//            Statement st = (Statement) con.createStatement();
//            ResultSet res = st.executeQuery(sql);
//            if (res.next()) {
//                String NoJual = res.getString("kode_pembukuan").substring(2);
//                String AN = "" + (Integer.parseInt(NoJual) + 1);
////                String AN = "" + (Integer.parseInt(txt_idsupplier.getText()) + 1);
//                String Nol = "";
//
//                if (AN.length() == 1) {
//                    Nol = "000";
//                } else if (AN.length() == 2) {
//                    Nol = "00";
//                } else if (AN.length() == 3) {
//                    Nol = "0";
//                } else if (AN.length() == 4) {
//                    Nol = "";
//                }
//                kd_pmb.setText("PB" + Nol + AN);//sesuaikan dengan variable namenya
//            } else {
//                kd_pmb.setText("PB0001");//sesuaikan dengan variable namenya
//            }
//            res.close();
////            con.close();
//        } catch (Exception e) {
//            //penanganan masalah
//            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
//        }
    }

    public void jumlpgl() {
        listrik.setText("" + 0);
        air.setText("" + 0);
        pewangi.setText("" + 0);
    }

    public void tanggal_pmbk() {
//        int hari, bulan, tahun;
//        GregorianCalendar date = new GregorianCalendar();
//
////    detik = date.get(Calendar.SECOND);
////    menit = date.get(Calendar.MINUTE);
////    jam =  date.get(Calendar.HOUR_OF_DAY);
//        hari = date.get(Calendar.DAY_OF_MONTH);
//        int awal = date.get(Calendar.DAY_OF_MONTH) - 7;
//        bulan = date.get(Calendar.MONTH) + 1;
//        tahun = date.get(Calendar.YEAR);
//        TGL_PMBK.setText("" + tahun + "-" + bulan + "-" + hari);
//        tgl_skr.setText("" + tahun + "-" + bulan + "-" + hari);
//        TGL_AWL.setText("" + tahun + "-" + bulan + "-" + awal);
        SimpleDateFormat sfDate = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggal = new Date();
//    detik = date.get(Calendar.SECOND);
//    menit = date.get(Calendar.MINUTE);
//    jam =  date.get(Calendar.HOUR_OF_DAY);
//    hari = date.get(Calendar.DAY_OF_MONTH);
//    int awal= date.get(Calendar.DAY_OF_MONTH)-7;
//    bulan = date.get(Calendar.MONTH)+1;
//    tahun = date.get(Calendar.YEAR);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date awal = cal.getTime();

//        TGL_PMBK.setText("" + sfDate.format(tanggal));
//        tgl_skr.setText("" + sfDate.format(tanggal));
//        TGL_AWL.setText("" + sfDate.format(awal));
    }

    public void kd_pngl_otomatis() {
//       try {
//           Statement statement=(Statement)konek.GetConnection().createStatement();
//            String sql = "SELECT MAX(kd_pengeluaran)as max FROM pengeluaran";
//        ResultSet res=statement.executeQuery(sql);
//            if (res.next()) {
//                String Nodaf = res.getString("max").substring(2);
//                String AN = "" + (Integer.valueOf(Nodaf) + 1);
////                String AN = "" + (Integer.parseInt(txt_idsupplier.getText()) + 1);
//                String Nol = "";
//
//                if(AN.length()==1)
//                    {Nol = "000";
//                }else if(AN.length()==2){
//                    Nol = "00";
//                }else if(AN.length()==3){
//                    Nol = "0";
//                }else if(AN.length()==4){
//                    Nol = "";
//                }
//                kd_png.setText("PNG" + Nol + AN);//sesuaikan dengan variable namenya
//            } else {
//                kd_png.setText("PNG0001");//sesuaikan dengan variable namenya
//            }
//            res.close();
//            statement.close();
//        } catch (Exception e) {
//            e.printStackTrace();//penanganan masalah
//        }

        try {

            String sql = "SELECT * from pengeluaran ORDER BY kd_pengeluaran DESC";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet res = st.executeQuery(sql);
            if (res.next()) {
                String NoJual = res.getString("kd_pengeluaran").substring(2);
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
                kd_png.setText("PN" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                kd_png.setText("PN0001");//sesuaikan dengan variable namenya
            }
            res.close();
//            con.close();
        } catch (Exception e) {
            //penanganan masalah
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }

    }

    public void tampil_datatabel_datatransaksi() {
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
        table_data_transaksi2.setModel(tbl);

        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tbl_order join pelanggan on pelanggan.id_pelanggan=tbl_order.id_pelanggan join user on user.id_user=tbl_order.id_user");
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
                table_data_transaksi2.setModel(tbl);
            }
            int b = table_data_transaksi2.getRowCount();
            jumlah_data_paket_dsb.setText("" + b);
            total_pmsk();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void tampil_pembukuan() {

    }

    public void datatabel_pengeluaran() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode pengeluaran");
        tbl.addColumn("tanggal pengeluaran");
        tbl.addColumn("biaya listrik");
        tbl.addColumn("biaya air");
        tbl.addColumn("biaya pewangi");
        tbl.addColumn("total");
        tabel_pengeluaran.setModel(tbl);
        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from pengeluaran");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("kd_pengeluaran"),
                    res.getString("tanggal_pengeluaran"),
                    res.getString("biaya_listrik"),
                    res.getString("biaya_air"),
                    res.getString("biaya_pewangi"),
                    res.getString("total"),});
                tabel_pengeluaran.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void tampil_data_kasir() {
        DefaultTableModel tbl = new DefaultTableModel();

        tbl.addColumn("ID KASIR");
        tbl.addColumn("NAMA");
        tbl.addColumn("USERNAME");
        tbl.addColumn("PASSWORD");
        tbl.addColumn("ALAMAT");
        tbl.addColumn("NO TELFON");
        tbl.addColumn("AKSES");
        tabelkasir.setModel(tbl);

        try {
            String kasir = "kasir";
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();
//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from user where akses='" + kasir + "'");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_user"),
                    res.getString("nama"),
                    res.getString("username"),
                    res.getString("password"),
                    res.getString("alamat"),
                    res.getString("no_hp"),
                    res.getString("akses")
                });
                tabelkasir.setModel(tbl);
            }
            int b = tabelkasir.getRowCount();
            jumlah_data_kasir.setText("" + b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }

    public void tanggal_otomatis() {
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

    public void setColor(JPanel p) { // HOVER MENU
        p.setBackground(new Color(113, 144, 245));
    }

    public void resetColor(JPanel pl) { //HOVER MENU
        pl.setBackground(new Color(255, 255, 255));
    }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();

        jPanel8.add(jPanel12);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        setColor(jPanel3);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        resetColor(jPanel3);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();

        jPanel8.add(jPanel13);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        setColor(jPanel4);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        resetColor(jPanel4);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();
        jPanel8.add(jPanel14);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        setColor(jPanel5);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        resetColor(jPanel5);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        setColor(jPanel6);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        resetColor(jPanel6);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();
        jPanel8.add(jPanel23);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        setColor(jPanel7);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        resetColor(jPanel7);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();
        jPanel8.add(jPanel31);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        setColor(jPanel9);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        resetColor(jPanel9);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Keluar Dari Dashboard Admin?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            new form_login_akses().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        setColor(jPanel10);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        resetColor(jPanel10);
    }//GEN-LAST:event_jLabel9MouseExited

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        tambah_data_kasir tdk = new tambah_data_kasir();
        tdk.setVisible(true);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void tabelkasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkasirMouseClicked
        // TODO add your handling code here:
        int baris = tabelkasir.rowAtPoint(evt.getPoint());
        String tid = tabelkasir.getValueAt(baris, 0).toString();
        id_user.setText(tid);
        id_user1.setText(tid);
        this.selected_data_kasir = tid;
        String tnama = tabelkasir.getValueAt(baris, 1).toString();
        nama.setText(tnama);
        nama1.setText(tnama);
        String tusername = tabelkasir.getValueAt(baris, 2).toString();
        username.setText(tusername);
        username10.setText(tusername);
        String tpassword = tabelkasir.getValueAt(baris, 3).toString();
        password.setText(tpassword);
        password1.setText(tpassword);
        String talamat = tabelkasir.getValueAt(baris, 4).toString();
        alamat.setText(talamat);
        alamat1.setText(talamat);
        String tno = tabelkasir.getValueAt(baris, 5).toString();
        notel.setText(tno);
        notel1.setText(tno);
    }//GEN-LAST:event_tabelkasirMouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        if (selected_data_kasir != null) {
            new edit_data_kasir().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Harap Pilih Data Pada Tabel Dengan Klik Data Yang Ingin Di Update");
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        if (selected_data_kasir != null) {
            int selectedOption = JOptionPane.showConfirmDialog(null,
                    "Apakah anda yakin ingin menghapus?", "Apakah ingin mengahpus", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                try {
                    String sql = "DELETE FROM user WHERE id_user='" + selected_data_kasir + "'";
                    Connection con = (Connection) ConnectionDatabase.configDB();
                    PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
                    pst.execute();
//                reset();
                    tampil_data_kasir();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Harap Pilih Data Pada Tabel Dengan Klik Data Yang Ingin Di Hapus");
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    public void buatkoduser() {
        try {
            String sql = "SELECT * from user ORDER BY id_user DESC";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet res = st.executeQuery(sql);
            if (res.next()) {
                String Noplg = res.getString("id_user").substring(2);
                String AN = "" + (Integer.parseInt(Noplg) + 1);
//             
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
                id_user.setText("US" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                id_user.setText("US0001");//sesuaikan dengan variable namenya
            }
            res.close();
//            con.close();
        } catch (Exception e) {
            //penanganan masalah
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Kasir");
        tbl.addColumn("Nama Kasir");
        tbl.addColumn("Username");
        tbl.addColumn("Password");
        tbl.addColumn("Alamat Kasir");
        tbl.addColumn("Nomor");
        tbl.addColumn("Hak Akses");
        try {
            try {
                String sql = "SELECT * FROM user WHERE id_user like'%" + cariDataKasir.getText() + "%'OR alamat like'%" + cariDataKasir.getText() + "%' OR nama like'%" + cariDataKasir.getText() + "%'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                Statement st = (Statement) con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tbl.addRow(new Object[]{
                        rs.getString("id_user"),
                        rs.getString("nama"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("alamat"),
                        rs.getString("no_hp"),
                        rs.getString("akses")
                    });
                    tabelkasir.setModel(tbl);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Kosong || Tidak Ada Data yang Sesuai");
        }
        cariDataKasir.setText("");
        // cari 2
//        String kasir = "kasir";
//        DefaultTableModel tbl = new DefaultTableModel();
//        tbl.addColumn("ID KASIR");
//        tbl.addColumn("NAMA");
//        tbl.addColumn("USERNAME");
//        tbl.addColumn("PASSWORD");
//        tbl.addColumn("ALAMAT");
//        tbl.addColumn("NO HP");
//        tbl.addColumn("HAK AKSES");
//        try {
//            String sql = "SELECT * FROM user WHERE akses= kasir AND nama like'%" + cariDataKasir.getText() + "%' OR alamat like'%" + cariDataKasir.getText() + "%' OR no_hp like'%" + cariDataKasir.getText() + "%'";
//            Connection con = (Connection)ConnectionDatabase.configDB();
//            Statement st = (Statement) con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                tbl.addRow(new Object[]{
//                    rs.getString("id_user"),
//                    rs.getString("nama"),
//                    rs.getString("username"),
//                    rs.getString("password"),
//                    rs.getString("alamat"),
//                    rs.getString("no_hp"),
//                    rs.getString("akses")
//                });
//                tabelkasir.setModel(tbl);
//            }
//        } catch (Exception e) {
//        }
        //}
    }//GEN-LAST:event_jLabel14MouseClicked

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        String kd = kd_png.getText();
//        String tampilan="yyyy-MM-dd";
//        SimpleDateFormat fm =new SimpleDateFormat(tampilan);
        int lis = Integer.parseInt(listrik.getText());
        int aing = Integer.parseInt(air.getText());
        int pwg = Integer.parseInt(pewangi.getText());
        int tutal = Integer.parseInt(total.getText());
        try {
            String sql2 = "INSERT INTO pengeluaran VALUES('" + kd + "', '" + txt_tgl_pngl.getText() + "','" + lis + "','" + aing + "','" + pwg + "','" + tutal + "')";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            datatabel_pengeluaran();
            jumlpgl();
            kd_pngl_otomatis();
            total_pngl();
            total.setText("0");
//            total_pngl();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void tabel_pengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pengeluaranMouseClicked
        // TODO add your handling code here:
        int baris = tabel_pengeluaran.rowAtPoint(evt.getPoint());
        String tkd = tabel_pengeluaran.getValueAt(baris, 0).toString();
        kd_png.setText(tkd);
        String tlis = tabel_pengeluaran.getValueAt(baris, 2).toString();
        listrik.setText(tlis);
        String ai = tabel_pengeluaran.getValueAt(baris, 3).toString();
        air.setText(ai);
        String pe = tabel_pengeluaran.getValueAt(baris, 4).toString();
        pewangi.setText(pe);
        String tu = tabel_pengeluaran.getValueAt(baris, 5).toString();
        total.setText(tu);
    }//GEN-LAST:event_tabel_pengeluaranMouseClicked

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        try {
            int lis = Integer.parseInt(listrik.getText());
            int aing = Integer.parseInt(air.getText());
            int pwg = Integer.parseInt(pewangi.getText());
            int tot = lis + aing + pwg;
            total.setText("" + tot);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Harap masukkan jumlah dengan benar/inputan harus berupa angka");
        }

    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        // TODO add your handling code here:
        String ID = kd_png.getText();
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        int lis = Integer.parseInt(listrik.getText());
        int aing = Integer.parseInt(air.getText());
        int pwg = Integer.parseInt(pewangi.getText());
        int tutal = Integer.parseInt(total.getText());
        try {
            String sql = "UPDATE pengeluaran SET kd_pengeluaran='" + ID + "',tanggal_pengeluaran='" + txt_tgl_pngl.getText() + "',biaya_listrik='" + lis + "',biaya_air='" + aing + "',biaya_pewangi='" + pwg + "',total='" + tutal + "' WHERE kd_pengeluaran='" + ID + "'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil di EDIT");
            pst.execute();
            datatabel_pengeluaran();
            datatabel_pengeluaran();
            jumlpgl();
            kd_pngl_otomatis();
            total_pngl();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data GAGAL di EDIT");
        }
    }//GEN-LAST:event_kButton7ActionPerformed

    public void tanggl_pengel() {
//        int hari, bulan, tahun;
//        GregorianCalendar date = new GregorianCalendar();
////    detik = date.get(Calendar.SECOND);
////    menit = date.get(Calendar.MINUTE);
////    jam =  date.get(Calendar.HOUR_OF_DAY);
//        hari = date.get(Calendar.DAY_OF_MONTH);
//        bulan = date.get(Calendar.MONTH) + 1;
//        tahun = date.get(Calendar.YEAR);
//        txt_tgl_pngl.setText("" + tahun + "-" + bulan + "-" + hari);
        SimpleDateFormat sfDate = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggal = new Date();
        txt_tgl_pngl.setText("" + sfDate.format(tanggal));

    }
    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin menghapus?", "Apakah ingin mengahpus", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM pengeluaran WHERE kd_pengeluaran='" + kd_png.getText() + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
                pst.execute();
                datatabel_pengeluaran();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
            }
        }
    }//GEN-LAST:event_kButton6ActionPerformed

    public void reset_pengeluaran() {
        kd_png.setText("");
        listrik.setText("");
        air.setText("");
        pewangi.setText("");
        total.setText("");

    }

    public void reset_paket() {
//        kd_pake.setText("");
        nama_paket.setText("");
        harga.setText("");
//        pewangi.setText("");
//        total.setText("");
    }
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String awal = String.valueOf(fm.format(cariDataPengeluaranm.getDate()));
//        String sampai = String.valueOf(fm.format(tgl_akhir.getDate()));
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode pengeluaran");
        tbl.addColumn("tanggal pengeluaran");
        tbl.addColumn("biaya listrik");
        tbl.addColumn("biaya air");
        tbl.addColumn("biaya pewangi");
        tbl.addColumn("total");
        try {
            String sql = "SELECT * FROM pengeluaran WHERE tanggal_pengeluaran like'%" + awal + "%'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kd_pengeluaran"),
                    rs.getString("tanggal_pengeluaran"),
                    rs.getString("biaya_listrik"),
                    rs.getString("biaya_air"),
                    rs.getString("biaya_pewangi"),
                    rs.getString("total")
                });
                tabel_pengeluaran.setModel(tbl);
            }
        } catch (Exception e) {
        }
        cariDataPengeluaranm.setCalendar(null);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void table_data_transaksi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_transaksi2MouseClicked
        // TODO add your handling code here:
        int baris = table_data_transaksi2.rowAtPoint(evt.getPoint());
        String tid = table_data_transaksi2.getValueAt(baris, 0).toString();
        kd_strk.setText(tid);
//        this.selectedkdtrs = tid;
        this.selected_detail_transaksi = tid;
        String tidpl = table_data_transaksi2.getValueAt(baris, 1).toString();
        id_pelgn.setText(tidpl);
//String tidusr=table.getValueAt(baris,3).toString();
//        id_ksr.setText(tidusr);
        String tg_psn = table_data_transaksi2.getValueAt(baris, 5).toString();
        tgl_pesan.setText(tg_psn);
        String tg_sl = table_data_transaksi2.getValueAt(baris, 6).toString();
        tgl_sls.setText(tg_sl);
        String grnt = table_data_transaksi2.getValueAt(baris, 7).toString();
        total_byr.setText(grnt);
        String sisabayar = table_data_transaksi2.getValueAt(baris, 9).toString();
        sis_byr.setText(sisabayar);
        String st_byr = table_data_transaksi2.getValueAt(baris, 10).toString();
        sts_byr.setText(st_byr);
        String kembaln = table_data_transaksi2.getValueAt(baris, 11).toString();
        kembalian.setText(kembaln);
    }//GEN-LAST:event_table_data_transaksi2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();
        jPanel8.add(jPanel22);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        // TODO add your handling code here:
        if (selected_detail_transaksi != null) {
            new detail_transaksi_two().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Harap pilih/klik salah satu data di tabel");
        }
    }//GEN-LAST:event_kButton9ActionPerformed

    private void kButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton15ActionPerformed
        // TODO add your handling code here:
        try {
            Long.parseLong(harga.getText());
            try {
                String kd = kd_paket.getText();
                String Nama = nama_paket.getText();
                String kdj = (String) jComboBox1.getSelectedItem();

                String sql = "INSERT INTO paket VALUES('" + kd + "', '" + Nama + "', '" + kdj + "','" + Integer.parseInt(harga.getText()) + "')";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil di tambah");
                tampil_data_paket();
                buatkodpaket();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di tambah karna kode paket telah tersedian");
            }

            resetPaket();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "masukkan harga dengan angka");
        }

    }//GEN-LAST:event_kButton15ActionPerformed
    public void labarg() {
        try {
            int peng = Integer.parseInt(total_pngln.getText());
            int pemsk = Integer.parseInt(total_pmsk.getText());
            int rugi = peng - pemsk;
            int labaa = pemsk - peng;
            if (pemsk > peng) {
                laba.setText("" + labaa);
                rugii.setText("" + 0);
            } else if (peng > pemsk) {
                laba.setText("" + 0);
                rugii.setText("" + rugi);
            } else if (peng == pemsk) {
                laba.setText("" + 0);
                rugii.setText("" + 0);
            }
            if (rootPaneCheckingEnabled) {

            }

        } catch (Exception e) {
        }
    }

    void resetPaket() {
//        kd_paket.setText("");/
        nama_paket.setText("");
        harga.setText("");
    }
    private void table_paketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_paketMouseClicked
        // TODO add your handling code here:
        int baris = table_paket.rowAtPoint(evt.getPoint());
        String tkd = table_paket.getValueAt(baris, 0).toString();
        kd_paket.setText(tkd);
        String tnama = table_paket.getValueAt(baris, 1).toString();
        nama_paket.setText(tnama);
        String tcmb = table_paket.getValueAt(baris, 2).toString();
        jComboBox1.setSelectedItem(tcmb);
        String tno = table_paket.getValueAt(baris, 3).toString();
        harga.setText(tno);
    }//GEN-LAST:event_table_paketMouseClicked

    private void kButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton16ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin menghapus?", "Apakah ingin mengahpus", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM paket WHERE kd_paket='" + kd_paket.getText() + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
                pst.execute();
                tampil_data_paket();
                buatkodpaket();
                resetPaket();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
            }
        }
    }//GEN-LAST:event_kButton16ActionPerformed

    private void kButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton17ActionPerformed

        // TODO add your handling code here:
        try {
            Long.parseLong(harga.getText());
            try {
                String kd = kd_paket.getText();
                String Nama = nama_paket.getText();
                String kdj = (String) jComboBox1.getSelectedItem();

                String sql = "UPDATE paket SET kd_paket='" + kd + "',nama_paket='" + Nama + "',jenis_paket='" + kdj + "',harga='" + Integer.parseInt(harga.getText()) + "' WHERE kd_paket='" + kd + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil di EDIT");
                pst.execute();
                tampil_data_paket();
                resetPaket();
                buatkodpaket();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data GAGAL di EDIT" + e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "harap masukkan bayar dengan benar");
        }

    }//GEN-LAST:event_kButton17ActionPerformed

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Paket");
        tbl.addColumn("Nama Paket");
        tbl.addColumn("Jenis Paket");
        tbl.addColumn("Harga Paket");
        try {
            String sql = "SELECT * FROM paket WHERE kd_paket like'%" + cariDataPaket.getText() + "%'OR nama_paket like'%" + cariDataPaket.getText() + "%' OR jenis_paket like'%" + cariDataPaket.getText() + "%'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kd_paket"),
                    rs.getString("nama_paket"),
                    rs.getString("jenis_paket"),
                    rs.getString("harga")
                });
                table_paket.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel48MouseClicked

    public void buatkodpaket() {
        try {

            String sql = "SELECT * from paket ORDER BY kd_paket DESC";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet res = st.executeQuery(sql);
            if (res.next()) {
                String Noplg = res.getString("kd_paket").substring(2);
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
                kd_paket.setText("PK" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                kd_paket.setText("PK0001");//sesuaikan dengan variable namenya
            }
            res.close();
//            con.close();
        } catch (Exception e) {
            //penanganan masalah
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());
        }
    }
    private void hargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaKeyReleased

    private void kd_pngKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kd_pngKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_pngKeyReleased

    private void listrikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listrikKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_listrikKeyReleased

    private void airKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_airKeyReleased

    private void pewangiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pewangiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pewangiKeyReleased

    private void kButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton13ActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String awal = String.valueOf(fm.format(tgl_awal.getDate()));
        String sampai = String.valueOf(fm.format(tgl_akhir.getDate()));
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode struk");

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

        try {
            String sql = "select * from tbl_order join pelanggan on pelanggan.id_pelanggan=tbl_order.id_pelanggan join user on user.id_user=tbl_order.id_user "
                    + "WHERE tbl_order.tgl_pesan BETWEEN '" + awal + "' AND '" + sampai + "'";
            Connection con = (Connection) ConnectionDatabase.configDB();
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kode_order"),
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
                    rs.getString("status_ambil")

                });
                table_data_transaksi2.setModel(tbl);
            }
        } catch (Exception e) {
        }
        resettglCariDataTransaksi();
    }//GEN-LAST:event_kButton13ActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) tabel_pengeluaran.getModel();
        mdl.setRowCount(0);
        datatabel_pengeluaran();
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) table_data_transaksi2.getModel();
        mdl.setRowCount(0);
        tampil_datatabel_datatransaksi();
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) tabelkasir.getModel();
        mdl.setRowCount(0);
        tampil_data_kasir();
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseEntered
        // TODO add your handling code here:
        setColor(jPanel34);
    }//GEN-LAST:event_jLabel52MouseEntered

    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        // TODO add your handling code here:
        resetColor(jPanel34);
    }//GEN-LAST:event_jLabel52MouseExited

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // TODO add your handling code here:
        jPanel8.removeAll();
        jPanel8.repaint();
        jPanel8.revalidate();
        jPanel8.add(jPanel35);
        jPanel8.repaint();
        jPanel8.revalidate();
    }//GEN-LAST:event_jLabel52MouseClicked

    private void kButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton18ActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String awal = String.valueOf(fm.format(tgl_awal_ht.getDate()));
        String sampai = String.valueOf(fm.format(tgl_akhir_ht.getDate()));
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id history");
        tbl.addColumn("kode struk");
        tbl.addColumn("id kasir pertama");
        tbl.addColumn("jumlah bayar awal");
        tbl.addColumn("kurang bayar awal");
        tbl.addColumn("kembalian awal");
        tbl.addColumn("waktu perubahan");
        tabelhistory.setModel(tbl);

        try {
            Statement statement = (Statement) ConnectionDatabase.configDB().createStatement();

//           Statement statement=(Statement)coneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from history_transaksi where waktu BETWEEN '" + awal + "' AND '" + sampai + "'");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_hist"),
                    res.getString("kode_order"),
                    res.getString("id_user_awl"),
                    res.getString("bayar_awl"),
                    res.getString("kurang_byr_awl"),
                    res.getString("status_byr_awl"),
                    res.getString("kembalian_awl"),
                    res.getString("waktu"),});
                tabelhistory.setModel(tbl);
            }
            int b = tabelhistory.getRowCount();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal" + e.getMessage());

        }
    }//GEN-LAST:event_kButton18ActionPerformed

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        // TODO add your handling code here:
        DefaultTableModel mdl = (DefaultTableModel) tabelhistory.getModel();
        mdl.setRowCount(0);
        datatableHistory();
    }//GEN-LAST:event_jLabel58MouseClicked

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin menghapus?", "Apakah ingin mengahpus", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM history_transaksi WHERE id_hist='" + kd_hist.getText() + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
                pst.execute();
                tampil_pembukuan();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
            }
        }
        datatableHistory();
    }//GEN-LAST:event_kButton8ActionPerformed

    private void tabelhistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelhistoryMouseClicked
        // TODO add your handling code here:
        int baris = tabelhistory.rowAtPoint(evt.getPoint());
        String tkd = tabelhistory.getValueAt(baris, 0).toString();
        kd_hist.setText(tkd);
    }//GEN-LAST:event_tabelhistoryMouseClicked

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed

        // TODO add your handling code here:
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat bulan = new SimpleDateFormat("MMMM");
        Date bulanini = new Date();
        String monthh = month.format(bulanini);

        if (bulann.getSelectedItem().equals("januari")) {
            monthh = "01";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + e.getMessage());
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
            }
        } else if (bulann.getSelectedItem().equals("februari")) {
            monthh = "02";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + e.getMessage());
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);

            }
        } else if (bulann.getSelectedItem().equals("maret")) {
            monthh = "03";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("april")) {
            monthh = "04";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("mei")) {
            monthh = "05";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("juni")) {
            monthh = "06";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("juli")) {
            monthh = "07";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("agustus")) {
            monthh = "08";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("september")) {
            monthh = "09";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("oktober")) {
            monthh = "10";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else if (bulann.getSelectedItem().equals("november")) {
            monthh = "11";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        } else {
            monthh = "12";
            try {
                String sql = "select SUM(total) AS total_pngl,month(tanggal_pengeluaran) bulan FROM pengeluaran group by bulan having bulan='" + monthh + "'";
                String sts = "sudah di ambil";
                String sql1 = "select SUM(grand_total) AS total_pemasukan,month(tgl_selesai) bulan FROM tbl_order "
                        + "where status_ambil='" + sts + "'group by bulan having bulan='" + monthh + "'";
                Connection con = (Connection) ConnectionDatabase.configDB();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                rs.next();
                String tot = (rs.getString("total_pngl"));
                total_pngln.setText(tot);
                rs1.next();
                String total = (rs1.getString("total_pemasukan"));
                total_pmsk.setText(total);
                labarg();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + "Data Bulan Ini Masih Kosong");
                total_pngln.setText("" + 0);
                total_pmsk.setText("" + 0);
                laba.setText("0");
                rugii.setText("0");
            }
        }
    }//GEN-LAST:event_kButton10ActionPerformed

    private void cariDataKasirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cariDataKasirFocusGained
        // TODO add your handling code here:
        if (cariDataKasir.getText().equals("Cari")) {
            cariDataKasir.setText("");
            cariDataKasir.setForeground(Color.black);
        }
    }//GEN-LAST:event_cariDataKasirFocusGained

    private void cariDataKasirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cariDataKasirFocusLost
        // TODO add your handling code here:
        if (cariDataKasir.getText().equals("")) {
            cariDataKasir.setText("Cari");
            cariDataKasir.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_cariDataKasirFocusLost

    private void listrikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listrikFocusGained
        // TODO add your handling code here:
        if (listrik.getText().equals("0")) {
            listrik.setText("");
            listrik.setForeground(Color.black);
        }
    }//GEN-LAST:event_listrikFocusGained

    private void listrikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listrikFocusLost
        // TODO add your handling code here:
        if (listrik.getText().equals("")) {
            listrik.setText("0");
            listrik.setForeground(Color.black);
        }
    }//GEN-LAST:event_listrikFocusLost

    private void airFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_airFocusGained
        // TODO add your handling code here:
        if (air.getText().equals("0")) {
            air.setText("");
            air.setForeground(Color.black);
        }
    }//GEN-LAST:event_airFocusGained

    private void airFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_airFocusLost
        // TODO add your handling code here:
        if (air.getText().equals("")) {
            air.setText("0");
            air.setForeground(Color.black);
        }
    }//GEN-LAST:event_airFocusLost

    private void pewangiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pewangiFocusLost
        // TODO add your handling code here:
        if (pewangi.getText().equals("")) {
            pewangi.setText("0");
            pewangi.setForeground(Color.black);
        }
    }//GEN-LAST:event_pewangiFocusLost

    private void pewangiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pewangiFocusGained
        // TODO add your handling code here:
        if (pewangi.getText().equals("0")) {
            pewangi.setText("");
            pewangi.setForeground(Color.black);
        }
    }//GEN-LAST:event_pewangiFocusGained

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        kd_pngl_otomatis();
        listrik.setText("0");
        air.setText("0");
        pewangi.setText("0");
        total.setText("0");
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        buatkodpaket();
        nama_paket.setText("");
        harga.setText("0");
    }//GEN-LAST:event_jLabel41MouseClicked

    void resettglCariDataTransaksi() {
        tgl_akhir.setCalendar(null);
        tgl_awal.setCalendar(null);
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
            java.util.logging.Logger.getLogger(dashboard_admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField air;
    private javax.swing.JLabel bln;
    private javax.swing.JComboBox<String> bulann;
    private javax.swing.JTextField cariDataKasir;
    private javax.swing.JTextField cariDataPaket;
    private com.toedter.calendar.JDateChooser cariDataPengeluaranm;
    private javax.swing.JTextField cariDataTransaksi;
    private javax.swing.JTextField harga;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel jumlah_data_kasir;
    private javax.swing.JLabel jumlah_data_paket_dsb;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton13;
    private com.k33ptoo.components.KButton kButton15;
    private com.k33ptoo.components.KButton kButton16;
    private com.k33ptoo.components.KButton kButton17;
    private com.k33ptoo.components.KButton kButton18;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    private javax.swing.JTextField kd_hist;
    private javax.swing.JTextField kd_paket;
    private javax.swing.JTextField kd_png;
    private javax.swing.JLabel laba;
    private javax.swing.JTextField listrik;
    public static final javax.swing.JLabel loginAdmin = new javax.swing.JLabel();
    private javax.swing.JTextField nama_paket;
    public static final javax.swing.JLabel nameAdminLogin2 = new javax.swing.JLabel();
    private javax.swing.JTextField pewangi;
    private javax.swing.JLabel rugii;
    private javax.swing.JTable tabel_pengeluaran;
    private javax.swing.JTable tabelhistory;
    public static final javax.swing.JTable tabelkasir = new javax.swing.JTable();
    public static final javax.swing.JTable table_data_transaksi2 = new javax.swing.JTable();
    private javax.swing.JTable table_paket;
    private javax.swing.JLabel tahun;
    private javax.swing.JLabel tanggal_laman_dashboard;
    private com.toedter.calendar.JDateChooser tgl_akhir;
    private com.toedter.calendar.JDateChooser tgl_akhir_ht;
    private com.toedter.calendar.JDateChooser tgl_awal;
    private com.toedter.calendar.JDateChooser tgl_awal_ht;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_pmsk;
    private javax.swing.JLabel total_pngln;
    private javax.swing.JTextField txt_tgl_pngl;
    // End of variables declaration//GEN-END:variables
}
