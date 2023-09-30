package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int waterTank = 255;
    int n = Integer.parseInt(scanner.nextLine());
    int liters = 0;
        for (int i = 0; i < n ; i++) {
        int litersIn = Integer.parseInt(scanner.nextLine());
        if (litersIn <= waterTank){
            waterTank -= litersIn;
            liters +=litersIn;
        } else {
            System.out.println("Insufficient capacity!");
            continue;
        }

    }
        System.out.printf("%d", liters);
    }
}
