package view.quanli.sanpham;

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

public class jf_SanPham extends javax.swing.JFrame {

    public jf_SanPham() {
        initComponents();
        loadTable("");
    }

    public void loadTable(String text) {
        String query = "SELECT SanPham.IDSanPham ,SanPham.TenSanPham ,NhomSanPham.TenNhom,BangGia.DonGia,BangGia.GiaVonSP,BangGia.Giam\n"
                + "FROM SanPham INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                + "INNER JOIN BangGia ON SanPham.IDBangGia = SanPham.IDBangGia" + text;
        System.out.print(query);
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode = null;
            listSanPham.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            listSanPham.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            listSanPham.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listSanPham.removeAll();
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
            listSanPham.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenSanPham1 = new javax.swing.JTextField();
        txtGiam = new javax.swing.JTextField();
        txtGiaVon = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Sản Phẩm");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 30, 130, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tên Sản Phẩm");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 90, 130, 30);

        txtIDSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtIDSanPham.setEnabled(false);
        jPanel2.add(txtIDSanPham);
        txtIDSanPham.setBounds(210, 20, 200, 50);

        txtTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtTenSanPham);
        txtTenSanPham.setBounds(210, 80, 200, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Nhóm Sản Phẩm");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 150, 140, 30);

        txtTenSanPham1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtTenSanPham1);
        txtTenSanPham1.setBounds(210, 140, 200, 50);

        txtGiam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtGiam);
        txtGiam.setBounds(510, 140, 200, 50);

        txtGiaVon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtGiaVon);
        txtGiaVon.setBounds(510, 80, 200, 50);

        txtDonGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtDonGia);
        txtDonGia.setBounds(510, 20, 200, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Đơn Giá");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(420, 30, 90, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Giá Vốn");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(420, 90, 90, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Giảm");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(420, 150, 90, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Import File Exel");
        jPanel2.add(jButton2);
        jButton2.setBounds(720, 140, 290, 50);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(720, 80, 290, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Chọn Nhà Cung Cấp");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(720, 30, 290, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Xóa");
        jPanel2.add(jButton1);
        jButton1.setBounds(1090, 140, 170, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Sửa");
        jPanel2.add(jButton4);
        jButton4.setBounds(1090, 80, 170, 50);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Thêm");
        jPanel2.add(jButton3);
        jButton3.setBounds(1090, 20, 170, 50);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        listSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listSanPham.setRowHeight(25);
        jScrollPane2.setViewportView(listSanPham);

        jPanel1.add(jScrollPane2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiaVon;
    private javax.swing.JTextField txtGiam;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTenSanPham1;
    // End of variables declaration//GEN-END:variables
}
