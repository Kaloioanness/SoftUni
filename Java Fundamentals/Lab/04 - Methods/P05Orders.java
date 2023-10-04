package SoftUni.SignOfIntegerNumbers;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (product){
            case "coffee":
                System.out.printf("%.2f",coffeePrice(quantity));
                break;
            case "water":
                System.out.printf("%.2f",waterPrice(quantity));
                break;
            case "coke":
                System.out.printf("%.2f",cokePrice(quantity));
                break;
            case "snacks":
                System.out.printf("%.2f",snackPrice(quantity));
                break;

        }
    }
    public static double coffeePrice(int quantity){
        return quantity * 1.50;
    }
    public static double waterPrice(int quantity){
        return quantity * 1.00;
    }
    public static double cokePrice(int quantity){
        return quantity * 1.40;
    }
    public static double snackPrice(int quantity){
        return quantity * 2.00;
    }

}