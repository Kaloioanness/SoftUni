package SoftUni.JavaAdvanced.Lab.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P04MatchingBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '('){
                stack.push(i);
            }else if (ch == ')'){
                int start = stack.pop();
                String subs = input.substring(start,i+1 );
                System.out.println(subs);
            }
        }
    }

}