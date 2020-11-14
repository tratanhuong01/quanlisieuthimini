package controller;

import java.sql.*;
import model.ConnectDAO;

public class SuaKhachHang {
    public boolean Sua(String idKhachHang,String hoTen, String gioiTinh,String soDienThoai,String diaChi) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE KhachHang SET HoTen = ? , GioiTinh = ? "
                    + ", SoDienThoai = ?  , DiaChi = ? WHERE IDKhachHang = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, hoTen);
            ps.setString(2, gioiTinh);
            ps.setString(3, soDienThoai);
            ps.setString(4, diaChi);
            ps.setString(5, idKhachHang);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
