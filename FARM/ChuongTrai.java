package FARM;



public abstract class ChuongTrai {
    protected String MaChuong;
    protected String TenChuong;
    protected int SucChua;
    protected String ViTri;

    public ChuongTrai() {

    }
    
    public ChuongTrai(String MaChuong, String TenChuong, int SucChua, String ViTri) {
        this.MaChuong = MaChuong;
        this.TenChuong = TenChuong;
        this.SucChua = SucChua;
        this.ViTri = ViTri;
    }

    public void setMaChuong(String MaChuong) {
        this.MaChuong = MaChuong;
    }

    public void setTenChuong(String TenChuong) {
        this.TenChuong = TenChuong;
    }

    public void setSucChua(int SucChua) {
        this.SucChua = SucChua;
    }

    public void setViTri(String ViTri) {
        this.ViTri = ViTri;
    }

    public String getMaChuong() {
        return MaChuong;
    }

    public String getTenChuong() {
        return TenChuong;
    }

    public int getSucChua() {
        return SucChua;
    }

    public String getViTri() {
        return ViTri;
    }

    


    public abstract String TrangThaiHienTai();

    public String toString() {
        return String.format("%s        %s      %d     %s", MaChuong, TenChuong, SucChua, ViTri);
    }
}
