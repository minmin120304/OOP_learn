/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_3;

public class GradeBook {
    private String courseName;
    private final int numStu = 20;
    private final double numComp = Math.random()*20;
    private static int ID = 0;
    private int curID = 0;
    
    GradeBook () {
//        courseName = "Lop mac dinh";
        ID++;
        curID = ID;
    }
    
    public String setCourseName(String name) {
        ID++;
        curID = ID;
        return this.courseName = name;
    }
    
    public String getCourseName() {
        return this.courseName;
    }
    
    public int getNumStu() {
        return this.numStu;
    }
    
    public double getNumComp() {
        return this.numComp;
    }
    
    public int getCurIdCourse() {
        return this.curID;
    }
    
    public void displayMessage() {
        System.out.println("Chao mung ban den voi khoa hoc so: " 
                + this.getCurIdCourse() + ": " + this.getCourseName() + " co so sinh vien la: " 
                + this.getNumStu() + " so may tinh: " + (int)this.getNumComp());
    }
    
    public int getTotal() {
        return GradeBook.ID;
    }
}
