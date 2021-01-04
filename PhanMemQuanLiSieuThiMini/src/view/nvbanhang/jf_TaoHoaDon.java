package view.nvbanhang;

import controller.CapNhatTienHoaDon;
import controller.DrawBill;
import controller.LuuAtm;
import controller.PTHoaDon;
import controller.SuaDiemTieuDung;
import controller.ThemKhachHang;
import controller.UDSoLuongHienTai;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.ConnectDAO;
import model.DongHoaDon;
import model.InfoAtm;
import model.KhachHang;
import model.NhanVien;
import model.StringUtil;

public class jf_TaoHoaDon extends javax.swing.JFrame {

    List<DongHoaDon> list;
    KhachHang kh;
    NhanVien nv;
    InfoAtm info;
    String tenPTThanhToans;
    JPanel pnMain;
    float tienKhuyenMai;
    float tienCheck = 0;
    String idHoaDon = StringUtil.taoID("IDHoaDon", "HoaDon", "HD");
    String time = "";
    float tongTienFull;
    String idThongTin = StringUtil.taoID("IDThongTin", "ThongTinThanhToan", "TTTT");
    public jf_TaoHoaDon(List<DongHoaDon> list, KhachHang kh, NhanVien nv, InfoAtm info, String tenPTThanhToans,
            float tienKhuyenMai, float tienKhachDua, JPanel pnMain, float tongTienFull) {
        initComponents();
        this.list = list;
        this.kh = kh;
        this.nv = nv;
        this.info = info;
        this.pnMain = pnMain;
        this.tenPTThanhToans = tenPTThanhToans;
        this.tienKhuyenMai = tienKhuyenMai;
        this.tongTienFull = tongTienFull;
        loadHoaDon1(tienKhachDua);
        loadHoaDon2(info);
    }

    public void loadHoaDon1(float tienKhachDua) {
        lbidHoaDon.setText(idHoaDon);
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        time = formatTime.format(new Date(System.currentTimeMillis()));
        datetimeHoaDon.setText(time);
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        int a = 300;
        JLabel tenSPTitle = new JLabel();
        JLabel donGiaTitle = new JLabel("CenterLeft", SwingConstants.CENTER);
        JLabel soLuongTitle = new JLabel("CenterLeft", SwingConstants.CENTER);
        JLabel tongTienTitle = new JLabel("CenterLeft", SwingConstants.CENTER);
        tenSPTitle.setText("Tên Sản Phẩm");
        donGiaTitle.setText("Đơn Giá");
        soLuongTitle.setText("SL");
        tongTienTitle.setText("Tổng Tiền");
        tenSPTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tenSPTitle.setForeground(java.awt.Color.blue);
        donGiaTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        donGiaTitle.setForeground(java.awt.Color.blue);
        soLuongTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        soLuongTitle.setForeground(java.awt.Color.blue);
        tongTienTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tongTienTitle.setForeground(java.awt.Color.blue);
        tenSPTitle.setBounds(10, a, 250, 25);
        donGiaTitle.setBounds(260, a, 100, 25);
        soLuongTitle.setBounds(360, a, 80, 25);
        tongTienTitle.setBounds(440, a, 140, 25);
        pnHoaDon.add(tenSPTitle);
        pnHoaDon.add(donGiaTitle);
        pnHoaDon.add(soLuongTitle);
        pnHoaDon.add(tongTienTitle);
        for (int i = 0; i < list.size(); i++) {
            JLabel tenSP = new JLabel();
            JLabel donGia = new JLabel("CenterLeft", SwingConstants.CENTER);
            JLabel soLuong = new JLabel("CenterLeft", SwingConstants.CENTER);
            JLabel tongTien = new JLabel("CenterLeft", SwingConstants.CENTER);
            tenSP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            tenSP.setForeground(java.awt.Color.blue);
            donGia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            donGia.setForeground(java.awt.Color.blue);
            soLuong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            soLuong.setForeground(java.awt.Color.blue);
            tongTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            tongTien.setForeground(java.awt.Color.blue);
            tenSP.setText(list.get(i).getTenSanPham());
            donGia.setText((formatter.format(list.get(i).getDonGia()) + " VNĐ"));
            soLuong.setText(String.valueOf(list.get(i).getSoLuong()));
            float rs = (float) list.get(i).getDonGia() * list.get(i).getSoLuong();
            tongTien.setText((formatter.format(rs)) + " VNĐ");
            a += 50;
            tenSP.setBounds(10, a, 250, 25);
            donGia.setBounds(260, a, 120, 25);
            soLuong.setBounds(360, a, 60, 25);
            tongTien.setBounds(440, a, 140, 25);
            txtTenKH.setText(list.get(i).getTenKhachHang());
            txtTenNV.setText(list.get(i).getTenNhanVien());
            pnHoaDon.add(tenSP);
            pnHoaDon.add(donGia);
            pnHoaDon.add(soLuong);
            pnHoaDon.add(tongTien);
            pnHoaDon.setPreferredSize(new Dimension(550, a));
        }
        JLabel br = new JLabel("------------------------------------------------"
                + "---------------------------------------------------------------"
                + "--------------------------");
        JLabel br1 = new JLabel("------------------------------------------------"
                + "---------------------------------------------------------------"
                + "--------------------------");
        JLabel tongTienF = new JLabel("Tổng Tiền Phải Thanh Toán :  " + formatter.format(tongTienFull) + " VNĐ");
        JLabel tienDaGiam = new JLabel("Tiền Đã Giảm :  :   " + formatter.format(tienKhuyenMai) + " VNĐ");
        JLabel tongSl = new JLabel("Tiền Khách Trả  :   " + formatter.format(tienKhachDua) + " VNĐ");
        JLabel tienTl = new JLabel("Tiền Trả Lại :  " + formatter.format((tienKhachDua - tongTienFull)) + " VNĐ");
        JLabel camOn = new JLabel("CenterLeft", SwingConstants.CENTER);
        camOn.setText("Cảm Ơn Quý Khách - Hẹn Gặp Lại!!");
        br.setForeground(Color.blue);
        br1.setForeground(Color.blue);
        camOn.setForeground(Color.blue);
        tienDaGiam.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tienDaGiam.setForeground(java.awt.Color.blue);
        tongTienF.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tongTienF.setForeground(java.awt.Color.blue);
        tongSl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tongSl.setForeground(java.awt.Color.blue);
        tienTl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tienTl.setForeground(java.awt.Color.blue);
        br.setBounds(10, a + 50, 590, 25);
        tongTienF.setBounds(10, a + 100, 590, 25);
        tienDaGiam.setBounds(10, a + 150, 590, 25);
        tongSl.setBounds(10, a + 200, 590, 25);
        tienTl.setBounds(10, a + 250, 590, 25);
        br1.setBounds(10, a + 300, 590, 25);
        camOn.setBounds(10, a + 350, 590, 25);
        pnHoaDon.add(tienDaGiam);
        pnHoaDon.add(br);
        pnHoaDon.add(tongTienF);
        pnHoaDon.add(tongSl);
        pnHoaDon.add(tienTl);
        pnHoaDon.add(br1);
        pnHoaDon.add(camOn);
        pnHoaDon.setPreferredSize(new Dimension(550, a + 380));
        tenPTThanhToan.setText("Phương Thức Thanh Toán : " + tenPTThanhToans);
        tienCheck = tongTienFull - tienKhuyenMai;
    }
    public void loadHoaDon2(InfoAtm info) {
        if (info == null) {
            pnHoaDonATM.removeAll();
            pnHoaDonATM.setLayout(new BorderLayout());
            JLabel lb = new JLabel("<EMPTY>");
            pnHoaDonATM.add(lb);
        }
        else {
            txtLoaThe.setText(info.getLoaiThe());
            txtTenNganHang.setText(info.getTenNganHang());
            txtSoTaiKhoan.setText(info.getSoTaiKhoan());
            txtChiNhanh.setText(info.getChiNhanh());
            txtIDHoaDon.setText(idHoaDon);
            txtNgay.setText(time.split(" ")[0]);
            txtGio.setText(time.split(" ")[1]);
            txtMaTT.setText(idThongTin);
            txtTongTienTT.setText(new DecimalFormat("###,###,###").format(tongTienFull));
            lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/anhsanpham/LogoBank/" + info.getLoaiThe() + ".png")));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        scrollHoaDon = new javax.swing.JScrollPane();
        pnHoaDon = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbidHoaDon = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        datetimeHoaDon = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        tenPTThanhToan = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        btnTaoHoaDonVaThanhToan = new javax.swing.JButton();
        pnHoaDon1 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lbidHoaDon1 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        datetimeHoaDon1 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tenPTThanhToan1 = new javax.swing.JLabel();
        txtTenKH1 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtTenNV1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnHoaDonATM = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        datetimeHoaDon2 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtTongTienTT = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtIDHoaDon = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtSoLo = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JLabel();
        lbidHoaDon5 = new javax.swing.JLabel();
        txtGio = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        txtMaTT = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        txtChiNhanh = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtLoaThe = new javax.swing.JLabel();
        txtTenNganHang = new javax.swing.JLabel();
        txtSoTaiKhoan = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setMaximumSize(new java.awt.Dimension(1366, 740));
        jPanel3.setMinimumSize(new java.awt.Dimension(1366, 740));
        jPanel3.setLayout(null);

        pnHoaDon.setBackground(java.awt.Color.white);
        pnHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnHoaDon.setMaximumSize(new java.awt.Dimension(40000, 40000));
        pnHoaDon.setMinimumSize(new java.awt.Dimension(40000, 40000));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(0, 0));
        pnHoaDon.setRequestFocusEnabled(false);
        pnHoaDon.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel47.setForeground(java.awt.Color.blue);
        jLabel47.setText("Cầu Tuyên Sơn  P. Khuê Mỹ ");
        pnHoaDon.add(jLabel47);
        jLabel47.setBounds(340, 10, 230, 20);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel48.setForeground(java.awt.Color.blue);
        jLabel48.setText("Q. Ngũ Hành Sơn ");
        pnHoaDon.add(jLabel48);
        jLabel48.setBounds(390, 40, 140, 20);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel49.setForeground(java.awt.Color.blue);
        jLabel49.setText("TP Đà Nẵng");
        pnHoaDon.add(jLabel49);
        jLabel49.setBounds(400, 70, 100, 20);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.blue);
        jLabel35.setText("0354114665");
        pnHoaDon.add(jLabel35);
        jLabel35.setBounds(400, 100, 100, 20);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel50.setForeground(java.awt.Color.blue);
        jLabel50.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        pnHoaDon.add(jLabel50);
        jLabel50.setBounds(10, 120, 560, 16);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel51.setForeground(java.awt.Color.blue);
        jLabel51.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        pnHoaDon.add(jLabel51);
        jLabel51.setBounds(10, 260, 560, 16);

        lbidHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbidHoaDon.setForeground(java.awt.Color.blue);
        lbidHoaDon.setText("HD0001");
        pnHoaDon.add(lbidHoaDon);
        lbidHoaDon.setBounds(130, 200, 140, 20);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel53.setForeground(java.awt.Color.blue);
        jLabel53.setText("IDHoaDon : ");
        pnHoaDon.add(jLabel53);
        jLabel53.setBounds(10, 200, 110, 20);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel54.setForeground(java.awt.Color.blue);
        jLabel54.setText("Ngày Bán :");
        pnHoaDon.add(jLabel54);
        jLabel54.setBounds(10, 170, 90, 20);

        datetimeHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        datetimeHoaDon.setForeground(java.awt.Color.blue);
        datetimeHoaDon.setText("25/09/2020 - 19:30:12");
        pnHoaDon.add(datetimeHoaDon);
        datetimeHoaDon.setBounds(100, 170, 170, 20);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel56.setForeground(java.awt.Color.blue);
        jLabel56.setText("HÓA ĐƠN BÁN HÀNG");
        pnHoaDon.add(jLabel56);
        jLabel56.setBounds(180, 140, 220, 20);

        tenPTThanhToan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tenPTThanhToan.setForeground(java.awt.Color.blue);
        tenPTThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnHoaDon.add(tenPTThanhToan);
        tenPTThanhToan.setBounds(10, 230, 570, 30);

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH.setForeground(java.awt.Color.blue);
        pnHoaDon.add(txtTenKH);
        txtTenKH.setBounds(380, 200, 170, 20);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel59.setForeground(java.awt.Color.blue);
        jLabel59.setText("Tên NV");
        pnHoaDon.add(jLabel59);
        jLabel59.setBounds(280, 170, 90, 20);

        txtTenNV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenNV.setForeground(java.awt.Color.blue);
        pnHoaDon.add(txtTenNV);
        txtTenNV.setBounds(380, 170, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        pnHoaDon.add(jLabel1);
        jLabel1.setBounds(10, 0, 280, 130);

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel58.setForeground(java.awt.Color.blue);
        jLabel58.setText("Tên KH");
        pnHoaDon.add(jLabel58);
        jLabel58.setBounds(280, 200, 90, 20);

        scrollHoaDon.setViewportView(pnHoaDon);

        jPanel3.add(scrollHoaDon);
        scrollHoaDon.setBounds(0, 0, 590, 740);

        btnTaoHoaDonVaThanhToan.setBackground(java.awt.Color.orange);
        btnTaoHoaDonVaThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTaoHoaDonVaThanhToan.setText("Tạo Hóa Đơn Và Thanh Toán");
        btnTaoHoaDonVaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonVaThanhToanActionPerformed(evt);
            }
        });
        jPanel3.add(btnTaoHoaDonVaThanhToan);
        btnTaoHoaDonVaThanhToan.setBounds(1050, 320, 300, 70);

        pnHoaDon1.setBackground(java.awt.Color.white);
        pnHoaDon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnHoaDon1.setMaximumSize(new java.awt.Dimension(40000, 40000));
        pnHoaDon1.setMinimumSize(new java.awt.Dimension(40000, 40000));
        pnHoaDon1.setPreferredSize(new java.awt.Dimension(0, 0));
        pnHoaDon1.setRequestFocusEnabled(false);
        pnHoaDon1.setLayout(null);

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel52.setForeground(java.awt.Color.blue);
        jLabel52.setText("Cầu Tuyên Sơn  P. Khuê Mỹ ");
        pnHoaDon1.add(jLabel52);
        jLabel52.setBounds(340, 10, 230, 20);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel55.setForeground(java.awt.Color.blue);
        jLabel55.setText("Q. Ngũ Hành Sơn ");
        pnHoaDon1.add(jLabel55);
        jLabel55.setBounds(390, 40, 140, 20);

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel57.setForeground(java.awt.Color.blue);
        jLabel57.setText("TP Đà Nẵng");
        pnHoaDon1.add(jLabel57);
        jLabel57.setBounds(400, 70, 100, 20);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel36.setForeground(java.awt.Color.blue);
        jLabel36.setText("0354114665");
        pnHoaDon1.add(jLabel36);
        jLabel36.setBounds(400, 100, 100, 20);

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel60.setForeground(java.awt.Color.blue);
        jLabel60.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        pnHoaDon1.add(jLabel60);
        jLabel60.setBounds(10, 120, 560, 16);

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel61.setForeground(java.awt.Color.blue);
        jLabel61.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        pnHoaDon1.add(jLabel61);
        jLabel61.setBounds(10, 260, 560, 16);

        lbidHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbidHoaDon1.setForeground(java.awt.Color.blue);
        lbidHoaDon1.setText("HD0001");
        pnHoaDon1.add(lbidHoaDon1);
        lbidHoaDon1.setBounds(130, 200, 140, 20);

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel62.setForeground(java.awt.Color.blue);
        jLabel62.setText("IDHoaDon : ");
        pnHoaDon1.add(jLabel62);
        jLabel62.setBounds(10, 200, 110, 20);

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel63.setForeground(java.awt.Color.blue);
        jLabel63.setText("Ngày Bán :");
        pnHoaDon1.add(jLabel63);
        jLabel63.setBounds(10, 170, 90, 20);

        datetimeHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        datetimeHoaDon1.setForeground(java.awt.Color.blue);
        datetimeHoaDon1.setText("25/09/2020 - 19:30:12");
        pnHoaDon1.add(datetimeHoaDon1);
        datetimeHoaDon1.setBounds(100, 170, 170, 20);

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel64.setForeground(java.awt.Color.blue);
        jLabel64.setText("HÓA ĐƠN BÁN HÀNG");
        pnHoaDon1.add(jLabel64);
        jLabel64.setBounds(180, 140, 220, 20);

        tenPTThanhToan1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tenPTThanhToan1.setForeground(java.awt.Color.blue);
        tenPTThanhToan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnHoaDon1.add(tenPTThanhToan1);
        tenPTThanhToan1.setBounds(10, 230, 570, 30);

        txtTenKH1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH1.setForeground(java.awt.Color.blue);
        pnHoaDon1.add(txtTenKH1);
        txtTenKH1.setBounds(380, 200, 170, 20);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel65.setForeground(java.awt.Color.blue);
        jLabel65.setText("Tên NV");
        pnHoaDon1.add(jLabel65);
        jLabel65.setBounds(280, 170, 90, 20);

        txtTenNV1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenNV1.setForeground(java.awt.Color.blue);
        pnHoaDon1.add(txtTenNV1);
        txtTenNV1.setBounds(380, 170, 170, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        pnHoaDon1.add(jLabel2);
        jLabel2.setBounds(10, 0, 280, 130);

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel66.setForeground(java.awt.Color.blue);
        jLabel66.setText("Tên KH");
        pnHoaDon1.add(jLabel66);
        jLabel66.setBounds(280, 200, 90, 20);

        jPanel3.add(pnHoaDon1);
        pnHoaDon1.setBounds(0, 0, 0, 0);

        jScrollPane1.setBackground(java.awt.Color.white);

        pnHoaDonATM.setBackground(java.awt.Color.white);
        pnHoaDonATM.setMaximumSize(new java.awt.Dimension(398, 628));
        pnHoaDonATM.setMinimumSize(new java.awt.Dimension(398, 628));
        pnHoaDonATM.setLayout(null);

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/LogoBank/TPBank.png"))); // NOI18N
        pnHoaDonATM.add(lbLogo);
        lbLogo.setBounds(0, 0, 400, 110);

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel67.setForeground(java.awt.Color.blue);
        jLabel67.setText("TÊN ĐẠI LÍ");
        pnHoaDonATM.add(jLabel67);
        jLabel67.setBounds(10, 130, 140, 20);

        datetimeHoaDon2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        datetimeHoaDon2.setForeground(java.awt.Color.blue);
        datetimeHoaDon2.setText("VinMart Khuê Mỹ");
        pnHoaDonATM.add(datetimeHoaDon2);
        datetimeHoaDon2.setBounds(230, 130, 160, 20);

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel68.setForeground(java.awt.Color.blue);
        jLabel68.setText("ĐỊA CHỈ ĐẠI LÍ");
        pnHoaDonATM.add(jLabel68);
        jLabel68.setBounds(10, 160, 150, 20);

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel69.setForeground(java.awt.Color.blue);
        jLabel69.setText("Cầu Tuyên Sơn  P. Khuê Mỹ ");
        pnHoaDonATM.add(jLabel69);
        jLabel69.setBounds(170, 160, 220, 20);

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel70.setForeground(java.awt.Color.blue);
        jLabel70.setText("Q. Ngũ Hành Sơn TP Đà Nẵng");
        pnHoaDonATM.add(jLabel70);
        jLabel70.setBounds(160, 190, 230, 20);

        txtTongTienTT.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTongTienTT.setForeground(java.awt.Color.blue);
        txtTongTienTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTongTienTT.setText("TỔNG CỘNG :");
        pnHoaDonATM.add(txtTongTienTT);
        txtTongTienTT.setBounds(200, 530, 190, 30);

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel72.setForeground(java.awt.Color.blue);
        jLabel72.setText("---------------------------------------------------------------");
        pnHoaDonATM.add(jLabel72);
        jLabel72.setBounds(10, 640, 380, 20);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel73.setForeground(java.awt.Color.blue);
        jLabel73.setText("---------------------------------------------------------------");
        pnHoaDonATM.add(jLabel73);
        jLabel73.setBounds(10, 100, 380, 20);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel74.setForeground(java.awt.Color.blue);
        jLabel74.setText("IDHoaDon : ");
        pnHoaDonATM.add(jLabel74);
        jLabel74.setBounds(200, 420, 94, 20);

        txtIDHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIDHoaDon.setForeground(java.awt.Color.blue);
        txtIDHoaDon.setText("HD0001");
        pnHoaDonATM.add(txtIDHoaDon);
        txtIDHoaDon.setBounds(300, 420, 100, 20);

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel75.setForeground(java.awt.Color.blue);
        jLabel75.setText("CHI NHÁNH :");
        pnHoaDonATM.add(jLabel75);
        jLabel75.setBounds(10, 360, 160, 20);

        txtSoLo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSoLo.setForeground(java.awt.Color.blue);
        txtSoLo.setText("00285");
        pnHoaDonATM.add(txtSoLo);
        txtSoLo.setBounds(90, 420, 90, 20);

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel76.setForeground(java.awt.Color.blue);
        jLabel76.setText("NGÀY :");
        pnHoaDonATM.add(jLabel76);
        jLabel76.setBounds(10, 450, 70, 20);

        txtNgay.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNgay.setForeground(java.awt.Color.blue);
        txtNgay.setText("HD0001");
        pnHoaDonATM.add(txtNgay);
        txtNgay.setBounds(90, 450, 90, 20);

        lbidHoaDon5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbidHoaDon5.setForeground(java.awt.Color.blue);
        lbidHoaDon5.setText("HD0001");
        pnHoaDonATM.add(lbidHoaDon5);
        lbidHoaDon5.setBounds(300, 450, 100, 20);

        txtGio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtGio.setForeground(java.awt.Color.blue);
        txtGio.setText("GIỜ :");
        pnHoaDonATM.add(txtGio);
        txtGio.setBounds(200, 450, 90, 20);

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel78.setForeground(java.awt.Color.blue);
        jLabel78.setText("MÃ TT");
        pnHoaDonATM.add(jLabel78);
        jLabel78.setBounds(10, 480, 70, 20);

        txtMaTT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMaTT.setForeground(java.awt.Color.blue);
        txtMaTT.setText("HD0001");
        pnHoaDonATM.add(txtMaTT);
        txtMaTT.setBounds(90, 480, 90, 20);

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel80.setForeground(java.awt.Color.blue);
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("TÔI XÁC NHẬN HÓA ĐƠN THANH TOÁN NÀY LÀ ĐÚNG");
        pnHoaDonATM.add(jLabel80);
        jLabel80.setBounds(10, 660, 380, 20);

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel81.setForeground(java.awt.Color.blue);
        jLabel81.setText("SỐ LÔ :");
        pnHoaDonATM.add(jLabel81);
        jLabel81.setBounds(10, 420, 70, 20);

        txtChiNhanh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtChiNhanh.setForeground(java.awt.Color.blue);
        txtChiNhanh.setText("LOẠI THẺ : ");
        pnHoaDonATM.add(txtChiNhanh);
        txtChiNhanh.setBounds(190, 360, 210, 20);

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel83.setForeground(java.awt.Color.blue);
        jLabel83.setText("TÊN NGÂN HÀNG :");
        pnHoaDonATM.add(jLabel83);
        jLabel83.setBounds(10, 300, 160, 20);

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel79.setForeground(java.awt.Color.blue);
        jLabel79.setText("SỐ TÀI KHOẢN : ");
        pnHoaDonATM.add(jLabel79);
        jLabel79.setBounds(10, 330, 160, 20);

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel84.setForeground(java.awt.Color.blue);
        jLabel84.setText("---------------------------------------------------------------");
        pnHoaDonATM.add(jLabel84);
        jLabel84.setBounds(10, 220, 380, 20);

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel85.setForeground(java.awt.Color.blue);
        jLabel85.setText("LOẠI THẺ : ");
        pnHoaDonATM.add(jLabel85);
        jLabel85.setBounds(10, 270, 110, 20);

        txtLoaThe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtLoaThe.setForeground(java.awt.Color.blue);
        txtLoaThe.setText("LOẠI THẺ : ");
        pnHoaDonATM.add(txtLoaThe);
        txtLoaThe.setBounds(190, 270, 210, 20);

        txtTenNganHang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenNganHang.setForeground(java.awt.Color.blue);
        txtTenNganHang.setText("LOẠI THẺ : ");
        pnHoaDonATM.add(txtTenNganHang);
        txtTenNganHang.setBounds(190, 300, 210, 20);

        txtSoTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSoTaiKhoan.setForeground(java.awt.Color.blue);
        txtSoTaiKhoan.setText("LOẠI THẺ : ");
        pnHoaDonATM.add(txtSoTaiKhoan);
        txtSoTaiKhoan.setBounds(190, 330, 210, 20);

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel90.setForeground(java.awt.Color.blue);
        jLabel90.setText("---------------------------------------------------------------");
        pnHoaDonATM.add(jLabel90);
        jLabel90.setBounds(10, 560, 380, 20);

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel91.setForeground(java.awt.Color.blue);
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("THANH TOÁN");
        pnHoaDonATM.add(jLabel91);
        jLabel91.setBounds(80, 390, 240, 20);

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel92.setForeground(java.awt.Color.blue);
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("THÔNG TIN THẺ");
        pnHoaDonATM.add(jLabel92);
        jLabel92.setBounds(80, 240, 240, 30);

        jLabel93.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel93.setForeground(java.awt.Color.blue);
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("(Kí ghi rõ họ tên)");
        pnHoaDonATM.add(jLabel93);
        jLabel93.setBounds(0, 610, 190, 30);

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel94.setForeground(java.awt.Color.blue);
        jLabel94.setText("---------------------------------------------------------------");
        pnHoaDonATM.add(jLabel94);
        jLabel94.setBounds(10, 510, 380, 20);

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel95.setForeground(java.awt.Color.blue);
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("TỔNG CỘNG :");
        pnHoaDonATM.add(jLabel95);
        jLabel95.setBounds(10, 530, 190, 30);

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel96.setForeground(java.awt.Color.blue);
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("CHỮ KÍ");
        pnHoaDonATM.add(jLabel96);
        jLabel96.setBounds(0, 580, 190, 40);

        jScrollPane1.setViewportView(pnHoaDonATM);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(620, 20, 400, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void printHoaDon(JPanel pn) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print HoaDon");
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) graphics;
                g2.translate(pageFormat.getImageableX() + 150, pageFormat.getImageableY());
                g2.scale(0.5, 0.5);
                pn.paint(g2);
                pn.paint(graphics);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean result = printerJob.printDialog();
        if (result) {
            try {
                printerJob.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getDiem(String idKhachHang) {
        int diem = 0;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT SoDiem FROM TichDiem WHERE IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idKhachHang);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                diem = rs.getInt(1);
            }
            return diem;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diem;
    }

    public boolean updateDiem(int diem, int isVip, String idKhachHang) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE TichDiem SET SoDiem = ? ,IsVip = ?  WHERE IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, diem);
            ps.setInt(2, isVip);
            ps.setString(3, idKhachHang);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    private void btnTaoHoaDonVaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonVaThanhToanActionPerformed
        if (update() == true) {
            JOptionPane.showMessageDialog(pnHoaDon, "Vui Lòng Nhận Hóa Đơn Tại Máy");
            if (info == null) 
                printHoaDon(pnHoaDon);
            else {
               printHoaDon(pnHoaDon);
               printHoaDon(pnHoaDonATM);
            }
            int diem = (int) (Integer.parseInt(pn_pnMain.txtSoDiemTich.getText()) + tienCheck / 100000);
            if (updateDiem(diem, diem >= 100 ? 1 : 0, kh.getIdKhachHang()) == true) {
                this.dispose();
                pnMain.removeAll();
                JLabel lb = new JLabel();
                lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg"))); // NOI18N
                lb.setHorizontalAlignment((int) CENTER_ALIGNMENT);
                pnMain.add(lb);
                pnMain.updateUI();
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Thất Bại");
        }
    }//GEN-LAST:event_btnTaoHoaDonVaThanhToanActionPerformed
    public boolean update() {
        try {
            int tongTien = 0;
            PTHoaDon pTHoaDon = new PTHoaDon();
            pTHoaDon.insertHoaDon(idHoaDon, time, kh.getIdKhachHang(), nv.getIdNhanVien(),
                    1, 0, 0);
            if (info != null) {
                LuuAtm luuatm = new LuuAtm();
                luuatm.luu(idThongTin, luuatm.getIDByTen(tenPTThanhToans), info.getLoaiThe(),
                        info.getSoTaiKhoan(), info.getTenTaiKhoan(), info.getChiNhanh(), info.getTenNganHang());
                luuatm.updateIDTTThanhToan(idThongTin, idHoaDon);
            }
            for (int i = 0; i < list.size(); i++) {
                String idDongHoaDon = StringUtil.taoID("IDDongHoaDon", "DongHoaDon", "DHD");
                pTHoaDon.insertDongHoaDon(idDongHoaDon, idHoaDon, list.get(i).getIdSanPham(), list.get(i).getIdDonViTinh(), list.get(i).getSoLuong());
                tongTien += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                new UDSoLuongHienTai().update(list.get(i).getIdSanPham(),list.get(i).getSoLuong());
            }
            new CapNhatTienHoaDon().CapNhat(tongTien - tienKhuyenMai, idHoaDon);
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDonVaThanhToan;
    private javax.swing.JLabel datetimeHoaDon;
    private javax.swing.JLabel datetimeHoaDon1;
    private javax.swing.JLabel datetimeHoaDon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbidHoaDon;
    private javax.swing.JLabel lbidHoaDon1;
    private javax.swing.JLabel lbidHoaDon5;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnHoaDon1;
    private javax.swing.JPanel pnHoaDonATM;
    private javax.swing.JScrollPane scrollHoaDon;
    private javax.swing.JLabel tenPTThanhToan;
    private javax.swing.JLabel tenPTThanhToan1;
    private javax.swing.JLabel txtChiNhanh;
    private javax.swing.JLabel txtGio;
    private javax.swing.JLabel txtIDHoaDon;
    private javax.swing.JLabel txtLoaThe;
    private javax.swing.JLabel txtMaTT;
    private javax.swing.JLabel txtNgay;
    private javax.swing.JLabel txtSoLo;
    private javax.swing.JLabel txtSoTaiKhoan;
    private javax.swing.JLabel txtTenKH;
    private javax.swing.JLabel txtTenKH1;
    private javax.swing.JLabel txtTenNV;
    private javax.swing.JLabel txtTenNV1;
    private javax.swing.JLabel txtTenNganHang;
    private javax.swing.JLabel txtTongTienTT;
    // End of variables declaration//GEN-END:variables
}
