package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] texts = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for (String text: texts
             ) {
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                if (!charCount.containsKey(symbol)){
                    charCount.put(symbol,0);
                }
                charCount.put(symbol,charCount.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue());
        }
    }
}
