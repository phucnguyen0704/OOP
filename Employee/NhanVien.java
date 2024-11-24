package EMPLOYEE;



public class NhanVien extends Employees {
    private String WorkPlace;
    private static int count = 1;

    public NhanVien() {

    }
    
    public NhanVien(String FullName, String DateofBirth, String Gender, String Position, String WorkPlace) {
        super(FullName, DateofBirth, Gender, Position);
        this.WorkPlace = WorkPlace;
    }

    @Override
    public void setWorkPlace(String WorkPlace) {
        this.WorkPlace = WorkPlace;
    }

    @Override
    public String getWorkPlace() {
        return WorkPlace;
    }

    @Override
    public String createEmployeeID() {
        return "NV"+(count++);
    }
}
