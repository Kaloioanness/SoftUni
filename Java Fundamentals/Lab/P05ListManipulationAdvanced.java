package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05ListManipulationAdvanced {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<>();

            String inputLine = scanner.nextLine();
            String[] inputTokens = inputLine.split(" ");
            for (String token : inputTokens) {
                numbers.add(Integer.parseInt(token));
            }

            while (true) {
                String command = scanner.nextLine();

                if (command.equals("end")) {
                    break;
                }

                String[] tokens = command.split(" ");
                String action = tokens[0];

                switch (action) {
                    case "Contains":
                        int numberToCheck = Integer.parseInt(tokens[1]);
                        if (numbers.contains(numberToCheck)) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No such number");
                        }
                        break;

                    case "Print":
                        if (tokens[1].equals("even")) {
                            printEven(numbers);
                        } else if (tokens[1].equals("odd")) {
                            printOdd(numbers);
                        } else if (tokens[1].equals("sum")) {
                            printSum(numbers);
                        }
                        break;

                    case "Get":
                        if (tokens[1].equals("sum")) {
                            printSum(numbers);
                        }
                        break;

                    case "Filter":
                        String condition = tokens[1];
                        int filterValue = Integer.parseInt(tokens[2]);
                        filterAndPrint(numbers, condition, filterValue);
                        break;

                    default:
                        break;
                }
            }
        }

        private static void printEven(List<Integer> numbers) {
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        private static void printOdd(List<Integer> numbers) {
            for (int num : numbers) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        private static void printSum(List<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println(sum);
        }

        private static void filterAndPrint(List<Integer> numbers, String condition, int filterValue) {
            for (int num : numbers) {
                if (condition.equals(">=") && num >= filterValue) {
                    System.out.print(num + " ");
                } else if (condition.equals("<") && num < filterValue) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }