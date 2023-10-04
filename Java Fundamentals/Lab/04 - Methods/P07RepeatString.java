package SoftUni.SignOfIntegerNumbers;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());
        repeat(input,times);
    }
    public static void repeat(String repeat,int times){
        for (int i = 0; i < times; i++) {
            System.out.print(repeat);
        }
    }
}