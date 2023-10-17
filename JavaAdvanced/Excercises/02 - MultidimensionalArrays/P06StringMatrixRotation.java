package JavaAdvanced.Excercises.MultidimensionalArrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        String rotationCommand = scanner.nextLine();
        int degrees = extractDegrees(rotationCommand);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            lines.add(line);
        }

        rotateAndPrint(lines, degrees);

        scanner.close();
    }

    private static int extractDegrees(String rotationCommand) {
        String degreesStr = rotationCommand.substring(7, rotationCommand.length() - 1);
        return Integer.parseInt(degreesStr) % 360;
    }

    private static void rotateAndPrint(List<String> lines, int degrees) {
        int numRows = lines.size();
        int numCols = lines.stream().mapToInt(String::length).max().orElse(0);

        char[][] matrix = new char[numRows][numCols];

        // Fill the matrix with the lines, padding with spaces as needed
        for (int i = 0; i < numRows; i++) {
            String line = lines.get(i);
            for (int j = 0; j < numCols; j++) {
                if (j < line.length()) {
                    matrix[i][j] = line.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        if (degrees == 90) {
            for (int i = 0; i < numCols; i++) {
                for (int j = numRows - 1; j >= 0; j--) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        } else if (degrees == 180) {
            for (int i = numRows - 1; i >= 0; i--) {
                for (int j = numCols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else if (degrees == 270) {
            for (int i = numCols - 1; i >= 0; i--) {
                for (int j = 0; j < numRows; j++) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}