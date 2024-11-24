package FOOD;

public class FoodofCow extends Foods {
    private String Status;
    private static int count = 1;

    public FoodofCow() {

    }

    public FoodofCow(String name, String TypeofFood, int Quantity, String Status) {
        super(name, TypeofFood, Quantity);
        this.Status = Status;
    }

    @Override
    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String getStatus() {
        return Status;
    }

    @Override
    public String createFoodID() {
        return "FOC" + (count++);
    }


    @Override
    public String toString() {
        return String.format("%-14s %-20s %-15s %-15d %-15s", FoodID, name, TypeofFood, Quantity, getStatus());
    }
}


