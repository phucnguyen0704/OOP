package Food;

public class Grass extends Foods {
    private String Status;

    public Grass() {

    }

    public Grass(String maFood, String name, String LoaiThucAn, int SoLuong, String Status) {
        super(maFood, name, LoaiThucAn, SoLuong);
        this.Status = Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    @Override
    public String CheckStatusFood() {
        return getStatus();
    }

    @Override
    public String toString() {
        return String.format("%s        %s      %s      %d      %s", maFood, name, LoaiThucAn, SoLuong, CheckStatusFood());
    }

    public static void main(String[] args) {
        Grass gr = new Grass("123", "co", "Bo", 10, "tuoi");
        gr.toString();
        System.out.println(gr.toString());
    }
}


