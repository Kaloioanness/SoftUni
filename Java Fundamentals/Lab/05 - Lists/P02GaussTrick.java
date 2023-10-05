package Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> items = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = items.size() / 2;
        for (int i = 0; i < size; i++) {
            int currentNum = items.get(i);
            int finalNum = items.get(items.size()- 1);
            int sum = currentNum + finalNum;
            items.set(i,sum);
            items.remove(items.size() - 1 );

        }
        for (int numS :
                items) {
            System.out.print(numS + " ");
        }
    }
}