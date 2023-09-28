package JavaFundamentals.Excercises.Arrays;


import java.util.Scanner;

public class NewP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] inputString = new String[n];
        int[] outputString = new int[n];

        for (int i = 0; i < inputString.length; i++) {
            inputString[i] = scanner.nextLine();

            int length = inputString[i].length();
            int result = 0;

            for (int j = 0; j < inputString[i].length(); j++) {
                if (inputString[i].charAt(j) == 'a' || inputString[i].charAt(j) == 'e' || inputString[i].charAt(j) == 'i' || inputString[i].charAt(j) == 'o' || inputString[i].charAt(j) == 'u') {     //a, e, i, o, u
                    result += inputString[i].charAt(j) * length;
                } else {
                    result += inputString[i].charAt(j) / length;
                }
            }

            outputString[i] = result;

        }

        boolean swapNeeded = true;

        while(swapNeeded == true) {

            for (int i = 0; i < outputString.length - 1; i++) {
                swapNeeded = false;

                if (outputString[i] > outputString[i + 1]) {
                    int temp = outputString[i];
                    outputString[i] = outputString[i + 1];
                    outputString[i + 1] = temp;
                    swapNeeded = true;
                }

            }

        }
        for (int i:outputString){
            System.out.println(i);
        }

    }
}



