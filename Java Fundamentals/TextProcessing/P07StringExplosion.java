package JavaFundamentals.Excercises.TextProcessing;

import java.util.Scanner;

public class P07StringExplosion {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();

            StringBuilder result = new StringBuilder();
            int strength = 0;

            for (char currentChar : input.toCharArray()) {
                if (currentChar == '>') {
                result.append('>');
                strength = 0;
            } else if (Character.isDigit(currentChar)) {
                strength = strength * 10 + (currentChar - '0');
            } else {
                if (strength > 0) {
                    strength--;
                } else {
                    result.append(currentChar);
                }
            }
        }

        System.out.println(result.toString());
    }
}
