/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Demo2;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day:");
        int day = scanner.nextInt();

        System.out.println("Enter month (as text, e.g., Jan):");
        String month = scanner.next();

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        // Create DateTime object
        DateTime date = new DateTime(day, Month.Jan, year);

        // Set month using string
        date.setMonth(month);

        // Convert format and print
        date.formatDate();
    }
    
}
