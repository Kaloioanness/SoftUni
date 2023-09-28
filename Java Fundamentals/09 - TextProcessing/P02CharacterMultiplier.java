package JavaFundamentals.Excercises.TextProcessing;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        String[] str = scanner.nextLine().split(" ");
        String one = str[0];
        String two = str[1];
        System.out.println(sum(one,two));
    }
    public static int sum(String one, String two){
        int sum = 0;
        int lower = Math.min(one.length(), two.length());
            for (int i = 0; i < lower; i++) {
                int num1 = one.charAt(i);
                int num2 = two.charAt(i);
                sum += num1 * num2;
        }
            if (one.length()<two.length()){
                for (int i = lower; i < two.length(); i++) {
                    sum += two.charAt(i);
                }
            } else if (one.length()>two.length()) {
                for (int i = lower; i < one.length(); i++) {
                    sum += one.charAt(i);
                }
            }
        return sum;
    }
}
