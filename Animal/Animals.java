package ANIMAL;

public abstract class Animals {
    protected String name;
    protected String ANId;
    protected String Type;
    protected int Weight;
    protected int Quantity;
    public Animals() {

    }

    public Animals(String name, String Type, int Weight, int Quantity) {
        this.name = name;
        this.Type = Type;
        this.Weight = Weight;
        this.Quantity = Quantity;
        this.ANId = createAnimalID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setANId(String ANId) {
        this.ANId = ANId;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getname() {
        return name;
    }

    public String getANId() {
        return ANId;
    }

    public String getType() {
        return Type;
    }

    public int getWeight() {
        return Weight;
    }

    public int getQuantity() {
        return Quantity;
    }

    public abstract String createAnimalID();

    public float getQuantityMeat() {
        return (Weight - 20) * Quantity;
    }

    public abstract void setTypeofFood(String TypeofFood);

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-10s %-12d %-10d %-10d",getANId(), name, Type, Weight, Quantity);
    }
}