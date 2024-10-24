package Food;

public class Foods {
    protected String maFood;
    protected String name;
    protected String LoaiThucAn;
    protected int SoLuong;

    public Foods() {

    }

    public Foods(String maFood, String name, String LoaiThucAn, int SoLuong) {
        this.maFood = maFood;
        this.name = name;
        this.LoaiThucAn = LoaiThucAn;
        this.SoLuong = SoLuong;
    }

    public void setMaFood(String maFood) {
        this.maFood = maFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoaiThucAn(String LoaiThucAn) {
        this.LoaiThucAn = LoaiThucAn;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaFood() {
        return maFood;
    }

    public String getName() {
        return name;
    }

    public String getLoaiThucAn() {
        return LoaiThucAn;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String CheckStatusFood() {
        return "";
    }

    public String toString() {
        return String.format("%s        %s      %s      %d", maFood, name, LoaiThucAn, SoLuong, CheckStatusFood());
    }
}
