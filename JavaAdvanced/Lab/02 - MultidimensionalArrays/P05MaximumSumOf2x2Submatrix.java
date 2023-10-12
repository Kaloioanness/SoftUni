package SoftUni.JavaAdvanced.MultidimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = getArray(scanner);
        int rows = array[0];
        int cols = array[1];
        int[][] matrix = new int[rows][cols];
        int[][] matrixRes = new int[2][2];
        for (int i = 0; i < rows; i++) {
            matrix[i] = getArray(scanner);
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentEl = matrix[i][j];
                int rightEl = matrix[i][j+1];
                int downEl = matrix[i+1][j];
                int downRightEl = matrix[i+1][j+1];
                int sum = currentEl + rightEl + downRightEl + downEl;
                if (maxSum < sum){
                    maxSum = sum;
                    matrixRes[0][0] = currentEl;
                    matrixRes[0][1] = rightEl;
                    matrixRes[1][0] = downEl;
                    matrixRes[1][1] = downRightEl;

                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixRes[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}