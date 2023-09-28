package JavaFundamentals.Excercises.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double totalIncome = 0;

        while (!(input = scanner.nextLine()).equals("end of shift")) {
            String regex = "%([A-Z][a-z]+)%[^\\d\\|\\$\\.%]*<([\\w]+)>[^\\d\\|\\$\\.%]*\\|([\\d]+)\\|[^\\d\\|\\$\\.%]*([\\d]+\\.?[\\d]*)\\$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customerName = matcher.group(1);
                String product = matcher.group(2);
                int count = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));
                double totalPrice = count * price;
                totalIncome += totalPrice;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPrice);
            }
        }

        System.out.printf("Total income: %.2f%n", totalIncome);
    }
}