package view.nvbanhang;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.ConnectDAO;
import model.DongHoaDon;

public class pn_SanPhamDaChon extends javax.swing.JPanel {

    DongHoaDon dhd;
    List<DongHoaDon> list;
    JScrollPane jscr;
    JTextField txtTongTien;
    JButton btnTaoHoaDon;
    JTextField txtTienKhuyenMai;
    public pn_SanPhamDaChon(JPanel pnSanPhamDaChon, String tenSanPham,
            double giaSanPham, String hinhSanPham, int SoLuong, DongHoaDon dhd,
            List<DongHoaDon> list, JScrollPane jscr, JTextField txtTongTien, JButton btnTaoHoaDon,JTextField txtTienKhuyenMai) {
        initComponents();
        this.dhd = dhd;
        this.list = list;
        this.jscr = jscr;
        this.txtTongTien = txtTongTien;
        this.btnTaoHoaDon = btnTaoHoaDon;
        this.txtTienKhuyenMai = txtTienKhuyenMai;
        lbTenSanPham.setText(tenSanPham);
        lbGia.setText(String.valueOf(giaSanPham * SoLuong));
        txtSoLuong.setText(String.valueOf(SoLuong));
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnSanPhamDaChon.removeAll();
                pnSanPhamDaChon.updateUI();
                list.remove(dhd);
                float tongTienC = 0;
                float giaKMC = 0;
                if (list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        pn_SanPhamDaChon pnsped = new pn_SanPhamDaChon(pnSanPhamDaChon, list.get(i).getTenSanPham(),
                                list.get(i).getDonGia(), list.get(i).getHinhSanPham(), list.get(i).getSoLuong(),
                                list.get(i), list, jscr, txtTongTien, btnTaoHoaDon,txtTienKhuyenMai);
                        pnSanPhamDaChon.setLayout(new BoxLayout(pnSanPhamDaChon, BoxLayout.Y_AXIS));

                        int numComponent = pnSanPhamDaChon.getComponentCount();
                        pnSanPhamDaChon.setPreferredSize(new Dimension(475, numComponent * 100));
                        jscr.getViewport().setViewPosition(new Point(0, pnSanPhamDaChon.getComponentCount() * 100));
                        jscr.getViewport().revalidate();
                        pnSanPhamDaChon.add(pnsped);
                        pnSanPhamDaChon.updateUI();
                        tongTienC += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                        giaKMC += (list.get(i).getDonGia() * ((list.get(i).getGiam()) / 100)) * list.get(i).getSoLuong();
                    }
                    txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTienC - giaKMC) + " VNĐ");
                    txtTienKhuyenMai.setText(new DecimalFormat("###,###,###").format(giaKMC) + " VNĐ");
                    
                }
                else {
                    btnTaoHoaDon.setEnabled(false);
                }
            }
        });
        btnTang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int soLuong = Integer.parseInt(txtSoLuong.getText());
                int a = 0;
                float tongTienC = 0;
                float giaKMC = 0;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getIdSanPham() == dhd.getIdSanPham()) {
                        a = i;
                    }
                    tongTienC += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                    giaKMC += (list.get(i).getDonGia() * ((list.get(i).getGiam()) / 100)) * list.get(i).getSoLuong();
                }
                soLuong++;
                list.get(a).setSoLuong(soLuong);
                txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTienC - giaKMC) + " VNĐ");
                txtTienKhuyenMai.setText(new DecimalFormat("###,###,###").format(giaKMC) + " VNĐ");
                lbGia.setText(new DecimalFormat("###,###,###").format(dhd.getDonGia() * soLuong) + " VNĐ");
                txtSoLuong.setText(String.valueOf(soLuong));
            }
        });

        btnGiam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int soLuong = Integer.parseInt(txtSoLuong.getText());
                int a = 0;
                float tongTienC = 0;
                float giaKMC = 0;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getIdSanPham() == dhd.getIdSanPham()) {
                        a = i;
                    }
                    tongTienC += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                    giaKMC += (list.get(i).getDonGia() * ((list.get(i).getGiam()) / 100)) * list.get(i).getSoLuong();
                }
                if (soLuong >= 2) {
                    soLuong--;
                    list.get(a).setSoLuong(soLuong);
                    txtSoLuong.setText(String.valueOf(soLuong));
                    txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTienC - giaKMC) + " VNĐ");
                    txtTienKhuyenMai.setText(new DecimalFormat("###,###,###").format(giaKMC) + " VNĐ");
                    lbGia.setText(new DecimalFormat("###,###,###").format(dhd.getDonGia() * soLuong) + " VNĐ");
                } else {
                    soLuong = 1;
                    list.get(a).setSoLuong(soLuong);
                    txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTienC - giaKMC) + " VNĐ");
                    txtTienKhuyenMai.setText(new DecimalFormat("###,###,###").format(giaKMC) + " VNĐ");
                    txtSoLuong.setText(String.valueOf(1));
                    lbGia.setText(new DecimalFormat("###,###,###").format(dhd.getDonGia() * soLuong) + " VNĐ");
                }
            }
        });
        lbGia.setText(new DecimalFormat("###,###,###").format(dhd.getDonGia() * Integer.parseInt(txtSoLuong.getText())) + " VNĐ");
        lbTenSanPham.setText(dhd.getTenSanPham());
        lbHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/" + dhd.getHinhSanPham()))); // NOI18N
    }

    public int TinhTongTien(int tongTien) {
        for (int i = 0; i < list.size(); i++) {
            tongTien += (list.get(i).getDonGia() * list.get(i).getSoLuong());
        }
        return tongTien;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        dongHoaDon = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbHinh = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbTenSanPham = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnTang = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnGiam = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtSoLuong = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lbGia = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(475, 100));
        setLayout(new java.awt.BorderLayout());

        dongHoaDon.setBackground(java.awt.Color.orange);
        dongHoaDon.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        dongHoaDon.setMaximumSize(new java.awt.Dimension(475, 100));
        dongHoaDon.setMinimumSize(new java.awt.Dimension(475, 100));
        dongHoaDon.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        lbHinh.setBackground(java.awt.Color.white);
        jPanel1.add(lbHinh);

        dongHoaDon.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 20, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        jPanel2.add(btnXoa);

        dongHoaDon.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel5.add(lbTenSanPham);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setPreferredSize(new java.awt.Dimension(40, 45));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/up.png"))); // NOI18N
        jPanel9.add(btnTang);

        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel10.setPreferredSize(new java.awt.Dimension(40, 45));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/down1.png"))); // NOI18N
        jPanel10.add(btnGiam);

        jPanel7.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel11.add(txtSoLuong);

        jPanel7.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        lbGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGia.setText("134.000.000VNĐ");
        jPanel8.add(lbGia);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        dongHoaDon.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(dongHoaDon, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel dongHoaDon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbGia;
    private javax.swing.JLabel lbHinh;
    private javax.swing.JLabel lbTenSanPham;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
