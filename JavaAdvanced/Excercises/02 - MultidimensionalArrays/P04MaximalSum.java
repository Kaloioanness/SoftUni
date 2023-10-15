package JavaAdvanced.Excercises.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int[][] matrix = new int[r][c];
        int[][] resultMat = new int[3][3];

        for (int i = 0; i < r; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {

                int current = matrix[i][j];
                int rightEl = matrix[i][j+1];
                int rightMost = matrix[i][j+2];
                int downEl = matrix[i+1][j];
                int downRight = matrix[i+1][j+1];
                int downRightMost = matrix[i+1][j+2];
                int mostDown = matrix[i+2][j];
                int mostDownRight = matrix[i+2][j+1];
                int mostDownMostRight = matrix[i+2][j+2];
                int sum =  current + rightEl + rightMost + downEl + downRight + downRightMost + mostDown + mostDownRight + mostDownMostRight;
                if (sum > maxSum){
                    maxSum = sum;
                    resultMat[0][0] = current;
                    resultMat[0][1] = rightEl;
                    resultMat[0][2] = rightMost;
                    resultMat[1][0] = downEl;
                    resultMat[1][1] = downRight;
                    resultMat[1][2] = downRightMost;
                    resultMat[2][0] = mostDown;
                    resultMat[2][1] = mostDownRight;
                    resultMat[2][2] = mostDownMostRight;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
