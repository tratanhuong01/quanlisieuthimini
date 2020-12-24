package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    public List<NhomSanPham> getNhomSanPham() {
        List<NhomSanPham> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT * FROM NhomSanPham";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhomSanPham nhomSanPham = new NhomSanPham(rs.getString(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4));
                list.add(nhomSanPham);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList getBoPhan() {
        ArrayList list = new ArrayList();

        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT IDBoPhan, TenBoPhan FROM BoPhan";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] arrS = new String[2];
                arrS[0] = rs.getString(1);
                arrS[1] = rs.getString(2);
                list.add(arrS);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SanPham> getSanPhamByNhomSanPham(String tenNhomSP) {
        List<SanPham> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT SanPham.IDSanPham,SanPham.IDNhomSanPham,SanPham.TenSanPham,SanPham.IDDonViTinh,\n"
                    + "SanPham.NgaySanXuat,SanPham.HanSuDung,SanPham.UrlImage , NhomSanPham.TenNhom,BangGia.DonGia,\n"
                    + "BangGia.Giam,BangGia.GiaVonSP,SanPham.IDKhachHang,KhachHang.HoTen ,\n"
                    + "SanPham.TinhTrang , SanPham.SKU,Kho.NgayNhap,Kho.NgayXuat FROM SanPham\n"
                    + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                    + "INNER JOIN KhachHang ON SanPham.IDKhachHang = KhachHang.IDKhachHang\n"
                    + "INNER JOIN Kho ON SanPham.SKU = Kho.SKU\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia\n"
                    + "WHERE NhomSanPham.TenNhom = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenNhomSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getFloat(9), rs.getFloat(10), rs.getFloat(11), rs.getString(12),
                        rs.getString(13), rs.getInt(14), rs.getString(15), rs.getString(16),
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
