package FOOD;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import ANIMAL.Animals;
import ANIMAL.Chicken;
import ANIMAL.Cow;
import INTERFACE.chucnang;

public class FoodList implements chucnang<Foods> {
    public ArrayList<Foods> FoodLists;

    public FoodList() {
        this.FoodLists = new ArrayList<Foods>();
    }

    public FoodList(ArrayList<Foods> FoodLists) {

        this.FoodLists = FoodLists;
    }

    @Override
    public void add(Foods food) {
        this.FoodLists.add(food);
    }

    @Override
    public void Show() {
        System.out.println(String.format("%-12s %-20s %-15s %-15s %-15s", "Ma thuc an",
                "Ten thuc an", "Loai thuc an", "So luong", "Tinh trang"));
        for (Foods food : FoodLists) {
            System.out.println(food.toString());
        }
    }

    @Override
    public void remove(String FoodID) {
        for (int i = 0; i < FoodLists.size(); i++) {
            Foods foods = FoodLists.get(i);
            if (foods.getFoodID().equals(FoodID)) {
                FoodLists.remove(foods);
                System.out.println("Food removed successfully!");
                break;
            } else {
                System.out.println("Don't find Food ID");
                break;
            }
        }
    }

    @Override
    public void Search(String FoodID) {
       
        for (Foods foods : FoodLists) {
            if (foods.getFoodID().indexOf(FoodID) >= 0) {
                System.out.println(foods.toString());
            } else {
                System.out.println("Don't find Food ID");
                break;
            }
        }
        
    }

    @Override
    public void edit(String FoodID) {
        Scanner input = new Scanner(System.in);
        for (Foods foods : FoodLists) {
            if (foods.getFoodID().equals(FoodID)) {
                String s[] = new String[100];
                System.out.println("Nhap ma thuc an: ");
                s[0] = input.nextLine();

                System.out.println("Nhap ten thuc an: ");
                s[1] = input.nextLine();

                System.out.println("Nhap so luong thuc an: ");
                s[3] = input.nextLine();
                int s3 = Integer.parseInt(s[3]);

                System.out.println("Nhap tinh trang thuc an: ");
                s[4] = input.nextLine();

                foods.setFoodID(s[0]);
                foods.setName(s[1]);
                foods.setQuantity(s3);
                foods.setStatus(s[4]);

                this.Show();
                break;
            }
        }
    }

    @Override
    public void export() {
        try {
            PrintWriter pw = new PrintWriter("FOOD/FoodList.txt", "UTF-8");
            for (Foods foods : FoodLists) {
                pw.println("Ma thuc an: " + foods.getFoodID());
                pw.println("Ten thuc an: " + foods.getName());
                pw.println("Loai thuc an: " + foods.getTypeofFood());
                pw.println("So luong: " + foods.getQuantity());
                pw.println("Tinh trang: " + foods.getStatus());
                // pw.println("Khu vuc lam viec: " + Employees.getKhuVucLamViec());
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
        File file = new File("FOOD/DBFL.txt");
        try (BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu bởi dấu phẩy
                String[] data = line.split(",");

                // Giả sử thứ tự các thông tin là: mã, tên, loại, trọng lượng, số lượng
                String name = data[0].trim();
                String TypeofFood = data[1].trim();
                int Quantity = Integer.parseInt(data[2].trim());
                String Status = data[3].trim();

                Foods foods = null;
                switch (TypeofFood) {
                    case "Thuc an cho bo":
                        foods = new FoodofCow(name, TypeofFood, Quantity, Status);
                        break;
                    case "Thuc an cho ga":
                        foods = new FoodofChick(name, TypeofFood, Quantity, Status);
                        break;
                    case "Thuc an cho lon":
                        foods = new FoodofPig(name, TypeofFood, Quantity, Status);
                        break;
                    // Thêm các loại vật nuôi khác nếu cần
                    default:
                        System.out.println("Loai vat nuoi khong hop le: " + TypeofFood);
                        continue; // Bỏ qua nếu loại vật nuôi không hợp lệ
                }

                // Thêm đối tượng vào danh sách
                FoodLists.add(foods);
            }
        } catch (Exception e) {  
        }
    }
}
