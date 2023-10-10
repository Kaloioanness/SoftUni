package SoftUni.JavaAdvanced.Lab.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")){
            if (input.equals("back")){
                if (stack.size() > 1){
                    stack.pop();
                    System.out.println(stack.peek());
                }else {
                    System.out.println("no previous URLs");
                }

            }else {
                System.out.println(input);
                stack.push(input);
            }
            input = scanner.nextLine();
        }
    }

}