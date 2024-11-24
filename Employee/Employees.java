package EMPLOYEE;

public abstract class Employees {
    protected String EmployeeID;
    protected String FullName;
    protected String DateofBirth;
    protected String Gender;
    protected String Position;

    public Employees() {

    }
    
    public Employees(String FullName, String DateofBirth, String Gender, String Position) {
        this.EmployeeID = createEmployeeID();
        this.FullName = FullName;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
        this.Position = Position;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getFullName() {
        return FullName;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public String getGender() {
        return Gender;
    }

    public String getPosition() {
        return Position;
    }

    public abstract String getWorkPlace();

    public abstract void setWorkPlace(String WorkPlace);

    public abstract String createEmployeeID();

    @Override
    public String toString() {
        return String.format("%-14s %-20s %-15s %-15s %-15s %-15s", getEmployeeID(), FullName, DateofBirth, Gender, Position, getWorkPlace());
    }    
}
