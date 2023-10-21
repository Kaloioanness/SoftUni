package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class P07HandsOfCards2ndWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Set<String>> players = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("JOKER")){
            String[] tokens = scanner.nextLine().split(": ");
            String name = tokens[0];
            if (!players.containsKey(name)){
                players.put(name, new HashSet<>());
            }
            String[] cards = tokens[1].split(", ");
            for (String card :
                    cards) {
                players.get(name).add(card);
            }
            input = scanner.nextLine();
        }
    }
}
