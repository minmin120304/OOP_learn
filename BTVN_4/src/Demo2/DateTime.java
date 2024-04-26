/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo2;

enum Month { 
    Jan, Feb, Mar, Apr, May,Jun, Jul, Aug, Sep, Oct, Nov, Dec
}

class DateTime {
    private int day;
    private Month month;
    private int year;

    // Constructor
    public DateTime(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void setDay(int day) { this.day = day; }    
    public int getDay() { return day; }
    public void setMonth(Month month) { this.month = month; }
    public Month getMonth() { return month; }
    public void setYear(int year) { this.year = year; }
    public int getYear() { return year; }

    // Nạp chồng phương thức setMonth
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = Month.values()[month - 1];
        } else {
            System.out.println("Invalid month number!");
        }
    }

    public void setMonth(String month) {
        Month[] months = Month.values();
        for (Month m : months) {
            if (m.name().equalsIgnoreCase(month)) {
                this.month = m;
                return;
            }
        }
        System.out.println("Invalid month name!");
    }
    
    // Phương thức để đổi định dạng thời gian
    public void formatDate() {
        System.out.printf("%02d %02d %d\n", this.day, this.month.ordinal() + 1, this.year);
    }
}
