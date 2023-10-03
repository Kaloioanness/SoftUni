package SoftUni.Arrays;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println(daysOfWeek[0]);
        } else {
            System.out.println(daysOfWeek[dayNumber]);
        }
    }
}