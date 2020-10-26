package view;

import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JDialog;
import modal.NhanVien;
import javax.swing.*;

public class pnHeader extends javax.swing.JPanel {

    NhanVien nvs;
    JPanel pnHeaderf;
    int i = 0;
    public pnHeader(JPanel pn, NhanVien nv) {
        initComponents();
        this.nvs = nv;
        this.pnHeaderf = pn;
        lbBoPhan.setText(nvs.getTenBoPhan());
        lbTenNhanVien.setText(nvs.getHoTen());
        
        Timer timmer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                load(time);
            }
        });
        timmer.start();
    }
    public String getThuTrongTuan() {
        String s = "";
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1 : 
                    s = "Chủ Nhật";
                    break;
            case 2 : 
                    s = "Thứ Hai";
                    break;
            case 3 : 
                    s = "Thứ Ba";
                    break;                   
            case 4 : 
                    s = "Thứ Tư";
                    break; 
            case 5 : 
                    s = "Thứ Năm";
                    break;                   
            case 6 : 
                    s = "Thứ Sáu";
                    break; 
            case 7 : 
                    s = "Thứ Bảy";
                    break;                     
        }
        return s;
    }
    public void load(JLabel lb) {
        String hh;
        String mm;
        String ss;
        try {
            String thu = getThuTrongTuan();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String[] splitString = dtf.format(now).split(" ");
            String[] hms = splitString[1].split(":");
            hh = hms[0];
            mm = hms[1];
            ss = hms[2];
            int s = Integer.parseInt(ss);
            s++;
            ss = String.valueOf(s);
            hh = (Integer.parseInt(hh) < 10) ? hh = "0" + hh : hh;
            mm = (Integer.parseInt(mm) < 10) ? mm = "0" + mm : mm;
            ss = (Integer.parseInt(ss) < 10) ? ss = "0" + ss : ss;
            if (Integer.parseInt(ss) > 59) {
                ss = "00";
                if (Integer.parseInt(mm) > 59) {
                    mm = "";
                    if (Integer.parseInt(hh) > 23) {
                        hh = "00";
                        mm = "";
                    } else {
                        int h = Integer.parseInt(hh);
                        h++;
                        hh = String.valueOf(h);
                    }
                } else {
                    int m = Integer.parseInt(mm);
                    m++;
                }
            }
            lb.setText(thu + " - " +splitString[0] + " - " + hh + ":" + mm + ":" + ss);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbBoPhan = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        bnDangXuat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pnThongTin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 90);

        lbBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbBoPhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBoPhan.setText("Nhân Viên");
        jPanel2.add(lbBoPhan);
        lbBoPhan.setBounds(280, 10, 460, 30);

        lbTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenNhanVien.setText("Trà Tấn Hưởng");
        jPanel2.add(lbTenNhanVien);
        lbTenNhanVien.setBounds(300, 50, 440, 30);

        bnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnDangXuatMouseClicked(evt);
            }
        });
        bnDangXuat.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Đăng Xuất");
        bnDangXuat.add(jLabel7);
        jLabel7.setBounds(80, 0, 100, 70);

        jPanel5.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(0, 0, 70, 70);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Thông Tin");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(80, 0, 100, 70);

        bnDangXuat.add(jPanel5);
        jPanel5.setBounds(740, 10, 180, 70);

        jPanel6.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel6.add(jLabel10);
        jLabel10.setBounds(0, 0, 70, 70);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Thông Tin");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(80, 0, 100, 70);

        jPanel7.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel7.add(jLabel12);
        jLabel12.setBounds(0, 0, 70, 70);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Thông Tin");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(80, 0, 100, 70);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(740, 10, 180, 70);

        bnDangXuat.add(jPanel6);
        jPanel6.setBounds(740, 10, 180, 70);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/exit.png"))); // NOI18N
        bnDangXuat.add(jLabel30);
        jLabel30.setBounds(0, 0, 70, 70);

        jPanel2.add(bnDangXuat);
        bnDangXuat.setBounds(1250, 10, 180, 70);

        pnThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongTinMouseClicked(evt);
            }
        });
        pnThongTin.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        pnThongTin.add(jLabel14);
        jLabel14.setBounds(0, 0, 60, 70);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Thông Tin");
        pnThongTin.add(jLabel15);
        jLabel15.setBounds(70, 0, 100, 70);

        jPanel9.setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel9.add(jLabel16);
        jLabel16.setBounds(0, 0, 70, 70);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Thông Tin");
        jPanel9.add(jLabel17);
        jLabel17.setBounds(80, 0, 100, 70);

        pnThongTin.add(jPanel9);
        jPanel9.setBounds(740, 10, 180, 70);

        jPanel10.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel10.add(jLabel18);
        jLabel18.setBounds(0, 0, 70, 70);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Thông Tin");
        jPanel10.add(jLabel19);
        jLabel19.setBounds(80, 0, 100, 70);

        jPanel11.setLayout(null);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel11.add(jLabel20);
        jLabel20.setBounds(0, 0, 70, 70);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21.setText("Thông Tin");
        jPanel11.add(jLabel21);
        jLabel21.setBounds(80, 0, 100, 70);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(740, 10, 180, 70);

        pnThongTin.add(jPanel10);
        jPanel10.setBounds(740, 10, 180, 70);

        jPanel2.add(pnThongTin);
        pnThongTin.setBounds(1060, 10, 180, 70);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel31.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Version 4.2 - Updated");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(740, 50, 320, 30);

        time.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(time);
        time.setBounds(740, 10, 320, 30);

        add(jPanel2);
        jPanel2.setBounds(0, 0, 1440, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void pnThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongTinMouseClicked
        jfBanHang nv = new jfBanHang(nvs);
        pnDInfo info = new pnDInfo(nv, true, nvs);
        info.setModalityType(ModalityType.APPLICATION_MODAL);
        info.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        info.setVisible(true);
    }//GEN-LAST:event_pnThongTinMouseClicked

    private void bnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnDangXuatMouseClicked
        JFrame f1 = (JFrame) SwingUtilities.windowForComponent(this);
        f1.dispose();
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_bnDangXuatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bnDangXuat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbBoPhan;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
