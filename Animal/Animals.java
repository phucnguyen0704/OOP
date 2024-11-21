package ANIMAL;


public abstract class Animals {
    protected String name;
    protected String maVN;
    protected String LoaiVN;
    protected int TrongLuong;
    protected int SoLuong;

    public Animals() {

    }

    public Animals(String name, String maVN, String LoaiVN, int TrongLuong, int SoLuong) {
        this.name = name;
        this.maVN = maVN;
        this.LoaiVN = LoaiVN;
        this.TrongLuong = TrongLuong;
        this.SoLuong = SoLuong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaVN(String maVN) {
        this.maVN = maVN;
    }

    public void setLoaiVN(String LoaiVN) {
        this.LoaiVN = LoaiVN;
    }

    public void setTrongLuong(int TrongLuong) {
        this.TrongLuong = TrongLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getname() {
        return name;
    }

    public String getmaVN() {
        return maVN;
    }

    public String getLoaiVN() {
        return LoaiVN;
    }

    public int getTrongLuong() {
        return TrongLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }
    // public abstract String Status();
    public int getSanLuongThit() {
        return (TrongLuong-20) * SoLuong;
    }

    @Override
    public String toString() {
        return String.format("%s        %s      %s      %d      %d", maVN, name, LoaiVN, TrongLuong, SoLuong);
    }

    public String toStringExport() {
        return String.format("%s        %s      %s      %d      %d", maVN, name, LoaiVN, TrongLuong, SoLuong);
    }
    
}