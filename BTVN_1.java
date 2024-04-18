package btvn_1;
import java.util.Scanner;

public class BTVN_1 {
    public static void b1() {
        //Bai 1: Cho 3 cạnh tam giác a,b,c (Sử dụng phép gán). 
        //Hãy kiểm tra xem đây là 3 cạnh của tam giác hay không?
        System.out.println("Bai 1:");
        double a, b, c;
        a = 3;
        b = 8;
        c = 9;
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("a, b, c la 3 canh cua tam giac");
        } else {
            System.out.println("a, b, c khong la 3 canh cua tam giac");
        }
    }
    
    public static void b2() {
        //Bai 2: Cho 1 số a bất kỳ. Hãy in ra thông báo a có phải là thứ trong tuần hay không. 
        //Nếu không phải, thông báo: a không là thứ trong tuần
       System.out.println("Bai 2:");
       System.out.print("Nhap vao so a: ");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       
       switch(a) {
           case 2 -> System.out.println("a la thu hai");
           case 3 -> System.out.println("a la thu ba");
           case 4 -> System.out.println("a la thu tu");
           case 5 -> System.out.println("a la thu nam");
           case 6 -> System.out.println("a la thu sau");
           case 7 -> System.out.println("a la thu bay");
           case 8 -> System.out.println("a la thu chu nhat");
           default -> System.out.println("a khong la thu trong tuan");
       }
    }
    
    public static void b3() {
        //Bai 3: Cho số nguyên dương n, kiểm tra xem n có phải là số nguyên tố không?
        System.out.println("Bai 3:");
        System.out.print("Nhap vao so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n > 2) {
            for (int i = 2; i < (n-1); i++) {
                if (n%i == 0) {
                    count++;
                }
            }
            if (count > 0) {
            System.out.println("n khong phai la so nguyen to");
            } else {
                System.out.println("n la so nguyen to");
            }
        } else {
            System.out.println("n khong phai la so nguyen to");
        }
    }
    
    public static void b4() {
        //Bai 4: Cho số nguyên dương n. Tính: S=1/2+1/4+...+1/(2*n)
        System.out.println("Bai 4:");
        System.out.print("Nhap vao so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        if (n > 0) {
            for (int i = 1; i < n+1; i++) {
                sum += (float)1.0/(2.0*i);
            }
            System.out.printf("%.2f\n",sum);
        } else {
            System.out.println("n khong hop le!");
        }
    }
    
    public static void main(String[] args) {
        b1();
        b2();
        b3();
        b4();
    }
}
