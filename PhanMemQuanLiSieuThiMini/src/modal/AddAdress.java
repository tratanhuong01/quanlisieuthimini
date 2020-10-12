
package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddAdress {
    public static void main(String args[]) {
        String s = "An Giang\n" +
                "Bà Rịa-Vũng Tàu\n" +
                "Bạc Liêu\n" +
                "Bắc Kạn\n" +
                "Bắc Giang\n" +
                "Bắc Ninh\n" +
                "Bến Tre\n" +
                "Bình Dương\n" +
                "Bình Định\n" +
                "Bình Phước\n" +
                "Bình Thuận\n" +
                "Cà Mau\n" +
                "Cao Bằng\n" +
                "Cần Thơ\n" +
                "Đà Nẵng\n" +
                "Đắk Lắk\n" +
                "Đắk Nông\n" +
                "Điện Biên\n" +
                "Đồng Nai\n" +
                "Đồng Tháp\n" +
                "Gia Lai\n" +
                "Hà Giang\n" +
                "Hà Nam\n" +
                "Hà Nội (TP)\n" +
                "Hà Tây\n" +
                "Hà Tĩnh\n" +
                "Hải Dương\n" +
                "Hải Phòng (TP)\n" +
                "Hòa Bình\n" +
                "Hồ Chí Minh (TP)\n" +
                "Hậu Giang\n" +
                "Hưng Yên\n" +
                "Khánh Hòa\n" +
                "Kiên Giang\n" +
                "Kon Tum\n" +
                "Lai Châu\n" +
                "Lào Cai\n" +
                "Lạng Sơn\n" +
                "Lâm Đồng\n" +
                "Long An\n" +
                "Nam Định\n" +
                "Nghệ An\n" +
                "Ninh Bình\n" +
                "Ninh Thuận\n" +
                "Phú Thọ\n" +
                "Phú Yên\n" +
                "Quảng Bình\n" +
                "Quảng Nam\n" +
                "Quảng Ngãi\n" +
                "Quảng Ninh\n" +
                "Quảng Trị\n" +
                "Sóc Trăng\n" +
                "Sơn La\n" +
                "Tây Ninh\n" +
                "Thái Bình\n" +
                "Thái Nguyên\n" +
                "Thanh Hóa\n" +
                "Thừa Thiên – Huế\n" +
                "Tiền Giang\n" +
                "Trà Vinh\n" +
                "Tuyên Quang\n" +
                "Vĩnh Long\n" +
                "Vĩnh Phúc\n" +
                "Yên Bái";
        String[] address = s.split("\n");
        try (Connection conn = new ConnectDAO().getConnection()) {
            for (int i = 0; i < address.length; i++) {
                String query = "INSERT INTO DiaChi(TenTinh)VALUES (?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, address[i]);
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
