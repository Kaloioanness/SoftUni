package JavaFundamentals.Excercises.TextProcessing;

import java.util.Scanner;

public class P03ExtractFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] filePath = scanner.nextLine().split("\\\\");
        String[] lastOne = filePath[filePath.length-1].split("\\.");
        String fileName = lastOne[0];
        String fileExtension = lastOne[1];
        System.out.printf("File name: %s\n",fileName);
        System.out.printf("File extension: %s",fileExtension);

    }
}
