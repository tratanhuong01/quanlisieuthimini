package view.kho;

import controller.LoadTable_Kho;
import controller.UpdateDB;
import controller.XuLiPhieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import model.ConnectDAO;

public class jf_XuLiPhieuXuat extends javax.swing.JFrame {

    String idHoaDon;
    String idDongHoaDon = "";
    String idKVKho = "";

    public jf_XuLiPhieuXuat(String idHoaDon) {
        initComponents();
        this.idHoaDon = idHoaDon;
        btnNhapFile.setEnabled(false);
        String query = " WHERE DongHoaDon.IDHoaDon = '" + idHoaDon + "' AND DongHoaDon.TinhTrang = 0 AND HoaDon.LoaiHoaDon = 2 ";
        new LoadTable_Kho().XuatHangTK(query, table);
        cbNgayXuat.setDate(new java.sql.Date(System.currentTimeMillis()));
    }

    public int checkEnd(String idHoaDon) {
        int kq = 0;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT COUNT(*) FROM DongHoaDon WHERE IDHoaDon = ? AND TinhTrang = 0 ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kq = rs.getInt(1);
            }
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaSKU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbNgayXuat = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtSoLuongNhap = new javax.swing.JTextField();
        cbKieuNhap = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnNhapFile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIDSanPham = new javax.swing.JTextField();
        bottom = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        main.setBackground(java.awt.Color.white);
        main.setLayout(new java.awt.BorderLayout());

        top.setBackground(java.awt.Color.white);
        top.setPreferredSize(new java.awt.Dimension(1366, 200));
        top.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Kiểu Nhập");
        top.add(jLabel1);
        jLabel1.setBounds(130, 20, 140, 40);

        txtMaSKU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtMaSKU);
        txtMaSKU.setBounds(280, 140, 260, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mã SKU");
        top.add(jLabel2);
        jLabel2.setBounds(130, 140, 140, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Ngày Xuất");
        top.add(jLabel3);
        jLabel3.setBounds(580, 40, 150, 40);

        cbNgayXuat.setDateFormatString("yyyy-MM-dd");
        cbNgayXuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(cbNgayXuat);
        cbNgayXuat.setBounds(730, 40, 260, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Số Lượng Xuất");
        top.add(jLabel5);
        jLabel5.setBounds(580, 120, 140, 40);

        txtSoLuongNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtSoLuongNhap);
        txtSoLuongNhap.setBounds(730, 120, 260, 40);

        cbKieuNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbKieuNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập Tay", "Nhập Từ Bảng" }));
        cbKieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKieuNhapActionPerformed(evt);
            }
        });
        top.add(cbKieuNhap);
        cbKieuNhap.setBounds(280, 10, 260, 50);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThem.setText("Thực Hiện");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        top.add(btnThem);
        btnThem.setBounds(1050, 40, 220, 50);

        btnNhapFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNhapFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnNhapFile.setText("Nhập Từ Bảng");
        btnNhapFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapFileActionPerformed(evt);
            }
        });
        top.add(btnNhapFile);
        btnNhapFile.setBounds(1050, 110, 220, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("ID Sản Phẩm");
        top.add(jLabel4);
        jLabel4.setBounds(130, 80, 140, 40);

        txtIDSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtIDSanPham);
        txtIDSanPham.setBounds(280, 80, 260, 40);

        main.add(top, java.awt.BorderLayout.PAGE_START);

        bottom.setBackground(java.awt.Color.white);
        bottom.setLayout(new java.awt.GridLayout(1, 0));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setRowHeight(25);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        bottom.add(jScrollPane2);

        main.add(bottom, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbKieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKieuNhapActionPerformed
        if (cbKieuNhap.getSelectedIndex() == 0) {
            trueOrFalse(true);
        } else {
            trueOrFalse(false);
        }
    }//GEN-LAST:event_cbKieuNhapActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
        idDongHoaDon = table.getModel().getValueAt(index, 0).toString();
        txtMaSKU.setText(table.getModel().getValueAt(index, 1).toString());
        txtIDSanPham.setText(table.getModel().getValueAt(index, 2).toString());
        txtSoLuongNhap.setText(table.getModel().getValueAt(index, 5).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new XuLiPhieu().xuLiPhieuNhap(1, idDongHoaDon);
        String query = " WHERE DongHoaDon.IDHoaDon = '" + idHoaDon + "' AND DongHoaDon.TinhTrang = 0 ";
        new UpdateDB().xuLiSKU(Integer.parseInt(txtSoLuongNhap.getText()), txtMaSKU.getText());
        new XuLiPhieu().updateSKUSanPham(txtMaSKU.getText(), txtIDSanPham.getText());
        new UpdateDB().updateNgayXuat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(cbNgayXuat.getDate()), txtMaSKU.getText());
        new LoadTable_Kho().XuatHangTK(query, table);
        if (checkEnd(idHoaDon) == 0) {
            new XuLiPhieu().updateTinhTrangHD(1, idHoaDon);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhapFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapFileActionPerformed
        for (int i = 0; i < table.getRowCount(); i++) {
            new XuLiPhieu().xuLiPhieuNhap(1, table.getModel().getValueAt(i, 0).toString());
            new UpdateDB().xuLiSKU(Integer.parseInt(table.getModel().getValueAt(i, 5).toString()), 
                    table.getModel().getValueAt(i, 1).toString());
            new XuLiPhieu().updateSKUSanPham(table.getModel().getValueAt(i, 1).toString(), 
                                             table.getModel().getValueAt(i, 2).toString());
            new UpdateDB().updateNgayXuat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(cbNgayXuat.getDate()), 
                    table.getModel().getValueAt(i, 1).toString());
            if (checkEnd(idHoaDon) == 0) {
                new XuLiPhieu().updateTinhTrangHD(1, idHoaDon);
            }
        }
        String query = " WHERE DongHoaDon.IDHoaDon = '" + idHoaDon + "' AND DongHoaDon.TinhTrang = 0 ";
        new LoadTable_Kho().XuatHangTK(query, table);
    }//GEN-LAST:event_btnNhapFileActionPerformed
    public void trueOrFalse(boolean b) {
        txtMaSKU.setEditable(b);
        txtSoLuongNhap.setEditable(b);
        cbNgayXuat.setEnabled(b);
        btnThem.setEnabled(b);
        btnNhapFile.setEnabled(!b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottom;
    private javax.swing.JButton btnNhapFile;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbKieuNhap;
    private com.toedter.calendar.JDateChooser cbNgayXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel main;
    private javax.swing.JTable table;
    private javax.swing.JPanel top;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtMaSKU;
    private javax.swing.JTextField txtSoLuongNhap;
    // End of variables declaration//GEN-END:variables
}
