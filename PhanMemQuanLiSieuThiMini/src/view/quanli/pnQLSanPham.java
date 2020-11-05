package view.quanli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modal.ConnectDAO;

public class pnQLSanPham extends javax.swing.JPanel {

    public pnQLSanPham() {
        initComponents();
    }

    public void loadTable() {
        String query = "SELECT IDSanPham AS 'ID Sản Phẩm' , IDNhomSanPham AS 'IDNhomSanPham',TenSanPham AS 'Tên Sản Phẩm'\n"
                + ",IDDonViTinh AS 'ID Đơn Vị Tính',NgaySanXuat AS 'Ngày Sản Xuất',HanSuDung AS 'Hạn Sử Dụng'\n"
                + ",UrlImage AS 'Link Ảnh' , IDBangGia AS 'ID Bảng Giá' FROM SanPham";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listNhanVien.getTableHeader().setPreferredSize(new Dimension(WIDTH, 40));
            listNhanVien.getTableHeader().setFont(new Font("Time New Roman", 1, 18));
            listNhanVien.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listNhanVien.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                tableMode.addRow(vData);
            }
            listNhanVien.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnQuanLiKhachHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbDonViTinh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNhanVien = new javax.swing.JTable();
        btnThemSanPham = new javax.swing.JButton();
        btnSuaSanPham = new javax.swing.JButton();
        btnKiemTraHSD = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnXoaSanPham = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        pn.setMaximumSize(new java.awt.Dimension(1440, 740));
        pn.setMinimumSize(new java.awt.Dimension(1440, 740));
        pn.setLayout(null);

        jPanel1.setLayout(null);

        pnQuanLiKhachHang.setBackground(java.awt.Color.white);
        pnQuanLiKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnQuanLiKhachHang.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Sản Phẩm");
        pnQuanLiKhachHang.add(jLabel1);
        jLabel1.setBounds(10, 40, 150, 50);

        txtTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(txtTenSanPham);
        txtTenSanPham.setBounds(160, 40, 410, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Đơn Vị Tính");
        pnQuanLiKhachHang.add(jLabel2);
        jLabel2.setBounds(10, 120, 150, 50);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField3);
        jTextField3.setBounds(770, 120, 410, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jLabel3);
        jLabel3.setBounds(620, 120, 150, 50);

        cbDonViTinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbDonViTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnQuanLiKhachHang.add(cbDonViTinh);
        cbDonViTinh.setBounds(160, 120, 420, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Mã Sản Phẩm");
        pnQuanLiKhachHang.add(jLabel4);
        jLabel4.setBounds(620, 40, 150, 50);

        txtMaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(txtMaSanPham);
        txtMaSanPham.setBounds(770, 40, 410, 50);

        jPanel1.add(pnQuanLiKhachHang);
        pnQuanLiKhachHang.setBounds(0, 0, 1190, 190);

        listNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        listNhanVien.setRowHeight(40);
        jScrollPane1.setViewportView(listNhanVien);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 1190, 540);

        pn.add(jPanel1);
        jPanel1.setBounds(0, 0, 1190, 740);

        btnThemSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnThemSanPham.setText("Thêm Sản Phẩm");
        pn.add(btnThemSanPham);
        btnThemSanPham.setBounds(1200, 200, 230, 90);

        btnSuaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnSuaSanPham.setText("Sửa Sản Phẩm");
        pn.add(btnSuaSanPham);
        btnSuaSanPham.setBounds(1200, 500, 230, 80);

        btnKiemTraHSD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnKiemTraHSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnKiemTraHSD.setText("Kiểm Tra HSD");
        pn.add(btnKiemTraHSD);
        btnKiemTraHSD.setBounds(1200, 650, 230, 80);

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        pn.add(btnTimKiem);
        btnTimKiem.setBounds(1200, 50, 230, 80);

        btnXoaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnXoaSanPham.setText("Xóa Sản Phẩm");
        pn.add(btnXoaSanPham);
        btnXoaSanPham.setBounds(1200, 350, 230, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKiemTraHSD;
    private javax.swing.JButton btnSuaSanPham;
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaSanPham;
    private javax.swing.JComboBox<String> cbDonViTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable listNhanVien;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnQuanLiKhachHang;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
