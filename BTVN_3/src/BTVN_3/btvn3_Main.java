/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTVN_3;

/**
 *
 * @author US 002
 */
public class btvn3_Main {
    public static void b1() {
        GradeBook b = new GradeBook();
        b.setCourseName("Java");
        b.displayMessage(); 
    }
    
    public static void b2() {
        Employee e = new Employee();
        e.getInfor();
        e.displayInfor();
    }
    
    public static void main(String[] args) {
        b1();
        b2();
    }
}
