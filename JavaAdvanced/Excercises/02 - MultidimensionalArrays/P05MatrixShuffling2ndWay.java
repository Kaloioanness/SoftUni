package JavaAdvanced.Excercises.MultidimensionalArrays;

import java.util.Scanner;

public class P05MatrixShuffling2ndWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] array = scanner.nextLine().split(" ");
            matrix[i] = array;
        }
        String input = scanner.nextLine();
        while (!input.equals("END")){
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("swap")) {

                int swapRow = Integer.parseInt(tokens[1]);
                int swapCol = Integer.parseInt(tokens[2]);
                int toSwapRow = Integer.parseInt(tokens[3]);
                int toSwapCol = Integer.parseInt(tokens[4]);
                if (swapRow == -1 || swapRow >= rows || toSwapRow == -1 || toSwapRow >= rows ||
                        swapCol == -1 || swapCol >= cols || toSwapCol == -1 || toSwapCol >= cols) {
                    System.out.println("Invalid input!");
                } else {
                    String currentNum = matrix[swapRow][swapCol];
                    String toSwapNum = matrix[toSwapRow][toSwapCol];
                    matrix[swapRow][swapCol] = toSwapNum;
                    matrix[toSwapRow][toSwapCol] = currentNum;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }
}