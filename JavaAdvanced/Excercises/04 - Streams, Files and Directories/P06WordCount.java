package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class P06WordCount {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String toCheck = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String outPath = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s = bufferedReader.readLine();
        String[] tokens = s.split(" ");
        TreeMap<String, Integer> wordsIn = new TreeMap<>();
        for (int i = 0; i < tokens.length; i++) {
            String current = tokens[i];
            wordsIn.put(current, 0);
        }
        BufferedReader bf = new BufferedReader(new FileReader(toCheck));
        String readLine = bf.readLine();
        while (readLine != null) {
            String[] inToCheckText = readLine.split(" ");
            for (int i = 0; i < inToCheckText.length; i++) {
                String current = inToCheckText[i];
                if (wordsIn.containsKey(current)) {
                    wordsIn.put(current, wordsIn.get(current) + 1);
                }
            }
            readLine = bf.readLine();

            // Create a list of entries from the TreeMap
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordsIn.entrySet());

            Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
            try (PrintWriter printWriter = new PrintWriter(outPath)) {
                for (Map.Entry<String, Integer> entry : entryList) {
                   printWriter.printf("%s - %d\n", entry.getKey(), entry.getValue());
                }
            }catch (Exception e){
                System.out.println("error404");
            }
        }
    }
}