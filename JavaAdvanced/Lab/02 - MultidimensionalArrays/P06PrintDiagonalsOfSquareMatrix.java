package SoftUni.JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        // Create a 2D array for the matrix
        int[][] matrix = new int[n][n];

        // Read the matrix elements from the console
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume the newline character
        }

        // Print the first diagonal
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        // Print the second diagonal
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[n - i - 1][i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}