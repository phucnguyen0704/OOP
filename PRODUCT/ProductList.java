package PRODUCT;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import INTERFACE.chucnang;

public class ProductList implements chucnang<Product> {
    private ArrayList <Product> ProductList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public ProductList() {
        this.ProductList = new ArrayList<>();
    }



    public ProductList(ArrayList<Product> productList) {
        ProductList = productList;
    }

    @Override
    public void add(Product product) {
        ProductList.add(product);
    }

    @Override
    public void Search(String id) {
        if(ProductList.isEmpty()){
            System.out.println("Danh sach san pham trong, ProducrList is Empty!");
            return;
        }
        boolean search = false;
        for (Product product : ProductList) {
            if(product.getProductID().indexOf(id) >= 0)
            System.out.println(product.toString());
            search = true;
        }
        if(!search) System.out.println("Khong tim thay san pham theo IdProduct!");
    }

    @Override
    public void Show() {
        if(ProductList.isEmpty()){
            System.out.println("Danh sach san pham trong, ProducrList is Empty!");
            return;
        }
        for (Product product : ProductList) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void remove(String id) {
        if(ProductList.isEmpty()){
            System.out.println("Danh sach san pham trong, ProducrList is Empty!");
            return;
        }
        for(int i = 0; i < ProductList.size(); i++){
            if(ProductList.get(i).getProductID().equalsIgnoreCase(id)){
                ProductList.remove(i);
                System.out.println("Da xoa thanh cong san pham(Product)");
                return;
            }
        }
        System.out.println("Khong tim thay IdProduct!");
    }

    @Override
    public void edit(String id) {
        for (Product product : ProductList) {
            if (product.getProductID().equals(id)) {
                System.out.print("Nhap ma san pham ma ban can sua, IdProduct: ");

                product.setProductID(sc.nextLine());
                System.out.print("Nhap ten san pham ma ban can sua, NameProduct: ");
                product.setName(sc.nextLine());

                System.out.println("Nhap loai san pham ma ban can sua, TypeofProduct: ");
                product.setTypeofProduct(sc.nextLine());

                System.out.println("Nhap so luong san pham ma ban can sua, Quantity: ");
                product.setQuantity(sc.nextInt());
                sc.nextLine();

                System.out.println("Nhap han su dung ma ban can chinh sua, ExpiredDate: ");
                product.setExpiredDate(sc.nextLine());

                System.out.println("Da sua san pham (Product) thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay san pham ma ban muon sua theo Idproduct!");
    }



    @Override
    public void export() {
         try {
            PrintWriter pw = new PrintWriter("PRODUCT/ProductList.txt", "UTF-8");
            for (Product product : ProductList) {
                pw.println("Ma san pham: " + product.getProductID());
                pw.println("Ten san pham: " + product.getName());
                pw.println("Loai san pham: " + product.getTypeofProduct());
                pw.println("So luong: " + product.getQuantity());
                pw.println("Han su dung: " + product.getExpiredDate());
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
        File file = new File("PRODUCT/DBPL.txt");
        try (BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu bởi dấu phẩy
                String[] data = line.split(",");

                // Giả sử thứ tự các thông tin là: mã, tên, loại, trọng lượng, số lượng
                String name = data[0].trim();
                String TypeofProduct = data[1].trim();
                int Quantity = Integer.parseInt(data[2].trim());
                String ExpiredDate = data[3].trim();

                Product product = new Product(name, TypeofProduct, Quantity, ExpiredDate);
                

                // Thêm đối tượng vào danh sách
                ProductList.add(product);
            }
        } catch (Exception e) {  
        }     
    }
    
    
}
