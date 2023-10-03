package SoftUni.DataTypesAndVariables;
import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInM = Integer.parseInt(scanner.nextLine());
        double distanceInKM = distanceInM / 1000.0;
        System.out.printf("%.2f",distanceInKM);
    }
}