package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] givenNum = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = givenNum[0];
        int s = givenNum[1];
        int x = givenNum[2];
        if (n <= s){
            System.out.println(0);
            return;

        }else {
            int[] givenNum2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            for (int numb :
                    givenNum2) {
                stack.push(numb);
            }
            for (int i = 0; i < s; i++) {
                stack.pop();
            }
            int lowest = Integer.MAX_VALUE;
            boolean isThere = false;
            while (!stack.isEmpty()){
                int current = stack.pop();
                if (x == current) {
                    isThere = true;
                    break;
                }
                if (lowest > current) {
                    lowest = current;
                }
            }
            if (isThere) {
                System.out.println("true");
            } else {
                System.out.println(lowest);
            }
        }
    }
}