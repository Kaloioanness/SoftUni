package JavaFundamentals.Excercises.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("Add")){
                int passToEnd = Integer.parseInt(input.split(" ")[1]);
                wagonList.add(passToEnd);
            }else {
                int fitWagon = Integer.parseInt(input);
                for (int i = 0; i < wagonList.size(); i++) {
                    int currentWagon = wagonList.get(i);
                    if (currentWagon + fitWagon <= maxCapacity){
                        wagonList.set(i,fitWagon + currentWagon);
                        break;
                    }
                }

            }
            input = scanner.nextLine();
        }
        for (int element :
                wagonList) {
            System.out.print(element + " ");
        }
    }
}
