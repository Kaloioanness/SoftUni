package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeMap;

public class P05PhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, String> phoneBook = new TreeMap<>();

        while (!input.equals("search")) {
            String[] nameContact = input.split("-");
            String name = nameContact[0];
            String phoneNumber = nameContact[1];
            phoneBook.put(name, phoneNumber);

            input = scanner.nextLine();
        }
        String nextInput = scanner.nextLine();
        while (!nextInput.equals("stop")) {
            if (phoneBook.containsKey(nextInput)) {
                System.out.printf("%s -> %s\n", nextInput, phoneBook.get(nextInput));
            } else {
                System.out.printf("Contact %s does not exist.\n", nextInput);

            }
            nextInput = scanner.nextLine();
        }
    }
}
