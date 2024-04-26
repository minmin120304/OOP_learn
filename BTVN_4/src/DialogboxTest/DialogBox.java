/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DialogboxTest;
import javax.swing.JOptionPane;
   

public class DialogBox {

  public static void main( String args[] )

     {

        String inputA = JOptionPane.showInputDialog("Nhập số a:");
        double a = Double.parseDouble(inputA);

        // Nhập số b
        String inputB = JOptionPane.showInputDialog("Nhập số b:");
        double b = Double.parseDouble(inputB);

        // Tính và in ra kết quả
        double sum = a + b;
        JOptionPane.showMessageDialog(null, "Kết quả của " 
                + a + " + " + b + " là: " + sum);


     } // end main

}

