package JavaFundamentals.Excercises.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean isFirst = false;
        boolean isSecond = false;

        while (true) {
            if (firstCards.get(0) > secondCards.get(0)) {
                int temp = firstCards.get(0);
                firstCards.remove(0);
                firstCards.add(temp);
                firstCards.add(secondCards.get(0));
                secondCards.remove(0);

            } else if (firstCards.get(0) < secondCards.get(0)) {
                int temp = secondCards.get(0);
                secondCards.remove(0);
                secondCards.add(temp);
                secondCards.add(firstCards.get(0));
                firstCards.remove(0);

            } else {
                firstCards.remove(0);
                secondCards.remove(0);

            }
            if (firstCards.size() == 0) {
                isSecond = true;
                break;
            }
            if (secondCards.size() == 0) {
                isFirst = true;
                break;
            }
        }
        if (isFirst) {
            int sum1 = 0;
            for (int el1 :
                    firstCards) {
                sum1 += el1;
            }
            System.out.printf("First player wins! Sum: %d",sum1);

        } else if (isSecond) {
            int sum1 = 0;
            for (int el1 :
                    secondCards) {
                sum1 += el1;
            }
            System.out.printf("Second player wins! Sum: %d",sum1);
        }
    }
}



