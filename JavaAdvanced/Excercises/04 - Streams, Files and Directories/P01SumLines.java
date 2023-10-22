package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.*;

public class P01SumLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String readLine = bufferedReader.readLine();

        while (readLine != null){
            int sum = 0;
            for (int i = 0; i < readLine.length(); i++) {
                int currentChar = readLine.charAt(i);
                sum += currentChar;
            }
            System.out.println(sum);
            readLine = bufferedReader.readLine();
        }
    }
}
