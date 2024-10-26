package EMPLOYEE;

public abstract class Employees {
    protected String MaNV;
    protected String HoTen;
    protected String NgaySinh;
    protected String GioiTinh;
    protected String ChucVu;

    public Employees() {

    }
    
    public Employees(String MaNV, String HoTen, String NgaySinh, String GioiTinh, String ChucVu) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.ChucVu = ChucVu;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

}
