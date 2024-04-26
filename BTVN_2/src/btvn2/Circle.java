/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

/**
 *
 * @author US 002
 */
public class Circle {
    private double rad;
    public double setR(double r){
        return this.rad = r;
    }
    public double getR(){
        return this.rad;
    }
    public double getP(){
        return 2*Math.PI*this.getR();
    }
    public double getS(){
        return Math.PI*Math.pow(rad, rad);
    }
}