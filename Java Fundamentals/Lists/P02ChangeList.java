package JavaFundamentals.Excercises.Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfInt = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("Delete")){
                int deleteElement = Integer.parseInt(input.split(" ")[1]);
                listOfInt.removeIf(integer -> integer == deleteElement);
            } else if (input.contains("Insert")) {
                int insertElement = Integer.parseInt(input.split(" ")[1]);
                int inPosition = Integer.parseInt(input.split(" ")[2]);
                listOfInt.add(inPosition,insertElement);
            }
            input = scanner.nextLine();
        }
        for (int element :
                listOfInt) {
            System.out.print(element + " ");
        }
    }
}
