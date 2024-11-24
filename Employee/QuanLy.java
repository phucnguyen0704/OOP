package EMPLOYEE;



public class QuanLy extends Employees {
    private String KhuVucQuanLy;
    private static int count = 1;

    public QuanLy() {

    }

    public QuanLy(String FullName, String DateofBirth, String Gender, String Position, String KhuVucQuanLy) {
        super(FullName, DateofBirth, Gender, Position);
        this.KhuVucQuanLy = KhuVucQuanLy;
    }


    @Override
    public void setWorkPlace(String KhuVucQuanLy) {
        this.KhuVucQuanLy = KhuVucQuanLy;
    }

    public String getWorkPlace() {
        return KhuVucQuanLy;
    }

    @Override
    public String createEmployeeID() {
        return "QL" + (count++);
    }
}
