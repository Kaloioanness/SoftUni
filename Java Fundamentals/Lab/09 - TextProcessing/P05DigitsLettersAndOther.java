package TextProcessing;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startingString = scanner.nextLine();
        StringBuilder words = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < startingString.length(); i++) {
            char symbol = startingString.charAt(i);
            if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 'z'){
                words.append(symbol);
            } else if (symbol >= 48 && symbol <= 57){
                numbers.append(symbol);
            }else {
                symbols.append(symbol);
            }
        }
        System.out.println(numbers);
        System.out.println(words);
        System.out.println(symbols);
    }
}