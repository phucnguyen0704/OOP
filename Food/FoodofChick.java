package FOOD;

public class FoodofChick extends Foods{
    private String Status;
    private static int count = 1;

    public FoodofChick() {

    }
    
    public FoodofChick(String name, String TypeofFood, int Quantity, String Status) {
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
        return "FCH" + (count++);
    }

    @Override
    public String toString() {
        return String.format("%-14s %-20s %-15s %-15d %-15s", getFoodID(), name, TypeofFood, Quantity, getStatus());
    }
}
