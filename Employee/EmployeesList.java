package EMPLOYEE;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import INTERFACE.chucnang;

public class EmployeesList implements chucnang<Employees> {
    public ArrayList<Employees> EmployeesLists;

    public EmployeesList() {
        this.EmployeesLists = new ArrayList<Employees>();
    }

    public EmployeesList(ArrayList<Employees> EmployeesLists) {

        this.EmployeesLists = EmployeesLists;
    }

    @Override
    public void add(Employees employees) {
        this.EmployeesLists.add(employees);
    }

    @Override
    public void Show() {
        System.out.println(String.format("%-12s %-20s %-15s %-15s %-15s %-15s", "Ma nhan vien",
                "Ho va ten", "Ngay sinh", "Gioi tinh", "Chuc vu", "Khu vuc lam viec"));
        for (Employees Employees : EmployeesLists) {
            System.out.println(Employees.toString());
        }
    }

    @Override
    public void remove(String EmployeeID) {
        for (int i = 0; i < EmployeesLists.size(); i++) {
            Employees employees = EmployeesLists.get(i);
            if (employees.getEmployeeID().equals(EmployeeID)) {
                EmployeesLists.remove(employees);
                System.out.println("Employee removed successfully!");
                break;
            }
        }
    }

    @Override
    public void Search(String EmployeeID) {
        int count = 0;
        for (Employees Employees : EmployeesLists) {
            if (Employees.getEmployeeID().indexOf(EmployeeID) >= 0) {
                System.out.println(Employees.toString());
                count++;
            } else {
                System.out.println();
            }
        }
        if (count == 0) {
            System.out.println("Employee was not found.");
        }
    }

    @Override
    public void edit(String EmployeeID) {
        Scanner input = new Scanner(System.in);
        for (Employees Employees : EmployeesLists) {
            if (Employees.getEmployeeID().equals(EmployeeID)) {
                String s[] = new String[100];
                System.out.println("Nhap ma nhan vien: ");
                s[0] = input.nextLine();

                System.out.println("Nhap ten nhan vien: ");
                s[1] = input.nextLine();

                System.out.println("Nhap ngay sinh: ");
                s[2] = input.nextLine();

                System.out.println("Nhap gioi tinh: ");
                s[3] = input.nextLine();

                System.out.println("Nhap chuc vu: ");
                s[4] = input.nextLine();

                System.out.println("Nhap khu vuc lam viec: ");
                s[5] = input.nextLine();

                

                Employees.setEmployeeID(s[0]);
                Employees.setFullName(s[1]);
                Employees.setDateofBirth(s[2]);
                Employees.setPosition(s[4]);
                Employees.setGender(s[3]);
                Employees.setWorkPlace(s[5]);

                this.Show();

                break;
            }
        }
    }

    @Override
    public void export() {
        try {
            PrintWriter pw = new PrintWriter("EMPLOYEE/EmployeeList.txt", "UTF-8");
            for (Employees Employees : EmployeesLists) {
                pw.println("Ma nhan vien: " + Employees.getEmployeeID());
                pw.println("Ho va ten: " + Employees.getFullName());
                pw.println("Ngay sinh: " + Employees.getDateofBirth());
                pw.println("Gioi tinh: " + Employees.getGender());
                pw.println("Chuc vu: " + Employees.getPosition());
                pw.println("Khu vuc lam viec: " + Employees.getWorkPlace());
                pw.println();
            }
            pw.flush();
            ;
            pw.close();
        } catch (Exception e) {
            System.err.println("Khong the xuat du lieu");
        }
    }

    @Override
    public void Import() {
        File file = new File("EMPLOYEE/DBEL.txt");
        try (BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu bởi dấu phẩy
                String[] data = line.split(",");

                String name = data[0].trim();
                String DateofBirth = data[1].trim();
                String Gender = data[2].trim();
                String Position = data[3].trim();
                String WorkPlace = data[4].trim();

                // Tạo đối tượng Employees dựa trên Chuc vu
                Employees employees = null;
                switch (Position) {
                    case "Nhan Vien":
                        employees = new NhanVien(name, DateofBirth, Gender, Position, WorkPlace);
                        break;
                    case "Quan Ly":
                        employees = new QuanLy(name, DateofBirth, Gender, Position, WorkPlace);
                        break;
                    // Thêm các loại vật nuôi khác nếu cần
                    default:
                        System.out.println("Loai vat nuoi khong hop le: " + Position);
                        continue; // Bỏ qua nếu loại vật nuôi không hợp lệ
                }

                // Thêm đối tượng vào danh sách
                EmployeesLists.add(employees);
            }
        } catch (Exception e) {
        }
    }
}
