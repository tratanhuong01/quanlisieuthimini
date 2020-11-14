package controller;

import model.NhanVien;
import java.sql.*;
import model.ConnectDAO;

public class ThemNhanVien {
    public NhanVien getNhanVien(String idNhanVien) {
        NhanVien nv = null;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT TaiKhoan.TaiKhoan , TaiKhoan.MatKhau, NhanVien.IDNhanVien,NhanVien.IDBoPhan ,\n"
                    + "NhanVien.HoTen,NhanVien.GioiTinh,NhanVien.SoDienThoai,Nhanvien.DiaChi,BoPhan.TenBoPhan\n"
                    + "FROM NhanVien INNER JOIN BoPhan ON NhanVien.IDBoPhan = BoPhan.IDBoPhan\n"
                    + "INNER JOIN TaiKhoan ON NhanVien.IDNhanVien = TaiKhoan.IDNhanVien \n"
                    + "WHERE NhanVien.IDNhanVien = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,idNhanVien);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                        , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9));
            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
}
