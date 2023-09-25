package JavaFundamentals.Excercises.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Try4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfInt = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        listOfInt.removeIf(e -> e < 0   );

        if (listOfInt.size() == 0){
            System.out.println("empty");
        }else {
            Collections.reverse(listOfInt);

            System.out.println(listOfInt.toString().replaceAll("[\\[\\],]",""));
        }
    }
}
