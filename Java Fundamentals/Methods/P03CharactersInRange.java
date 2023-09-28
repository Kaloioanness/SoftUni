package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        charInRange(a,b);
    }

    public static void charInRange(char a,char b) {
        int start = (int) a;
        int end = (int) b;


        if (end > start){
            for (int i = start + 1 ; i < end ; i++) {
                System.out.print((char) i + " ");
            }
        }else if (end < start){
            for (int i = end + 1; i < start ; i++) {
                System.out.print((char) i + " ");
            }
        }

    }
}
