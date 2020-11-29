package controller;

import java.sql.*;
import model.ConnectDAO;

public class TaoTaiKhoan {
    public boolean tao(String taiKhoan,String matKhau,String idBoPhan,String idNhanVien) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO TaiKhoan(TaiKhoan,MatKhau,IDBoPhan,IDNhanVien)VALUES "
                    + "(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, taiKhoan);
            ps.setString(2, matKhau);
            ps.setString(3, idBoPhan);
            ps.setString(4, idNhanVien);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean check(String taiKhoan) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT TaiKhoan FROM TaiKhoan WHERE TaiKhoan = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, taiKhoan);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
