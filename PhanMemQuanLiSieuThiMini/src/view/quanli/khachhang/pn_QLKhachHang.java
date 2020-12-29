package view.quanli.khachhang;

import controller.LoadTable;
import controller.ThemKhachHang;
import controller.XuatFile;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;
import model.FormatScroll;
import model.KhachHang;
import model.StringUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class pn_QLKhachHang extends javax.swing.JPanel {

    String id = "";
    
    public pn_QLKhachHang() {
        initComponents();
        FormatScroll.format(jScrollPane1);
        FormatScroll.format(jScrollPane2);
        new LoadTable().KhachHang("", listKhachHang);
    }
    public String switchs(String chon,String value) {
        String text = "";
        switch (chon) {
            case "Theo Họ Tên":
                text = "  WHERE KhachHang.HoTen LIKE N'%" + value + "%' ";
                break;
            case "Theo Số Điện Thoại":
                text = " WHERE KhachHang.SoDienThoai LIKE N'%" + value + "%' ";
                break;
            case "Theo Địa Chỉ":
                text = " WHERE KhachHang.DiaChi LIKE N'%" + value + "%'  ";
                break;       
            case "Theo Mã Khách Hàng":
                text = " WHERE KhachHang.IDKhachHang LIKE N'%" + value + "%' ";
                break;   
            case "Theo Giới Tính":
                text = " WHERE KhachHang.GioiTinh LIKE N'%" + value + "%' ";
                break;   
        }
        return text;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        cbChon = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnQuanLiDiem = new javax.swing.JButton();
        process = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listKhachHang = new javax.swing.JTable();

        setBackground(null);
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 100));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 598));
        jPanel1.setLayout(null);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N
        jPanel5.setLayout(null);
        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 271, 350, 330);

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
        cbChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Họ Tên", "Theo Số Điện Thoại", "Theo Mã Khách Hàng", "Theo Địa Chỉ", "Theo Giới Tính" }));

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
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(cbChon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(cbChon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(86, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(2, 10, 340, 250);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setPreferredSize(new java.awt.Dimension(101, 100));
        jPanel3.setLayout(null);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);
        btnSua.setBounds(290, 20, 141, 63);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa);
        btnXoa.setBounds(480, 20, 141, 63);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-export-40.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });
        jPanel3.add(btnXuatFile);
        btnXuatFile.setBounds(670, 20, 160, 63);

        btnQuanLiDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnQuanLiDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-supplier-45.png"))); // NOI18N
        btnQuanLiDiem.setText("Quản Lí Điểm");
        btnQuanLiDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLiDiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuanLiDiem);
        btnQuanLiDiem.setBounds(40, 20, 210, 63);

        process.setForeground(new java.awt.Color(51, 255, 51));
        jPanel3.add(process);
        process.setBounds(850, 50, 146, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(850, 16, 140, 30);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        listKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        listKhachHang.setRowHeight(25);
        listKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listKhachHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listKhachHang);

        jPanel4.add(jScrollPane2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        listKhachHang.removeAll();
        new LoadTable().KhachHang(switchs(cbChon.getSelectedItem().toString(), txtInput.getText()), listKhachHang);
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnQuanLiDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiDiemActionPerformed
        new pn_QuanLiDiem().setVisible(true);
    }//GEN-LAST:event_btnQuanLiDiemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (id.equals("")) 
            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Khách Hàng !!");
        else 
            new pn_SuaKhachHang(new ThemKhachHang().getKhachHang(id),listKhachHang).setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void listKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKhachHangMouseClicked
        int index = listKhachHang.getSelectedRow();
        id = listKhachHang.getModel().getValueAt(index, 0).toString();
    }//GEN-LAST:event_listKhachHangMouseClicked

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        new XuatFile().execute(listKhachHang, process, "Khách Hàng");
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLiDiem;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cbChon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listKhachHang;
    private javax.swing.JProgressBar process;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
