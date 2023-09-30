package JavaFundamentals.Excercises.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            processPassword(password);
        }
    }
    public static void processPassword(String password) {
        String pattern = "_(\\.+)([A-Z][A-Za-z0-9]*[A-Z])_(\\.+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(password);

        if (matcher.matches()) {
            String inner = matcher.group(2);
            if (inner.length() >= 6 && inner.matches("[A-Z][A-Za-z0-9]*[A-Z]")) {
                String digits = inner.replaceAll("[^0-9]", "");
                String group = digits.isEmpty() ? "default" : digits;
                System.out.println("Group: " + group);
            } else System.out.println("Invalid pass!");
        } else System.out.println("Invalid pass!");
    }
}




