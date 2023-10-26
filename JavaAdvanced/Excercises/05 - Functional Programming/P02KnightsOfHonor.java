package JavaAdvanced.Excercises.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<List<String>> sirNames = l -> l.forEach( e -> System.out.println("Sir " + e));
        List<String> names = Arrays.asList(scanner.nextLine().split(" "));
        sirNames.accept(names);
    }
}
