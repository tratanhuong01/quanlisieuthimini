package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.ConnectDAO;

public class SuaDiemTieuDung {
    public boolean suaDiemHienTai(int diem,float tien) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE TichDiem SET QuyDoiDiem = ? , TienQuyDoi = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, diem);
            ps.setFloat(2, tien);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public int[] getDiemHienTai() {
        int[] diem = new int[2];
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT QuyDoiDiem ,TienQuyDoi FROM TichDiem";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                diem[0] = rs.getInt(1);
                diem[1] = rs.getInt(2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diem;
    }
}
