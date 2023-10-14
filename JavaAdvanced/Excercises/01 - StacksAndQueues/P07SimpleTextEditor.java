package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        Stack<String> undoStack = new Stack<>();

        int q = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int command = Integer.parseInt(query[0]);

            switch (command) {
                case 1:
                    String toAppend = query[1];
                    text.append(toAppend);
                    undoStack.push("2 " + toAppend.length());
                    break;
                case 2:
                    int count = Integer.parseInt(query[1]);
                    int endIndex = text.length() - count;
                    String removedText = text.substring(endIndex);
                    text.delete(endIndex, text.length());
                    undoStack.push("1 " + removedText);
                    break;
                case 3:
                    int index = Integer.parseInt(query[1]) - 1;
                    if (index >= 0 && index < text.length()) {
                        System.out.println(text.charAt(index));
                    }
                    break;
                case 4:
                    if (!undoStack.isEmpty()) {
                        String lastCommand = undoStack.pop();
                        String[] undoQuery = lastCommand.split(" ");
                        int undoType = Integer.parseInt(undoQuery[0]);
                        if (undoType == 1) {
                            text.append(undoQuery[1]);
                        } else if (undoType == 2) {
                            int undoCount = Integer.parseInt(undoQuery[1]);
                            text.delete(text.length() - undoCount, text.length());
                        }
                    }
                    break;
            }
        }

        scanner.close();
    }
}