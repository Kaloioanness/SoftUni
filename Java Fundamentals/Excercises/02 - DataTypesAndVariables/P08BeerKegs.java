package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        String biggestModel = "";
        double biggestVolume = 0.0;
        for (int i = 0; i < n ; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * radius * radius * height;
            if (volume > biggestVolume){
                biggestVolume = volume;
                biggestModel = modelKeg;
            }
        }
        System.out.println(biggestModel);
    }
}