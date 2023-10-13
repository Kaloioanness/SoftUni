package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P03MaximumElement {
    public static int maxEl(ArrayDeque<Integer> stack){
        int max = Integer.MIN_VALUE;
        while (!stack.isEmpty()){
            int current = stack.pop();
            if (max < current){
                max = current;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(" ");
            String command = commands[0];
            switch (command){
                case "1":
                    int x = Integer.parseInt(commands[1]);
                    stack.push(x);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    ArrayDeque<Integer> neStack = new ArrayDeque<>(stack    );
                    System.out.println(maxEl(neStack));
                    break;
            }
        }
    }

}