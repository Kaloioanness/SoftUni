package JavaFundamentals.Excercises.Lists;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Try{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> firstOne = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        List<String> secondOne = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        int size = firstOne.size() + secondOne.size();
        List<String> newList = new ArrayList<>(size);

        if (firstOne.size() > secondOne.size()) {
            for (int i = 0; i < secondOne.size(); i++) {
                String firstCurrentItem = firstOne.get(i);
                newList.add(firstCurrentItem);
                String secondCurrentItem = secondOne.get(i);
                newList.add(secondCurrentItem);
            }

            for (int i = secondOne.size(); i < firstOne.size(); i++) {
                String firstCurrentItem = firstOne.get(i);
                newList.add(firstCurrentItem);
            }
        } else {
            for (int i = 0; i < firstOne.size(); i++) {
                String firstCurrentItem = firstOne.get(i);
                newList.add(firstCurrentItem);
                String secondCurrentItem = secondOne.get(i);
                newList.add(secondCurrentItem);
            }

            for (int i = firstOne.size(); i < secondOne.size(); i++) {
                String secondCurrentItem = secondOne.get(i);
                newList.add(secondCurrentItem);
            }
        }
        for (String element :
                newList) {
            System.out.print(element + " ");
        }

    }
}
