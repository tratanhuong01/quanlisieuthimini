package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ConnectDAO;
import model.KhachHang;
import model.StringUtil;

public class ThemKhachHang {

    String id = StringUtil.taoID("IDKhachHang", "KhachHang", "KH");

    public boolean them(String id, String idNhom, String hoTen, String gioiTinh,
            String soDienThoai, String diaChi, String maSoThue, float traDK, float thuDK) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO KhachHang(IDKhachHang,IDNhomKH,HoTen,GioiTinh,SoDienThoai,DiaChi"
                    + ",MasoThue,TraDK,ThuDK)VALUES "
                    + " (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, idNhom);
            ps.setString(3, hoTen);
            ps.setString(4, gioiTinh);
            ps.setString(5, soDienThoai);
            ps.setString(6, diaChi);
            ps.setString(7, maSoThue);
            ps.setFloat(8, traDK);
            ps.setFloat(9, thuDK);
            ps.executeUpdate();
            int[] arr = new SuaDiemTieuDung().getDiemHienTai();
            themTichDiem(id, 0, 0,arr[0],(float)arr[1]);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean themTichDiem(String idKhachHang, int SoDiem, int isVip,int quyDoiDiem,float tienQuyDoi) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO TichDiem(IDKhachHang,SoDiem,IsVip,QuyDoiDiem,TienQuyDoi)VALUES "
                    + "(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idKhachHang);
            ps.setInt(2, SoDiem);
            ps.setInt(3, isVip);
            ps.setInt(4, quyDoiDiem);
            ps.setFloat(5, tienQuyDoi);
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
            String query = "SELECT KhachHang.IDKhachHang ,KhachHang.IDNhomKH,KhachHang.HoTen,KhachHang.GioiTinh,\n"
                    + "KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                    + "KhachHang.TraDK,KhachHang.ThuDK,TichDiem.SoDiem\n"
                    + "FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                    + "INNER JOIN TichDiem ON KhachHang.IDKhachHang = TichDiem.IDKhachHang \n"
                    + "WHERE KhachHang.IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getFloat(9), rs.getFloat(10), rs.getInt(11));
            }
            return kh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }
    public KhachHang getNhaCungCap(String id) {
        KhachHang kh = null;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT KhachHang.IDKhachHang ,KhachHang.IDNhomKH,KhachHang.HoTen,\n"
                    + " KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                    + " KhachHang.TraDK,KhachHang.ThuDK"
                    + " FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                    + " WHERE KhachHang.IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3),
                        "", rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getFloat(8), rs.getFloat(9), 0);
            }
            return kh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }
    public List<KhachHang> getAllNhaCungCap() {
        List<KhachHang> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT KhachHang.IDKhachHang ,NhomKhachHang.TenNhom,KhachHang.HoTen,\n"
                + "KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                + "KhachHang.TraDK,KhachHang.ThuDK\n"
                + "FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                + "WHERE NhomKhachHang.IDNhomKH = 'NKH10003' ";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3),
                        "", rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getFloat(8), rs.getFloat(9), 0);
                list.add(kh);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
