package JavaFundamentals.Excercises.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = "";

        while (!input.equals("end")){
            input = scanner.next();
            if (input.equals("swap")){

                int number1 = scanner.nextInt(); // 2
                int number2 = scanner.nextInt(); // 3
                int temp = arr[number1];
                arr[number1] = arr[number2];
                arr[number2] = temp;

            } else if (input.equals("multiply")) {
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                arr[number1] *= arr[number2];

            } else if (input.equals("decrease")) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] -= 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1){
                System.out.print(", ");
            }
        }
    }
}
