package FOOD;

public abstract class Foods {
    protected String FoodID;
    protected String name;
    protected String TypeofFood;
    protected int Quantity;

    public Foods() {

    }

    public Foods(String name, String TypeofFood, int Quantity) {
        this.FoodID = createFoodID();
        this.name = name;
        this.TypeofFood = TypeofFood;
        this.Quantity = Quantity;
    }

    public void setFoodID(String FoodID) {
        this.FoodID = FoodID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeofFood(String TypeofFood) {
        this.TypeofFood = TypeofFood;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getFoodID() {
        return FoodID;
    }

    public String getName() {
        return name;
    }

    public String getTypeofFood() {
        return TypeofFood;
    }

    public int getQuantity() {
        return Quantity;
    }

    public abstract String createFoodID();

    public abstract void setStatus(String Status);

    public abstract String getStatus();

    public String toString() {
        return String.format("%-14s %-20s %-15s %-15d %-15s", getFoodID(), name, TypeofFood, Quantity, getStatus());
    }
}
