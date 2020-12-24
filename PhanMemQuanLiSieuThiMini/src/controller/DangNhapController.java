package controller;

import model.ConnectDAO;
import java.sql.*;
import model.NhanVien;

public class DangNhapController {
    public NhanVien getNhanVien(String tenDangNhap,String matKhau,String tenBoPhan,String idNhanVien) {
        NhanVien nv = null;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TaiKhoan.TaiKhoan , TaiKhoan.MatKhau, NhanVien.IDNhanVien,NhanVien.IDBoPhan ,\n"
                    + "NhanVien.HoTen,NhanVien.GioiTinh,NhanVien.SoDienThoai,Nhanvien.DiaChi,BoPhan.TenBoPhan,NhanVien.TinhTrang \n"
                    + "FROM NhanVien INNER JOIN BoPhan ON NhanVien.IDBoPhan = BoPhan.IDBoPhan\n"
                    + "INNER JOIN TaiKhoan ON NhanVien.IDNhanVien = TaiKhoan.IDNhanVien \n"
                    + "WHERE TaiKhoan = ? AND MatKhau = ? AND BoPhan.TenBoPhan = ? AND NhanVien.IDNhanVien = ? AND NhanVien.TinhTrang = '1' ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            ps.setString(3, tenBoPhan);
            ps.setString(4, idNhanVien);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                        , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getInt(10));
            }
            else {
                nv = null;
            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
}
