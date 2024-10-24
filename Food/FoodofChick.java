package Food;

public class FoodofChick extends Foods{
    private String Status;

    public FoodofChick() {

    }
    
    public FoodofChick(String maFood, String name, String LoaiThucAn, int SoLuong, String Status) {
        super(maFood, name, LoaiThucAn, SoLuong);
        this.Status = Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    @Override
    public String CheckStatusFood() {
        return getStatus();
    }

    @Override
    public String toString() {
        return String.format("%s        %s      %s      %d      %s", maFood, name, LoaiThucAn, SoLuong,
                CheckStatusFood());
    }
    
    public static void main(String[] args) {
        FoodofChick ch= new FoodofChick("123", "co", "Bo", 10, "tuoi");
        ch.toString();
        System.out.println(ch.toString());
    }
}
