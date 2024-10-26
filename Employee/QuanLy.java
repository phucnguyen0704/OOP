package EMPLOYEE;

import FARM.ChuongTrai;

public class QuanLy extends Employees {
    private String KhuVucQuanLy;

    public QuanLy() {

    }

    public QuanLy(String MaNV, String HoTen, String NgaySinh, String GioiTinh, String ChucVu, String KhuVucQuanLy) {
        super(MaNV, HoTen, NgaySinh, GioiTinh, ChucVu);
        this.KhuVucQuanLy = KhuVucQuanLy;
    }

    public void setKhuVucQuanLy(String KhuVucQuanLy) {
        this.KhuVucQuanLy = KhuVucQuanLy;
    }

    public String getKhuVucQuanLy() {
        return KhuVucQuanLy;
    }
}
