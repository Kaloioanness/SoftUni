package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.*;
import java.util.LinkedHashSet;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outPath = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputP05.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s = bufferedReader.readLine();
        LinkedHashSet<String> lines = new LinkedHashSet<>();
        int count = 0;
        while (s != null){
            count++;
            String currentLine = count + ". " + s;
            lines.add(currentLine);
            s = bufferedReader.readLine();
        }
            try  (PrintWriter printWriter = new PrintWriter(outPath)){
                for (String line : lines) {
                    printWriter.println(line);
                }
            }catch (Exception e){
                System.out.println("Cant write it");
            }
    }
}
