package view.quanli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modal.ConnectDAO;

public class pnQLNhaCungCap extends javax.swing.JPanel {

    public pnQLNhaCungCap() {
        initComponents();
    }
    public void loadTable() {
        String query = "SELECT IDKhachHang AS 'ID Khách Hàng' , IDNhomKH AS 'ID Nhóm Khách Hàng',\n"
                + "HoTen AS 'Họ Tên' , GioiTinh AS 'Giới Tính', SoDienThoai AS 'Số Điện Thoại',\n"
                + "DiaChi AS 'Địa Chỉ' FROM KhachHang WHERE IDNhomKH = 'NKH00002' ";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listKhachHang.getTableHeader().setPreferredSize(new Dimension(WIDTH, 40));
            listKhachHang.getTableHeader().setFont(new Font("Time New Roman", 1, 18));
            listKhachHang.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listKhachHang.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                tableMode.addRow(vData);
            }
            listKhachHang.setModel(tableMode);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKhachHang = new javax.swing.JTable();
        btnSuaNhanVien = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnThemNhanVien = new javax.swing.JButton();
        btnSuaNhanVien1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        pn.setMaximumSize(new java.awt.Dimension(1440, 740));
        pn.setMinimumSize(new java.awt.Dimension(1440, 740));
        pn.setLayout(null);

        jPanel1.setLayout(null);

        pnQuanLiKhachHang.setBackground(java.awt.Color.white);
        pnQuanLiKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Nhà Cung Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnQuanLiKhachHang.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Tên Nhà Cung Cấp");
        pnQuanLiKhachHang.add(jLabel1);
        jLabel1.setBounds(10, 40, 150, 50);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField1);
        jTextField1.setBounds(160, 40, 410, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Địa Chỉ");
        pnQuanLiKhachHang.add(jLabel2);
        jLabel2.setBounds(10, 120, 150, 50);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField3);
        jTextField3.setBounds(770, 120, 390, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Số Điện Thoại");
        pnQuanLiKhachHang.add(jLabel3);
        jLabel3.setBounds(620, 120, 150, 50);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnQuanLiKhachHang.add(jComboBox1);
        jComboBox1.setBounds(160, 120, 420, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Mã Nhà Cung Cấp");
        pnQuanLiKhachHang.add(jLabel4);
        jLabel4.setBounds(620, 40, 150, 50);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField2);
        jTextField2.setBounds(770, 40, 390, 50);

        jPanel1.add(pnQuanLiKhachHang);
        pnQuanLiKhachHang.setBounds(0, 0, 1170, 190);

        listKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        listKhachHang.setRowHeight(40);
        jScrollPane1.setViewportView(listKhachHang);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 1170, 540);

        pn.add(jPanel1);
        jPanel1.setBounds(0, 0, 1170, 740);

        btnSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnSuaNhanVien.setText("Chọn Nhà Cung Cấp");
        pn.add(btnSuaNhanVien);
        btnSuaNhanVien.setBounds(1180, 640, 260, 80);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jButton2.setText("Tìm Kiếm");
        pn.add(jButton2);
        jButton2.setBounds(1180, 50, 260, 80);

        btnThemNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnThemNhanVien.setText("Thêm Nhà Cung Cấp");
        pn.add(btnThemNhanVien);
        btnThemNhanVien.setBounds(1180, 200, 260, 80);

        btnSuaNhanVien1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnSuaNhanVien1.setText("Sửa Nhà Cung Cấp");
        pn.add(btnSuaNhanVien1);
        btnSuaNhanVien1.setBounds(1180, 390, 260, 80);

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
    private javax.swing.JButton btnSuaNhanVien;
    private javax.swing.JButton btnSuaNhanVien1;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable listKhachHang;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnQuanLiKhachHang;
    // End of variables declaration//GEN-END:variables
}
