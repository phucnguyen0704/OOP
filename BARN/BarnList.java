package BARN;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import INTERFACE.chucnang;


public class BarnList implements chucnang<Barn> {
    public ArrayList<Barn> BarnLists;

    public BarnList() {
        this.BarnLists = new ArrayList<Barn>();
    }

    public BarnList(ArrayList<Barn> BarnLists) {

        this.BarnLists = BarnLists;
    }

    @Override
    public void add(Barn Barn) {
        this.BarnLists.add(Barn);
    }

    @Override
    public void Show() {
        System.out.println(String.format("%-12s %-20s %-15s %-15s %-15s", "Ma chuong",
                "Ten chuong", "Suc chua", "Vi tri", "Trang thai hien tai"));
        for (Barn Barn : BarnLists) {
            System.out.println(Barn.toString());
        }
    }

    @Override
    public void remove(String BarnID) {
        for (int i = 0; i < BarnLists.size(); i++) {
            Barn Barn = BarnLists.get(i);
            if (Barn.getBarnID().equals(BarnID)) {
                BarnLists.remove(Barn);
                System.out.println("Employee removed successfully!");
                break;
            }
        }
    }

    @Override
    public void Search(String BarnID) {
        int count = 0;
        for (Barn Barn : BarnLists) {
            if (Barn.getBarnID().indexOf(BarnID) >= 0) {
                System.out.println(Barn.toString());
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
    public void edit(String BarnID) {
        Scanner input = new Scanner(System.in);
        for (Barn Barn : BarnLists) {
            if (Barn.getBarnID().equals(BarnID)) {
                String s[] = new String[100];
                System.out.println("Nhap ma chuong trai: ");
                s[0] = input.nextLine();

                System.out.println("Nhap ten chuong trai: ");
                s[1] = input.nextLine();

                System.out.println("Nhap suc chua: ");
                s[2] = input.nextLine();
                int s2 = Integer.parseInt(s[2]);

                System.out.println("Nhap vi tri: ");
                s[3] = input.nextLine();

                System.out.println("Nhap so luong hien tai: ");
                s[4] = input.nextLine();
                int s4 = Integer.parseInt(s[4]);

                Barn.setBarnID(s[0]);
                Barn.setBarnName(s[1]);
                Barn.setCapacity(s2);
                Barn.setLocation(s[3]);
                Barn.setSoLuongHienTai(s4);

                this.Show();

                break;
            }
        }
    }
    

    @Override
    public void export() {
        try {
            PrintWriter pw = new PrintWriter("BARN/BarnList.txt", "UTF-8");
            for (Barn Barn : BarnLists) {
                pw.println("Ma chuong trai: " + Barn.getBarnID());
                pw.println("Ten chuong trai: " + Barn.getBarnName());
                pw.println("Suc chua: " + Barn.getCapacity());
                pw.println("Vi tri: " + Barn.getLocation());
                pw.println("Trang thai hien tai: "+Barn.TrangThaiHienTai());
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
        File file = new File("BARN/DBBL.txt");
        try (BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu bởi dấu phẩy
                String[] data = line.split(",");

                String BarnName = data[0].trim();
                String TypeofBarn = data[1].trim();
                int Capacity = Integer.parseInt(data[2].trim());
                String Location = data[3].trim();

                Barn barn = null;
                switch (TypeofBarn) {
                    case "Chuong Bo":
                        barn = new CowBarn(BarnName, TypeofBarn, Capacity, Location);
                        break;
                    case "Chuong Ga":
                        barn = new ChickBarn(BarnName, TypeofBarn, Capacity, Location);
                        break;
                    case "Chuong Lon":
                        barn = new PigBarn(BarnName, TypeofBarn, Capacity, Location);
                        break;
                    default:
                        System.out.println("Loai chuong trai khong hop le: " + TypeofBarn);
                        continue;
                }

                // Thêm đối tượng vào danh sách
                BarnLists.add(barn);
            }
        } catch (Exception e) {
            System.out.println("Khong doc duoc");
        }
    }
}
