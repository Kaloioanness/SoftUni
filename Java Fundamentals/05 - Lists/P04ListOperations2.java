package JavaFundamentals.Excercises.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            if (commandName.equals("Add")) {
                int number = Integer.parseInt(commandParts[1]);
                numbers.add(number);

            } else if (commandName.equals("Insert")) {
                int number = Integer.parseInt(commandParts[1]);
                int index = Integer.parseInt(commandParts[2]);

                if (index < numbers.size() && index >= 0) {
                    numbers.add(index, number);
                }else {
                    System.out.println("Invalid index");
                }

            } else if (commandName.equals("Remove")) {
                int index = Integer.parseInt(commandParts[1]);
                if (index < numbers.size() && index >= 0) {
                    numbers.remove(index);

                } else {
                    System.out.println("Invalid index");
                }


            } else if (commandName.equals("Shift")) {
                int count = Integer.parseInt(commandParts[2]);
                if (commandParts[1].equals("left")) {
                    Collections.rotate(numbers, -(count));
                } else if (commandParts[1].equals("right")) {
                    Collections.rotate(numbers, count);
                }
            }
            command = scanner.nextLine();
        }
        for (int el :
                numbers) {
            System.out.print(el + " ");
        }
    }
}
