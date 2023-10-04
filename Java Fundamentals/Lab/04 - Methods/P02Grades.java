package SoftUni.SignOfIntegerNumbers;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        gradeWithWords(grade);
    }
    public static void gradeWithWords (double n) {
        if (n <= 6.00 && n >= 5.50){
            System.out.println("Excellent");
        } else if (n >= 4.50 && n <= 5.49) {
            System.out.println("Very good");
        } else if (n >= 3.50 && n <= 4.49) {
            System.out.println("Good");
        } else if (n >= 3.00 && n <= 3.49) {
            System.out.println("Poor");
        }else {
            System.out.println("Fail");
        }
    }
}