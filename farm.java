import java.util.*;

import javax.print.DocFlavor.STRING;

import Animal.*;
import Food.*;
import Employee.*;
import ChuongTrai.*;
import CheckStatusHistory.*;

public class farm {
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
                                String s[] = new String[100];
                                System.out.println("Nhap ma vat nuoi: ");
                                input.nextInt();
                                s[0] = input.nextLine();

                                System.out.println("Nhap ten vat nuoi");
                                s[1] = input.nextLine();

                                System.out.println("Nhap loai vat nuoi");
                                s[2] = input.nextLine();

                                System.out.println("Nhap trong luong vat nuoi(kg): ");
                                s[3] = input.nextLine();

                                System.out.println("Nhap so luong vat nuoi: ");
                                s[4] = input.nextLine();

                                // Cow Bo = new Cow(s[0], s[1], s[2], s[3], s[4], null, null);
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
                break;
            }
        }

    }

}