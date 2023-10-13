package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        boolean isTrue = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()){
                    isTrue = false;
                    break;
                }
                char open = stack.pop();
                switch (open){
                    case '{':
                        if (ch != '}') {
                            isTrue = false;
                            break;
                        }
                        break;

                    case '[':
                        if (ch != ']') {
                            isTrue = false;
                            break;
                        }
                        break;

                    case '(':
                        if (ch != ')') {
                            isTrue = false;
                            break;
                        }
                        break;

                    default:
                        isTrue = true;
                }
            }else {
                isTrue = false;
                break;
            }
        }
        if (isTrue){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
