/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo3;


class Person {
    private final int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void normalizeName() {
        StandardStr standardStr = new StandardStr(this.name);
        standardStr.normalizeString();
        this.name = standardStr.toString();
    }

    public void displayPersonInfo() {
        System.out.println("ID: " + this.id + ", Full name: " + this.name);
    }

    public String getName() { return this.name; }
    public int getId() { return this.id; }
}