package ANIMAL;

public class Pig extends Animals {
    private String TypeofFood = "Thuc an hon hop BG2";
    private static int count = 1;

    public Pig() {

    }

    public Pig(String name, String Type, int Weight, int Quantity) {
        super(name, Type, Weight, Quantity);
    }

    @Override
    public void setTypeofFood(String TypeofFood) {
        this.TypeofFood = TypeofFood;
    }

    public String getTypeofFood() {
        return TypeofFood;
    }

    @Override
    public float getQuantityMeat() {
        return ((Weight * 75 / 100) * Quantity);
    }

    @Override
    public String createAnimalID() {
        return "PIG" + (count++);
    }

    public String toString() {
        return String.format(" %-14s %-20s %-13s %-20s %-15d %-15d %-20s %-20s %-20.2f", getANId(), name, Type,
                getTypeofFood(),
                Weight, Quantity, "X", "X", getQuantityMeat());
    }
}
