package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P06RecursiveFibonacci {
    public static long fibBo(long one, long two, long n) {
        ArrayDeque<Long> queue = new ArrayDeque<>();
        queue.offer(one);
        queue.offer(two);
        long sum = 0;
        if (n == 1) {
            return 1;
        } else {
            for (int i = 1; i < n; i++) {
                long first = queue.poll();
                long second = queue.poll();
                sum = first + second;
                queue.offer(second);
                queue.offer(sum);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(fibBo(1, 1, n));
    }
}