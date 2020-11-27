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
            jTable1.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            jTable1.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            jTable1.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            jTable1.removeAll();
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
            jTable1.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTenSanPham1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGiam = new javax.swing.JTextField();
        txtGiaVon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1213, 650));
        setMinimumSize(new java.awt.Dimension(1213, 650));
        setPreferredSize(new java.awt.Dimension(1213, 650));
        setSize(new java.awt.Dimension(1213, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Sản Phẩm");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 130, 30);

        txtIDSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtIDSanPham.setEnabled(false);
        getContentPane().add(txtIDSanPham);
        txtIDSanPham.setBounds(180, 10, 200, 50);

        txtTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtTenSanPham);
        txtTenSanPham.setBounds(180, 70, 200, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tên Sản Phẩm");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 130, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 1220, 450);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Xóa");
        getContentPane().add(jButton1);
        jButton1.setBounds(1120, 130, 110, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Nhóm Sản Phẩm");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 140, 140, 30);

        txtTenSanPham1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtTenSanPham1);
        txtTenSanPham1.setBounds(180, 130, 200, 50);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Giảm");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 140, 90, 30);

        txtGiam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtGiam);
        txtGiam.setBounds(480, 130, 200, 50);

        txtGiaVon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtGiaVon);
        txtGiaVon.setBounds(480, 70, 200, 50);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Giá Vốn");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 80, 90, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Đơn Giá");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 20, 90, 30);

        txtDonGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtDonGia);
        txtDonGia.setBounds(480, 10, 200, 50);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1010, 20, 80, 80);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Import File Exel");
        getContentPane().add(jButton2);
        jButton2.setBounds(690, 130, 290, 50);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Thêm");
        getContentPane().add(jButton3);
        jButton3.setBounds(1120, 10, 110, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Sửa");
        getContentPane().add(jButton4);
        jButton4.setBounds(1120, 70, 110, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Chọn Nhà Cung Cấp");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(690, 20, 290, 30);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(690, 70, 290, 50);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Upload");
        getContentPane().add(jButton5);
        jButton5.setBounds(1000, 130, 110, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        txtIDSanPham.setText(jTable1.getModel().getValueAt(index, 0).toString());
        txtTenSanPham.setText(jTable1.getModel().getValueAt(index, 1).toString());
        txtDonGia.setText(jTable1.getModel().getValueAt(index, 3).toString());
        txtGiaVon.setText(jTable1.getModel().getValueAt(index, 4).toString());
        txtGiam.setText(jTable1.getModel().getValueAt(index, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiaVon;
    private javax.swing.JTextField txtGiam;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTenSanPham1;
    // End of variables declaration//GEN-END:variables
}
