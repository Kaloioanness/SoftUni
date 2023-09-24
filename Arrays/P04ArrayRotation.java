package JavaFundamentals.Excercises.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        // Adjust the rotation value to be within the array length
        n = n % elements.length;

        // Perform array rotation
        for (int i = 0; i < n; i++) {
            String temp = elements[0];
            for (int j = 0; j < elements.length - 1; j++) {
                elements[j] = elements[j + 1];
            }
            elements[elements.length - 1] = temp;
        }

        System.out.println(String.join(" ", elements));
    }
}
