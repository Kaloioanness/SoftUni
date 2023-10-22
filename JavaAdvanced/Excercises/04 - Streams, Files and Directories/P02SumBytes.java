package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String readLine = bufferedReader.readLine();
        long totalSum = 0;
        while (readLine != null){
            long sum = 0;
            for (int i = 0; i < readLine.length(); i++) {
                long currentChar = readLine.charAt(i);
                sum += currentChar;
            }
            totalSum+=sum;
            readLine = bufferedReader.readLine();
        }
        System.out.println(totalSum);
    }
}
