package controller;

import model.NhanVien;
import java.sql.*;
import model.ConnectDAO;

public class ThemNhanVien {
    public boolean them(String idNhanVien,String idBoPhan,String hoTen,String gioiTinh,
            String soDienThoai,String diaChi , int tinhTrang) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO (IDNhanVien,IDBoPhan,HoTen,GioiTinh,SoDienThoai,DiaChi,TinhTrang)VALUES "
                    + "(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idNhanVien);
            ps.setString(2, idBoPhan);
            ps.setString(3, hoTen);
            ps.setString(4, gioiTinh);
            ps.setString(5, soDienThoai);
            ps.setString(6, diaChi);
            ps.setInt(7, tinhTrang);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return false;
    }
    public NhanVien getNhanVien(String idNhanVien) {
        NhanVien nv = null;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT TaiKhoan.TaiKhoan , TaiKhoan.MatKhau, NhanVien.IDNhanVien,NhanVien.IDBoPhan ,\n"
                    + "NhanVien.HoTen,NhanVien.GioiTinh,NhanVien.SoDienThoai,Nhanvien.DiaChi,BoPhan.TenBoPhan,NhanVien.TinhTrang \n"
                    + "FROM NhanVien INNER JOIN BoPhan ON NhanVien.IDBoPhan = BoPhan.IDBoPhan\n"
                    + "INNER JOIN TaiKhoan ON NhanVien.IDNhanVien = TaiKhoan.IDNhanVien \n"
                    + "WHERE NhanVien.IDNhanVien = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,idNhanVien);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                        , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getInt(10));
            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
}
