package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P11SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highestSnowballValue = Double.NEGATIVE_INFINITY;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / (double) snowballTime), snowballQuality);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, highestSnowballValue, bestSnowballQuality);
    }
}