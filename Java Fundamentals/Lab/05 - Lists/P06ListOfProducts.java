package Lists;

import java.util.*;

public class P06ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentString = scanner.nextLine();
            newList.add(i, currentString);
        }
        Collections.sort(newList);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println((i+1) + "." + newList.get(i));
        }
    }
}