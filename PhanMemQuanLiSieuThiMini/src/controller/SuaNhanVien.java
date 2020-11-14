package controller;

import java.sql.*;
import model.ConnectDAO;

public class SuaNhanVien {
    public boolean Sua(String hoTen,String gioiTinh,String soDienThoai,String diaChi,String idNhanVien) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE NhanVien SET HoTen = ? , GioiTinh = ? ,"
                    + " SoDienThoai = ? , DiaChi = ? WHERE IDNhanVien = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, hoTen);
            ps.setString(2, gioiTinh);
            ps.setString(3, soDienThoai);
            ps.setString(4, diaChi);
            ps.setString(5, idNhanVien);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
