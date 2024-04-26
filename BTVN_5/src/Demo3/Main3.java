/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Demo3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Khởi tạo và nhập xâu
        StandardStr standardStr = new StandardStr("");
        standardStr.inputString();

        // In xâu vừa nhập
        standardStr.displayString();

        // Chuẩn hóa xâu
        standardStr.normalizeString();
        System.out.println("String after standard: " + standardStr);

        // Đếm kí tự đặc biệt
        standardStr.countSpecialCharacters();

        // Đếm số từ bắt đầu bằng 'T'
        standardStr.countWordsStartingWithT();

        // Nhập từ cần tìm và đếm số lần xuất hiện
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter from the word need to count the number of appearance: ");
        String word = scanner.next();
        standardStr.countOccurrencesOfWord(word);

        // Chuyển xâu thành chữ HOA và in ra
        standardStr.convertToUpperCase();
        System.out.println("String after converting into capital letters: " + standardStr);

        // Chuyển xâu thành chữ thường và in ra
        standardStr.convertToLowerCase();
        System.out.println("String after converting into regular letters: " + standardStr);

        // Nhập và chuẩn hóa thông tin người
        Person[] people = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter infor of person " + (i + 1)+": ");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Full name: ");
            String name = scanner.next();
            Person person = new Person(id, name);
            person.normalizeName();
            people[i] = person;
        }

        // In thông tin mảng người
        System.out.println("Infor of people:");
        for (Person person : people) {
            person.displayPersonInfo();
        }

        // Tìm kiếm người theo tên và họ
        System.out.print("Enter the first name of the person to find: ");
        String searchName = scanner.next();
        for (Person person : people) {
            if (person.getName().equals(searchName)) {
                System.out.println("Found the first name " + searchName);
                break;
            }
        }

        System.out.print("Enter the last name of the person to find: ");
        String searchLastName = scanner.next();
        for (Person person : people) {
            String[] nameParts = person.getName().split(" ");
            if (nameParts.length > 1 && nameParts[0].equals(searchLastName)) {
                System.out.println("Found the last name " + searchLastName);
            }
        }
    }
}
