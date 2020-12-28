package view.nvbanhang;

import controller.CapNhatTienHoaDon;
import controller.DrawBill;
import controller.LuuAtm;
import controller.PTHoaDon;
import controller.SuaDiemTieuDung;
import controller.ThemKhachHang;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
    public void zl(float tienKhachDua) {
                DecimalFormat formatter = new DecimalFormat("###,###,###");
        int[] arr = new DrawBill().drawData(pnHoaDon, list);
        int a = arr[0];
        float tongTienFull = Float.parseFloat(String.valueOf(arr[1]));
        JLabel br = new JLabel("------------------------------------------------"
                + "---------------------------------------------------------------"
                + "--------------------------");
        JLabel br1 = new JLabel("------------------------------------------------"
                + "---------------------------------------------------------------"
                + "--------------------------");
        JLabel tongTienF = new JLabel("Tổng Tiền Phải Thanh Toán :  " + formatter.format(tongTienFull - tienKhuyenMai) + " VNĐ");
        JLabel tienDaGiam = new JLabel("Tiền Đã Giảm :  :   " + formatter.format(tienKhuyenMai) + " VNĐ");
        JLabel tongSl = new JLabel("Tiền Khách Trả  :   " + formatter.format(tienKhachDua) + " VNĐ");
        JLabel tienTl = new JLabel("Tiền Trả Lại :  " + formatter.format((tienKhachDua - (tongTienFull - tienKhuyenMai))) + " VNĐ");
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
    public jf_TaoHoaDon(List<DongHoaDon> list, KhachHang kh, NhanVien nv, InfoAtm info, String tenPTThanhToans,
            float tienKhuyenMai, float tienKhachDua, JPanel pnMain,float tongTienFull) {
        initComponents();
        this.list = list;
        this.kh = kh;
        this.nv = nv;
        this.info = info;
        this.pnMain = pnMain;
        this.tenPTThanhToans = tenPTThanhToans;
        this.tienKhuyenMai = tienKhuyenMai;
        this.tongTienFull = tongTienFull;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setMaximumSize(new java.awt.Dimension(1366, 740));
        jPanel3.setMinimumSize(new java.awt.Dimension(1366, 740));

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

        btnTaoHoaDonVaThanhToan.setBackground(java.awt.Color.orange);
        btnTaoHoaDonVaThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTaoHoaDonVaThanhToan.setText("Tạo Hóa Đơn Và Thanh Toán");
        btnTaoHoaDonVaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonVaThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(scrollHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(btnTaoHoaDonVaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btnTaoHoaDonVaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2.scale(0.7, 0.7);
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
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT SoDiem FROM TichDiem WHERE IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idKhachHang);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
                diem = rs.getInt(1);
            return diem;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diem;
    }
    public boolean updateDiem(int diem,int isVip,String idKhachHang) {
        try (Connection conn = new ConnectDAO().getConnection()){
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
            printHoaDon(pnHoaDon);
            int diem = (int) (Integer.parseInt(pn_pnMain.txtSoDiemTich.getText()) + tienCheck/100000);
            if (updateDiem(diem, diem >= 100 ? 1 : 0 ,kh.getIdKhachHang()) == true) {
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
            pTHoaDon.insertHoaDon(idHoaDon,time, kh.getIdKhachHang(), nv.getIdNhanVien(),
                    1, 0,0);
            if (info != null) {
                String idThongTin = StringUtil.taoID("IDThongTin", "ThongTinThanhToan", "TTTT");
                LuuAtm luuatm = new LuuAtm();
                luuatm.luu(idThongTin, luuatm.getIDByTen(tenPTThanhToans), info.getLoaiThe(),
                        info.getSoTaiKhoan(), info.getTenTaiKhoan(), info.getChiNhanh(), info.getTenNganHang());
                luuatm.updateIDTTThanhToan(idThongTin, idHoaDon);
            }
            for (int i = 0; i < list.size(); i++) {
                String idDongHoaDon = StringUtil.taoID("IDDongHoaDon", "DongHoaDon", "DHD");
                pTHoaDon.insertDongHoaDon(idDongHoaDon, idHoaDon, list.get(i).getIdSanPham(), list.get(i).getIdDonViTinh(), list.get(i).getSoLuong());
                tongTien += (list.get(i).getDonGia() * list.get(i).getSoLuong());
            }
            new CapNhatTienHoaDon().CapNhat(tongTien - tienKhuyenMai, idHoaDon);
//            new ThemKhachHang().
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDonVaThanhToan;
    private javax.swing.JLabel datetimeHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbidHoaDon;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JScrollPane scrollHoaDon;
    private javax.swing.JLabel tenPTThanhToan;
    private javax.swing.JLabel txtTenKH;
    private javax.swing.JLabel txtTenNV;
    // End of variables declaration//GEN-END:variables
}
