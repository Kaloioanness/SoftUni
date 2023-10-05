package Lists;
import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfInt = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Iterator<Integer> iterator = listOfInt.iterator();
        while (iterator.hasNext()) {
            int currentInt = iterator.next();
            if (currentInt < 0) {
                iterator.remove();
            }
        }

        if (listOfInt.size() == 0){
            System.out.println("empty");
        }else {
            for (int i = listOfInt.size() - 1; i >= 0; i--) {
                int lastNum = listOfInt.get(i);
                System.out.print(lastNum + " ");
            }
        }
    }
}
