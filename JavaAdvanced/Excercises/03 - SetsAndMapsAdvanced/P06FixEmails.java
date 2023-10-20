package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> domain = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            String email = scanner.nextLine();
            String[] tokens = email.split("\\.");
            String domainPart = tokens[tokens.length - 1];

            if (!domainPart.equalsIgnoreCase("com") && !domainPart.equalsIgnoreCase("uk") && !domainPart.equalsIgnoreCase("us")) {
                domain.put(input, email);
            }
        }

        for (Map.Entry<String, String> entry : domain.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}

