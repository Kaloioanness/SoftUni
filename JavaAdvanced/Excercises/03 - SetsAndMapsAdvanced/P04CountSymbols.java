package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<Character,Integer> symbolOcc = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            symbolOcc.putIfAbsent(ch,0);
            symbolOcc.put(ch,symbolOcc.get(ch) + 1);
        }
        for (Map.Entry<Character, Integer> entry : symbolOcc.entrySet()) {
            System.out.printf("%c: %d time/s\n",entry.getKey(),entry.getValue());
        }
    }
}
