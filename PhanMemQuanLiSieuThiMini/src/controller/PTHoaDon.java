package controller;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.ConnectDAO;
import model.DongHoaDon;
import model.SanPham;
import model.StringUtil;
import view.nvbanhang.pn_SanPhamDaChon;

public class PTHoaDon {
    DecimalFormat formatter = new DecimalFormat("###,###,###");

    public PTHoaDon() {

    }
    public int getSoLuongDongHoaDon(String idDongHoaDon) {
        int soLuong = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT SoLuong FROM DongHoaDon WHERE IDDongHoaDon = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,idDongHoaDon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soLuong = rs.getInt(1);
            }
            return soLuong;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soLuong;
    }
    public boolean updateSanPhamDaThem(int soLuong,String idDongHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE DongHoaDon SET SoLuong = ?  WHERE IDDongHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,soLuong);
            ps.setString(2, idDongHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<DongHoaDon> getListDongHoaDon(String idHoaDon) {
        List<DongHoaDon> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT DongHoaDon.IDDongHoaDon, HoaDon.IDHoaDon ,SanPham.TenSanPham,\n"
                    + "SanPham.IDSanPham,SanPham.IDDonViTinh , BangGia.DonGia , DongHoaDon.SoLuong ,SanPham.UrlImage, \n"
                    + "BangGia.Giam , NhanVien.IDNhanVien , NhanVien.HoTen,KhachHang.IDKhachHang,KhachHang.HoTen"
                    + " ,HoaDon.NgayTao FROM HoaDon\n"
                    + "LEFT JOIN DongHoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                    + "INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia\n"
                    + "INNER JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n"
                    + "INNER JOIN KhachHang ON KhachHang.IDKhachHang = HoaDon.IDKhachHang\n"
                    + "WHERE HoaDon.IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongHoaDon dongHoaDon = new DongHoaDon(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),rs.getString(5), rs.getFloat(6), rs.getInt(7), rs.getString(8),
                        rs.getFloat(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),rs.getString(14));
                list.add(dongHoaDon);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insertHoaDon(String idHoaDon, String idKhachHang, String idNhanVien,
            int trangThai, String ptThanhToan) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO HoaDon(IDHoaDon,NgayTao,IDKhachHang,IDNhanVien,TrangThai)"
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            ps.setString(2, dateFormat.format(cal.getTime()));
            ps.setString(3, idKhachHang);
            ps.setString(4, idNhanVien);
            ps.setInt(5, trangThai);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertDongHoaDon(String idDongHoaDon,String idHoaDon, String idSanPham, String idDonViTinh,
            int soLuong) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            
            String query = "INSERT INTO DongHoaDon(IDDongHoaDon,IDHoaDon,IDSanPham,IDDonViTinh,"
                    + "SoLuong)VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idDongHoaDon);
            ps.setString(2, idHoaDon);
            ps.setString(3, idSanPham);
            ps.setString(4, idDonViTinh);
            ps.setInt(5, soLuong);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean ThayDoiSLSanPham(int soLuong,String idDongHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE SoLuong = ? FROM DongHoaDon WHERE IDDongHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuong);
            ps.setString(2, idDongHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
