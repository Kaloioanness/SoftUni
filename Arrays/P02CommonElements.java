package JavaFundamentals.Excercises.Arrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        String[] arrayOne = inputOne.split(" ");
        String inputTwo = scanner.nextLine();
        String[] arrayTwo = inputTwo.split(" ");
        for (String elementTwo : arrayTwo){
            for (String elementOne : arrayOne){
                if (elementTwo.equals(elementOne)){
                    System.out.print(elementTwo + " ");
                    break;
                }
            }
        }
    }
}
