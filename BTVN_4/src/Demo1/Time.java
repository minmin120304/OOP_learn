package Demo;
public class Time {
    private int hour;
    private int minute;
    private int second;
    private String format;

    // Constructor without parameters
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.format = "24";
    }

    // Constructor with parameters
    public Time(int hour, int minute, int second, String format) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.format = format;
    }

    // Getters and setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    // Method to convert time format and normalize
    public void convertAndNormalize() {
        if (format.equals("12")) {
            if (hour > 12) {
                hour -= 12;
                format = "12 PM";
            } else if (hour == 12) {
                format = "12 PM";
            } else {
                format = "12 AM";
            }
        }

        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }

        if (second >= 60) {
            minute += second / 60;
            second %= 60;
        }
    }
}
