package ANIMAL;

import FOOD.FoodofPig;
public class Pig extends Animals{
    private int SanLuongThit;
    private FoodofPig food;

    public Pig() {

    }

    public Pig(String name, String maVN, String LoaiVN, int TrongLuong,int SoLuong, int SanLuongThit) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SanLuongThit = SanLuongThit;
        this.food = null;
    }

    public Pig(String name, String maVN, String LoaiVN, int TrongLuong,int SoLuong, int SanLuongThit, FoodofPig food) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SanLuongThit = SanLuongThit;
        this.food = food;
    }

    public void setSanLuongThit(int SanLuongThit) {
        this.SanLuongThit = SanLuongThit;
    }
    @Override
    public int getSanLuongThit() {
        return SanLuongThit;
    }

    public String toString() {
        if (food != null && getLoaiVN() == food.getLoaiThucAn()) {
            return String.format("%s        %s      %s      %s      %d      %d      %d", maVN, name, LoaiVN,
                    food.getLoaiThucAn(), TrongLuong, SoLuong, SanLuongThit);
        } else if(food !=null){
            return String.format("%s        %s      %s      %s      %d      %d      %d", maVN, name, LoaiVN, " ", TrongLuong, SoLuong, SanLuongThit);
        }
        else {
            return String.format("%s        %s      %s      %s      %d      %d      %d", maVN, name, LoaiVN, " ", TrongLuong, SoLuong, SanLuongThit);
        }
    }
}
