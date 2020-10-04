package modal;

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
            String query = "SELECT TenBoPhan FROM BoPhan";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<SanPham> getSanPhamByNhomSanPham() {
        List<SanPham> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT SanPham.IDSanPham,SanPham.IDNhomSanPham,SanPham.TenSanPham,SanPham.IDDonViTinh,\n"
                    + "SanPham.NgaySanXuat,SanPham.HanSuDung,SanPham.UrlImage , NhomSanPham.TenNhom,BangGia.DonGia,\n"
                    + "BangGia.Giam,KhuVuc.TenKhuVuc FROM SanPham \n"
                    + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                    + "INNER JOIN BangGia ON SanPham.IDSanPham = BangGia.IDSanPham \n"
                    + "INNER JOIN KhuVuc ON NhomSanPham.IDKhuVuc = KhuVuc.IDKhuVuc";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getFloat(9), rs.getFloat(10), rs.getString(11));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
