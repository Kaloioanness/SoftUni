package JavaFundamentals.FinalExamPrep;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();//само букви и цифри!

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] commands = input.split(">>>");
            String command = commands[0];
            if (command.equals("Contains")) {
                String subs = commands[1];
                if (key.contains(subs)) {
                    System.out.println(key + " contains "+ subs);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (command.equals("Flip")) {
                String whatCase = commands[1];
                if (whatCase.equals("Lower")) {
                    int start = Integer.parseInt(commands[2]);
                    int end = Integer.parseInt(commands[3]);
                    String old = key.substring(start, end);
                    String modified = key.substring(start, end).toLowerCase();
                    key = key.replace(old, modified);
                    System.out.println(key);
                } else if (whatCase.equals("Upper")) {
                    int start = Integer.parseInt(commands[2]);
                    int end = Integer.parseInt(commands[3]);
                    String old = key.substring(start, end);
                    String modified = key.substring(start, end).toUpperCase();
                    key = key.replace(old, modified);
                    System.out.println(key);
                }
            } else if (command.equals("Slice")) {
                int start = Integer.parseInt(commands[1]);
                int end = Integer.parseInt(commands[2]);
                String toRemove = key.substring(start,end);
                key = key.replace(toRemove,"");
                System.out.println(key);
            }


            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: "+ key);
    }
}
