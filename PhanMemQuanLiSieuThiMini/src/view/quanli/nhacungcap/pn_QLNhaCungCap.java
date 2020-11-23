package view.quanli.nhacungcap;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class pn_QLNhaCungCap extends javax.swing.JPanel {

    public pn_QLNhaCungCap() {
        initComponents();
        loadTable();
    }
    public void loadTable() {
            String query = "SELECT KhachHang.IDKhachHang ,NhomKhachHang.TenNhom,KhachHang.HoTen,KhachHang.GioiTinh,\n"
                    + "KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                    + "KhachHang.TraDK,KhachHang.ThuDK\n"
                    + "FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                    + "WHERE NhomKhachHang.IDNhomKH = 'NKH00003' ";
        System.out.print(query);
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listKhachHang.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            listKhachHang.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
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
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                vData.add(rs.getString(10));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        cboxTenNhaCungCap = new javax.swing.JCheckBox();
        txtTenNhaCungCap = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        cboxDiaChi = new javax.swing.JCheckBox();
        txtDiaChi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cboxMaNhaCungCap = new javax.swing.JCheckBox();
        txtMaNhaCungCap = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cboxSoDienThoai = new javax.swing.JCheckBox();
        txtSoDienThoai = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKhachHang = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnThemNhaCungCap = new javax.swing.JButton();
        btnXoaNhaCungCap = new javax.swing.JButton();
        btnSuaNhaCungCap = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Nhà Cung Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 150));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(230, 119));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        jPanel3.add(btnTimKiem);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.setBackground(java.awt.Color.white);

        cboxTenNhaCungCap.setBackground(java.awt.Color.white);
        cboxTenNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxTenNhaCungCap.setText("Tên Nhà Cung Cấp");
        cboxTenNhaCungCap.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel13.add(cboxTenNhaCungCap);

        txtTenNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenNhaCungCap.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel13.add(txtTenNhaCungCap);

        jPanel17.setBackground(java.awt.Color.white);

        cboxDiaChi.setBackground(java.awt.Color.white);
        cboxDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxDiaChi.setText("Địa Chỉ");
        cboxDiaChi.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel17.add(cboxDiaChi);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiaChi.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel17.add(txtDiaChi);

        jPanel13.add(jPanel17);

        jPanel2.add(jPanel13);

        jPanel4.setBackground(java.awt.Color.white);

        cboxMaNhaCungCap.setBackground(java.awt.Color.white);
        cboxMaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxMaNhaCungCap.setText("Mã Nhà Cung Cấp");
        cboxMaNhaCungCap.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel4.add(cboxMaNhaCungCap);

        txtMaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMaNhaCungCap.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(txtMaNhaCungCap);

        jPanel9.setBackground(java.awt.Color.white);

        cboxSoDienThoai.setBackground(java.awt.Color.white);
        cboxSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxSoDienThoai.setText("Số Điện Thoại");
        cboxSoDienThoai.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel9.add(cboxSoDienThoai);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSoDienThoai.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel9.add(txtSoDienThoai);

        jPanel4.add(jPanel9);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(1050, 535));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        listKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        listKhachHang.setRowHeight(40);
        listKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listKhachHang);

        jPanel5.add(jScrollPane1);

        add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel21.setBackground(java.awt.Color.white);
        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel21.setMaximumSize(new java.awt.Dimension(315, 32767));
        jPanel21.setMinimumSize(new java.awt.Dimension(315, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(315, 535));
        jPanel21.setRequestFocusEnabled(false);
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 23, 23);
        flowLayout2.setAlignOnBaseline(true);
        jPanel21.setLayout(flowLayout2);

        btnThemNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemNhaCungCap.setText("Thêm Nhà Cung Cấp");
        btnThemNhaCungCap.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnThemNhaCungCap);

        btnXoaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaNhaCungCap.setText("Xóa Nhà Cung Cấp");
        btnXoaNhaCungCap.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnXoaNhaCungCap);

        btnSuaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaNhaCungCap.setText("Sửa Nhà Cung Cấp");
        btnSuaNhaCungCap.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnSuaNhaCungCap);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnXuatFile);

        add(jPanel21, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void listKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKhachHangMouseClicked
        int row = listKhachHang.getSelectedRow();
        txtMaNhaCungCap.setText(listKhachHang.getModel().getValueAt(row, 0).toString());
        txtTenNhaCungCap.setText(listKhachHang.getModel().getValueAt(row, 2).toString());
        txtSoDienThoai.setText(listKhachHang.getModel().getValueAt(row, 4).toString());
        txtDiaChi.setText(listKhachHang.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_listKhachHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNhaCungCap;
    private javax.swing.JButton btnThemNhaCungCap;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaNhaCungCap;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JCheckBox cboxDiaChi;
    private javax.swing.JCheckBox cboxMaNhaCungCap;
    private javax.swing.JCheckBox cboxSoDienThoai;
    private javax.swing.JCheckBox cboxTenNhaCungCap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhaCungCap;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhaCungCap;
    // End of variables declaration//GEN-END:variables
}
