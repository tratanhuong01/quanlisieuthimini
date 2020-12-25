package view.quanli.hoadon;

import controller.LoadHoaDon;
import controller.LocHoaDon;
import controller.TimHoaDon;
import controller.XuatFile;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class pn_QLHoaDon extends javax.swing.JPanel {
    TimHoaDon thd = new TimHoaDon();
    LocHoaDon lhd = new LocHoaDon();
    LoadHoaDon load = new LoadHoaDon();
    public pn_QLHoaDon() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        load.load(listHoaDon, load.getAll());
    }
    public String getLoaiHoaDon(String sa) {
        String s = "";
        switch (sa) {
            case "Tất Cả":
                s = "   ";
                break;
            case "Hóa Đơn Khách Hàng":
                s = " AND HoaDon.LoaiHoaDon = 0 ";
                break;
            case "Hóa Đơn Nhập Hàng":
                s = " AND HoaDon.LoaiHoaDon = 1 ";
                break;
            case "Hóa Đơn Xuất Hàng":
                s = " AND HoaDon.LoaiHoaDon = 2 ";
                break;
        }
        return s;
    }
    public String getPTTThanhToan(String sa) {
        String s = "";
        switch (sa) {
            case "Tất Cả":
                s = "  ";
                break;
            case "ATM":
                s = " AND HoaDon.IDThongTin IS NOT NULL ";
                break;
            case "Tiền Mặt":
                s = " AND HoaDon.IDThongTin IS NULL ";
                break;
        }
        return s;
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
        btnLoc = new javax.swing.JButton();
        den = new com.toedter.calendar.JDateChooser();
        tu = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cbPTThanhToan = new javax.swing.JComboBox<>();
        cbLoaiHoaDon = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        cbChon = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        process = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHoaDon = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel22.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 100));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 598));
        jPanel1.setLayout(null);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Từ");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 30, 40, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đến");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(160, 30, 50, 40);

        btnLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });
        jPanel5.add(btnLoc);
        btnLoc.setBounds(110, 280, 130, 60);

        den.setDateFormatString("yyyy-MM-dd");
        den.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel5.add(den);
        den.setBounds(210, 30, 120, 40);

        tu.setDateFormatString("yyyy-MM-dd");
        tu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel5.add(tu);
        tu.setBounds(40, 30, 120, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Phương Thức Thanh Toán");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 80, 320, 40);

        cbPTThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPTThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "ATM", "Tiền Mặt" }));
        jPanel5.add(cbPTThanhToan);
        cbPTThanhToan.setBounds(10, 120, 320, 46);

        cbLoaiHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbLoaiHoaDon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Hóa Đơn Khách Hàng", "Hóa Đơn Nhập Hàng", "Hóa Đơn Xuất Hàng" }));
        jPanel5.add(cbLoaiHoaDon);
        cbLoaiHoaDon.setBounds(10, 220, 320, 46);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Loại Hóa Đơn");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 180, 320, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 241, 350, 360);

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        cbChon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Mã Hóa Đơn", "Theo Ngày Tạo", "Theo Tên Nhân Viên", "Theo Tên Khách Hàng", "Theo Mã Khách Hàng", "Theo Mã Nhân Viên" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cbChon, 0, 304, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnTim))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(cbChon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(2, 10, 340, 230);

        jScrollPane1.setViewportView(jPanel1);

        jPanel22.add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setPreferredSize(new java.awt.Dimension(101, 100));
        jPanel3.setLayout(null);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        jPanel3.add(btnXoa);
        btnXoa.setBounds(240, 20, 141, 63);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-export-40.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });
        jPanel3.add(btnXuatFile);
        btnXuatFile.setBounds(440, 20, 160, 63);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        jPanel3.add(btnSua);
        btnSua.setBounds(30, 20, 158, 63);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(630, 20, 140, 30);

        process.setForeground(new java.awt.Color(51, 255, 51));
        jPanel3.add(process);
        process.setBounds(630, 50, 146, 30);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        listHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listHoaDon.setRowHeight(25);
        jScrollPane2.setViewportView(listHoaDon);

        jPanel4.add(jScrollPane2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel22, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        load.load(listHoaDon, thd.loc(thd.switchs(cbChon.getSelectedItem().toString(), txtInput.getText())));
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String subQuery = getLoaiHoaDon(cbLoaiHoaDon.getSelectedItem().toString()) + " " +
                           getPTTThanhToan(cbPTThanhToan.getSelectedItem().toString());
        load.load(listHoaDon, lhd.loc(sdf.format(tu.getDate()), sdf.format(den.getDate()),subQuery));
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        new XuatFile().execute(listHoaDon, process, "Hóa Đơn");
    }//GEN-LAST:event_btnXuatFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cbChon;
    private javax.swing.JComboBox<String> cbLoaiHoaDon;
    private javax.swing.JComboBox<String> cbPTThanhToan;
    private com.toedter.calendar.JDateChooser den;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JProgressBar process;
    private com.toedter.calendar.JDateChooser tu;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
