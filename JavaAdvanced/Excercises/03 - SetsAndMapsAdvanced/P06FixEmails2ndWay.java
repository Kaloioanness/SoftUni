package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06FixEmails2ndWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LinkedHashMap<String, String> domain = new LinkedHashMap<>();
        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")){
                domain.put(name,email);
            }
            name = scanner.nextLine();
        }
        domain.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value));
    }
}
