package JavaAdvanced.Excercises.Generics.P01GenericBox;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Box<String> stringBox = new Box<>(input);
            System.out.println(stringBox.toString());
        }
    }

}
