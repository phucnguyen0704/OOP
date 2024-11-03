package MANAGE;

import java.util.*;

import javax.print.DocFlavor.STRING;

import ANIMAL.*;
import FOOD.*;
import EMPLOYEE.*;
import FARM.*;
import CheckStatusHistory.*;

public class MANAGE_FARM {
    public static void add(int n) {
        Scanner input = new Scanner(System.in);
        switch (n) {
            case 1:
                String s[] = new String[100];
                System.out.println("Nhap ma vat nuoi: ");
                input.nextLine();
                s[0] = input.nextLine();

                System.out.println("Nhap ten vat nuoi");
                s[1] = input.nextLine();

                System.out.println("Nhap loai vat nuoi");
                s[2] = input.nextLine();

                System.out.println("Nhap trong luong vat nuoi(kg): ");
                s[3] = input.nextLine();

                System.out.println("Nhap so luong vat nuoi: ");
                s[4] = input.nextLine();

                int s3 = Integer.parseInt(s[3]);
                int s4 = Integer.parseInt(s[4]);

                Cow Bo = new Cow(s[0], s[1], s[2], s3, s4, 1000);
                System.out.println(Bo.toString());
                break;

            case 2:
                System.out.println("Loi");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, k;

        System.out.println("       Chao mung ban den voi trang trai");
        System.out.println(String.format("---------------------------------------------"));

        System.out.println("        1. Quan ly vat nuoi");
        System.out.println("        2. Quan ly nhan vien");
        System.out.println("        3. Quan ly thuc an");
        System.out.println("        4. Quan ly chuong trai");
        System.out.println("        5. Quan ly lich su kham benh");
        System.out.println(String.format("---------------------------------------------"));

        System.out.print("          Nhap lua chon cua ban: ");
        n = input.nextInt();

        switch (n) {
            case 1: {
                System.out.println("\n \n \n              Quan ly vat nuoi");
                System.out.println(String.format("---------------------------------------------"));

                System.out.println("        1. Them vat nuoi");
                System.out.println("        2. Chinh sua thong tin vat nuoi");
                System.out.println("        3. Xoa thong tin vat nuoi");
                System.out.println("        4. Tim kiem thong tin vat nuoi");
                System.out.println("        5. Quay lai");
                System.out.println(String.format("---------------------------------------------"));

                System.out.print("          Nhap lua chon cua ban: ");
                i = input.nextInt();
                switch (i) {
                    case 1: {
                        System.out.println("\n \n \n              Them vat nuoi");
                        System.out.println(String.format("---------------------------------------------"));
                        System.out.println("        1. Bo");
                        System.out.println("        2. Ga");
                        System.out.println("        3. Trau");
                        System.out.println("        4. Lon");
                        System.out.println("        5. Quay lai");
                        System.out.println(String.format("---------------------------------------------"));
                        System.out.print("          Nhap lua chon cua ban: ");
                        k = input.nextInt();
                        switch (k) {
                            case 1:
                                add(n);
                                break;

                            default:
                                break;
                        }
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("\n \n \n              Quan ly thuc an");
                System.out.println(String.format("---------------------------------------------"));

                System.out.println("        1. Them thuc an");
                System.out.println("        2. Chinh sua thong tin thuc an");
                System.out.println("        3. Xoa thong tin thuc an");
                System.out.println("        4. Tim kiem thong tin thuc an");
                System.out.println("        5. Quay lai");
                System.out.println(String.format("---------------------------------------------"));

                System.out.print("          Nhap lua chon cua ban: ");
                i = input.nextInt();
                switch (i) {
                    case 1:
                        add(n);
                        break;
                }

                break;
            }
        }

    }

}
