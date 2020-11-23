package view.quanli.nhanvien;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class pn_QLNhanVien extends javax.swing.JPanel {
    JTextField[] listTextField;
    JCheckBox[] listCheckBox;
    String s = "";
    int[] state = {0, 0, 0, 0,0,0};
    public pn_QLNhanVien() {
        initComponents();
        loadTable("");
        listCheckBox = listCheckBox();
        listTextField = listTextField();
        for (int i = 0; i < listCheckBox.length; i++) {
            int a = i;
            listCheckBox[i].addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    for (int j = 0; j < listCheckBox.length; j++) {
                        if (e.getStateChange() == 1) {
                            state[a] = 1;
                        } else {
                            state[a] = 0;
                            listTextField[a].setText("");
                        }
                    }

                }
            });
        }
    }
    public String addQuery(int num, String text) {
        String s = "";
        switch (num) {
            case 0:
                s = " NhanVien.HoTen LIKE N'%" + text + "%' ";
                break;
            case 1:
                s = " NhanVien.DiaChi LIKE N'%" + text + "%' ";
                break;
            case 2:
                s = " NhanVien.SoDienThoai LIKE N'%" + text + "%' ";
                break;
            case 3:
                s = " NhanVien.BoPhan LIKE N'%" + text + "%' ";
                break;
            case 4 :
                s = " NhanVien.IDNhanVien LIKE N'%" + text + "%' ";
                break;
            case 5 :
                s = " TaiKhoan.TaiKhoan LIKE N'%" + text + "%' ";
                break;
                
        }
        return s;
    }
    public JCheckBox[] listCheckBox() {
        JCheckBox[] listCheckBox = {cboxTenNhanVien,cboxDiaChi,cboxSoDienThoai,cboxBoPhan,cboxMaNhanVien,cboxTenTaiKhoan};
        return listCheckBox;
    }
    public JTextField[] listTextField() {
        JTextField[] listTextField = {txtTenNhanVien,txtDiaChi,txtSoDienThoai,txtBoPhan,txtMaNhanVien,txtTenTaiKhoan};
        return listTextField;
    }
    public void loadTable(String querys) {
        String query = "SELECT NhanVien.IDNhanVien AS 'ID Nhân Viên' , NhanVien.IDBoPhan AS 'ID Bộ Phận',\n"
                + "HoTen AS 'Họ Tên' , GioiTinh AS 'Giới Tính', SoDienThoai AS 'Số Điện Thoại',\n"
                + "DiaChi AS 'Địa Chỉ' ,TaiKhoan.TaiKhoan AS 'Tài Khoản',TaiKhoan.MatKhau \n"
                + "AS 'Mật Khẩu' FROM NhanVien INNER JOIN TaiKhoan\n"
                + "ON NhanVien.IDNhanVien = TaiKhoan.IDNhanVien " + querys;
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listNhanVien.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            listNhanVien.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
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
                vData.add(rs.getString(8));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        cboxTenNhanVien = new javax.swing.JCheckBox();
        txtTenNhanVien = new javax.swing.JTextField();
        cboxBoPhan = new javax.swing.JCheckBox();
        txtBoPhan = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        cboxDiaChi = new javax.swing.JCheckBox();
        txtDiaChi = new javax.swing.JTextField();
        cboxMaNhanVien = new javax.swing.JCheckBox();
        txtMaNhanVien = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cboxSoDienThoai = new javax.swing.JCheckBox();
        txtSoDienThoai = new javax.swing.JTextField();
        cboxTenTaiKhoan = new javax.swing.JCheckBox();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNhanVien = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnThemNhanVien = new javax.swing.JButton();
        btnXoaNhanVien = new javax.swing.JButton();
        btnSuaNhanVien = new javax.swing.JButton();
        btnTaoTaiKhoan = new javax.swing.JButton();
        btnTinhLuong = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 20, 35, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(230, 119));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel22.setLayout(new javax.swing.BoxLayout(jPanel22, javax.swing.BoxLayout.Y_AXIS));

        cboxTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxTenNhanVien.setText("Tên Nhân Viên");
        cboxTenNhanVien.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel22.add(cboxTenNhanVien);

        txtTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenNhanVien.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel22.add(txtTenNhanVien);

        cboxBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxBoPhan.setText("Bộ Phận");
        cboxBoPhan.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel22.add(cboxBoPhan);

        txtBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtBoPhan.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel22.add(txtBoPhan);

        jPanel2.add(jPanel22);

        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.Y_AXIS));

        cboxDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxDiaChi.setText("Địa Chỉ");
        cboxDiaChi.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel13.add(cboxDiaChi);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiaChi.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel13.add(txtDiaChi);

        cboxMaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxMaNhanVien.setText("Mã Nhân Viên");
        cboxMaNhanVien.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel13.add(cboxMaNhanVien);

        txtMaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMaNhanVien.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel13.add(txtMaNhanVien);

        jPanel2.add(jPanel13);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        cboxSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxSoDienThoai.setText("Số Điện Thoại");
        cboxSoDienThoai.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel4.add(cboxSoDienThoai);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSoDienThoai.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel4.add(txtSoDienThoai);

        cboxTenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxTenTaiKhoan.setText("Tên Tài Khoản");
        cboxTenTaiKhoan.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel4.add(cboxTenTaiKhoan);

        txtTenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenTaiKhoan.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel4.add(txtTenTaiKhoan);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(1050, 535));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        listNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        listNhanVien.setRowHeight(40);
        listNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listNhanVien);

        jPanel5.add(jScrollPane1);

        add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 10, 4));
        jPanel21.setMaximumSize(new java.awt.Dimension(315, 32767));
        jPanel21.setMinimumSize(new java.awt.Dimension(315, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(315, 535));
        jPanel21.setRequestFocusEnabled(false);
        jPanel21.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        btnThemNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemNhanVien.setText("Thêm Nhân Viên");
        btnThemNhanVien.setPreferredSize(new java.awt.Dimension(285, 75));
        btnThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanVienActionPerformed(evt);
            }
        });
        jPanel21.add(btnThemNhanVien);

        btnXoaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaNhanVien.setText("Xóa Nhân Viên");
        btnXoaNhanVien.setPreferredSize(new java.awt.Dimension(285, 75));
        btnXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhanVienActionPerformed(evt);
            }
        });
        jPanel21.add(btnXoaNhanVien);

        btnSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaNhanVien.setText("Sửa Nhân Viên");
        btnSuaNhanVien.setPreferredSize(new java.awt.Dimension(285, 75));
        btnSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNhanVienActionPerformed(evt);
            }
        });
        jPanel21.add(btnSuaNhanVien);

        btnTaoTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTaoTaiKhoan.setText("Tạo Tài Khoản");
        btnTaoTaiKhoan.setPreferredSize(new java.awt.Dimension(285, 75));
        btnTaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTaiKhoanActionPerformed(evt);
            }
        });
        jPanel21.add(btnTaoTaiKhoan);

        btnTinhLuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTinhLuong.setText("Tính Lương");
        btnTinhLuong.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnTinhLuong);

        add(jPanel21, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void listNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNhanVienMouseClicked

    }//GEN-LAST:event_listNhanVienMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String query = "";
        for (int i = 0; i < state.length; i++) {
            if (state[i] == 1) {
                query += "AND" + addQuery(i, listTextField[i].getText());
            }
        }
        System.out.println(query);
        loadTable(query);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanVienActionPerformed
        new pn_ThemNhanVien().setVisible(true);
        
    }//GEN-LAST:event_btnThemNhanVienActionPerformed

    private void btnXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNhanVienActionPerformed
        
    }//GEN-LAST:event_btnXoaNhanVienActionPerformed

    private void btnSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNhanVienActionPerformed
        new pn_SuaNhanVien(txtMaNhanVien.getText()).setVisible(true);
    }//GEN-LAST:event_btnSuaNhanVienActionPerformed

    private void btnTaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTaiKhoanActionPerformed
        new pn_TaoTaiKhoan().setVisible(true);
    }//GEN-LAST:event_btnTaoTaiKhoanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNhanVien;
    private javax.swing.JButton btnTaoTaiKhoan;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTinhLuong;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JCheckBox cboxBoPhan;
    private javax.swing.JCheckBox cboxDiaChi;
    private javax.swing.JCheckBox cboxMaNhanVien;
    private javax.swing.JCheckBox cboxSoDienThoai;
    private javax.swing.JCheckBox cboxTenNhanVien;
    private javax.swing.JCheckBox cboxTenTaiKhoan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listNhanVien;
    private javax.swing.JTextField txtBoPhan;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
