package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.ConnectDAO;
import model.KhachHang;
import model.StringUtil;

public class ThemKhachHang {
    String id = StringUtil.taoID("IDKhachHang", "KhachHang", "KH");
    public boolean them(String id,String idNhom, String hoTen, String gioiTinh,
            String soDienThoai, String diaChi) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO KhachHang(IDKhachHang,IDNhomKH,HoTen,GioiTinh,SoDienThoai,DiaChi)VALUES "
                    + " (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,id);
            ps.setString(2, idNhom);
            ps.setString(3, hoTen);
            ps.setString(4, gioiTinh);
            ps.setString(5, soDienThoai);
            ps.setString(6, diaChi);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public KhachHang getKhachHang(String id) {
        KhachHang kh = null;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT * FROM KhachHang WHERE IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3)
                        , rs.getString(4), rs.getString(5), rs.getString(6));
            }
            return kh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }
    
}
