package JavaFundamentals.Excercises.MidExamPreparation;

import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");

        int initialHealth = 100;
        int bitcoins = 0;
        for (int i = 0; i < input.length; i++) {
            String[] input2 = input[i].split(" ");
            String command = input2[0];
            int number = Integer.parseInt(input2[1]);
            if (command.equals("potion")) {
                if (initialHealth + number <= 100) {
                    initialHealth += number;
                    System.out.printf("You healed for %d hp.\n", number);
                    System.out.printf("Current health: %d hp.\n", initialHealth);
                }else {
                    System.out.printf("You healed for %d hp.\n", 100 - initialHealth);
                    initialHealth = 100;
                    System.out.printf("Current health: %d hp.\n", initialHealth);
                }
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.\n",number);

            } else {
                if (initialHealth - number > 0){
                    initialHealth -= number;
                    System.out.printf("You slayed %s.\n",command);
                }else if (initialHealth - number <= 0) {
                    System.out.printf("You died! Killed by %s.\n", command);
                    System.out.printf("Best room: %d\n", i + 1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n",bitcoins);
        System.out.printf("Health: %d",initialHealth);
    }
}
