package SoftUni.JavaAdvanced.Lab.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String fileName = scanner.nextLine();
        while (!fileName.equals("print")){
            if (fileName.equals("cancel")) {
                if (queue.size() > 0) {

                    System.out.println(("Canceled " + queue.poll()));

                }else {
                    System.out.println("Printer is on standby");

                }
            }else {
                queue.offer(fileName);
            }
            fileName = scanner.nextLine();
        }
        while (queue.size() != 0){
            System.out.println(queue.poll());
        }
    }

}