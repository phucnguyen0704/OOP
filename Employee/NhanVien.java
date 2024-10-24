package Employee;



public class NhanVien extends Employees {
    private String KhuVucLamViec;

    public NhanVien() {

    }
    
    public NhanVien(String MaNV, String HoTen, String NgaySinh, String GioiTinh, String ChucVu, String KhuVucLamViec) {
        super(MaNV, HoTen, NgaySinh, GioiTinh, ChucVu);
        this.KhuVucLamViec = KhuVucLamViec;
    }

    public void setKhuVucLamViec(String KhuVucLamViec) {
        this.KhuVucLamViec = KhuVucLamViec;
    }

    public String getKhuVucLamViec() {
        return KhuVucLamViec;
    }
}
