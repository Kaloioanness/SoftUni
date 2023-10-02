package SoftUni.DataTypesAndVariables;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        String populationStr = scanner.nextLine();
        String areaStr = scanner.nextLine();


        int population = Integer.parseInt(populationStr);
        int area = Integer.parseInt(areaStr);


        System.out.printf("Town %s has population of %d and area %d square km.%n", townName, population, area);

    }
}