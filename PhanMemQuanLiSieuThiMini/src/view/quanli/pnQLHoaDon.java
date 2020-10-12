package view.quanli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modal.ConnectDAO;

public class pnQLHoaDon extends javax.swing.JPanel {

    public pnQLHoaDon() {
        initComponents();
        loadTable();
    }

    public void loadTable() {
        String query = "SELECT IDHoaDon AS 'ID Hóa Đơn' , NgayTao AS 'Ngày Tạo',IDKhachHang AS 'ID Khách Hàng'\n"
                + ",IDNhanVien AS 'ID Nhân Viên',TongTien AS 'Tổng Tiền',TrangThai AS 'Trạng Thái'\n"
                + ",PTThanhToan AS 'PT Thanh Toán' FROM HoaDon";
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNhanVien = new javax.swing.JTable();
        pnRight = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        pn.setMaximumSize(new java.awt.Dimension(1440, 740));
        pn.setMinimumSize(new java.awt.Dimension(1440, 740));
        pn.setLayout(null);

        jPanel1.setLayout(null);

        pnQuanLiKhachHang.setBackground(java.awt.Color.white);
        pnQuanLiKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnQuanLiKhachHang.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Hóa Đơn");
        pnQuanLiKhachHang.add(jLabel1);
        jLabel1.setBounds(10, 40, 150, 50);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField1);
        jTextField1.setBounds(160, 40, 410, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("PT Thanh Toán");
        pnQuanLiKhachHang.add(jLabel2);
        jLabel2.setBounds(10, 120, 150, 50);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField3);
        jTextField3.setBounds(770, 120, 410, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tên Khách Hàng");
        pnQuanLiKhachHang.add(jLabel3);
        jLabel3.setBounds(620, 120, 150, 50);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnQuanLiKhachHang.add(jComboBox1);
        jComboBox1.setBounds(160, 120, 410, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("ID Khách Hàng");
        pnQuanLiKhachHang.add(jLabel4);
        jLabel4.setBounds(620, 40, 150, 50);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(jTextField2);
        jTextField2.setBounds(770, 40, 410, 50);

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

        pnRight.setLayout(null);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jButton3.setText("Tìm Kiếm");
        pnRight.add(jButton3);
        jButton3.setBounds(0, 380, 240, 80);

        jDateChooser3.setBackground(java.awt.Color.white);
        jDateChooser3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateChooser3.setDateFormatString("dd/MM/yyyy");
        jDateChooser3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jDateChooser3.setMaxSelectableDate(new java.util.Date(253370743311000L));
        jDateChooser3.setMinSelectableDate(new java.util.Date(-62135791089000L));
        pnRight.add(jDateChooser3);
        jDateChooser3.setBounds(0, 610, 240, 40);

        jDateChooser4.setBackground(java.awt.Color.white);
        jDateChooser4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateChooser4.setDateFormatString("dd/MM/yyyy");
        jDateChooser4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jDateChooser4.setMaxSelectableDate(new java.util.Date(253370743311000L));
        jDateChooser4.setMinSelectableDate(new java.util.Date(-62135791089000L));
        pnRight.add(jDateChooser4);
        jDateChooser4.setBounds(0, 520, 240, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Đến");
        pnRight.add(jLabel5);
        jLabel5.setBounds(0, 570, 240, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Từ");
        pnRight.add(jLabel6);
        jLabel6.setBounds(0, 480, 240, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Lọc");
        pnRight.add(jButton1);
        jButton1.setBounds(50, 670, 140, 50);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tổng Số Hóa Đơn :");
        pnRight.add(jLabel8);
        jLabel8.setBounds(0, 70, 240, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tổng Số Hóa Đơn :");
        pnRight.add(jLabel9);
        jLabel9.setBounds(0, 20, 240, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tổng Số Tiền ");
        pnRight.add(jLabel10);
        jLabel10.setBounds(0, 200, 240, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tổng Số Hóa Đơn :");
        pnRight.add(jLabel11);
        jLabel11.setBounds(0, 250, 240, 40);

        pn.add(pnRight);
        pnRight.setBounds(1200, 0, 240, 740);

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable listNhanVien;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnQuanLiKhachHang;
    private javax.swing.JPanel pnRight;
    // End of variables declaration//GEN-END:variables
}
