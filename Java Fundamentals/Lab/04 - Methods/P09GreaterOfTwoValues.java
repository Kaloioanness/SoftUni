package SoftUni.SignOfIntegerNumbers;

import java.util.Scanner;

public class P09GreaterOfTwoValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String type = scanner.nextLine();

        switch (type) {
            case "int":

                int int1 = scanner.nextInt();

                int int2 = scanner.nextInt();
                int intResult = getMax(int1, int2);
                System.out.println(intResult);
                break;

            case "char":

                char char1 = scanner.next().charAt(0);

                char char2 = scanner.next().charAt(0);
                char charResult = getMax(char1, char2);
                System.out.println(charResult);
                break;

            case "string":

                String str1 = scanner.next();

                String str2 = scanner.next();
                String strResult = getMax(str1, str2);
                System.out.println(strResult);
                break;

            default:
                break;
        }
    }

    // Method to find the maximum of two integers
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    // Method to find the maximum of two characters
    public static char getMax(char a, char b) {
        return a > b ? a : b;
    }

    // Method to find the maximum of two strings
    public static String getMax(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
