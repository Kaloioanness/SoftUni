package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> reverseStack = new ArrayDeque<>();
        for (int num :
                numbers) {
            reverseStack.push(num);
        }
        while (reverseStack.size() > 0){
            System.out.print(reverseStack.pop() + " ");
        }
    }

}