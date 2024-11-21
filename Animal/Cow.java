package ANIMAL;

import FOOD.Grass;

public class Cow extends Animals {
    private int SanLuongSua = 7000;
    private Grass grass;

    public Cow() {

    }

    public Cow(String maVN, String name, String LoaiVN, int TrongLuong, int SoLuong, Grass grass) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.grass = grass;
    }

    public Cow(String maVN, String name, String LoaiVN, int TrongLuong, int SoLuong) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.grass = null;
    }

    public int getSanLuongSua() {
        return SanLuongSua * SoLuong;
    }


    @Override
    public String toString() {
        if (grass != null && getLoaiVN() == grass.getLoaiThucAn()) {
            return String.format("%-10s %-15s %-10s %-12s %-10s %-10d %-10d %-10d %-10d", maVN, name, LoaiVN,
                    grass.getLoaiThucAn(), TrongLuong, SoLuong, getSanLuongSua(),"X", getSanLuongThit());
        } else if (grass != null) {
            return String.format("%-10s %-15s %-10s %-12s %-15d %-10d %-10d %-10s %-10d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong, getSanLuongSua(), "X", getSanLuongThit());
        } else {
            return String.format(" %-14s %-20s %-15s %-15s %-15d %-15d %-20d %-20s %-20d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong, getSanLuongSua(),"X", getSanLuongThit());
        }
    }

    
    // public static void main(String[] args) {
    //     Grass grass = new Grass("123", "co", "Trau", 10, "tuoi");
    //     Cow cow = new Cow("Bo sua", "BO123", "Bo", 100, 100, grass);

    //     cow.toString();
    //     System.out.println(cow.toString());
    // }
}
