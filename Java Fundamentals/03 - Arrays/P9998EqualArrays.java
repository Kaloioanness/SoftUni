package JavaFundamentals.Excercises.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P9998EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");
        int sum = 0;
        if (Arrays.equals(array1,array2)){
            int[] numbers = Arrays.stream(array1).
                    mapToInt(Integer::parseInt)
                    .toArray();
            for (int i = 0; i < numbers.length; i++) {
                int current = numbers[i];
                sum += current;
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])){
                    System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                    break;
                }
            }
        }
    }
}
