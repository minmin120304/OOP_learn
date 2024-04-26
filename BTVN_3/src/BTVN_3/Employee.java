/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_3;
import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    
    public void getInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter the first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter the salary: ");
        salary = sc.nextFloat();
    }
    
    public String setFirstName(String fName) {
        return this.firstName = fName;
    }
    
    public String setLastName(String lName) {
        return this.lastName = lName;
    }
    
    public double setSalary(double sal) {       
            return this.salary = sal;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public double getSalary() {
        if (this.salary < 0) {
            return this.salary = 0.0;
        } else {
            return this.salary;
        }
    }
    
    
    public double getSalaryAfter() {
        return this.getSalary() * 1.1;
    }
    
    
    public void displayInfor() {
        System.out.println("Danh sach co luong mot nam cua nhan vien: ");
        System.out.println("Ho \t Ten \t Luong \t Luong sau khi tang");
        System.out.println(this.getLastName()+ " \t" + this.getFirstName() 
                + " \t" + this.getSalary() + " \t" + this.getSalaryAfter());
    }
}
