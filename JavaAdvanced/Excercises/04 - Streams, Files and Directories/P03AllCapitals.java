package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;

public class P03AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String readLine = bufferedReader.readLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (readLine != null){
            String upperCase = readLine.toUpperCase();
            queue.offer(upperCase);
            readLine = bufferedReader.readLine();
        }
        try (PrintWriter printWriter = new PrintWriter(outPath)){
            while (!queue.isEmpty()) {
                printWriter.println(queue.poll());
            }
        }catch (IOException e){
            System.out.println("Error");
        }

    }
}
