package view.quanli.hoadon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class pn_QLHoaDon extends javax.swing.JPanel {

    public pn_QLHoaDon() {
        initComponents();
        loadTable();
    }
    public void loadTable() {
        String query = "SELECT IDHoaDon AS 'ID Hóa Đơn' , NgayTao AS 'Ngày Tạo',IDKhachHang AS 'ID Khách Hàng'\n"
                        + ",IDNhanVien AS 'ID Nhân Viên',TongTien AS 'Tổng Tiền',TrangThai AS 'Trạng Thái'\n"
                        + ",IDThongTin AS 'ID Thông Tin' FROM HoaDon";      
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listHoaDon.getTableHeader().setPreferredSize(new Dimension(WIDTH, 40));
            listHoaDon.getTableHeader().setFont(new Font("Time New Roman", 1, 18));
            listHoaDon.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listHoaDon.removeAll();
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
            listHoaDon.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHoaDon = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel22.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 100));

        jPanel1.setPreferredSize(new java.awt.Dimension(335, 598));
        jPanel1.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Từ");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 30, 50, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đến");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(0, 90, 60, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        jButton1.setText("Lọc");
        jPanel5.add(jButton1);
        jButton1.setBounds(120, 160, 130, 60);
        jPanel5.add(jDateChooser3);
        jDateChooser3.setBounds(80, 100, 250, 30);
        jPanel5.add(jDateChooser4);
        jDateChooser4.setBounds(80, 40, 250, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 191, 350, 410);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTim.setText("Tìm");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(2, 10, 340, 180);

        jScrollPane1.setViewportView(jPanel1);

        jPanel22.add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(101, 100));
        jPanel3.setLayout(null);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        jPanel3.add(btnXoa);
        btnXoa.setBounds(234, 13, 141, 63);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setText("Xuất File");
        jPanel3.add(btnXuatFile);
        btnXuatFile.setBounds(420, 10, 141, 63);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        jPanel3.add(btnSua);
        btnSua.setBounds(36, 13, 158, 63);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        listHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(listHoaDon);

        jPanel4.add(jScrollPane2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel22, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listHoaDon;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
