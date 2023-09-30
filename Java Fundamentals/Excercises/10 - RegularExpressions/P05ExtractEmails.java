package JavaFundamentals.Excercises.RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        List<String> validEmails = extractValidEmails(text);

        for (String email : validEmails) {
            System.out.println(email);
        }
    }

    public static List<String> extractValidEmails(String text) {
        List<String> validEmails = new ArrayList<>();
        String emailRegex = "([a-zA-Z0-9]+[._-]?[a-zA-Z0-9]+)@([a-zA-Z]+(?:-[a-zA-Z]+)*\\.[a-zA-Z]+(?:-[a-zA-Z]+)*)";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String email = matcher.group();
            if (isValidEmail(email)) {
                validEmails.add(email);
            }
        }

        return validEmails;
    }

    public static boolean isValidEmail(String email) {
        String[] parts = email.split("@");
        if (parts.length != 2) return false;

        String userPart = parts[0];
        String hostPart = parts[1];

        if (!userPart.matches("[a-zA-Z0-9]+[._-]?[a-zA-Z0-9]+")) return false;

        return hostPart.matches("([a-zA-Z]+(?:-[a-zA-Z]+)*\\.[a-zA-Z]+(?:-[a-zA-Z]+)*)");
    }
}