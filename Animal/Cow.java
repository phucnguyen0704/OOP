package ANIMAL;

public class Cow extends Animals {
    private int SanLuongSua = 7000;
    private String TypeofFood = " Co voi";
    private static int count = 1;

    public Cow() {

    }

    public Cow(String name, String Type, int Weight, int Quantity) {
        super(name, Type, Weight, Quantity);
    }

    public int getSanLuongSua() {
        return SanLuongSua * Quantity;
    }

    @Override
    public void setTypeofFood(String TypeofFood) {
        this.TypeofFood = TypeofFood;
    }

    public String getTypeofFood() {
        return TypeofFood;
    }

    public float getQuantityMeat() {
        return ((Weight*60/100)*Quantity);
    }

    @Override
    public String createAnimalID() {
        return "COW" + (count++);
    }

    @Override
    public String toString() {
        return String.format(" %-14s %-20s %-13s %-20s %-15d %-15d %-20d %-20s %-20.2f", getANId(), name, Type,
                getTypeofFood(),
                Weight, Quantity, getSanLuongSua(), "X", getQuantityMeat());
    }

}
