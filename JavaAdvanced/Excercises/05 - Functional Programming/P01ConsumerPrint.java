package JavaAdvanced.Excercises.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        Consumer<List<String>> toPrint = e -> e.forEach(System.out::println);
        List<String> names = Arrays.asList(scanner.nextLine().split(" "));
        toPrint.accept(names);
    }
}
