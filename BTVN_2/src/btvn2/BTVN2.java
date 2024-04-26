package btvn2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author US 002
 */
public class BTVN2 {
    public static void b1() {
        int n, i = 0,j,k,l, sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        n = sc.nextInt();
        int a[] = new int[n];
        do {
            System.out.print("Nhap vao so hang thu "+(i+1)+" cua day: ");
            a[i] = sc.nextInt();
            i++;
        } while (a[i-1]!= 0 && i+1<=n);
        for (j=0;j<n;j++) 
            sum += a[j];
        avg = (double)sum/n;
        System.out.println("Trung binh cong cua day la: "+avg);
        int max = a[0];
        for(k=1;k<n;k++)
            if (a[k]>max)
                max = a[k];
        System.out.println("So hang lon nhat cua day so la: "+max);
        int min = a[0];
        for(l=1;l<n;l++)
            if (a[l]<min)
                min = a[l];
        System.out.println("So hang lon nhat cua day so la: "+min);       

    }

    public static void b2() {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       double sum = 1;
       if (n > 0) {
           for (int i = 1; i < n+1; i++) {
               sum += (double)1.0/i;
           }
           System.out.printf("%.2f", sum);
       } else {
           System.out.println("n khong hop le!");
       }
    }
    
    public static void b3() {
        Circle c=new Circle();
        c.setR(5);
        System.out.printf("Ban kinh %5.3f \t dien tich: %5.3f \t chu vi: %5.3f",
                + c.getR(),c.getS(), c.getP());
    }
    

    public static void main(String[]args){
        b1();
        b2();
        b3();
    }
}
