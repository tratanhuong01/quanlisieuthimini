package view.quanli;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pnQLTKDoanhThu extends javax.swing.JPanel {

    public pnQLTKDoanhThu() {
        initComponents();
        load();
    }

    public void load() {
        JPanel[] arrPanel = {pnDoanhThuTrongNgay, pnDoanhThuNgayTruoc, pnDoanhThuTrongTuan,
            pnDoanhThuTuanTruoc, pnDoanhThuTrongThang, pnDoanhThuThangTruoc, pnDoanhThuTrongNam,
            pnDoanhThuNamTruoc};
        String[] tenThongKeDoanhThu = {"Doanh Thu Trong Ngày", "Doanh Thu Ngày Trước", "Doanh Thu Trong Tuần",
            "Doanh Thu Tuần Trước", "Doanh Thu Trong Tháng", "Doanh Thu Tháng Trước", "Doanh Thu Trong Năm", "Doanh Thu Năm Trước"};
        String[] tenThongKeSanPham = {"Sản Phẩm Bán Trong Ngày", "Sản Phẩm Bán Ngày Trước", "Sản Phẩm Bán Trong Tuần",
            "Sản Phẩm Bán Tuần Trước", "Sản Phẩm Bán Trong Tháng", "Sản Phẩm Bán Tháng Trước", "Sản Phẩm Bán Trong Năm", "Sản Phẩm Bán Năm Trước"};
        for (int i = 0; i < arrPanel.length; i++) {
            String[] arr = new String[8]; 
            if (cbChon.getSelectedItem().toString().equals("Doanh Thu")) {
                arr = tenThongKeDoanhThu;
            }
            else {
                arr = tenThongKeSanPham;
            }
            JLabel lbTien = new JLabel();
            JButton btn = new JButton();
            JLabel lbTenThongKe = new JLabel();
            JLabel lbHinh = new JLabel();
            lbTenThongKe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
            lbTenThongKe.setForeground(java.awt.Color.white);
            lbTenThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbTenThongKe.setText(arr[i]);
            arrPanel[i].add(lbTenThongKe);
            lbTenThongKe.setBounds(10, 0, 410, 40);
            lbHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
            arrPanel[i].add(lbHinh);
            lbHinh.setBounds(10, 40, 410, 80);
            lbTien.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
            lbTien.setForeground(java.awt.Color.white);
            lbTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbTien.setText("3.023.000 VNĐ");
            arrPanel[i].add(lbTien);
            lbTien.setBounds(100, 130, 240, 30);
            btn.setText("THÔNG TIN CHI TIẾT");
            btn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            btn.setForeground(Color.WHITE);
            btn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.LIGHT_GRAY));
            btn.setBackground(arrPanel[i].getBackground());
            arrPanel[i].add(btn);
            btn.setBounds(10, 170, 400, 40);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbChon = new javax.swing.JComboBox<>();
        pnFull = new javax.swing.JPanel();
        pnDoanhThuTrongNgay = new javax.swing.JPanel();
        pnDoanhThuNgayTruoc = new javax.swing.JPanel();
        pnDoanhThuTrongTuan = new javax.swing.JPanel();
        pnDoanhThuTuanTruoc = new javax.swing.JPanel();
        pnDoanhThuTrongThang = new javax.swing.JPanel();
        pnDoanhThuThangTruoc = new javax.swing.JPanel();
        pnDoanhThuTrongNam = new javax.swing.JPanel();
        pnDoanhThuNamTruoc = new javax.swing.JPanel();
        btnChiTietDoanhThu = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));
        setLayout(null);

        cbChon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doanh Thu", "Sản Phẩm" }));
        cbChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonActionPerformed(evt);
            }
        });
        add(cbChon);
        cbChon.setBounds(510, 0, 420, 50);

        pnFull.setBackground(java.awt.Color.white);
        pnFull.setLayout(null);

        pnDoanhThuTrongNgay.setBackground(new java.awt.Color(77, 177, 81));
        pnDoanhThuTrongNgay.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongNgay.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNgay.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNgay.setLayout(null);
        pnFull.add(pnDoanhThuTrongNgay);
        pnDoanhThuTrongNgay.setBounds(20, 0, 420, 220);

        pnDoanhThuNgayTruoc.setBackground(new java.awt.Color(255, 151, 0));
        pnDoanhThuNgayTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuNgayTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNgayTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNgayTruoc.setLayout(null);
        pnFull.add(pnDoanhThuNgayTruoc);
        pnDoanhThuNgayTruoc.setBounds(510, 0, 420, 220);

        pnDoanhThuTrongTuan.setBackground(new java.awt.Color(109, 108, 103));
        pnDoanhThuTrongTuan.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongTuan.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongTuan.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongTuan.setLayout(null);
        pnFull.add(pnDoanhThuTrongTuan);
        pnDoanhThuTrongTuan.setBounds(1000, 0, 420, 220);

        pnDoanhThuTuanTruoc.setBackground(new java.awt.Color(25, 112, 132));
        pnDoanhThuTuanTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTuanTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTuanTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTuanTruoc.setLayout(null);
        pnFull.add(pnDoanhThuTuanTruoc);
        pnDoanhThuTuanTruoc.setBounds(20, 230, 420, 220);

        pnDoanhThuTrongThang.setBackground(new java.awt.Color(30, 149, 244));
        pnDoanhThuTrongThang.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongThang.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongThang.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongThang.setLayout(null);
        pnFull.add(pnDoanhThuTrongThang);
        pnDoanhThuTrongThang.setBounds(510, 230, 420, 220);

        pnDoanhThuThangTruoc.setBackground(new java.awt.Color(96, 125, 139));
        pnDoanhThuThangTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuThangTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuThangTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuThangTruoc.setLayout(null);
        pnFull.add(pnDoanhThuThangTruoc);
        pnDoanhThuThangTruoc.setBounds(1000, 230, 420, 220);

        pnDoanhThuTrongNam.setBackground(new java.awt.Color(222, 77, 58));
        pnDoanhThuTrongNam.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongNam.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNam.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNam.setLayout(null);
        pnFull.add(pnDoanhThuTrongNam);
        pnDoanhThuTrongNam.setBounds(20, 460, 420, 220);

        pnDoanhThuNamTruoc.setBackground(new java.awt.Color(122, 66, 65));
        pnDoanhThuNamTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuNamTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNamTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNamTruoc.setLayout(null);
        pnFull.add(pnDoanhThuNamTruoc);
        pnDoanhThuNamTruoc.setBounds(510, 460, 420, 220);

        btnChiTietDoanhThu.setBackground(java.awt.Color.orange);
        btnChiTietDoanhThu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnChiTietDoanhThu.setForeground(java.awt.Color.white);
        btnChiTietDoanhThu.setText("Chi Tiết Doanh Thu");
        btnChiTietDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietDoanhThuActionPerformed(evt);
            }
        });
        pnFull.add(btnChiTietDoanhThu);
        btnChiTietDoanhThu.setBounds(1020, 500, 356, 87);

        add(pnFull);
        pnFull.setBounds(0, 60, 1440, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void cbChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonActionPerformed
        Component[] comp = pnFull.getComponents();
        System.out.print(comp.length);
        for (int i = 0; i < comp.length - 1; i++) {
            JPanel pn = (JPanel)comp[i];
            pn.removeAll();
            pn.revalidate();
            pn.repaint();
        }
        load();
    }//GEN-LAST:event_cbChonActionPerformed

    private void btnChiTietDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietDoanhThuActionPerformed
        new jfChiTietDoanhThu().setVisible(true);
    }//GEN-LAST:event_btnChiTietDoanhThuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietDoanhThu;
    private javax.swing.JComboBox<String> cbChon;
    private javax.swing.JPanel pnDoanhThuNamTruoc;
    private javax.swing.JPanel pnDoanhThuNgayTruoc;
    private javax.swing.JPanel pnDoanhThuThangTruoc;
    private javax.swing.JPanel pnDoanhThuTrongNam;
    private javax.swing.JPanel pnDoanhThuTrongNgay;
    private javax.swing.JPanel pnDoanhThuTrongThang;
    private javax.swing.JPanel pnDoanhThuTrongTuan;
    private javax.swing.JPanel pnDoanhThuTuanTruoc;
    private javax.swing.JPanel pnFull;
    // End of variables declaration//GEN-END:variables
}
