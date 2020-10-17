package view.nhanvien;

import controller.CapNhatTienHoaDon;
import controller.CheckHoaDon;
import controller.PTHoaDon;
import controller.TimKiemSanPham;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modal.ConnectDAO;
import modal.DAO;
import modal.KhachHang;
import modal.NhanVien;
import modal.NhomSanPham;
import modal.SanPham;
import view.jfBanHang;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;
import modal.DongHoaDon;

public class pnMain extends javax.swing.JPanel {

    int dem = -100;
    JPanel pnBanHang;
    float tien = 0;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    NhanVien nv = null;
    KhachHang kh = null;
    String idHoaDon;
    jfBanHang jfbh;

    public pnMain(JPanel pnBanHang, KhachHang kh, NhanVien nv, String idHoaDon) {
        initComponents();
        this.pnBanHang = pnBanHang;
        this.kh = kh;
        this.nv = nv;
        this.idHoaDon = idHoaDon;
        if (kh != null) {
            loadNhomSanPham();
            loadSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
            txtTenKhachHang.setText(kh.getHoTen());
        } else {
            pnFull.removeAll();
            JLabel lb = new JLabel();
            lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg"))); // NOI18N
            pnFull.add(lb);
            lb.setBounds(0, 0, 1440, 600);
        }
        if (new CheckHoaDon().check(idHoaDon) == true) {
            btnTaoHoaDon.setEnabled(false);
        } else {
            btnTaoHoaDon.setEnabled(true);
        }
        btnTaoHoaDon.setEnabled(false);
        txtTenKhachHang.setEditable(false);
        txtSoDiemTich.setEditable(false);
        loadPTThanhToan();
    }

    public pnMain(JPanel pnBanHang, KhachHang kh, NhanVien nv, jfBanHang jfbh) {
        initComponents();
        this.pnBanHang = pnBanHang;
        this.kh = kh;
        this.nv = nv;
        this.jfbh = jfbh;
        if (kh != null) {
            loadNhomSanPham();
            loadSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
            txtTenKhachHang.setText(kh.getHoTen());
        } else {
            pnFull.removeAll();
            JLabel lb = new JLabel();
            lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg"))); // NOI18N
            pnFull.add(lb);
            lb.setBounds(0, 0, 1440, 600);

        }
        txtTenKhachHang.setEditable(false);
        txtSoDiemTich.setEditable(false);
        loadPTThanhToan();
    }

    public pnMain(JPanel pnFull) {
        initComponents();
        this.pnFull = pnFull;
        pnFull.removeAll();
        JLabel lb = new JLabel();
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg"))); // NOI18N
        pnFull.add(lb);
        lb.setBounds(0, 0, 1440, 600);
        txtTenKhachHang.setEditable(false);
        txtSoDiemTich.setEditable(false);
        loadPTThanhToan();
    }

    public void loadNhomSanPham() {
        List<NhomSanPham> list = new DAO().getNhomSanPham();
        for (int i = 0; i < list.size(); i++) {
            cbNhomSanPham.addItem(list.get(i).getTenNhomSanPham());
        }
    }

    public void loadSanPhamByNhomSanPham(List<SanPham> list) {
        int left = -200;
        int top = -150;
        for (int i = 0; i < list.size(); i++) {
            if (i % 5 == 0) {
                top += 160;
                left = 0;
            } else {
                left += 200;
                top += 0;
            }
            JPanel pn = new JPanel();
            pn.setBackground(Color.yellow);
            JLabel lbTenSanPham = new JLabel();
            JLabel lbGiaSanPham = new JLabel();
            JLabel lbHinhSanPham = new JLabel();
            pn.setLayout(null);
            lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            lbTenSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbTenSanPham.setText(list.get(i).getTenSanPham());
            pn.add(lbTenSanPham);
            lbTenSanPham.setBounds(0, 70, 190, 30);

            lbGiaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            lbGiaSanPham.setForeground(java.awt.Color.red);
            lbGiaSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbGiaSanPham.setText(formatter.format(list.get(i).getDonGia()) + " VNĐ");
            pn.add(lbGiaSanPham);
            lbGiaSanPham.setBounds(0, 100, 190, 30);

            lbHinhSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbHinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/pay.png"))); // NOI18N
            pn.add(lbHinhSanPham);
            lbHinhSanPham.setBounds(30, 10, 120, 60);

            pnChonSanPham.add(pn);
            pn.setBounds(left, top, 190, 130);
            pnChonSanPham.setPreferredSize(new Dimension(left, top));
            SanPham sp = list.get(i);

            pn.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jfBanHang nvs = new jfBanHang(nv);
                    pnDSoLuong soLuong = new pnDSoLuong(nvs, true, sp, nv, kh, idHoaDon, pnSanPhamDaChon, jScrollPane2,
                            pnBanHang, txtTongTien, btnTaoHoaDon, txtTienKhuyenMai);
                    soLuong.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                    soLuong.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    soLuong.setVisible(true);
                }
            });
        }
        list = null;
    }

    public void loadSanPhamByNhomSanPham(String tenNhomSP) {
        List<SanPham> list = new DAO().getSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
        int left = -200;
        int top = -150;
        for (int i = 0; i < list.size(); i++) {
            if (i % 5 == 0) {
                top += 160;
                left = 0;
            } else {
                left += 200;
                top += 0;
            }
            JPanel pn = new JPanel();
            pn.setBackground(Color.yellow);
            JLabel lbTenSanPham = new JLabel();
            JLabel lbGiaSanPham = new JLabel();
            JLabel lbHinhSanPham = new JLabel();
            pn.setLayout(null);
            lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            lbTenSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbTenSanPham.setText(list.get(i).getTenSanPham());
            pn.add(lbTenSanPham);
            lbTenSanPham.setBounds(0, 70, 190, 30);

            lbGiaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            lbGiaSanPham.setForeground(java.awt.Color.red);
            lbGiaSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbGiaSanPham.setText(formatter.format(list.get(i).getDonGia()) + " VNĐ");
            pn.add(lbGiaSanPham);
            lbGiaSanPham.setBounds(0, 100, 190, 30);

            lbHinhSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbHinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/pay.png"))); // NOI18N
            pn.add(lbHinhSanPham);
            lbHinhSanPham.setBounds(30, 10, 120, 60);

            pnChonSanPham.add(pn);
            pn.setBounds(left, top, 190, 130);
            pnChonSanPham.setPreferredSize(new Dimension(left, top));
            SanPham sp = list.get(i);

            pn.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jfBanHang nvs = new jfBanHang(nv);
                    pnDSoLuong soLuong = new pnDSoLuong(nvs, true, sp, nv, kh, idHoaDon, pnSanPhamDaChon, jScrollPane2,
                            pnBanHang, txtTongTien, btnTaoHoaDon, txtTienKhuyenMai);
                    soLuong.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                    soLuong.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    soLuong.setVisible(true);
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtTienKhachTra = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        ptThanhToan = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnTaoHoaDon = new javax.swing.JButton();
        txtTienKhuyenMai = new javax.swing.JTextField();
        pnFull = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        cbNhomSanPham = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDiemTich = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        suaKhachHang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnChonSanPham = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnSanPhamDaChon = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 740));
        jPanel1.setLayout(null);

        jPanel21.setBackground(java.awt.Color.white);
        jPanel21.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Tiền Khuyến Mãi");
        jPanel21.add(jLabel37);
        jLabel37.setBounds(40, 20, 160, 24);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel34.setText("Tiền Khách Trả");
        jPanel21.add(jLabel34);
        jLabel34.setBounds(40, 80, 160, 24);

        txtTienKhachTra.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTienKhachTra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhachTra.setText("0");
        txtTienKhachTra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.add(txtTienKhachTra);
        txtTienKhachTra.setBounds(210, 70, 230, 42);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Thanh Toán");
        jPanel21.add(jLabel41);
        jLabel41.setBounds(560, 20, 101, 24);

        ptThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ptThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel21.add(ptThanhToan);
        ptThanhToan.setBounds(710, 10, 230, 40);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel35.setText("Tổng Tiền");
        jPanel21.add(jLabel35);
        jLabel35.setBounds(560, 80, 86, 24);

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");
        txtTongTien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });
        jPanel21.add(txtTongTien);
        txtTongTien.setBounds(710, 70, 230, 42);

        btnTaoHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTaoHoaDon.setText("Tạo Hóa Đơn");
        btnTaoHoaDon.setEnabled(false);
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });
        jPanel21.add(btnTaoHoaDon);
        btnTaoHoaDon.setBounds(1070, 20, 320, 70);

        txtTienKhuyenMai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTienKhuyenMai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhuyenMai.setText("0");
        txtTienKhuyenMai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.add(txtTienKhuyenMai);
        txtTienKhuyenMai.setBounds(210, 10, 230, 42);

        jPanel1.add(jPanel21);
        jPanel21.setBounds(0, 610, 1440, 120);

        pnFull.setLayout(null);

        jPanel23.setBackground(java.awt.Color.white);
        jPanel23.setLayout(null);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Nhập Tên Mặt Hàng Cần Thêm Hoặc Chọn Bên Dưới");
        jPanel23.add(jLabel38);
        jLabel38.setBounds(110, 0, 450, 30);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        jPanel23.add(txtSearch);
        txtSearch.setBounds(110, 40, 450, 40);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/search1.png"))); // NOI18N
        jPanel23.add(jLabel39);
        jLabel39.setBounds(10, 10, 80, 60);

        jPanel24.setBackground(java.awt.Color.white);
        jPanel24.setLayout(null);

        cbNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbNhomSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomSanPhamActionPerformed(evt);
            }
        });
        jPanel24.add(cbNhomSanPham);
        cbNhomSanPham.setBounds(20, 20, 360, 50);

        jPanel23.add(jPanel24);
        jPanel24.setBounds(610, 0, 450, 90);

        pnFull.add(jPanel23);
        jPanel23.setBounds(440, 0, 1000, 90);

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel36.setText("Tên Khách Hàng");
        jPanel19.add(jLabel36);
        jLabel36.setBounds(10, 10, 141, 24);

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(txtTenKhachHang);
        txtTenKhachHang.setBounds(160, 10, 250, 30);

        txtSoDiemTich.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDiemTich.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDiemTich.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(txtSoDiemTich);
        txtSoDiemTich.setBounds(160, 50, 160, 30);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điểm Tích");
        jPanel19.add(jLabel40);
        jLabel40.setBounds(10, 50, 112, 24);

        suaKhachHang.setBackground(java.awt.Color.orange);
        suaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        suaKhachHang.setText("Sửa");
        suaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaKhachHangActionPerformed(evt);
            }
        });
        jPanel19.add(suaKhachHang);
        suaKhachHang.setBounds(340, 50, 70, 30);

        pnFull.add(jPanel19);
        jPanel19.setBounds(0, 0, 430, 90);

        pnChonSanPham.setBackground(java.awt.Color.white);
        pnChonSanPham.setLayout(null);
        jScrollPane1.setViewportView(pnChonSanPham);

        pnFull.add(jScrollPane1);
        jScrollPane1.setBounds(440, 100, 970, 490);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(430, 450));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(430, 450));
        jScrollPane2.setName(""); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(430, 450));

        pnSanPhamDaChon.setBackground(java.awt.Color.white);
        pnSanPhamDaChon.setMaximumSize(new java.awt.Dimension(4000, 4000));
        pnSanPhamDaChon.setMinimumSize(new java.awt.Dimension(4000, 4000));
        pnSanPhamDaChon.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout pnSanPhamDaChonLayout = new javax.swing.GroupLayout(pnSanPhamDaChon);
        pnSanPhamDaChon.setLayout(pnSanPhamDaChonLayout);
        pnSanPhamDaChonLayout.setHorizontalGroup(
            pnSanPhamDaChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4000, Short.MAX_VALUE)
        );
        pnSanPhamDaChonLayout.setVerticalGroup(
            pnSanPhamDaChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4000, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(pnSanPhamDaChon);

        pnFull.add(jScrollPane2);
        jScrollPane2.setBounds(0, 100, 420, 490);

        jPanel2.setLayout(null);

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Danh Sách Sản Phẩm Đã Chọn");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 40);

        pnFull.add(jPanel2);
        jPanel2.setBounds(0, 0, 430, 40);

        jPanel1.add(pnFull);
        pnFull.setBounds(0, 0, 1440, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void loadPTThanhToan() {
        ptThanhToan.removeAll();
        ptThanhToan.removeAllItems();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TenPTThanhToan FROM PhuongThucThanhToan";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ptThanhToan.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getIDPTThanhToan(String tenPTThanhToan) {
        String string = "";
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT IDPTThanhToan FROM PhuongThucThanhToan WHERE TenPTThanhToan = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenPTThanhToan);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                string = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }
    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        List<DongHoaDon> list = new PTHoaDon().getListDongHoaDon(idHoaDon);
        float tongTien = 0;
        float tienKhuyenMai = 0;
        for (int i = 0; i < list.size(); i++) {
            tongTien += (list.get(i).getDonGia() * list.get(i).getSoLuong());
            tienKhuyenMai += (list.get(i).getDonGia() * (list.get(i).getGiam() / 100)) * list.get(i).getSoLuong();
        }
        if (Float.parseFloat(txtTienKhachTra.getText()) < (tongTien - tienKhuyenMai)) {

        } else {
            CapNhatTienHoaDon cn = new CapNhatTienHoaDon();
            cn.CapNhat(tongTien - tienKhuyenMai, idHoaDon);
            pnBanHang.removeAll();
            jpnTaoHoaDon thd = new jpnTaoHoaDon(pnBanHang, list, Float.parseFloat(txtTienKhachTra.getText()), tienKhuyenMai);
            if (ptThanhToan.getSelectedItem().toString().equals("ATM")) {
                pnDAtm pnAtm = new pnDAtm(jfbh, true,kh, nv, this, pnBanHang, thd,ptThanhToan.getSelectedItem().toString());
                pnAtm.setVisible(true);
                
            } else {
                thd.setVisible(true);
                pnBanHang.setLayout(new BorderLayout());
                pnBanHang.add(thd);
                pnBanHang.validate();
            }
        }
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed

    }//GEN-LAST:event_txtTongTienActionPerformed

    private void suaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaKhachHangActionPerformed
        new pnDSuaKH(jfbh, true, txtTenKhachHang,kh.getIdKhachHang()).setVisible(true);
    }//GEN-LAST:event_suaKhachHangActionPerformed

    private void cbNhomSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomSanPhamActionPerformed
        pnChonSanPham.removeAll();
        pnChonSanPham.repaint();
        loadSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
    }//GEN-LAST:event_cbNhomSanPhamActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        pnChonSanPham.removeAll();
        pnChonSanPham.repaint();
        List<SanPham> list = new TimKiemSanPham().getSanPhamByNhomSanPham(txtSearch.getText());
        loadSanPhamByNhomSanPham(list);
    }//GEN-LAST:event_txtSearchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JComboBox<String> cbNhomSanPham;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnChonSanPham;
    private javax.swing.JPanel pnFull;
    private javax.swing.JPanel pnSanPhamDaChon;
    private javax.swing.JComboBox<String> ptThanhToan;
    private javax.swing.JButton suaKhachHang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoDiemTich;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTienKhachTra;
    private javax.swing.JTextField txtTienKhuyenMai;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
