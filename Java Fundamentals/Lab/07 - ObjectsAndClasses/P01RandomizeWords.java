package ObjectsAndClasses;
import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int randomI = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[randomI];
            words[randomI] = temp;
        }
        for (String el :
                words) {
            System.out.println(el);
        }

    }
}