package Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfInt = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        String input;

        while (true){
            input = scanner.next();
            switch (input){
                case "Add":
                    int n = scanner.nextInt();
                    listOfInt.add(n);
                    break;
                case "Remove":
                    int m = scanner.nextInt();
                    listOfInt.remove(Integer.valueOf(m));
                    break;
                case "RemoveAt":
                    int z = scanner.nextInt();
                    listOfInt.remove(z);
                    break;
                case "Insert":
                    int number = scanner.nextInt();
                    int index = scanner.nextInt();
                    listOfInt.add(index,number);
                    break;
                case "end":
                    for (int element : listOfInt) {
                        System.out.print(element + " ");
                    }
                    return;
            }
        }

    }
}
