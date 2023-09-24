package JavaFundamentals.Excercises.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length - 1; i++) {
            int firstNum = arr[i];
            for (int j = i + 1 ; j < arr.length ; j++) {
                int secondNum = arr[j];
                if (firstNum + secondNum == n){
                    System.out.printf("%d %d\n", firstNum, secondNum);
                }
            }
        }
    }
}
