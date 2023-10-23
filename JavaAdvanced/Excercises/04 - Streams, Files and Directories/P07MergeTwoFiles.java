package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String outPath = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputResult.txt";
        BufferedReader bf1 = new BufferedReader(new FileReader(path1));
        BufferedReader bf2 = new BufferedReader(new FileReader(path2));
        ArrayDeque<String> queue = new ArrayDeque<>();
        String s = bf1.readLine();
        String s2 = bf2.readLine();
        while (s != null) {
            queue.offer(s);
            s = bf1.readLine();
        }
        while (s2 != null) {
            queue.offer(s2);
            s2 = bf2.readLine();
        }
        try (PrintWriter printWriter = new PrintWriter(outPath)){
            while (!queue.isEmpty()){
                printWriter.println(queue.poll());
            }
        }catch (Exception e){
            System.out.println("Error404");
        }
    }
}
