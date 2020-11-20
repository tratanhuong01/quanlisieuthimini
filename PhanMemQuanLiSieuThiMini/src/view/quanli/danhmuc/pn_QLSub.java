package view.quanli.danhmuc;

public class pn_QLSub extends javax.swing.JPanel {

    public pn_QLSub() {
        initComponents();
        pn_NhomKhachHang pn1 = new pn_NhomKhachHang();
        pn1.setVisible(true);
        pn_PTThanhToan pn5 = new pn_PTThanhToan();
        pn5.setVisible(true);
        pn_BoPhan pn2 = new pn_BoPhan();
        pn2.setVisible(true);
        pn_NhomSanPham pn4 = new pn_NhomSanPham();
        pn4.setVisible(true);
        pn_DonViTinh pn3 = new pn_DonViTinh();
        pn3.setVisible(true);
        pn_NhomKhachHang pn6 = new pn_NhomKhachHang();
        pn6.setVisible(true);
        pnNhomKhachHang.removeAll();
        pnBoPhan.removeAll();
        pnDonViTinh.removeAll();
        pnNhomSanPham.removeAll();
        pnPTThanhToan.removeAll();
        jPanel1.removeAll();
        
        pnNhomKhachHang.add(pn1);
        pnBoPhan.add(pn2);
        pnDonViTinh.add(pn3);
        pnNhomSanPham.add(pn4);
        pnPTThanhToan.add(pn5);
        jPanel1.add(pn6);
        
        pnNhomKhachHang.validate();
        pnBoPhan.validate();
        pnDonViTinh.validate();
        pnNhomSanPham.validate();
        pnPTThanhToan.validate();
        jPanel1.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnDanhMuc = new javax.swing.JPanel();
        pnNhomKhachHang = new javax.swing.JPanel();
        pnBoPhan = new javax.swing.JPanel();
        pnDonViTinh = new javax.swing.JPanel();
        pnNhomSanPham = new javax.swing.JPanel();
        pnPTThanhToan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1366, 600));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1366, 600));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1366, 600));

        pnDanhMuc.setPreferredSize(new java.awt.Dimension(1364, 1800));
        pnDanhMuc.setLayout(new java.awt.GridLayout(3, 2));

        pnNhomKhachHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        pnNhomKhachHang.setLayout(new java.awt.GridLayout());
        pnDanhMuc.add(pnNhomKhachHang);

        pnBoPhan.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        pnBoPhan.setLayout(new java.awt.GridLayout());
        pnDanhMuc.add(pnBoPhan);

        pnDonViTinh.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        pnDonViTinh.setLayout(new java.awt.GridLayout());
        pnDanhMuc.add(pnDonViTinh);

        pnNhomSanPham.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        pnNhomSanPham.setLayout(new java.awt.GridLayout());
        pnDanhMuc.add(pnNhomSanPham);

        pnPTThanhToan.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        pnPTThanhToan.setLayout(new java.awt.GridLayout());
        pnDanhMuc.add(pnPTThanhToan);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jPanel1.setLayout(new java.awt.GridLayout());
        pnDanhMuc.add(jPanel1);

        jScrollPane1.setViewportView(pnDanhMuc);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnBoPhan;
    private javax.swing.JPanel pnDanhMuc;
    private javax.swing.JPanel pnDonViTinh;
    private javax.swing.JPanel pnNhomKhachHang;
    private javax.swing.JPanel pnNhomSanPham;
    private javax.swing.JPanel pnPTThanhToan;
    // End of variables declaration//GEN-END:variables
}
