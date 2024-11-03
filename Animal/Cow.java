package ANIMAL;

import FOOD.Grass;

public class Cow extends Animals{
    private int SanLuongSua;
    private Grass grass;

    public Cow() {

    }
    
    public Cow(String maVN, String name, String LoaiVN, int TrongLuong, int SoLuong, int SanLuongSua, Grass grass) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SanLuongSua = SanLuongSua;
        this.grass = grass;
    }
    
    public Cow(String maVN, String name, String LoaiVN, int TrongLuong,int SoLuong, int SanLuongSua) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SanLuongSua = SanLuongSua;
        this.grass = null;
    }

    public void setSanLuongSua(int SanLuongSua) {
        this.SanLuongSua = SanLuongSua;
    }

    public int getSanLuongSua() {
        return SanLuongSua;
    }

    

    @Override
    public String toString() {
        if (grass != null && getLoaiVN() == grass.getLoaiThucAn()) {
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN,
                    grass.getLoaiThucAn(), TrongLuong, SoLuong);
        } else if(grass !=null){
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN, " ", TrongLuong, SoLuong);
        }
        else {
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN, " ", TrongLuong, SoLuong);
        }
    }

     public static void main(String[] args) {
        Grass grass = new Grass("123", "co", "Trau", 10, "tuoi");
        Cow cow = new Cow("Bo sua", "BO123", "Bo", 100, 10, 1000, grass);

        cow.toString();
        System.out.println(cow.toString());
    }
}
