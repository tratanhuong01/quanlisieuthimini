package controller;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import model.ConnectDAO;

public class LoadDiaChi {
    public ArrayList getTenTinh() {
        ArrayList list = new ArrayList();
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT TenTinh FROM DiaChi ";
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
    public List<JButton> load(String id) {
        List<JButton> listlb = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT TenTinh FROM DiaChi " + id;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                JButton btn = new JButton();
                btn.setMaximumSize(new Dimension(315, 30));
                btn.setMinimumSize(new Dimension(315, 30));
                btn.setSize(new Dimension(315, 30));
                btn.setPreferredSize(new Dimension(315, 30));
                btn.setBackground(Color.WHITE);
                btn.setText(rs.getString(1));
                listlb.add(btn);
                
            }
            return listlb;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listlb;
    }
}
