package ANIMAL;

public class Chicken extends Animals {
    private int QuantityEggs = 100;
    private String TypeofFood = "Thuc an ga C235";
    private static int count = 1;

    public Chicken() {

    }

    public Chicken(String name, String Type, int Weight, int Quantity) {
        super(name, Type, Weight, Quantity);

    }

    @Override
    public String createAnimalID() {
        return "CHI" + (count++);
    }

    public int getQuantityEggs() {
        return Quantity * QuantityEggs;
    }

    public void setTypeofFood(String TypeofFood) {
        this.TypeofFood = TypeofFood;
    }

    public String getTypeofFood() {
        return TypeofFood;
    }

    @Override
    public float getQuantityMeat() {
        return ((Weight * 85 / 100) * Quantity);
    }

    @Override
    public String toString() {
        return String.format(" %-14s %-20s %-13s %-20s %-15d %-15d %-20s %-20d %-20.2f", getANId(), name, Type,
                getTypeofFood(),
                Weight, Quantity, "X", getQuantityEggs(), getQuantityMeat());
    }
}
