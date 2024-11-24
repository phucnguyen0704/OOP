package FOOD;

public class FoodofPig extends Foods {
    private String Status;
    private static int count = 1;

    public FoodofPig() {

    }

    public FoodofPig(String name, String TypeofFood, int Quantity, String Status) {
        super(name, TypeofFood, Quantity);
        this.Status = Status;
    }

   
    @Override
    public String getStatus() {
        return Status;
    }

    @Override
    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String createFoodID() {
        return "FOP" + (count++);
    }

    @Override
    public String toString() {
        return String.format("%-14s %-20s %-15s %-15d %-15s", getFoodID(), name, TypeofFood, Quantity, getStatus());
    }
   
}
