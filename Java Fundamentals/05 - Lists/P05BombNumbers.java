package JavaFundamentals.Excercises.Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] bombArray = scanner.nextLine().split(" ");
        int bombNum = Integer.parseInt(bombArray[0]);
        int bombedNum = Integer.parseInt(bombArray[1]);

        while (numbers.contains(bombNum)){
            int indexOfNum = numbers.indexOf(bombNum);
                int startIndex = Math.max(0, indexOfNum - bombedNum);
                int endIndex = Math.min(numbers.size() - 1, indexOfNum + bombedNum);

                for (int j = endIndex; j >= startIndex; j--) {
                    numbers.remove(j);
                }
            }


        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}