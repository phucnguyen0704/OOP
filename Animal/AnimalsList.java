package ANIMAL;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import INTERFACE.chucnang;

public class AnimalsList implements chucnang<Animals> {
    public ArrayList<Animals> AnimalsLists;

    public AnimalsList() {
        this.AnimalsLists = new ArrayList<Animals>();
    }

    public AnimalsList(ArrayList<Animals> AnimalsLists) {

        this.AnimalsLists = AnimalsLists;
    }

    @Override
    public void add(Animals Animals) {
        this.AnimalsLists.add(Animals);
    }

    @Override
    public void Show() {
        System.out.println(String.format("%-12s %-20s %-15s %-20s %-15s %-15s %-20s %-20s %-20s", "Ma Vat Nuoi",
                "Ten Vat Nuoi", "Loai Vat Nuoi", "Loai thuc an", "Trong luong(kg)", "So luong(con)", "San luong Sua(l)",
                "So Luong Trung", "San luong Thit(kg)"));
        for (Animals animals : AnimalsLists) {
            System.out.println(animals.toString());
        }
    }

    @Override
    public void remove(String ANId) {
        for (int i = 0; i < AnimalsLists.size(); i++) {
            Animals animal = AnimalsLists.get(i);
            if (animal.getANId().equals(ANId)) {
                AnimalsLists.remove(animal);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }

    @Override
    public void Search(String ANId) {
        for (Animals animals : AnimalsLists) {
            if (animals.getANId().indexOf(ANId) >= 0) {
                System.out.println(animals.toString());
            }
        } 
    }

    @Override
    public void edit(String ANId) {
        Scanner input = new Scanner(System.in);
        for (Animals animals : AnimalsLists) {
            if (animals.getANId().equals(ANId)) {
                String s[] = new String[100];
                System.out.println("Nhap ma vat nuoi: ");
                s[0] = input.nextLine();

                System.out.println("Nhap ten vat nuoi: ");
                s[1] = input.nextLine();

                System.out.println("Nhap Loai thuc an: ");
                s[2] = input.nextLine();

                System.out.println("Nhap trong luong vat nuoi(kg): ");
                s[3] = input.nextLine();

                System.out.println("Nhap so luong vat nuoi: ");
                s[4] = input.nextLine();

                int s3 = Integer.parseInt(s[3]);
                int s4 = Integer.parseInt(s[4]);

                animals.setANId(s[0]);
                animals.setName(s[1]);
                animals.setTypeofFood(s[2]);
                animals.setWeight(s3);
                animals.setQuantity(s4);

                this.Show();

                break;
            }
        }
    }

    @Override
    public void export() {
        try {
            PrintWriter pw = new PrintWriter("ANIMAL/AnimalList.txt", "UTF-8");
            for (Animals animals : AnimalsLists) {
                pw.println("Ma vat nuoi: " + animals.getANId());
                pw.println("Ten vat nuoi: " + animals.getname());
                pw.println("Loai vat nuoi: " + animals.getType());
                pw.println("Trong luong vat nuoi (kg): " + animals.getWeight());
                pw.println("So luong vat nuoi (con): " + animals.getQuantity());
                pw.println("San luong thit cua vat nuoi (kg): " + animals.getQuantityMeat());
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
        File file = new File("ANIMAL/DBAL.txt");
        try (BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu bởi dấu phẩy
                String[] data = line.split(",");

                // Giả sử thứ tự các thông tin là: mã, tên, loại, trọng lượng, số lượng
                String name = data[0].trim();
                String Type = data[1].trim();
                int Weight = Integer.parseInt(data[2].trim());
                int Quantity = Integer.parseInt(data[3].trim());

                // Tạo đối tượng Animals dựa trên loại vật nuôi
                Animals animal = null;
                switch (Type) {
                    case "Bo":
                        animal = new Cow(name, Type, Weight, Quantity);
                        break;
                    case "Ga":
                        animal = new Chicken(name, Type, Weight, Quantity);
                        break;
                    // Thêm các loại vật nuôi khác nếu cần
                    default:
                        System.out.println("Loai vat nuoi khong hop le: " + Type);
                        continue; // Bỏ qua nếu loại vật nuôi không hợp lệ
                }

                // Thêm đối tượng vào danh sách
                AnimalsLists.add(animal);
            }
        } catch (Exception e) {
        }
    }

}
