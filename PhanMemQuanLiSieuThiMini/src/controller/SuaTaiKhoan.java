package controller;

import java.sql.*;
import model.ConnectDAO;

public class SuaTaiKhoan {
    public boolean sua(String taiKhoan,String matKhau,String idNhanVien) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE TaiKhoan SET TaiKhoan = ? , MatKhau = ? WHERE IDNhanVien = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, taiKhoan);
            ps.setString(2, matKhau);
            ps.setString(3, idNhanVien);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
