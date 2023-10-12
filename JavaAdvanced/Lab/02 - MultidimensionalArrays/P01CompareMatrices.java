package SoftUni.JavaAdvanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = matrixBoom(scanner);
        int[][] secondMatrix = matrixBoom(scanner);
        boolean areEq = areMatricesEqual(firstMatrix, secondMatrix);

        if (areEq){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[][] matrixBoom(Scanner scanner) {
        int[] matrixSize = getArray(scanner);
        int rows = matrixSize[0];
        int columns = matrixSize[1];
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] arr = getArray(scanner);
            matrix[i] = arr;
        }
        return matrix;
    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}