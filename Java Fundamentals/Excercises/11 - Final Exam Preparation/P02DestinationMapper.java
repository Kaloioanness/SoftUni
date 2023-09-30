package JavaFundamentals.FinalExamPrep;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<splitter>[\\/|\\=])(?<letters>[A-Z][A-Za-z]{2,})\\1";
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> destinations = new ArrayList<>();
        int sum = 0;
        while (matcher.find()){
            String destination = matcher.group("letters");
            destinations.add(destination);
            int length = destination.length();
            sum += length;

        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ",destinations));
        System.out.printf("\nTravel Points: %d", sum);
    }
}
