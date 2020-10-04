package controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import modal.SanPham;

public class ThemSanPhamVaoHoaDon {
    int clone = 0;
    public void them(List<SanPham> list,SanPham sp) {
        list.add(sp);
    }
    public void load(JPanel pn,List<SanPham> list,int top,String hinhSanPham, String tenSanPham,float giaSanPham,int i) {
        JPanel pnMain = new JPanel();
        pnMain.setLayout(null);
        JLabel lbHinhSanPham = new JLabel();
        JLabel lbTenSanPham = new JLabel();
        JLabel lbGia = new JLabel();
        JButton btnXoa = new JButton();
        JButton btnTang = new JButton();
        JButton btnGiam = new JButton();
        JTextField txtSoLuong = new JTextField();
        lbHinhSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbHinhSanPham.setText(hinhSanPham);
        pnMain.add(lbHinhSanPham);
        lbHinhSanPham.setBounds(0, 0, 90, 90);

        lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTenSanPham.setText(tenSanPham);
        pnMain.add(lbTenSanPham);
        lbTenSanPham.setBounds(100, 0, 260, 30);

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setText("0");
        pnMain.add(txtSoLuong);
        txtSoLuong.setBounds(130, 50, 40, 30);

        btnGiam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/down1.png"))); // NOI18N
        pnMain.add(btnGiam);
        btnGiam.setBounds(100, 50, 30, 30);

        btnTang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/up.png"))); // NOI18N
        pnMain.add(btnTang);
        btnTang.setBounds(170, 50, 30, 30);

        lbGia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbGia.setForeground(java.awt.Color.red);
        lbGia.setText(String.valueOf(giaSanPham) + " ");
        pnMain.add(lbGia);
        lbGia.setBounds(210, 50, 150, 30);

        btnXoa.setBackground(java.awt.Color.yellow);
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        pnMain.add(btnXoa);
        btnXoa.setBounds(350, 15, 60, 60);
        pn.add(pnMain);
        pnMain.setBounds(0, top, 430, 90);
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
}
