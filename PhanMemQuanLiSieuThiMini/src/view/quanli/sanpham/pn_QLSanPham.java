package view.quanli.sanpham;

import controller.LoadTable;
import controller.XuatFile;
import controller.loadDanhMuc;
import java.util.List;
import javax.swing.ButtonModel;
import model.NhomSanPham;
import model.StringUtil;

public class pn_QLSanPham extends javax.swing.JPanel {

    String idNhomSanPham = "";
    List<NhomSanPham> list;
    loadDanhMuc ldm = new loadDanhMuc();

    public pn_QLSanPham() {
        initComponents();
        new LoadTable().SanPham("", listSanPham);
        StringUtil.format(txtTu);
        StringUtil.format(txtDen);
        cbNhomSanPham.removeAllItems();
        cbNhomSanPham1.removeAllItems();
        list = ldm.loadNhomSanPham2();
        ldm.loadNhomSanPham1(cbNhomSanPham);
        ldm.loadNhomSanPham1(cbNhomSanPham1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sapXep = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtDen = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnLoc = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtTenSP = new javax.swing.JTextField();
        btnTimByNhom = new javax.swing.JButton();
        cbNhomSanPham = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnXuatFile = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnBanChay = new javax.swing.JButton();
        btnHanSuDung = new javax.swing.JButton();
        radioGiamDan = new javax.swing.JRadioButton();
        radioTangDan = new javax.swing.JRadioButton();
        btnGia = new javax.swing.JButton();
        cbNhomSanPham1 = new javax.swing.JComboBox<>();
        process = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSanPham = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1366, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 200));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bộ Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel7.setLayout(null);

        txtDen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txtDen);
        txtDen.setBounds(180, 60, 120, 50);

        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-more-45.png"))); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel7.add(btnOk);
        btnOk.setBounds(320, 60, 120, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Đến");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(140, 60, 40, 40);

        txtTu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txtTu);
        txtTu.setBounds(30, 60, 110, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Theo Giá Sản Phẩm");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(11, 24, 170, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Từ");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(0, 60, 30, 40);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sản Phẩm Tồn Kho", "Sản Phẩm Chưa Nhập", " " }));
        jPanel7.add(jComboBox2);
        jComboBox2.setBounds(10, 130, 300, 50);

        btnLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-more-45.png"))); // NOI18N
        jPanel7.add(btnLoc);
        btnLoc.setBounds(320, 130, 120, 50);

        jPanel1.add(jPanel7);

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel6.setLayout(null);

        txtTenSP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel6.add(txtTenSP);
        txtTenSP.setBounds(135, 24, 315, 50);

        btnTimByNhom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimByNhom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTimByNhom.setText("Tìm");
        btnTimByNhom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimByNhomActionPerformed(evt);
            }
        });
        jPanel6.add(btnTimByNhom);
        btnTimByNhom.setBounds(310, 81, 140, 44);

        cbNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhomSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomSanPhamActionPerformed(evt);
            }
        });
        jPanel6.add(cbNhomSanPham);
        cbNhomSanPham.setBounds(11, 81, 282, 44);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("---------------------------------------------------------------------------");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(11, 132, 450, 10);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-export-40.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });
        jPanel6.add(btnXuatFile);
        btnXuatFile.setBounds(10, 144, 150, 50);

        btnSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-product-45.png"))); // NOI18N
        btnSanPham.setText("Sản Phẩm ");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jPanel6.add(btnSanPham);
        btnSanPham.setBounds(170, 144, 281, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Nhập Tên SP");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(10, 24, 120, 50);

        jPanel1.add(jPanel6);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp Xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel5.setLayout(null);

        btnBanChay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBanChay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-grocery-shelf-40.png"))); // NOI18N
        btnBanChay.setText("Bán Chạy");
        btnBanChay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanChayActionPerformed(evt);
            }
        });
        jPanel5.add(btnBanChay);
        btnBanChay.setBounds(250, 140, 190, 49);

        btnHanSuDung.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHanSuDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-date-to-40.png"))); // NOI18N
        btnHanSuDung.setText("Theo HSD");
        btnHanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanSuDungActionPerformed(evt);
            }
        });
        jPanel5.add(btnHanSuDung);
        btnHanSuDung.setBounds(250, 80, 190, 49);

        radioGiamDan.setBackground(java.awt.Color.white);
        sapXep.add(radioGiamDan);
        radioGiamDan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioGiamDan.setText("Giảm Dần");
        jPanel5.add(radioGiamDan);
        radioGiamDan.setBounds(130, 30, 110, 40);

        radioTangDan.setBackground(java.awt.Color.white);
        sapXep.add(radioTangDan);
        radioTangDan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioTangDan.setText("Tăng Dần");
        jPanel5.add(radioTangDan);
        radioTangDan.setBounds(0, 30, 120, 40);

        btnGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-cheap-2-40.png"))); // NOI18N
        btnGia.setText("Theo Giá");
        btnGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaActionPerformed(evt);
            }
        });
        jPanel5.add(btnGia);
        btnGia.setBounds(250, 20, 190, 49);

        cbNhomSanPham1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhomSanPham1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomSanPham1ActionPerformed(evt);
            }
        });
        jPanel5.add(cbNhomSanPham1);
        cbNhomSanPham1.setBounds(10, 80, 230, 44);
        jPanel5.add(process);
        process.setBounds(50, 150, 146, 30);

        jPanel1.add(jPanel5);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 600));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        listSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        listSanPham.setRowHeight(25);
        jScrollPane2.setViewportView(listSanPham);

        jPanel3.add(jScrollPane2);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        new jf_SanPham().setVisible(true);
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String query = "WHERE DonGia >= " + txtTu.getText().replace(",", "") + " AND DonGia <= " + txtDen.getText().replace(",", "");
        new LoadTable().SanPham(query, listSanPham);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnTimByNhomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimByNhomActionPerformed
        String query = "WHERE SanPham.IDNhomSanPham LIKE N'%" + idNhomSanPham + "%' AND "
                + "(SanPham.IDSanPham LIKE N'%" + txtTenSP.getText() + "%' "
                + " OR SanPham.TenSanPham LIKE N'%" + txtTenSP.getText() + "%') ";
        new LoadTable().SanPham(query, listSanPham);
    }//GEN-LAST:event_btnTimByNhomActionPerformed

    private void cbNhomSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomSanPhamActionPerformed
        if (cbNhomSanPham.isValid()) {
            int index = cbNhomSanPham.getSelectedIndex();
            if (index == 0) 
                idNhomSanPham = "";
            else 
                idNhomSanPham = list.get(index - 1).getIdNhomSanPham();
        }
    }//GEN-LAST:event_cbNhomSanPhamActionPerformed

    private void cbNhomSanPham1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomSanPham1ActionPerformed
        if (cbNhomSanPham.isValid()) {
            int index = cbNhomSanPham1.getSelectedIndex();
            if (index == 0) 
                idNhomSanPham = "";
            else 
                idNhomSanPham = list.get(index - 1).getIdNhomSanPham();
        }
    }//GEN-LAST:event_cbNhomSanPham1ActionPerformed

    private void btnGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaActionPerformed
        String query = "";
        if (radioGiamDan.isSelected()) {
            query = "WHERE SanPham.IDNhomSanPham LIKE N'%" + idNhomSanPham + "%' ORDER BY BangGia.DonGia DESC";
        } else {
            query = "WHERE SanPham.IDNhomSanPham LIKE N'%" + idNhomSanPham + "%' ORDER BY BangGia.DonGia ASC";
        }
        new LoadTable().SanPham(query, listSanPham);
    }//GEN-LAST:event_btnGiaActionPerformed

    private void btnHanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHanSuDungActionPerformed
        String query = "";
        if (radioGiamDan.isSelected()) {
            query = "WHERE SanPham.IDNhomSanPham LIKE N'%" + idNhomSanPham + "%' ORDER BY SanPham.HanSuDung DESC";
        } else {
            query = "WHERE SanPham.IDNhomSanPham LIKE N'%" + idNhomSanPham + "%' ORDER BY SanPham.HanSuDung ASC";
        }
        new LoadTable().SanPham(query, listSanPham);
    }//GEN-LAST:event_btnHanSuDungActionPerformed

    private void btnBanChayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanChayActionPerformed

        ldm.createViewSQL(listSanPham);

    }//GEN-LAST:event_btnBanChayActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        new XuatFile().execute(listSanPham, process,"Sản Phẩm");
    }//GEN-LAST:event_btnXuatFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanChay;
    private javax.swing.JButton btnGia;
    private javax.swing.JButton btnHanSuDung;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnTimByNhom;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cbNhomSanPham;
    private javax.swing.JComboBox<String> cbNhomSanPham1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listSanPham;
    private javax.swing.JProgressBar process;
    private javax.swing.JRadioButton radioGiamDan;
    private javax.swing.JRadioButton radioTangDan;
    private javax.swing.ButtonGroup sapXep;
    private javax.swing.JTextField txtDen;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTu;
    // End of variables declaration//GEN-END:variables
}
