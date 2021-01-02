package controller;

import java.sql.*;
import java.util.ArrayList;
import model.ConnectDAO;

public class QuetSanPham {
    public int getSoLuong(String idSanPham) {
        int num  = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT SUM(SoLuong) FROM DongHoaDon INNER JOIN "
                    + "HoaDon ON DongHoaDon.IDHoaDon = HoaDon.IDHoaDon "
                    + "WHERE HoaDon.LoaiHoaDon = 0 AND DongHoaDon.IDSanPham = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                num = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }
    public ArrayList getSanPham() {
        ArrayList list = new ArrayList();
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT IDSanPham FROM Kho WHERE TinhTrang = 1";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void update(int soLuong,String idSanPham) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE SoLuongHienTai = SoLuongXuat - ? WHERE IDSanPham = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuong);
            ps.setString(2, idSanPham);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void quet() {
        ArrayList list = getSanPham();
        for (int i = 0; i < list.size(); i++) {
            update(getSoLuong(list.get(i).toString()), list.get(i).toString());
        }
    }
    public static void main(String[] args) {
        new QuetSanPham().quet();
    }
}
