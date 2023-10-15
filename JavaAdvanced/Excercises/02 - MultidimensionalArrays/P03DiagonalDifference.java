package JavaAdvanced.Excercises.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int sum2 = 0;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        for (int i = 0; i < n; i++) {
            int currentNumOfFirst = matrix[i][i];
            sum += currentNumOfFirst;
            int currentNumOfSecond = matrix[i][n-1-i];
            sum2 += currentNumOfSecond;
        }

        System.out.println(Math.abs(sum2-sum));
    }
}
