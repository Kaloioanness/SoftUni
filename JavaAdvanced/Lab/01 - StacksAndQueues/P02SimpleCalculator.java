package SoftUni.JavaAdvanced.Lab.StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;

public class P02SimpleCalculator {
    public static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--;
                numbers.push(Integer.parseInt(num.toString()));
            } else if (c == '+' || c == '-') {
                while (!operators.isEmpty() && (operators.peek() == '+' || operators.peek() == '-')) {
                    int b = numbers.pop();
                    int a = numbers.pop();
                    char op = operators.pop();
                    if (op == '+') {
                        numbers.push(a + b);
                    } else {
                        numbers.push(a - b);
                    }
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            int b = numbers.pop();
            int a = numbers.pop();
            char op = operators.pop();
            if (op == '+') {
                numbers.push(a + b);
            } else {
                numbers.push(a - b);
            }
        }

        if (!numbers.isEmpty()) {
            return numbers.pop();
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();

        int result = evaluateExpression(expression);
        System.out.println(result);
    }
}