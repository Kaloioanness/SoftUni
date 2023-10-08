package TextProcessing;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        for (String temp : array) {
            int n = temp.length();
            for (int j = 0; j < n; j++) {
                System.out.print(temp);
            }
        }
    }
}