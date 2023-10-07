package SoftUni.MapsLambdaAndStreamAPI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03OddOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> countWords = new LinkedHashMap<>();
        for (String word :
                words) {
            String wordToLower = word.toLowerCase();
            if (!countWords.containsKey(wordToLower)){
                countWords.put(wordToLower,0);
            }
            countWords.put(wordToLower,countWords.get(wordToLower) + 1);
        }
        ArrayList<String> wordName = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                wordName.add(entry.getKey());

            }
        }
        System.out.print(String.join(", ", wordName));
    }
}
