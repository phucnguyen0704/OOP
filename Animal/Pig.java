package ANIMAL;

import FOOD.FoodofPig;
public class Pig extends Animals{
    private int SanLuongThit;
    private FoodofPig food;

    public Pig() {

    }

    public Pig(String name, String maVN, String LoaiVN, int TrongLuong,int SoLuong, int SanLuongThit, FoodofPig food) {
        super(name, maVN, LoaiVN, TrongLuong, SoLuong);
        this.SanLuongThit = SanLuongThit;
        this.food = food;
    }

    public void setSanLuongThit(int SanLuongThit) {
        this.SanLuongThit = SanLuongThit;
    }

    public int getSanLuongThit() {
        return SanLuongThit;
    }

    @Override
    public String toString() {
        if (getLoaiVN() == food.getLoaiThucAn()) {
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN, food.getLoaiThucAn(), TrongLuong, SoLuong);
        } else {
            String loaithucan = "";
            return String.format("%s        %s      %s      %s      %d      %d", maVN, name, LoaiVN, loaithucan, TrongLuong, SoLuong);
        }
    }
}
