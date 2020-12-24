package controller;

import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.DongHoaDon;
import model.InfoAtm;
import model.KhachHang;
import model.NhanVien;

public class DrawBill {
    public void drawFooter(JPanel pnHoaDon) {
        
    }
    public void setFontAndForeColor(JLabel lb,JPanel pnHoaDon,int size) {
        lb.setFont(new java.awt.Font("Times New Roman", 1, size)); // NOI18N
        lb.setForeground(java.awt.Color.blue);
        pnHoaDon.add(lb);
    }
    public JLabel addLabel(String nameLb,int i,int a) {
        JLabel lb = new JLabel("CenterLeft", SwingConstants.CENTER);
        lb.setText(nameLb);
        switch (i) {
            case 1 :
                lb = new JLabel(nameLb);
                lb.setBounds(10, a, 220, 25);
                break;
            case 2 :
                lb.setBounds(260, a, 140, 25);
                break;
            case 3 :
                lb.setBounds(360, a, 80, 25);
                break;
            case 4 :
                lb.setBounds(440, a, 140, 25);
                break;
        }
        return lb;
    }
    public int[] drawData(JPanel pnHoaDon,List<DongHoaDon> list) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        int[] arrInt = new int[2];
        int a = drawTitle(pnHoaDon, 300);
        int tongTienFull = 0;
        for (int i = 0; i < list.size(); i++) {
            a += 50;
            float rs = (float) list.get(i).getDonGia() * list.get(i).getSoLuong();
            setFontAndForeColor(addLabel(list.get(i).getTenSanPham(), 1, a), pnHoaDon, 18);
            setFontAndForeColor(addLabel((formatter.format(list.get(i).getDonGia()) + " VNĐ"), 2, a), pnHoaDon, 18);
            setFontAndForeColor(addLabel(String.valueOf(list.get(i).getSoLuong()), 3, a), pnHoaDon, 18);
            setFontAndForeColor(addLabel((formatter.format(rs)) + " VNĐ", 4, a), pnHoaDon, 18);
            pnHoaDon.setPreferredSize(new Dimension(550, a));
            tongTienFull += (list.get(i).getDonGia() * list.get(i).getSoLuong());
        }
        arrInt[0] = a;
        arrInt[1] = tongTienFull;
        return arrInt;
    }
    public int drawTitle(JPanel pnHoaDon, int _a) {
        int a = _a;
        setFontAndForeColor(addLabel("Tên Sản Phẩm",1,a), pnHoaDon,22);
        setFontAndForeColor(addLabel("Đơn Giá",2,a), pnHoaDon,22);
        setFontAndForeColor(addLabel("SL",3,a), pnHoaDon,22);
        setFontAndForeColor(addLabel("Tổng Tiền",4,a), pnHoaDon,22);
        return a;
    }
    public void draw() {
        
    }
}
