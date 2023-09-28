package JavaFundamentals.Excercises.RegularExpressions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)");

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String encryptedMessage = scanner.nextLine();
            int key = countStarLetters(encryptedMessage);

            StringBuilder decryptedMessage = new StringBuilder();
            for (int j = 0; j < encryptedMessage.length(); j++) {
                char currentChar = (char) (encryptedMessage.charAt(j) - key);
                decryptedMessage.append(currentChar);
            }

            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String planetName = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("type").equals("A") ? "Attack" : "Destruction";
                int soldiers = Integer.parseInt(matcher.group("soldiers"));

                if (attackType.equals("Attack")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }
        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.println("Attacked planets: " + attackedPlanets.size());
        for (String planetName : attackedPlanets) {
            System.out.println("-> " + planetName);
        }

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        for (String planetName : destroyedPlanets) {
            System.out.println("-> " + planetName);
        }
    }

    private static int countStarLetters(String message) {
        String lowercaseMessage = message.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowercaseMessage.length(); i++) {
            char currentChar = lowercaseMessage.charAt(i);
            if (currentChar == 's' || currentChar == 't' || currentChar == 'a' || currentChar == 'r') {
                count++;
            }
        }
        return count;
    }
}