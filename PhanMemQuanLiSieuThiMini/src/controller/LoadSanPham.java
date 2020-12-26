package controller;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class LoadSanPham {
    
    public int updateNhaCungCap(String idKhachHang,String idSanPham) {
        int count = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE SanPham SET IDKhachHang = ? WHERE IDSanPham = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idKhachHang);
            ps.setString(2, idSanPham);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    public void load(JTable table) {
        DecimalFormat format = new DecimalFormat("###,###,###");
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT SanPham.IDSanPham,NhomSanPham.TenNhom,SanPham.TenSanPham,SanPham.IDDonViTinh AS 'Đơn Vị Tính',\n"
                    + "BangGia.DonGia , BangGia.Giam,BangGia.GiaVonSP FROM SanPham \n"
                    + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            Vector vTitle = new Vector(rsm.getColumnCount());
            Vector vData = null;
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            DefaultTableModel tableModel = new DefaultTableModel(vTitle, 0);
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(format.format(rs.getInt(5)) + " VNĐ");
                vData.add(format.format(rs.getInt(6)));
                vData.add(format.format(rs.getInt(7)) + " VNĐ");
                tableModel.addRow(vData);
            }
            table.setModel(tableModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getIDByNhomSP(String tenNhom) {
        String id = "";
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT IDNhomSanPham FROM NhomSanPham WHERE TenNhom = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenNhom);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                id = rs.getString(1);
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
