package ANIMAL;

import FOOD.FoodofChick;

public class Chicken extends Animals{
    private int SoluongTrung;
    private FoodofChick chick;


    public Chicken() {

    }

    public Chicken(String name, String maVN, String LoaiVN, int TrongLuong,int SoLuong, int SoluongTrung) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SoluongTrung = SoluongTrung;
        this.chick = null;
    }
    
    public Chicken(String name, String maVN, String LoaiVN, int TrongLuong,int SoLuong, int SoluongTrung, FoodofChick chick) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SoluongTrung = SoluongTrung;
        this.chick = chick;
    }

    public void setSoLuongTrung(int SoluongTrung) {
        this.SoluongTrung = SoluongTrung;
    }

    public int getSoLuongTrung() {
        return SoluongTrung;
    }

    @Override
    public String toString() {
        if (chick != null && getLoaiVN() == chick.getLoaiThucAn()) {
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN,
                    chick.getLoaiThucAn(), TrongLuong, SoLuong);
        } else if (chick != null) {
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong);
        } 
        else {
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN, " ",
                    TrongLuong, SoLuong);
        }
    }
}
