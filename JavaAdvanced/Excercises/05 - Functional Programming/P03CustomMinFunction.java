package JavaAdvanced.Excercises.FunctionalProgramming;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Function<Integer[], Integer> func = arr -> Arrays.stream(arr).min(Integer::compare).get();

        System.out.println(func.apply(numbers));
    }
}
