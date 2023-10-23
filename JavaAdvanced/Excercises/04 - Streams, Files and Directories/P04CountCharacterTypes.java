package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Set;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPatch = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\otherOutput.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s = bufferedReader.readLine();
        int vowels = 0;
        int punctuations = 0;
        int others = 0;
        Set<Character> vowel = Set.of('a','e','i','o','u');
        Set<Character> punctuation = Set.of('!','.',',','?');
        while (s != null){
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                if (vowel.contains(current)) {
                    vowels++;
                } else if (punctuation.contains(current)) {
                    punctuations++;
                } else if (current != ' ') {
                    others++;
                }
            }
            s = bufferedReader.readLine();
        }
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("Vowels: " + vowels);
        queue.offer("Other symbols: " + others);
        queue.offer("Punctuation: "+ punctuations);
        try (PrintWriter printWriter = new PrintWriter(outPatch)){
            while (!queue.isEmpty()){
                printWriter.printf("%s\n",queue.poll());
            }
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
