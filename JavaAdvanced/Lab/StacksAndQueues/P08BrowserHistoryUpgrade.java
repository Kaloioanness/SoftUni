package SoftUni.JavaAdvanced.Lab.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> backHistory = new ArrayDeque<>();
        Deque<String> forwardHistory = new ArrayDeque<>();
        String currentURL = "";
        String command = scanner.nextLine();

        while (true) {
            if (command.equals("Home")){
                break;
            }else if (command.equals("exit")) {
                break;
            } else if (command.equals("back")) {
                if (backHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.push(currentURL);
                    currentURL = backHistory.pop();
                    System.out.println(currentURL);
                }
            } else if (command.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    backHistory.push(currentURL);
                    currentURL = forwardHistory.pop();
                    System.out.println(currentURL);
                }
            } else {
                backHistory.push(currentURL);
                currentURL = command;
                forwardHistory.clear(); // Clear forward history when navigating to a new URL
                System.out.println(currentURL);
            }
            command = scanner.nextLine();
        }
    }
}