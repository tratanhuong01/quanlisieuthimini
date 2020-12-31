package view.quanli.sanpham;

import controller.*;
import view.quanli.*;
import controller.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import model.*;

public class jf_SanPham extends javax.swing.JFrame {

    List<KhachHang> list = new ThemKhachHang().getAllNhaCungCap();
    String idNhaCungCap = "";
    ThemAndCapNhatSanPham tac = new ThemAndCapNhatSanPham();
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

    public jf_SanPham() {
        initComponents();
        trueFalse();
        List<NhomSanPham> listnsp = new DAO().getNhomSanPham();
        cbTenNhom.removeAllItems();
        for (int i = 0; i < listnsp.size(); i++) {

            cbTenNhom.addItem(listnsp.get(i).getTenNhomSanPham());
        }
    }

    public void switchsB(int a) {
        switch (a) {
            case 0:
                txtIDSanPham.setText(StringUtil.taoID("IDSanPham", "SanPham", "SP"));
                btnReadFile.setEnabled(false);
                btnThemFromFile.setEnabled(false);
                txtGiaVon.setEditable(true);
                listSPAdd.removeAll();
                listSPAdd.repaint();
                listSPAdd.updateUI();
                break;
            case 1:
                btnReadFile.setEnabled(false);
                btnThemFromFile.setEnabled(false);
                txtGiaVon.setEditable(false);
                new LoadSanPham().load(listSPAdd);
                break;
            case 2:
                btnReadFile.setEnabled(false);
                btnThemFromFile.setEnabled(false);
                txtGiaVon.setEditable(false);
                new LoadSanPham().load(listSPAdd);
                break;
        }
    }

    public void trueFalse() {
        JButton[] btn = {btnThem, btnSua, btnXoa, btnReadFile, btnThemFromFile};
        for (int i = 0; i < btn.length; i++) {
            btn[i].setEnabled(false);
        }

        JRadioButton[] radioBtn = {radioThem, radioSua, radioXoa};
        for (int i = 0; i < radioBtn.length; i++) {
            radioBtn[i].setEnabled(false);
        }
        for (int i = 0; i < radioBtn.length; i++) {
            int a = i;
            radioBtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (radioBtn[a].isSelected()) {
                        switchsB(a);
                        for (int j = 0; j < radioBtn.length; j++) {
                            if (j == a) {
                                btn[a].setEnabled(true);
                            } else {
                                btn[j].setEnabled(false);
                            }
                        }
                    }
                }
            });
        }
        nhapTay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnReadFile.setEnabled(false);
                btnThemFromFile.setEnabled(false);
                for (int i = 0; i < radioBtn.length; i++) {
                    radioBtn[i].setEnabled(true);
                }
            }

        });
        nhapFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnReadFile.setEnabled(true);
                btnThemFromFile.setEnabled(true);
                for (int i = 0; i < btn.length - 2; i++) {
                    btn[i].setEnabled(false);
                    radioBtn[i].setEnabled(false);
                    buttonGroup2.clearSelection();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGiam = new javax.swing.JTextField();
        txtGiaVon = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReadFile = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        nhapFile = new javax.swing.JRadioButton();
        nhapTay = new javax.swing.JRadioButton();
        radioXoa = new javax.swing.JRadioButton();
        radioThem = new javax.swing.JRadioButton();
        radioSua = new javax.swing.JRadioButton();
        txtDonViTinh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnThemFromFile = new javax.swing.JButton();
        nsx = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hsd = new com.toedter.calendar.JDateChooser();
        cbTenNhom = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSPAdd = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Sản Phẩm");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 30, 130, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tên Sản Phẩm");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 90, 130, 30);

        txtIDSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtIDSanPham.setEnabled(false);
        jPanel2.add(txtIDSanPham);
        txtIDSanPham.setBounds(150, 20, 230, 50);

        txtTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtTenSanPham);
        txtTenSanPham.setBounds(150, 80, 230, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Tên Nhóm");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 150, 140, 30);

        txtGiam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtGiam);
        txtGiam.setBounds(480, 140, 200, 50);

        txtGiaVon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtGiaVon);
        txtGiaVon.setBounds(480, 80, 200, 50);

        txtDonGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtDonGia);
        txtDonGia.setBounds(480, 20, 200, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Đơn Giá");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(390, 30, 90, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Giá Vốn");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(390, 90, 90, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("NSX");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(700, 30, 50, 30);

        btnReadFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReadFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-import-40.png"))); // NOI18N
        btnReadFile.setText("Import File Exel");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });
        jPanel2.add(btnReadFile);
        btnReadFile.setBounds(810, 140, 203, 50);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        jPanel2.add(btnXoa);
        btnXoa.setBounds(1210, 140, 140, 50);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua);
        btnSua.setBounds(1210, 80, 140, 50);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);
        btnThem.setBounds(1210, 10, 140, 50);

        nhapFile.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(nhapFile);
        nhapFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nhapFile.setText("Nhập File");
        jPanel2.add(nhapFile);
        nhapFile.setBounds(850, 100, 120, 31);

        nhapTay.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(nhapTay);
        nhapTay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nhapTay.setText("Nhập Tay");
        jPanel2.add(nhapTay);
        nhapTay.setBounds(1020, 100, 120, 31);

        radioXoa.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(radioXoa);
        radioXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(radioXoa);
        radioXoa.setBounds(1170, 150, 30, 25);

        radioThem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(radioThem);
        radioThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(radioThem);
        radioThem.setBounds(1170, 30, 30, 25);

        radioSua.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(radioSua);
        radioSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(radioSua);
        radioSua.setBounds(1170, 90, 30, 25);

        txtDonViTinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtDonViTinh);
        txtDonViTinh.setBounds(690, 140, 110, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Đơn Vị Tính");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(690, 90, 110, 30);

        btnThemFromFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemFromFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThemFromFile.setText("Thêm");
        btnThemFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemFromFileActionPerformed(evt);
            }
        });
        jPanel2.add(btnThemFromFile);
        btnThemFromFile.setBounds(1020, 140, 130, 50);

        nsx.setDateFormatString("yyy-MM-dd");
        nsx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(nsx);
        nsx.setBounds(750, 20, 160, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Giảm");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(390, 150, 90, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("HSD");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(920, 30, 50, 30);

        hsd.setDateFormatString("yyy-MM-dd");
        hsd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(hsd);
        hsd.setBounds(980, 20, 160, 50);

        cbTenNhom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbTenNhom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbTenNhom);
        cbTenNhom.setBounds(150, 140, 230, 50);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        listSPAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listSPAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listSPAdd.setModel(new javax.swing.table.DefaultTableModel(
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
        listSPAdd.setRowHeight(25);
        listSPAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSPAddMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listSPAdd);

        jPanel1.add(jScrollPane2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String idBangGia = StringUtil.taoID("IDBangGia", "BangGia", "BG");
        float donGia = Float.parseFloat(txtDonGia.getText().replace(",", "").replace(" VNĐ", ""));
        float giam = Float.parseFloat(txtGiam.getText().replace(",", "").replace(" VNĐ", ""));
        float giaVonSP = Float.parseFloat(txtGiaVon.getText().replace(",", "").replace(" VNĐ", ""));
        tac.insertBangGia(idBangGia, donGia, giam, giaVonSP);
        String idSanPham = StringUtil.taoID("IDSanPham", "SanPham", "SP");
        String idNhomSanPham = new LoadSanPham().getIDByNhomSP(cbTenNhom.getSelectedItem().toString());
        String tenSanPham = txtTenSanPham.getText();
        String donViTinh = txtDonViTinh.getText();
        tac.them(idSanPham, idNhomSanPham, tenSanPham, donViTinh,
                formatDate.format(nsx.getDate()), formatDate.format(hsd.getDate()), idNhomSanPham + ".png", idBangGia, null, 0);
        txtIDSanPham.setText(StringUtil.taoID("IDSanPham", "SanPham", "SP"));
        JOptionPane.showMessageDialog(this, "Thành Công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void listSPAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSPAddMouseClicked
        int index = listSPAdd.getSelectedRow();
        txtIDSanPham.setText(listSPAdd.getModel().getValueAt(index, 0).toString());
        cbTenNhom.setSelectedItem(listSPAdd.getModel().getValueAt(index, 1).toString());
        txtTenSanPham.setText(listSPAdd.getModel().getValueAt(index, 2).toString());
        txtDonViTinh.setText(listSPAdd.getModel().getValueAt(index, 3).toString());
        txtDonGia.setText(listSPAdd.getModel().getValueAt(index, 4).toString());
        txtGiam.setText(listSPAdd.getModel().getValueAt(index, 5).toString());
        txtGiaVon.setText(listSPAdd.getModel().getValueAt(index, 6).toString());
    }//GEN-LAST:event_listSPAddMouseClicked

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        new ReadFileExel().readThem(listSPAdd);
    }//GEN-LAST:event_btnReadFileActionPerformed

    private void btnThemFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemFromFileActionPerformed
        for (int i = 0; i < listSPAdd.getRowCount(); i++) {
            String idBangGia = StringUtil.taoID("IDBangGia", "BangGia", "BG");
            float donGia = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 6)
                    .toString().replace(",", "").replace(" VNĐ", ""));
            float giam = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 7)
                    .toString().replace(",", "").replace(" VNĐ", ""));
            float giaVonSP = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 8)
                    .toString().replace(",", "").replace(" VNĐ", ""));
            String tenNhom = listSPAdd.getModel().getValueAt(i, 1).toString();
            tac.insertBangGia(idBangGia, donGia, giam, giaVonSP);
            String idSanPham = StringUtil.taoID("IDSanPham", "SanPham", "SP");
            String idNhomSanPham = new LoadSanPham().getIDByNhomSP(tenNhom);
            String tenSanPham = listSPAdd.getModel().getValueAt(i, 2).toString();
            String donViTinh = listSPAdd.getModel().getValueAt(i, 3).toString();
            String nsx = listSPAdd.getModel().getValueAt(i, 4).toString();
            String hsd = listSPAdd.getModel().getValueAt(i, 5).toString();
            tac.them(idSanPham, idNhomSanPham, tenSanPham, donViTinh,
                    nsx, hsd, idNhomSanPham + ".png", idBangGia, null, 0);
        }
        JOptionPane.showMessageDialog(this, "Thành Công");
    }//GEN-LAST:event_btnThemFromFileActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int i = new UpdateDB().updateSanPham(txtTenSanPham.getText(), txtDonViTinh.getText(), 
        txtIDSanPham.getText(), Float.parseFloat(txtDonGia.getText().replace(" VNĐ", "").replace(",", "")), 
        Integer.parseInt(txtGiam.getText().replace(" VNĐ", "").replace(",", "")));
        if (i != 0) {
            JOptionPane.showMessageDialog(this, "Thành Công");
            new LoadSanPham().load(listSPAdd);
        }
        else
            JOptionPane.showMessageDialog(this, "Thất Bại");
        
    }//GEN-LAST:event_btnSuaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReadFile;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemFromFile;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbTenNhom;
    private com.toedter.calendar.JDateChooser hsd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listSPAdd;
    private javax.swing.JRadioButton nhapFile;
    private javax.swing.JRadioButton nhapTay;
    private com.toedter.calendar.JDateChooser nsx;
    private javax.swing.JRadioButton radioSua;
    private javax.swing.JRadioButton radioThem;
    private javax.swing.JRadioButton radioXoa;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtGiaVon;
    private javax.swing.JTextField txtGiam;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
