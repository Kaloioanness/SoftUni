package JavaFundamentals.Excercises.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            boolean isTopInteger = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (current <= arr[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(current + " ");
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}
