package JavaAdvanced.Excercises.MultidimensionalArrays;

import java.util.Scanner;

public class P05MatrixShuffling{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rowData[j];
            }
        }

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("END")) {
                break;
            }

            String[] parts = command.split("\\s+");
            if (parts.length != 5 || !parts[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            }

            try {
                int row1 = Integer.parseInt(parts[1]);
                int col1 = Integer.parseInt(parts[2]);
                int row2 = Integer.parseInt(parts[3]);
                int col2 = Integer.parseInt(parts[4]);

                if (isValidCoordinate(row1, col1, rows, cols) && isValidCoordinate(row2, col2, rows, cols)) {
                    String temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;

                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }

        scanner.close();
    }

    private static boolean isValidCoordinate(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
