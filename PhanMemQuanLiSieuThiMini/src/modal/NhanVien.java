package modal;

public class NhanVien {
    private String tenDangNhap;
    private String matKhau;
    private String idNhanVien;
    private String idBoPhan;
    private String hoTen;
    private String gioiTinh;
    private String soDienThoai;
    private String tenBoPhan;

    public NhanVien() {
    }
    
    public NhanVien(String tenDangNhap, String matKhau, String idNhanVien, String idBoPhan, String hoTen, String gioiTinh, String soDienThoai, String tenBoPhan) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.idNhanVien = idNhanVien;
        this.idBoPhan = idBoPhan;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.tenBoPhan = tenBoPhan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdBoPhan() {
        return idBoPhan;
    }

    public void setIdBoPhan(String idBoPhan) {
        this.idBoPhan = idBoPhan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    
}
