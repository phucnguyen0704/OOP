package FARM;

import EMPLOYEE.NhanVien;

public class ChuongBo extends ChuongTrai {
    private int SoLuongHienTai;
    NhanVien nv;

    public ChuongBo() {

    }

    public ChuongBo(String MaChuong, String TenChuong, int SucChua, String ViTri, int SoLuongHienTai, NhanVien nv) {
        super(MaChuong, TenChuong, SucChua, ViTri);
        this.SoLuongHienTai = SoLuongHienTai;
        this.nv = nv;
    }

    public void setNhanVien(NhanVien nv) {
        this.nv = nv;
    }

    public ChuongBo(String MaChuong, String TenChuong, int SucChua, String ViTri, int SoLuongHienTai) {
        super(MaChuong, TenChuong, SucChua, ViTri);
        this.SoLuongHienTai = SoLuongHienTai;
        this.nv = null;
    }

    @Override
    public String TrangThaiHienTai() {
        if (SucChua < SoLuongHienTai) {
            return String.format("Chuong qua tai");
        } else if (SucChua > SoLuongHienTai) {
            return String.format("Chuong con trong cho");
        } else {
            return String.format("Chuong vua du cho");
        }
    }

    @Override
    public String toString() {
        if (nv != null && getMaChuong() == nv.getKhuVucLamViec()) {
            return String.format("%s        %s          %d          %s          %d              %s      %s", MaChuong,
                    TenChuong, SucChua,
                    ViTri, SoLuongHienTai, TrangThaiHienTai(), nv.getHoTen());
        } else if (nv != null) {
            return String.format("%s        %s          %d          %s          %d              %s      %s", MaChuong,
                    TenChuong, SucChua,
                    ViTri, SoLuongHienTai, TrangThaiHienTai(), " ");
        } else {
            return String.format("%s        %s          %d          %s          %d              %s      %s", MaChuong,
                    TenChuong, SucChua,
                    ViTri, SoLuongHienTai, TrangThaiHienTai(), " ");
        }
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("NV01", "Nguyen Phuc", "07/04/2004", null, null, "CB01");
        ChuongBo Chuong1 = new ChuongBo("CB01", "CB01", 10, "jdfnjsdf", 9);
        Chuong1.toString();

        System.out.println(
                String.format("%s        %s      %s      %s      %s      %s      %s", "Ma Chuong", "Ten Chuong",
                        "Suc Chua", "Vi tri", "So luong hien tai", "Trang thai hien tai", "Nhan vien cham soc"));
        System.out.println(Chuong1.toString());

        Chuong1.setNhanVien(nv1);
        System.out.println(Chuong1.toString());

    }
}
