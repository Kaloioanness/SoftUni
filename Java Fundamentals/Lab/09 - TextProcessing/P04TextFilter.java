package TextProcessing;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            while (text.contains(bannedWord)) {

                text = text.replace(bannedWord, numberStars(bannedWord));

            }
        }
        System.out.println(text);
    }
    public static String numberStars(String bannedWord){
        StringBuilder el = new StringBuilder();
        for (int i = 0; i < bannedWord.length(); i++) {
            el.append("*");
        }
        return el.toString();
    }
}