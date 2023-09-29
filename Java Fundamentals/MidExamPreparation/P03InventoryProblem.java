package JavaFundamentals.Excercises.MidExamPreparation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03InventoryProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journal = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));
        String command = scanner.nextLine();
        while (!command.equals("Craft!")){
            String[] initialCommand = command.split(" - ");
            String commandName = initialCommand[0];
            String item = initialCommand[1];
 
            switch (commandName){
                case "Collect":
                    if (journal.contains(item)){
                        break;
                    }else {
                        journal.add(item);
                    }
                    break;
                case "Drop":
                    if (journal.contains(item)){
                        journal.remove(item);
                        break;
                    }
                    break;
                case "Renew":
                    if (journal.contains(item)){
                        journal.remove(item);
                        journal.add(item);
                    break;
                    }
                    break;
                case "Combine Items":
                    String[] items = item.split(":");
                    String firstItem = items[0];
                    String secondItem = items[1];
                    int indexFI = journal.indexOf(firstItem);
                    if (journal.contains(firstItem)){
                        journal.add(indexFI + 1,secondItem);
                        break;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < journal.size() - 1; i++) {
            String curr = journal.get(i);
            System.out.print(curr + ", ");
        }
        System.out.print(journal.get(journal.size() - 1));
    }
}
