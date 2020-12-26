package view.quanli.phieu;

import controller.ThemAndCapNhatSanPham;
import controller.ThemKhachHang;
import controller.TimKiemSanPham;
import view.quanli.sanpham.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;
import model.KhachHang;
import model.StringUtil;

public class jf_SanPham extends javax.swing.JFrame {

    List<KhachHang> list = new ThemKhachHang().getAllNhaCungCap();
    String idNhaCungCap = "";

    public jf_SanPham() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSPAdd = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
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
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-import-40.png"))); // NOI18N
        jButton2.setText("Import File Exel");
        jPanel2.add(jButton2);
        jButton2.setBounds(720, 80, 250, 50);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        jPanel2.add(btnXoa);
        btnXoa.setBounds(1190, 140, 140, 50);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        jPanel2.add(btnSua);
        btnSua.setBounds(1190, 80, 140, 50);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);
        btnThem.setBounds(1190, 20, 140, 50);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setText("Nhập File");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(1005, 130, 180, 31);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setText("Nhập Tay");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(1005, 50, 180, 31);

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
        ThemAndCapNhatSanPham tac = new ThemAndCapNhatSanPham();
        for (int i = 0; i < listSPAdd.getRowCount(); i++) {
            String idSanPham = StringUtil.taoID("IDSanPham", "SanPham", "SP");
            String idBangGia = StringUtil.taoID("IDBangGia", "BangGia", "BG");
            String idDonViTinh = listSPAdd.getModel().getValueAt(i, 3).toString();
            float giam = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 7).toString().replace(",", ""));
            float donGia = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 6).toString().replace(" VNĐ", "").replace(",", ""));
            float giaVonSP = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 8).toString().replace(" VNĐ", "").replace(",", ""));
            String idNhomSP = new TimKiemSanPham().getAllNhomSanPham(listSPAdd.getModel().getValueAt(i, 1).toString());
            String tenSP = listSPAdd.getModel().getValueAt(i, 2).toString();
            String ngaySanXuat = listSPAdd.getModel().getValueAt(i, 4).toString();
            String hanSuDung = listSPAdd.getModel().getValueAt(i, 5).toString();
            tac.insertBangGia(idBangGia, donGia, giam, giaVonSP);
            tac.them(idSanPham, idNhomSP, tenSP, idDonViTinh, ngaySanXuat, hanSuDung,
                    "BANKEO1.png", idBangGia, idNhaCungCap, 0);
        }
        JOptionPane.showMessageDialog(this, "Thành Công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void listSPAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSPAddMouseClicked
        
    }//GEN-LAST:event_listSPAddMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listSPAdd;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiaVon;
    private javax.swing.JTextField txtGiam;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTenSanPham1;
    // End of variables declaration//GEN-END:variables
}
