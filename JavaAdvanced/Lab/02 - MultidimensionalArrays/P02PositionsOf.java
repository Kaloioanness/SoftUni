package SoftUni.JavaAdvanced.MultidimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class P02PositionsOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int toCompare = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentNum = matrix[i][j];
                if (currentNum == toCompare) {
                    System.out.print(i + " " + j);
                    System.out.println();
                    isFound = true;
                }
            }

        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}