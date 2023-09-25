package JavaFundamentals.Excercises.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfInt = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.contains("End")){
            switch (command.split(" ")[0]){

                case "Add":
                    int number = Integer.parseInt(command.split(" ")[1]);
                    listOfInt.add(number);
                    break;

                case "Insert":
                    int number2 = Integer.parseInt(command.split(" ")[1]);
                    int index2 = Integer.parseInt(command.split(" ")[2]);
                    listOfInt.add(index2,number2);
                    break;

                case "Remove":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    if (index >= listOfInt.size()){
                        System.out.println("Invalid index");

                    }else {
                        listOfInt.remove(index);
                    }
                    break;

                case "Shift":
                    int rotations = Integer.parseInt(command.split(" ")[2]);
                    if (command.split(" ")[1].equals("left")){
                        Collections.rotate(listOfInt,-(rotations));
                    }else {
                        Collections.rotate(listOfInt,rotations);
                    }
                    break;

            }

            command = scanner.nextLine();
        }
        for (int el :
                listOfInt) {
            System.out.print(el + " ");
        }
    }
}
