package SoftUni.Arrays;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print(String.join(" ", arr));
    }
}