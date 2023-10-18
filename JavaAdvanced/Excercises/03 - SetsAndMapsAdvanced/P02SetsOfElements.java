package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int firstSetLength = Integer.parseInt(input[0]);
        int secondSetLength = Integer.parseInt(input[1]);
        LinkedHashSet<Integer> setOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> setTwo = new LinkedHashSet<>();
        LinkedHashSet<Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            setOne.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < secondSetLength; i++) {
            setTwo.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer integer :
                setOne) {
            if (setTwo.contains(integer)){
                result.add(integer);
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}