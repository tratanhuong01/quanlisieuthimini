package view.nvbanhang;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String loaiThe;
    private String tenNganHang;

    public Bank(String loaiThe, String tenNganHang) {
        this.loaiThe = loaiThe;
        this.tenNganHang = tenNganHang;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public String getTenNganHang() {
        return tenNganHang;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }
    
}
