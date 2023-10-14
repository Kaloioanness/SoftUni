package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;


public class P08InfixToPostfix {
    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        int precedence = 0;

        String[] tokens = infixExpression.split(" ");
        for (String token : tokens) {
            if (token.matches("[0-9]+")) {
                postfix.append(token).append(" ");
            } else if (token.equals("(")) {
                operatorStack.push(token.charAt(0));
            } else if (token.equals(")")) {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop()).append(" ");
                }
                operatorStack.pop();
            } else {
                int tokenPrecedence = getPrecedence(token.charAt(0));
                while (!operatorStack.isEmpty() && tokenPrecedence <= getPrecedence(operatorStack.peek())) {
                    postfix.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(token.charAt(0));
            }
        }
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    public static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infixExpression = scanner.nextLine();
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println(postfixExpression);
    }
}