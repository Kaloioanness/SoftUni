package JavaAdvanced.Excercises.StreamsFilesDirectories;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class P12CreateZipArchive {
    public static void main(String[] args) throws IOException {

        String path1 = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt";
        String path2 = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt";
        String path3 = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        String outputPath = "C:\\Users\\zaekb\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\files.zip";

        List<String> paths = List.of(path1,path2,path3);

        try (FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
             ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream)){
             for (String path : paths) {

                 File fileToZip = new File(path);
                 FileInputStream fileInputStream = new FileInputStream(fileToZip);

                 ZipEntry zipEntry = new ZipEntry(fileToZip.getName());

                zipOutputStream.putNextEntry(zipEntry);
                 int read = fileInputStream.read();
                 while (read != -1){
                     zipOutputStream.write(read);
                    read = fileInputStream.read();
                 }
                 fileInputStream.close();
             }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
