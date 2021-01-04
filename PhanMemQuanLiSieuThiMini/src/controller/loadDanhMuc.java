package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;
import model.DAO;
import model.NhomSanPham;
import model.SanPham;

public class loadDanhMuc {

    public List<NhomSanPham> loadNhomSanPham(JComboBox cbBox) {
        cbBox.removeAllItems();
        List<NhomSanPham> list = new DAO().getNhomSanPham();
        for (int i = 0; i < list.size(); i++) {
            cbBox.addItem(list.get(i).getTenNhomSanPham());
        }
        return list;
    }
    
    public List<NhomSanPham> loadNhomSanPham2() {
        List<NhomSanPham> list = new DAO().getNhomSanPham();
        return list;
    }

    public void loadNhomSanPham1(JComboBox cbBox) {
        cbBox.addItem("Tất Cả");
        List<NhomSanPham> list = new DAO().getNhomSanPham();
        for (int i = 0; i < list.size(); i++) {
            cbBox.addItem(list.get(i).getTenNhomSanPham());
        }
    }

    public void loadPTThanhToan(JComboBox cbBox) {
        cbBox.removeAllItems();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TenPTThanhToan FROM PhuongThucThanhToan";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbBox.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createView(String query) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dropView() {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "DROP VIEW ListOne;"
                    + "DROP VIEW ListTwo;"
                    + "DROP VIEW ListThree;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createViewSQL(JTable table) {
        DecimalFormat format = new DecimalFormat("###,###,###");
        PreparedStatement ps = null;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query1 = " CREATE VIEW ListOne AS\n"
                    + "SELECT DongHoaDon.IDSanPham,SanPham.TenSanPham,SanPham.IDDonViTinh,\n"
                    + "SanPham.NgaySanXuat,SanPham.HanSuDung,SanPham.UrlImage , NhomSanPham.TenNhom,BangGia.DonGia,\n"
                    + "BangGia.Giam,BangGia.GiaVonSP,KhachHang.HoTen ,\n"
                    + "SanPham.TinhTrang , SanPham.SKU,Kho.NgayNhap,Kho.NgayXuat FROM DongHoaDon\n"
                    + "INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                    + "INNER JOIN KhachHang ON SanPham.IDKhachHang = KhachHang.IDKhachHang\n"
                    + "INNER JOIN Kho ON SanPham.SKU = Kho.SKU\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia;";
            String query2 = " CREATE VIEW ListTwo AS\n"
                    + "SELECT DongHoaDon.IDSanPham, SUM(SoLuong) AS SoLuongSP FROM DongHoaDon \n"
                    + "INNER JOIN HoaDon ON DongHoaDon.IDHoaDon = HoaDon.IDHoaDon\n"
                    + "WHERE HoaDon.LoaiHoaDon = 0\n"
                    + "GROUP BY DongHoaDon.IDSanPham;";
            String query3 = " CREATE VIEW ListThree AS\n"
                    + "SELECT DISTINCT ListOne.IDSanPham,ListOne.TenSanPham,ListOne.IDDonViTinh,\n"
                    + "ListOne.NgaySanXuat,ListOne.HanSuDung,ListOne.UrlImage , ListOne.TenNhom,ListOne.DonGia,\n"
                    + "ListOne.Giam,ListOne.GiaVonSP,ListOne.HoTen ,\n"
                    + "ListOne.TinhTrang , ListOne.SKU,ListOne.NgayNhap,ListOne.NgayXuat\n"
                    + "FROM ListOne\n"
                    + "INNER JOIN ListTwo ON ListOne.IDSanPham = ListTwo.IDSanPham; ";
            String query = " SELECT ListThree.IDSanPham,ListThree.TenSanPham,ListThree.IDDonViTinh,\n"
                    + "ListThree.NgaySanXuat,ListThree.HanSuDung,ListThree.UrlImage , ListThree.TenNhom,ListThree.DonGia,\n"
                    + "ListThree.Giam,ListThree.GiaVonSP,ListThree.HoTen ,\n"
                    + "ListThree.TinhTrang , ListThree.SKU,ListThree.NgayNhap,ListThree.NgayXuat FROM ListThree\n"
                    + "INNER JOIN ListTwo ON ListThree.IDSanPham = ListTwo.IDSanPham \n"
                    + "ORDER BY ListTwo.SoLuongSP DESC;";
            createView(query1);
            createView(query2);
            createView(query3);
            ps = conn.prepareStatement(query);
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            table.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(format.format(Integer.parseInt(rs.getString(8).replace(".0", ""))) + " VNĐ");
                vData.add(format.format(Integer.parseInt(rs.getString(9).replace(".0", ""))));
                vData.add(format.format(Integer.parseInt(rs.getString(10).replace(".0", ""))) + "VNĐ");
                vData.add(rs.getString(11));
                vData.add(rs.getString(12));
                vData.add(rs.getString(13));
                vData.add(rs.getString(14));
                vData.add(rs.getString(15));
                tableMode.addRow(vData);
            }
            table.setModel(tableMode);
            dropView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<SanPham> get(String tenNhom) {
        List<SanPham> list = new ArrayList<>();
        PreparedStatement ps = null;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query1 = " CREATE VIEW ListOne AS\n"
                    + "SELECT DongHoaDon.IDSanPham,SanPham.TenSanPham,SanPham.IDDonViTinh,\n"
                    + "SanPham.NgaySanXuat,SanPham.HanSuDung,SanPham.UrlImage , NhomSanPham.TenNhom,BangGia.DonGia,\n"
                    + "BangGia.Giam,BangGia.GiaVonSP,KhachHang.HoTen ,\n"
                    + "SanPham.TinhTrang , SanPham.SKU,Kho.NgayNhap,Kho.NgayXuat FROM DongHoaDon\n"
                    + "INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                    + "INNER JOIN KhachHang ON SanPham.IDKhachHang = KhachHang.IDKhachHang\n"
                    + "INNER JOIN Kho ON SanPham.SKU = Kho.SKU\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia;";
            String query2 = " CREATE VIEW ListTwo AS\n"
                    + "SELECT DongHoaDon.IDSanPham, SUM(SoLuong) AS SoLuongSP FROM DongHoaDon \n"
                    + "INNER JOIN HoaDon ON DongHoaDon.IDHoaDon = HoaDon.IDHoaDon\n"
                    + "WHERE HoaDon.LoaiHoaDon = 0\n"
                    + "GROUP BY DongHoaDon.IDSanPham;";
            String query3 = " CREATE VIEW ListThree AS\n"
                    + "SELECT DISTINCT ListOne.IDSanPham,ListOne.TenSanPham,ListOne.IDDonViTinh,\n"
                    + "ListOne.NgaySanXuat,ListOne.HanSuDung,ListOne.UrlImage , ListOne.TenNhom,ListOne.DonGia,\n"
                    + "ListOne.Giam,ListOne.GiaVonSP,ListOne.HoTen ,\n"
                    + "ListOne.TinhTrang , ListOne.SKU,ListOne.NgayNhap,ListOne.NgayXuat\n"
                    + "FROM ListOne\n"
                    + "INNER JOIN ListTwo ON ListOne.IDSanPham = ListTwo.IDSanPham; ";
            String query = " SELECT TOP 4 ListThree.IDSanPham,ListThree.TenSanPham,ListThree.IDDonViTinh,\n"
                    + "ListThree.NgaySanXuat,ListThree.HanSuDung,ListThree.UrlImage , ListThree.TenNhom,ListThree.DonGia,\n"
                    + "ListThree.Giam,ListThree.GiaVonSP,ListThree.HoTen ,\n"
                    + "ListThree.TinhTrang , ListThree.SKU,ListThree.NgayNhap,ListThree.NgayXuat FROM ListThree\n"
                    + "INNER JOIN ListTwo ON ListThree.IDSanPham = ListTwo.IDSanPham \n"
                    + "WHERE ListThree.TenNhom = ? ORDER BY ListTwo.SoLuongSP DESC";
            createView(query1);
            createView(query2);
            createView(query3);
            ps = conn.prepareStatement(query);
            ps.setString(1, tenNhom);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 SanPham sp = new SanPham(
                        rs.getString(1), "", rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getFloat(8), rs.getFloat(9), rs.getFloat(10), "",
                        rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
                        rs.getString(15));
                list.add(sp);
            }
            dropView();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
