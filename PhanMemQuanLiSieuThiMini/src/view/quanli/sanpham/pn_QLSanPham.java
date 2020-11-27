package view.quanli.sanpham;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class pn_QLSanPham extends javax.swing.JPanel {

    public pn_QLSanPham() {
        initComponents();
        loadTable(jTable1);
    }
    public void loadTable(JTable jTable) {
        String query = "SELECT IDSanPham AS 'ID Sản Phẩm' , IDNhomSanPham AS 'IDNhomSanPham',TenSanPham AS 'Tên Sản Phẩm'\n"
                + ",IDDonViTinh AS 'ID Đơn Vị Tính',NgaySanXuat AS 'Ngày Sản Xuất',HanSuDung AS 'Hạn Sử Dụng'\n"
                + ",UrlImage AS 'Link Ảnh' , IDBangGia AS 'ID Bảng Giá' FROM SanPham";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            jTable.getTableHeader().setPreferredSize(new Dimension(WIDTH, 40));
            jTable.getTableHeader().setFont(new Font("Time New Roman", 1, 18));
            jTable.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            jTable.removeAll();
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
            jTable.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 200));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bộ Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel7.setLayout(null);
        jPanel7.add(jTextField1);
        jTextField1.setBounds(200, 60, 120, 44);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        jButton1.setText("OK");
        jPanel7.add(jButton1);
        jButton1.setBounds(330, 50, 130, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Đến");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(160, 60, 40, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setText("Sản Phẩm Đã Bán");
        jPanel7.add(jButton8);
        jButton8.setBounds(240, 130, 220, 50);
        jPanel7.add(jTextField3);
        jTextField3.setBounds(40, 60, 110, 44);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Theo Giá Sản Phẩm");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(11, 24, 170, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Từ");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 60, 30, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setText("Sản Phẩm Tồn Kho");
        jPanel7.add(jButton9);
        jButton9.setBounds(10, 130, 220, 50);

        jPanel1.add(jPanel7);

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel6.setLayout(null);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel6.add(jTextField2);
        jTextField2.setBounds(130, 20, 334, 46);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Tìm");
        jPanel6.add(jButton4);
        jButton4.setBounds(341, 77, 120, 44);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1);
        jComboBox1.setBounds(11, 77, 320, 44);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("---------------------------------------------------------------------------");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(11, 128, 450, 10);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Xuất File");
        jPanel6.add(jButton5);
        jButton5.setBounds(10, 140, 150, 50);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Sản Phẩm ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(170, 140, 290, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Nhập Dữ Liệu");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(10, 20, 120, 50);

        jPanel1.add(jPanel6);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp Xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel5.setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Bán Chạy");
        jPanel5.add(jButton2);
        jButton2.setBounds(110, 140, 208, 49);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Theo Hạn Sử Dụng");
        jPanel5.add(jButton3);
        jButton3.setBounds(240, 90, 205, 49);

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setText("Giảm Dần");
        jPanel5.add(jRadioButton1);
        jRadioButton1.setBounds(240, 30, 200, 40);

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setText("Tăng Dần");
        jPanel5.add(jRadioButton2);
        jRadioButton2.setBounds(20, 30, 200, 40);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setText("Theo Giá");
        jPanel5.add(jButton10);
        jButton10.setBounds(10, 90, 208, 49);

        jPanel1.add(jPanel5);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new jf_SanPham().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
