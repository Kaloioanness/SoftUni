package SoftUni.SignOfIntegerNumbers;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calc = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        switch (calc){
            case "add":
                System.out.println(adding(firstNumber,secondNumber));
                break;
            case "multiply":
                System.out.println(multiplying(firstNumber,secondNumber));
                break;
            case "subtract":
                System.out.println(subtracting(firstNumber,secondNumber));
                break;
            case "divide":
                System.out.println(dividing(firstNumber,secondNumber));
                break;
        }
    }
    public static int adding (int first, int second){
        return first + second;
    }
    public static int multiplying (int first, int second){
        return first * second;
    }
    public static int subtracting (int first, int second){
        return first - second;
    }
    public static int dividing (int first, int second){
        return first / second;
    }
}