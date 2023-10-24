package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P09CopyAPicture {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zaekb\\Desktop\\temida.jpg";
        String outPath = "C:\\Users\\zaekb\\Desktop\\picture-copy.jpg";
        try (FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(outPath)){
            int read = fileInputStream.read();
            while (read != -1){
                fileOutputStream.write(read);
                read = fileInputStream.read();
            }
        }catch (IOException e){
            System.out.println("Error404 - File not found");
        }
    }
}
