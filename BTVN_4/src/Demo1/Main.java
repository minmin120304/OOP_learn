package Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time format (12 or 24):");
        String format = scanner.nextLine();

        System.out.println("Enter hour:");
        int hour = scanner.nextInt();

        System.out.println("Enter minute:");
        int minute = scanner.nextInt();

        System.out.println("Enter second:");
        int second = scanner.nextInt();

        Time time = new Time(hour, minute, second, format);
        time.convertAndNormalize();

        System.out.println("Normalized time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + " " + time.getFormat());
    }
}
