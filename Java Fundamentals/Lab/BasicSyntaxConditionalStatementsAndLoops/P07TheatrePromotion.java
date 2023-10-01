package JavaFundamentals.Lab.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean error = false;

        switch (typeDay){
            case "Weekday":
                if (age >= 0 && age <= 18){
                    price = 12;
                } else if ( age > 18 && age <= 64) {
                    price = 18;
                } else if ( age > 64 && age <= 122) {
                    price = 12;
                } else {
                    error = true;
                    break;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18){
                    price = 15;
                } else if ( age > 18 && age <= 64) {
                    price = 20;
                } else if ( age > 64 && age <= 122) {
                    price = 15;
                } else {
                    error = true;
                    break;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18){
                    price = 5;
                } else if ( age > 18 && age <= 64) {
                    price = 12;
                } else if ( age > 64 && age <= 122) {
                    price = 10;
                } else {
                    error = true;
                    break;
                }
                break;
        }
        if (error){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$",price);

        }
    }
}
