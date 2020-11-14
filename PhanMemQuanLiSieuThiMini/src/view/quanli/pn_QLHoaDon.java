package view.quanli;

public class pn_QLHoaDon extends javax.swing.JPanel {

    public pn_QLHoaDon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        cboxMaHoaDon = new javax.swing.JCheckBox();
        txtMaHoaDon = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        cboxPTThanhToan = new javax.swing.JCheckBox();
        cbPTThanhToan = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cboxTenKhachHang = new javax.swing.JCheckBox();
        txtTenKhachHang = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        cboxMaKhachHang = new javax.swing.JCheckBox();
        txttMaKhachHang = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKhachHang = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbTien = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbSoHoaDon = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnLoc = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 150));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(230, 119));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        jPanel3.add(btnTimKiem);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.add(jPanel14);

        jPanel15.add(jPanel16);

        jPanel13.add(jPanel15);

        cboxMaHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxMaHoaDon.setText("Mã Hóa Đơn");
        cboxMaHoaDon.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel13.add(cboxMaHoaDon);

        txtMaHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMaHoaDon.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel13.add(txtMaHoaDon);

        jPanel17.add(jPanel18);

        jPanel19.add(jPanel20);

        jPanel17.add(jPanel19);

        cboxPTThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxPTThanhToan.setText("Địa Chỉ");
        cboxPTThanhToan.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel17.add(cboxPTThanhToan);

        cbPTThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPTThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPTThanhToan.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel17.add(cbPTThanhToan);

        jPanel13.add(jPanel17);

        jPanel2.add(jPanel13);

        jPanel4.add(jPanel6);

        jPanel7.add(jPanel8);

        jPanel4.add(jPanel7);

        cboxTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxTenKhachHang.setText("Tên Khách Hàng");
        cboxTenKhachHang.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel4.add(cboxTenKhachHang);

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenKhachHang.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(txtTenKhachHang);

        jPanel9.add(jPanel10);

        jPanel11.add(jPanel12);

        jPanel9.add(jPanel11);

        cboxMaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxMaKhachHang.setText("Mã Khách Hàng");
        cboxMaKhachHang.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel9.add(cboxMaKhachHang);

        txttMaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txttMaKhachHang.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel9.add(txttMaKhachHang);

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

        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel21.setMaximumSize(new java.awt.Dimension(315, 32767));
        jPanel21.setMinimumSize(new java.awt.Dimension(315, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(315, 535));
        jPanel21.setRequestFocusEnabled(false);
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0);
        flowLayout2.setAlignOnBaseline(true);
        jPanel21.setLayout(flowLayout2);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tổng Số Tiền :");
        jLabel10.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel21.add(jLabel10);

        lbTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTien.setText("0 VNĐ");
        lbTien.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel21.add(lbTien);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tổng Số Hóa Đơn :");
        jLabel9.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel21.add(jLabel9);

        lbSoHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbSoHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoHoaDon.setText("873 Hóa Đơn");
        lbSoHoaDon.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel21.add(lbSoHoaDon);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Từ");
        jLabel12.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel21.add(jLabel12);

        jDateChooser1.setBorder(javax.swing.BorderFactory.createEmptyBorder(19, 1, 10, 1));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(220, 70));
        jPanel21.add(jDateChooser1);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Đến");
        jLabel13.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel21.add(jLabel13);

        jDateChooser2.setBorder(javax.swing.BorderFactory.createEmptyBorder(19, 1, 10, 1));
        jDateChooser2.setPreferredSize(new java.awt.Dimension(220, 70));
        jPanel21.add(jDateChooser2);

        btnLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel21.add(btnLoc);

        add(jPanel21, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void listKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKhachHangMouseClicked
        int row = listKhachHang.getSelectedRow();
        txtTenKhachHang.setText(listKhachHang.getModel().getValueAt(row, 0).toString());
        txtMaHoaDon.setText(listKhachHang.getModel().getValueAt(row, 2).toString());
        txttMaKhachHang.setText(listKhachHang.getModel().getValueAt(row, 4).toString());
        
    }//GEN-LAST:event_listKhachHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbPTThanhToan;
    private javax.swing.JCheckBox cboxMaHoaDon;
    private javax.swing.JCheckBox cboxMaKhachHang;
    private javax.swing.JCheckBox cboxPTThanhToan;
    private javax.swing.JCheckBox cboxTenKhachHang;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSoHoaDon;
    private javax.swing.JLabel lbTien;
    private javax.swing.JTable listKhachHang;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txttMaKhachHang;
    // End of variables declaration//GEN-END:variables
}
