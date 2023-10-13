package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P04BasicQueueOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int n = Integer.parseInt(elements[0]);
        int s = Integer.parseInt(elements[1]);
        int x = Integer.parseInt(elements[2]);
        int min = Integer.MAX_VALUE;

        if (n <= s){
            System.out.println(0);
            return;
        }else {
            int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            for (int num:arrays
            ) {
                queue.offer(num);
            }
            for (int i = 0; i < s; i++) {
                queue.poll();
            }
            while (!queue.isEmpty()){
                int current = queue.poll();
                if (x == current){
                    System.out.print("true");
                    return;
                }else {
                    if (current < min){
                        min = current;
                    }
                }
            }
        }
        System.out.println(min);
    }
}