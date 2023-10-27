package JavaAdvanced.Excercises.FunctionalProgramming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(arr);
        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isDivisible = a -> a % n != 0;
        Consumer<List<Integer>> print = l -> l.forEach(a -> System.out.print(a + " "));

        arr = arr.stream().filter(isDivisible).collect(Collectors.toList());
        print.accept(arr);
    }
}