package BARN;

public abstract class Barn {
    protected String BarnID;
    protected String BarnName;
    protected int Capacity;
    protected String Location;

    public Barn() {

    }

    public Barn(String BarnName, int Capacity, String Location) {
        this.BarnID = createBarnID();
        this.BarnName = BarnName;
        this.Capacity = Capacity;
        this.Location = Location;
    }

    public void setBarnID(String BarnID) {
        this.BarnID = BarnID;
    }

    public void setBarnName(String BarnName) {
        this.BarnName = BarnName;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getBarnID() {
        return BarnID;
    }

    public String getBarnName() {
        return BarnName;
    }

    public int getCapacity() {
        return Capacity;
    }

    public String getLocation() {
        return Location;
    }

    public abstract String TrangThaiHienTai();

    public abstract String createBarnID();

    public abstract void setSoLuongHienTai(int SoLuongHienTai);

    public String toString() {
        return String.format("%-14s %-20s %-15d %-15s", getBarnID(), BarnName, Capacity, Location);
    }
}
