package MANAGE;

import java.io.File;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.*;
import java.awt.*;
import javax.print.DocFlavor.STRING;

import ANIMAL.*;
import BARN.*;
import FOOD.*;
import EMPLOYEE.*;
import PRODUCT.*;

public class MANAGE_FARM {
    public static void add(int n, AnimalsList animalsList, EmployeesList employeesList, FoodList foodList,
            BarnList barnList, ProductList productList, int k) {
        Scanner input = new Scanner(System.in);

        switch (n) {
            // add vat nuoi
            case 1:
                String a[] = new String[100];
                System.out.println("Nhap ten vat nuoi");
                a[0] = input.nextLine();

                System.out.println("Nhap trong luong vat nuoi(kg): ");
                a[1] = input.nextLine();

                System.out.println("Nhap so luong vat nuoi: ");
                a[2] = input.nextLine();

                int a1 = Integer.parseInt(a[1]);
                int a2 = Integer.parseInt(a[2]);

                switch (k) {
                    case 1:
                        Cow Bo = new Cow(a[0], "Cow", a1, a2);
                        animalsList.add(Bo);
                        animalsList.Show();
                        animalsList.export();
                        break;
                    case 2:
                        Chicken Ga = new Chicken(a[0], "Chicken", a1, a2);
                        animalsList.add(Ga);
                        animalsList.Show();
                        animalsList.export();
                        break;
                    case 3:
                        Pig Lon = new Pig(a[0], "Pig", a1, a2);
                        animalsList.add(Lon);
                        animalsList.Show();
                        animalsList.export();
                        break;
                    case 0:
                        break;
                }

                System.out.println();
                break;

            // add thuc an
            case 2:
                String f[] = new String[100];
                System.out.println("Nhap ten thuc an: ");
                f[0] = input.nextLine();

                System.out.println("Nhap so luong: ");
                f[1] = input.nextLine();
                int f1 = Integer.parseInt(f[1]);

                System.out.println("Nhap tinh trang thuc an: ");
                f[2] = input.nextLine();

                switch (k) {
                    case 1:
                        FoodofCow grass = new FoodofCow(f[0], "Thuc an cho bo", f1, f[2]);
                        foodList.add(grass);
                        foodList.Show();
                        foodList.export();
                        break;
                    case 2:
                        FoodofChick foodofChick = new FoodofChick(f[0], "Thuc an cho ga", f1, f[2]);
                        foodList.add(foodofChick);
                        foodList.Show();
                        foodList.export();
                        break;
                    case 3:
                        FoodofPig foodofPig = new FoodofPig(f[0], "Thuc an cho lon", f1, f[2]);
                        foodList.add(foodofPig);
                        foodList.Show();
                        foodList.export();
                        break;
                }
                break;

            // add nhan vien
            case 3:
                String e[] = new String[100];

                System.out.println("Nhap ho va ten nhan vien: ");
                e[0] = input.nextLine();

                System.out.println("Nhap ngay sinh: ");
                e[1] = input.nextLine();

                System.out.println("Nhap gioi tinh: ");
                e[2] = input.nextLine();

                System.out.println("Nhap chuc vu: ");
                e[3] = input.nextLine();

                System.out.println("Nhap khu vuc lam viec: ");
                e[4] = input.nextLine();

                switch (k) {
                    case 1:
                        NhanVien nv = new NhanVien(e[0], e[1], e[2], e[3], e[4]);
                        employeesList.add(nv);
                        employeesList.Show();
                        employeesList.export();
                        break;
                    case 2:
                        QuanLy ql = new QuanLy(e[0], e[1], e[2], e[3], e[4]);
                        employeesList.add(ql);
                        employeesList.Show();
                        employeesList.export();
                        break;
                }

                break;

            // add chuong trai
            case 4:
                String b[] = new String[100];

                System.out.println("Nhap ten chuong: ");
                b[0] = input.nextLine();

                System.out.println("Nhap suc chua: ");
                b[1] = input.nextLine();
                int b1 = Integer.parseInt(b[1]);

                System.out.println("Nhap vi tri: ");
                b[2] = input.nextLine();

                switch (k) {
                    case 1:
                        CowBarn cowBarn = new CowBarn(b[0], "Chuong Bo", b1, b[2]);
                        barnList.add(cowBarn);
                        barnList.Show();
                        barnList.export();
                        break;
                    case 2:
                        ChickBarn chickBarn = new ChickBarn(b[0], "Chuong Ga", b1, b[2]);
                        barnList.add(chickBarn);
                        barnList.Show();
                        barnList.export();
                        break;
                    case 3:
                        PigBarn pigBarn = new PigBarn(b[0], "Chuong Lon", b1, b[2]);
                        barnList.add(pigBarn);
                        barnList.Show();
                        barnList.export();
                        break;
                }
                break;

            // add san pham
            case 5:
                String p[] = new String[100];

                System.out.println("Nhap ten san pham: ");
                p[0] = input.nextLine();

                System.out.println("Nhap loai san pham: ");
                p[1] = input.nextLine();

                System.out.println("Nhap so luong: ");
                p[2] = input.nextLine();
                int p2 = Integer.parseInt(p[2]);

                System.out.println("Nhap han su dung: ");
                p[3] = input.nextLine();

                Product product = new Product(p[0], p[1], p2, p[3]);
                productList.add(product);
                productList.Show();
                productList.export();

                break;
        }
    }

    public static void search(int n, AnimalsList animalsList, EmployeesList employeesList, FoodList foodList,
            BarnList barnList, ProductList productList) {
        Scanner input = new Scanner(System.in);

        switch (n) {
            // Tim vat nuoi
            case 1:
                System.out.println("Nhap ten vat nuoi can tim: ");
                String a = input.nextLine();
                animalsList.Search(a);
                break;

            // Tim Thuc an
            case 2:
                System.out.println("Nhap ma thuc an can tim: ");
                String f = input.nextLine();
                foodList.Search(f);
                break;

            // Tim nhan vien
            case 3:
                System.out.println("Nhap ma nhan vien can tim: ");
                String e = input.nextLine();
                employeesList.Search(e);
                break;

            // Tim chuong trai
            case 4:
                System.out.println("Nhap ma chuong trai can tim: ");
                String b = input.nextLine();
                barnList.Search(b);
                break;

            // Tim san pham
            case 5:
                System.out.println("Nhap ma san pham can tim: ");
                String p = input.nextLine();
                productList.Search(p);
                break;
        }
    }

    public static void edit(int n, AnimalsList animalsList, EmployeesList employeesList, FoodList foodList,
            BarnList barnList, ProductList productList) {
        Scanner input = new Scanner(System.in);
        switch (n) {
            // Sua vat nuoi
            case 1:
                System.out.println("Nhap ma vat nuoi can chinh sua: ");
                String a = input.nextLine();
                animalsList.edit(a);

                break;

            // Sua thuc an
            case 2:
                System.out.println("Nhap ma thuc an can chinh sua: ");
                String f = input.nextLine();
                foodList.edit(f);
                break;

            // Sua nhan vien
            case 3:
                System.out.println("Nhap ma nhan vien can chinh sua: ");
                String e = input.nextLine();
                employeesList.edit(e);
                break;

            // Sua chuong trai
            case 4:
                System.out.println("Nhap ma chuong trai can chinh sua: ");
                String b = input.nextLine();
                barnList.edit(b);
                break;

            // Sua san pham
            case 5:
                System.out.println("Nhap ma san pham can chinh sua: ");
                String p = input.nextLine();
                productList.edit(p);
                break;
        }
    }

    public static void Remove(int n, AnimalsList animalsList, EmployeesList employeesList, FoodList foodList,
            BarnList barnList, ProductList productList) {
        Scanner input = new Scanner(System.in);
        switch (n) {
            // Xoa vat nuoi
            case 1:
                System.out.println("Nhap ma vat nuoi xoa: ");
                String a = input.nextLine();
                animalsList.remove(a);
                break;

            // Xoa thuc an
            case 2:
                System.out.println("Nhap ma thuc an can xoa: ");
                String f = input.nextLine();
                foodList.remove(f);
                break;

            // Xoa nhan vien
            case 3:
                System.out.println("Nhap ma nhan vien can xoa: ");
                String e = input.nextLine();
                employeesList.remove(e);
                break;

            // Xoa chuong trai
            case 4:
                System.out.println("Nhap ma chuong trai can xoa: ");
                String b = input.nextLine();
                barnList.remove(b);
                break;

            // Xoa San pham
            case 5:
                System.out.println("Nhap ma san pham can xoa: ");
                String p = input.nextLine();
                productList.remove(p);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        AnimalsList animalsList = new AnimalsList();
        EmployeesList employeesList = new EmployeesList();
        FoodList foodList = new FoodList();
        BarnList barnList = new BarnList();
        ProductList productList = new ProductList();

        int n, i, k;
        int start = 1;
        animalsList.Import();
        foodList.Import();
        employeesList.Import();
        barnList.Import();
        productList.Import();

        do {
            System.out.println("\n \n       Chao mung ban den voi trang trai");
            System.out.println(String.format("---------------------------------------------"));

            System.out.println("        1. Quan ly vat nuoi");
            System.out.println("        2. Quan ly thuc an");
            System.out.println("        3. Quan ly nhan vien");
            System.out.println("        4. Quan ly chuong trai");
            System.out.println("        5. Quan ly san pham");
            System.out.println("        6. Thoat");
            System.out.println(String.format("---------------------------------------------"));

            System.out.print("          Nhap lua chon cua ban: ");
            n = input.nextInt();

            switch (n) {
                case 1: {
                    do {
                        System.out.println("\n \n \n              Quan ly vat nuoi");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.println("        1. add vat nuoi");
                        System.out.println("        2. Chinh sua thong tin vat nuoi");
                        System.out.println("        3. Xoa thong tin vat nuoi");
                        System.out.println("        4. Tim kiem thong tin vat nuoi");
                        System.out.println("        5. Xuat du lieu vat nuoi");
                        System.out.println("        6. Quay lai");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.print("          Nhap lua chon cua ban: ");
                        i = input.nextInt();
                        switch (i) {
                            case 1: {
                                System.out.println("\n \n \n              add vat nuoi");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.println("        1. Bo");
                                System.out.println("        2. Ga");
                                System.out.println("        3. Lon");
                                System.out.println("        4. Quay lai");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.print("          Nhap lua chon cua ban: ");
                                k = input.nextInt();
                                input.nextLine();
                                switch (k) {
                                    case 1:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 2:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 3:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 4:
                                        break;
                                }
                                break;
                            }
                            case 2:
                                edit(n, animalsList, employeesList, foodList, barnList, productList);
                                break;

                            case 3:
                                Remove(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            case 4:
                                search(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            case 5:
                                animalsList.export();
                                System.out.println("Xuat thanh cong");
                                File file = new File("ANIMAL/AnimalList.txt");
                                Desktop.getDesktop().open(file);
                                break;
                            case 6:
                                i = 0;
                                break;
                        }
                    } while (i != 0);
                    break;
                }
                case 2: {
                    do {
                        System.out.println("\n \n \n              Quan ly thuc an");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.println("        1. add thuc an");
                        System.out.println("        2. Chinh sua thong tin thuc an");
                        System.out.println("        3. Xoa thong tin thuc an");
                        System.out.println("        4. Tim kiem thong tin thuc an");
                        System.out.println("        5. Xuat du lieu thuc an");
                        System.out.println("        6. Quay lai");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.print("          Nhap lua chon cua ban: ");
                        i = input.nextInt();
                        switch (i) {
                            // Them thuc an
                            case 1:
                                System.out.println("\n \n \n              Them thuc an");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.println("        1. Thuc an cho bo");
                                System.out.println("        2. Thuc an cho ga");
                                System.out.println("        3. Thuc an cho lon");
                                System.out.println("        4. Quay lai");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.print("          Nhap lua chon cua ban: ");
                                k = input.nextInt();
                                input.nextLine();
                                switch (k) {
                                    case 1:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 2:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 3:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 4:
                                        break;
                                }
                                break;
                            // Chinh sua thong tin thuc an
                            case 2:
                                edit(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Xoa thuc an
                            case 3:
                                Remove(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Tim kiem thong tin thuc an
                            case 4:
                                search(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Xuat du lieu thuc an
                            case 5:
                                foodList.export();
                                System.out.println("Xuat thanh cong");
                                File file = new File("FOOD/FoodList.txt");
                                Desktop.getDesktop().open(file);
                                break;
                            case 6:
                                i = 0;
                                break;
                        }
                    } while (i != 0);
                    break;
                }
                case 3: {
                    do {
                        System.out.println("\n \n \n              Quan ly nhan vien");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.println("        1. add nhan vien");
                        System.out.println("        2. Chinh sua thong tin nhan vien");
                        System.out.println("        3. Xoa thong tin nhan vien");
                        System.out.println("        4. Tim kiem thong tin nhan vien");
                        System.out.println("        5. Xuat du lieu nhan vien");
                        System.out.println("        6. Quay lai");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.print("          Nhap lua chon cua ban: ");
                        i = input.nextInt();

                        switch (i) {
                            // Them nhan vien
                            case 1:
                                System.out.println("\n \n \n              add vat nuoi");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.println("        1. Nhan Vien");
                                System.out.println("        2. Quan ly");
                                System.out.println("        3. Quay lai");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.print("          Nhap lua chon cua ban: ");
                                k = input.nextInt();
                                input.nextLine();
                                switch (k) {
                                    case 1:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 2:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                    case 3:
                                        break;
                                }
                                break;
                            // Sua thong tin nhan vien
                            case 2:
                                edit(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Xoa thong tin nhan vien
                            case 3:
                                Remove(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Tim kiem thong tin nhan vien
                            case 4:
                                search(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // xuat du lieu nhan vien
                            case 5:
                                employeesList.export();
                                System.out.println("Xuat thanh cong");
                                File file = new File("EMPLOYEE/EmployeeList.txt");
                                Desktop.getDesktop().open(file);
                                break;
                            case 6:
                                i = 0;
                                break;
                        }
                    } while (i != 0);
                    break;
                }

                case 4: {
                    do {
                        System.out.println("\n \n \n              Quan ly chuong trai");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.println("        1. add chuong trai");
                        System.out.println("        2. Cap nhat chuong trai");
                        System.out.println("        3. Xoa chuong trai");
                        System.out.println("        4. Tim kiem chuong trai");
                        System.out.println("        5. Xuat du lieu chuong trai");
                        System.out.println("        6. Quay lai");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.print("          Nhap lua chon cua ban: ");
                        i = input.nextInt();

                        switch (i) {
                            // Them chuong trai
                            case 1:
                                System.out.println("\n \n \n              add Chuong trai");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.println("        1. Chuong Bo");
                                System.out.println("        2. Chuong Ga");
                                System.out.println("        3. Chuong Lon");
                                System.out.println("        4. Quay lai");
                                System.out.println(String.format("---------------------------------------------"));
                                System.out.print("          Nhap lua chon cua ban: ");
                                k = input.nextInt();
                                input.nextLine();
                                switch (k) {
                                    case 1:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 2:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 3:
                                        add(n, animalsList, employeesList, foodList, barnList, productList, k);
                                        break;
                                    case 4:
                                        break;
                                }
                                break;
                            // Chinh sua chuong trai
                            case 2:
                                edit(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Xoa thong tin chuong trai
                            case 3:
                                Remove(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Tim kiem thong tin chuong trai
                            case 4:
                                search(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            // Xuat du lieu chuong trai
                            case 5:
                                barnList.export();
                                System.out.println("Xuat thanh cong");
                                File file = new File("BARN/BarnList.txt");
                                Desktop.getDesktop().open(file);
                                break;
                            case 6:
                                i = 0;
                                break;
                        }
                    } while (i != 0);

                    break;
                }

                case 5: {
                    do {
                        System.out.println("\n \n \n              Quan ly san pham");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.println("        1. Them san pham");
                        System.out.println("        2. Sua thong tin san pham");
                        System.out.println("        3. Xoa thong tin san pham");
                        System.out.println("        4. Tim kiem thong tin san pham");
                        System.out.println("        5. Xuat du lieu san pham");
                        System.out.println("        6. Quay lai");
                        System.out.println(String.format("---------------------------------------------"));

                        System.out.print("          Nhap lua chon cua ban: ");
                        i = input.nextInt();

                        switch (i) {
                            case 1:
                                add(n, animalsList, employeesList, foodList, barnList, productList, 0);
                                break;
                            case 2:
                                edit(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            case 3:
                                Remove(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            case 4:
                                search(n, animalsList, employeesList, foodList, barnList, productList);
                                break;
                            case 5:
                                productList.export();
                                System.out.println("Xuat thanh cong");
                                File file = new File("PRODUCT/ProductList.txt");
                                Desktop.getDesktop().open(file);
                                break;
                            case 6:
                                i = 0;
                                break;
                        }
                    } while (i != 0);

                    break;
                }
                case 6:
                    start = 0;
                    break;

            }

        } while (start == 1);

    }

}
