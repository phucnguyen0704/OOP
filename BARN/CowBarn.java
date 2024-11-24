package BARN;

public class CowBarn extends Barn {
    private int SoLuongHienTai;
    private String TypeofBarn;
    private static int count = 1;

    public CowBarn() {
    }

    public CowBarn(String BarnName, String TypeofBarn, int Capacity, String Location) {
        super(BarnName, Capacity, Location);
        this.TypeofBarn = TypeofBarn;

    }

    public String getTypeofBarn() {
        return TypeofBarn;
    }

    public void setTypeofBarn(String TyeofBarn) {
        this.TypeofBarn = TyeofBarn;
    }

    @Override
    public String createBarnID() {
        return "CB" + (count++);
    }

    @Override
    public String TrangThaiHienTai() {
        if (Capacity < SoLuongHienTai) {
            return String.format("Chuong qua tai");
        } else if (Capacity > SoLuongHienTai) {
            return String.format("Chuong con trong cho");
        } else {
            return String.format("Chuong vua du cho");
        }
    }

    @Override
    public void setSoLuongHienTai(int SoLuongHienTai) {
        this.SoLuongHienTai = SoLuongHienTai;
    }

    @Override
    public String toString() {
        return String.format("%-14s %-20s %-15d %-13s %-15s", getBarnID(), BarnName, Capacity, Location,
                TrangThaiHienTai());
    }
}
