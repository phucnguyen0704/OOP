package FOOD;

public class FoodofPig extends Foods {
    private String Status;

    public FoodofPig() {

    }

    public FoodofPig(String maFood, String name, String Loai, int SoLuong, String Status) {
        super(maFood, name, Loai, SoLuong);
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
        return Status;
    }
}
