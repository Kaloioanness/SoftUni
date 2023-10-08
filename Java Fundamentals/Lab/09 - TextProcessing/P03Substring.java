package TextProcessing;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removingString = scanner.nextLine();
        String majorString = scanner.nextLine();
        int index = majorString.indexOf(removingString);
        while (index != -1){
            majorString = majorString.replace(removingString,"");
            index = majorString.indexOf(removingString);
        }
        System.out.println(majorString);
    }
}