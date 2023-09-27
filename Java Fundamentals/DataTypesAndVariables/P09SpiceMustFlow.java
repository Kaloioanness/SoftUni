package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startYield = Integer.parseInt(scanner.nextLine());
        int workersConsumes = 26;
        int extractSpices = 0;
        int days = 0;
        while (true){
            if (startYield >= 100){
                extractSpices += startYield - workersConsumes;
                startYield -= 10;
                days += 1;
            }else {
                extractSpices -= workersConsumes;
                if (workersConsumes > extractSpices){
                    extractSpices = 0;
                }
                break;
            }
        }
        System.out.println(days);
        System.out.println(extractSpices);
    }
}
