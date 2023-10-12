package SoftUni.JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrixOne = new char[rows][cols];
        char[][] matrixTwo = new char[rows][cols];
        char[][] result = new char[rows][cols];


        for (int i = 0; i < rows; i++) {
            String nxT = scanner.nextLine().replace(" ", "");
            matrixOne[i] = nxT.toCharArray();
        }
        for (int i = 0; i < rows; i++) {
            String nxT = scanner.nextLine().replace(" ", "");
            matrixTwo[i] = nxT.toCharArray();
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols ; j++) {
                char chM1 = matrixOne[i][j];
                char chM2 = matrixTwo[i][j];
                if (chM1 == chM2){
                    result[i][j] = matrixOne[i][j];
                }else {
                    result[i][j] = '*';
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
