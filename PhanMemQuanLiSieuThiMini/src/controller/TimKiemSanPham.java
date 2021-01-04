package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import model.*;

public class TimKiemSanPham {
    public String getAllNhomSanPham(String tenNhom) {
        String s = null;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT IDNhomSanPham FROM NhomSanPham WHERE TenNhom = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenNhom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
                s = rs.getString(1);
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    public List<SanPham> getSanPhamByNhomSanPham(String subQuery) {
        List<SanPham> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT SanPham.IDSanPham,SanPham.IDNhomSanPham,SanPham.TenSanPham,SanPham.IDDonViTinh,\n"
                    + "SanPham.NgaySanXuat,SanPham.HanSuDung,SanPham.UrlImage , NhomSanPham.TenNhom,BangGia.DonGia,\n"
                    + "BangGia.Giam,BangGia.GiaVonSP,SanPham.IDKhachHang,KhachHang.HoTen , \n"
                    + "SanPham.TinhTrang , SanPham.SKU,Kho.NgayNhap,Kho.NgayXuat FROM SanPham "
                    + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                    + "INNER JOIN KhachHang ON SanPham.IDKhachHang = KhachHang.IDKhachHang\n"
                    + "FULL JOIN Kho ON SanPham.SKU = Kho.SKU\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia \n"
                    + "INNER JOIN KhuVuc ON NhomSanPham.IDKhuVuc = KhuVuc.IDKhuVuc " + subQuery;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                    rs.getFloat(9), rs.getFloat(10), rs.getFloat(11),rs.getString(12),
                    rs.getString(13),rs.getInt(14),rs.getString(15),rs.getString(16),
                    rs.getString(17));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
