package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StringUtil {
    public static String taoID(String id ,String tenBang,String firstID) {
        int num = 0;
        String string = "";
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TOP 1 " + id + " FROM "  + tenBang + " ORDER BY "
                    + id + " DESC";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                string = rs.getString(1);
                String[] arr = string.split(firstID);
                num = Integer.parseInt(arr[1]);
            }
            num++;
            string = firstID + String.valueOf(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }
}
