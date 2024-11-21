package ANIMAL;

import FOOD.FoodofChick;

public class Chicken extends Animals{
    private int SoluongTrung;
    private FoodofChick chick;


    public Chicken() {

    }

    public Chicken(String maVN, String name, String LoaiVN, int TrongLuong,int SoLuong) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.chick = null;
    }
    
    public Chicken(String maVN, String name, String LoaiVN, int TrongLuong,int SoLuong, FoodofChick chick) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.chick = chick;
    }


    public int getSoLuongTrung() {
        return SoLuong * 100;
    }

    @Override
    public int getSanLuongThit() {
        return TrongLuong * SoLuong;
    }

    @Override
    public String toString() {
        if (chick != null && getLoaiVN() == chick.getLoaiThucAn()) {
            return String.format("%-10s %-15s %-10s %-12s %-10s %-10d %-10s %-10d %-10d", maVN, name, LoaiVN,
                    chick.getLoaiThucAn(), TrongLuong, SoLuong, "X", getSoLuongTrung(), getSanLuongThit());
        } else if (chick != null) {
            return String.format("%-10s %-15s %-10s %-12s %-15d %-10d %-10s %-10d %-10d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong, "X", getSoLuongTrung(), getSanLuongThit());
        } else {
            return String.format("%-14s %-20s %-15s %-15s %-15d %-15d %-20s %-20d %-20d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong, "X", getSoLuongTrung(), getSanLuongThit());
        }
    }
    
    @Override
    public String toStringExport() {
        if (chick != null && getLoaiVN() == chick.getLoaiThucAn()) {
            return String.format("%-10s %-10s %-10s %-10s %-10s %-10d %-10s %-10d %-10d", maVN, name, LoaiVN,
                    chick.getLoaiThucAn(), TrongLuong, SoLuong, "X", getSoLuongTrung(), getSanLuongThit());
        } else if (chick != null) {
            return String.format("%-10s %-15s %-10s %-12s %-15d %-10d %-10s %-10d %-10d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong, "X", getSoLuongTrung(), getSanLuongThit());
        } else {
            return String.format("%-14s %-20s %-15s %-15s %-15d %-15d %-20s %-20d %-20d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong, "X", getSoLuongTrung(), getSanLuongThit());
        }
    }
}
