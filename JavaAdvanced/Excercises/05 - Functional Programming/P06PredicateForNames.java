package JavaAdvanced.Excercises.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.asList(scanner.nextLine().split(" "));
        Predicate<String> isBigger = s -> s.length() <= n;
        names.stream().filter(isBigger).forEach(name -> System.out.println(name));

    }
}
