package view.quanli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import modal.ConnectDAO;

public class pnQLKhachHang extends javax.swing.JPanel {

    public pnQLKhachHang() {
        initComponents();
        loadTable();
    }

    public void loadTable() {
        String query = "SELECT IDKhachHang AS 'ID Khách Hàng' , IDNhomKH AS 'ID Nhóm Khách Hàng',\n"
                + "HoTen AS 'Họ Tên' , GioiTinh AS 'Giới Tính', SoDienThoai AS 'Số Điện Thoại',\n"
                + "DiaChi AS 'Địa Chỉ' FROM KhachHang WHERE IDNhomKH = 'NKH00002' ";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listKhachHang.getTableHeader().setPreferredSize(new Dimension(WIDTH, 40));
            listKhachHang.getTableHeader().setFont(new Font("Time New Roman", 1, 18));
            listKhachHang.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listKhachHang.removeAll();
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
            listKhachHang.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKhachHang = new javax.swing.JTable();
        pnQuanLiKhachHang = new javax.swing.JPanel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        btnSuaKhachHang = new javax.swing.JButton();
        btnXoaKhachHang = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnThemNhanVien = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        pn.setMaximumSize(new java.awt.Dimension(1440, 740));
        pn.setMinimumSize(new java.awt.Dimension(1440, 740));
        pn.setLayout(null);

        jPanel1.setLayout(null);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 1190, 540);

        pnQuanLiKhachHang.setBackground(java.awt.Color.white);
        pnQuanLiKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnQuanLiKhachHang.setLayout(null);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(txtDiaChi);
        txtDiaChi.setBounds(220, 120, 350, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Địa Chỉ");
        pnQuanLiKhachHang.add(jLabel2);
        jLabel2.setBounds(10, 120, 150, 50);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(830, 120, 350, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Số Điện Thoại");
        pnQuanLiKhachHang.add(jLabel3);
        jLabel3.setBounds(620, 120, 150, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Mã Khách Hàng");
        pnQuanLiKhachHang.add(jLabel4);
        jLabel4.setBounds(620, 40, 150, 50);

        txtMaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(txtMaKhachHang);
        txtMaKhachHang.setBounds(830, 40, 350, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Tên Khách Hàng");
        pnQuanLiKhachHang.add(jLabel6);
        jLabel6.setBounds(10, 40, 150, 50);

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnQuanLiKhachHang.add(txtTenKhachHang);
        txtTenKhachHang.setBounds(220, 40, 350, 50);

        jPanel1.add(pnQuanLiKhachHang);
        pnQuanLiKhachHang.setBounds(0, 0, 1190, 190);

        pn.add(jPanel1);
        jPanel1.setBounds(0, 0, 1190, 740);

        btnSuaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnSuaKhachHang.setText("Sửa Khách Hàng");
        pn.add(btnSuaKhachHang);
        btnSuaKhachHang.setBounds(1190, 230, 250, 80);

        btnXoaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnXoaKhachHang.setText("Xóa Khách Hàng");
        pn.add(btnXoaKhachHang);
        btnXoaKhachHang.setBounds(1190, 400, 250, 80);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jButton3.setText("Tìm Kiếm");
        pn.add(jButton3);
        jButton3.setBounds(1190, 570, 250, 80);

        btnThemNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnThemNhanVien.setText("Quản Lí Điểm ");
        btnThemNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseExited(evt);
            }
        });
        btnThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanVienActionPerformed(evt);
            }
        });
        pn.add(btnThemNhanVien);
        btnThemNhanVien.setBounds(1190, 60, 250, 80);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Tên Khách Hàng");
        pn.add(jLabel5);
        jLabel5.setBounds(10, 40, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemNhanVienActionPerformed

    private void btnThemNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseEntered
        btnThemNhanVien.setBackground(Color.red);
        btnThemNhanVien.revalidate();
        btnXoaKhachHang.setText("");
    }//GEN-LAST:event_btnThemNhanVienMouseEntered

    private void btnThemNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseExited
        btnThemNhanVien.setBackground(new Color(240, 240, 240));
        btnXoaKhachHang.setText("Sửa Nhân Viên");
    }//GEN-LAST:event_btnThemNhanVienMouseExited

    private void listKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKhachHangMouseClicked
        int row = listKhachHang.getSelectedRow();
        txtMaKhachHang.setText(listKhachHang.getModel().getValueAt(row, 0).toString());
        txtTenKhachHang.setText(listKhachHang.getModel().getValueAt(row, 2).toString());
        txtSoDienThoai.setText(listKhachHang.getModel().getValueAt(row, 4).toString());
        txtDiaChi.setText(listKhachHang.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_listKhachHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaKhachHang;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton btnXoaKhachHang;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listKhachHang;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnQuanLiKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
