package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (typeGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;

                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }

                if (countStudents >= 30) {
                    price = price * 0.85;
                }

                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                if (countStudents >= 100) {
                    countStudents = countStudents - 10;
                }

                break;
            case "Regular":

                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                if (countStudents >= 10 && countStudents <= 20) {
                    price = price * 0.95;

                }
                break;
        }
        double totalPrice = countStudents * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
