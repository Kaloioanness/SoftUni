package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class P08GetFolderSize {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        String outPath =  "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputSizeFolder.txt";
        long sum = 0;
        File directory = new File(path);
        File[] files = directory.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File currentFile = files[i];
                long length = currentFile.length();
                sum += length;
            }
        }
        String output = "Folder size: " + sum;
        try (PrintWriter printWriter = new PrintWriter(outPath)){
            printWriter.println(output);
        }
    }
}
