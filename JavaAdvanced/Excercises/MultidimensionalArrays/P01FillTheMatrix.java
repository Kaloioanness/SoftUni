package JavaAdvanced.Excercises.MultidimensionalArrays;

import java.util.Scanner;

public class P01FillTheMatrix {
    private static void patternA (int n){
        int[][] array = new int[n][n];
        int count = 1;
        for (int rows = 0; rows < n; rows++) {
            for (int column = 0; column < n; column++) {
                array[column][rows] = count;
                count++;
            }
        }
        printArr(n, array);
    }

    private static void printArr(int n, int[][] array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void patternB (int n) {
        int count = 1;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    array[j][i] = count;
                    count++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    array[j][i] = count;
                    count++;
                }
            }
        }
        printArr(n, array);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String typePattern = input[1];
        if (typePattern.equals("A")) {
            patternA(n);
        }else {
            patternB(n);
        }
    }
}

