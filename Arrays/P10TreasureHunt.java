package JavaFundamentals.Excercises.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.nextLine().split("\\|");
        List<String> treasureChest = new ArrayList<>(Arrays.asList(initialLoot));

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split(" ");
            String action = tokens[0];

            switch (action) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        String item = tokens[i];
                        if (!treasureChest.contains(item)) {
                            treasureChest.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        String droppedItem = treasureChest.remove(index);
                        treasureChest.add(droppedItem);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    List<String> stolenItems = new ArrayList<>();
                    if (count >= treasureChest.size()) {
                        stolenItems.addAll(treasureChest);
                        treasureChest.clear();
                    } else {
                        for (int i = 0; i < count; i++) {
                            int lastIndex = treasureChest.size() - 1;
                            String stolenItem = treasureChest.remove(lastIndex);
                            stolenItems.add(0, stolenItem);
                        }
                    }
                    System.out.println(String.join(", ", stolenItems));
                    break;
            }

            command = scanner.nextLine();
        }

        if (treasureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int totalLength = 0;
            for (String item : treasureChest) {
                totalLength += item.length();
            }
            double averageGain = (double) totalLength / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.\n", averageGain);
        }
    }
}