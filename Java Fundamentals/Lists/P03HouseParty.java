package JavaFundamentals.Excercises.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.split(" ")[2].equals("not")){
                if (names.contains(input.split(" ")[0])) {
                    names.remove(input.split(" ")[0]);
                }else {
                    System.out.println(input.split(" ")[0] + " is not in the list!");
                }
            }else {
                if (names.contains(input.split(" ")[0])) {
                    System.out.println(input.split(" ")[0] + " is already in the list!");

                }else {
                    names.add(input.split(" ")[0]);
                }
            }
        }
        for (String element :
                names) {
            System.out.println(element);
        }
    }
}
