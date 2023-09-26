package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        vowelsCount(input);
    }

    public static void vowelsCount(String input) {
        int vowels = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a'|| c == 'u'|| c == 'o'|| c == 'i'|| c == 'e'){
                vowels += 1;
            }
        }
        System.out.println(vowels);
    }
}
