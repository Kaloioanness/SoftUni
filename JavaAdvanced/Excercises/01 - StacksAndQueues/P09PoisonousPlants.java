package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P09PoisonousPlants {
    public static int daysUntilNoPlantsDie(int[] pesticide) {
        Stack<Integer> stack = new Stack<>();
        int[] days = new int[pesticide.length];

        int maxDays = 0;
        for (int i = 0; i < pesticide.length; i++) {
            int daysAlive = 0;

            while (!stack.isEmpty() && pesticide[i] <= pesticide[stack.peek()]) {
                daysAlive = Math.max(daysAlive, days[stack.pop()]);
            }

            if (!stack.isEmpty()) {
                days[i] = daysAlive + 1;
            } else {
                days[i] = 0;
            }

            maxDays = Math.max(maxDays, days[i]);
            stack.push(i);
        }

        return maxDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] pesticide = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int days = daysUntilNoPlantsDie(pesticide);
        System.out.println(days);
    }
}