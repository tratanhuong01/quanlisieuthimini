package view.nhanvien;

import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import modal.HoaDon;

public class jpnTaoHoaDon extends javax.swing.JPanel {
    JPanel pnBanHang;
    public jpnTaoHoaDon(JPanel pnBanHang) {
        initComponents();
        this.pnBanHang = pnBanHang;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        
        List<HoaDon> list = taoListHoaDon();
        int a = 250;
        double tongTienFull = 0;
        double tienKhachDua = 1000000;
        double tienTraLai = 0;
        JLabel tenSPTitle = new JLabel();
        JLabel donGiaTitle = new JLabel("CenterLeft",SwingConstants.CENTER);
        JLabel soLuongTitle = new JLabel("CenterLeft",SwingConstants.CENTER);
        JLabel tongTienTitle = new JLabel("CenterLeft",SwingConstants.CENTER);
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
        jPanel17.add(tenSPTitle);
        jPanel17.add(donGiaTitle);
        jPanel17.add(soLuongTitle);
        jPanel17.add(tongTienTitle);
        for (int i = 0; i < list.size(); i++) {
            JLabel tenSP = new JLabel();
            JLabel donGia = new JLabel("CenterLeft",SwingConstants.CENTER);
            JLabel soLuong = new JLabel("CenterLeft",SwingConstants.CENTER);
            JLabel tongTien = new JLabel("CenterLeft",SwingConstants.CENTER);
            tenSP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            tenSP.setForeground(java.awt.Color.blue);
            donGia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            donGia.setForeground(java.awt.Color.blue);
            soLuong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            soLuong.setForeground(java.awt.Color.blue);
            tongTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            tongTien.setForeground(java.awt.Color.blue);
            tenSP.setText(list.get(i).getTenSP());
            donGia.setText((formatter.format(list.get(i).getDonGia())+ " VNĐ"));
            soLuong.setText(String.valueOf(list.get(i).getSoLuong()));
            int rs = (int)list.get(i).getDonGia() * list.get(i).getSoLuong();
            tongTien.setText((formatter.format(rs)) + " VNĐ");
            a += 50;
            tenSP.setBounds(10, a, 250, 25);
            donGia.setBounds(260, a, 100, 25);
            soLuong.setBounds(360, a, 80, 25);
            tongTien.setBounds(440, a, 140, 25);
            txtTenKH.setText(list.get(i).getTenKH());
            txtTenNV.setText(list.get(i).getTenNV());
            jPanel17.add(tenSP);
            jPanel17.add(donGia);
            jPanel17.add(soLuong);
            jPanel17.add(tongTien);
            jPanel17.setPreferredSize(new Dimension(550, a));
            tongTienFull += (list.get(i).getDonGia() * list.get(i).getSoLuong());
        }
        
        JLabel tongTienF = new JLabel("Tổng Tiền Phải Thanh Toán :  " + formatter.format(tongTienFull) + " VNĐ");
        JLabel tongSl = new JLabel("Tiền Khách Trả  :   " +  formatter.format(tienKhachDua) + " VNĐ");
        JLabel tienTl = new JLabel("Tiền Trả Lại :  " + formatter.format((tienKhachDua - tongTienFull)) + " VNĐ");
        tongTienF.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tongTienF.setForeground(java.awt.Color.blue);
        tongSl.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tongSl.setForeground(java.awt.Color.blue);
        tienTl.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tienTl.setForeground(java.awt.Color.blue);
        tongTienF.setBounds(10, a + 50, 590, 25);
        tongSl.setBounds(10, a + 100, 590, 25);
        tienTl.setBounds(10, a + 150, 590, 25);
        jPanel17.add(tongTienF);
        jPanel17.add(tongSl);
        jPanel17.add(tienTl);
        jPanel17.setPreferredSize(new Dimension(550, a + 300));
    }

    public List<HoaDon> taoListHoaDon() {
        List<HoaDon> listhd = new ArrayList<>();
        HoaDon hd1 = new HoaDon("HD001", "SP001", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Bim Bim", 3500, 5);
        HoaDon hd2 = new HoaDon("HD002", "SP002", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Nho mỹ", 10000, 5);
        HoaDon hd3 = new HoaDon("HD003", "SP003", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Sting", 12000, 5);
        HoaDon hd4 = new HoaDon("HD004", "SP004", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Thịt bò", 30000, 5);
        HoaDon hd5 = new HoaDon("HD005", "SP005", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Trứng", 2000, 5);
        HoaDon hd6 = new HoaDon("HD001", "SP001", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Bim Bim", 3500, 5);
        HoaDon hd7 = new HoaDon("HD002", "SP002", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Nho mỹ", 10000, 5);
        HoaDon hd8 = new HoaDon("HD003", "SP003", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Sting", 12000, 5);
        HoaDon hd9 = new HoaDon("HD004", "SP004", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Thịt bò", 30000, 5);
        HoaDon hd10 = new HoaDon("HD005", "SP005", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Trứng", 2000, 5);
        HoaDon hd11 = new HoaDon("HD001", "SP001", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Bim Bim", 3500, 5);
        HoaDon hd12 = new HoaDon("HD002", "SP002", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Nho mỹ", 10000, 5);
        HoaDon hd13 = new HoaDon("HD003", "SP003", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Sting", 12000, 5);
        HoaDon hd14 = new HoaDon("HD004", "SP004", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Thịt bò", 30000, 5);
        HoaDon hd15 = new HoaDon("HD005", "SP005", "Mạc Văn Khoa", "Chu Nghệ An", "12-02-2020", "Trứng", 2000, 5);
        listhd.add(hd1);
        listhd.add(hd2);
        listhd.add(hd3);
        listhd.add(hd4);
        listhd.add(hd5);
        listhd.add(hd6);
        listhd.add(hd7);
        listhd.add(hd8);
        listhd.add(hd9);
        listhd.add(hd10);
        listhd.add(hd11);
        listhd.add(hd12);
        listhd.add(hd13);
        listhd.add(hd14);
        listhd.add(hd15);
        return listhd;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel3.setLayout(null);

        jPanel17.setBackground(java.awt.Color.white);
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setMaximumSize(new java.awt.Dimension(40000, 40000));
        jPanel17.setMinimumSize(new java.awt.Dimension(40000, 40000));
        jPanel17.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel17.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel47.setForeground(java.awt.Color.blue);
        jLabel47.setText("235 Lê Văn Hiến P. Khuê Mỹ ");
        jPanel17.add(jLabel47);
        jLabel47.setBounds(340, 10, 230, 20);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel48.setForeground(java.awt.Color.blue);
        jLabel48.setText("Q. Ngũ Hành Sơn ");
        jPanel17.add(jLabel48);
        jLabel48.setBounds(390, 40, 140, 20);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel49.setForeground(java.awt.Color.blue);
        jLabel49.setText("TP Đà Nẵng");
        jPanel17.add(jLabel49);
        jLabel49.setBounds(400, 70, 100, 20);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.blue);
        jLabel35.setText("0354114665");
        jPanel17.add(jLabel35);
        jLabel35.setBounds(400, 100, 100, 20);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel50.setForeground(java.awt.Color.blue);
        jLabel50.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        jPanel17.add(jLabel50);
        jLabel50.setBounds(10, 120, 560, 16);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel51.setForeground(java.awt.Color.blue);
        jLabel51.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        jPanel17.add(jLabel51);
        jLabel51.setBounds(10, 230, 560, 16);

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel52.setForeground(java.awt.Color.blue);
        jLabel52.setText("HD0001");
        jPanel17.add(jLabel52);
        jLabel52.setBounds(130, 200, 170, 20);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel53.setForeground(java.awt.Color.blue);
        jLabel53.setText("IDHoaDon : ");
        jPanel17.add(jLabel53);
        jLabel53.setBounds(10, 200, 110, 20);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel54.setForeground(java.awt.Color.blue);
        jLabel54.setText("Ngày Bán :");
        jPanel17.add(jLabel54);
        jLabel54.setBounds(10, 170, 90, 20);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel55.setForeground(java.awt.Color.blue);
        jLabel55.setText("25/09/2020 - 19:30:12");
        jPanel17.add(jLabel55);
        jLabel55.setBounds(100, 170, 170, 20);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel56.setForeground(java.awt.Color.blue);
        jLabel56.setText("HÓA ĐƠN BÁN HÀNG");
        jPanel17.add(jLabel56);
        jLabel56.setBounds(180, 140, 220, 20);

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel57.setForeground(java.awt.Color.blue);
        jLabel57.setText("Tên KH");
        jPanel17.add(jLabel57);
        jLabel57.setBounds(280, 200, 90, 20);

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH.setForeground(java.awt.Color.blue);
        jPanel17.add(txtTenKH);
        txtTenKH.setBounds(380, 200, 170, 20);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel59.setForeground(java.awt.Color.blue);
        jLabel59.setText("Tên NV");
        jPanel17.add(jLabel59);
        jLabel59.setBounds(280, 170, 90, 20);

        txtTenNV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenNV.setForeground(java.awt.Color.blue);
        jPanel17.add(txtTenNV);
        txtTenNV.setBounds(380, 170, 170, 20);
        jPanel17.add(jLabel1);
        jLabel1.setBounds(10, 0, 280, 130);

        jScrollPane1.setViewportView(jPanel17);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 590, 740);

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setText("Về Trang Chủ");
        jPanel3.add(jButton1);
        jButton1.setBounds(890, 380, 230, 70);

        jButton2.setBackground(java.awt.Color.orange);
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton2.setText("Tạo Hóa Đơn Và Thanh Toán");
        jPanel3.add(jButton2);
        jButton2.setBounds(840, 160, 300, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
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
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtTenKH;
    private javax.swing.JLabel txtTenNV;
    // End of variables declaration//GEN-END:variables
}
