package ObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    private static class Song{
        String typeList;
        String name;
        String time;
        public Song (String typeList,String name,String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
        public String getName(){
            return this.name;
        }
        public String getTypeList(){
            return this.typeList;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] text = scanner.nextLine().split("_");

            Song song = new Song(text[0],text[1],text[2]);
            songsList.add(song);
        }

        String finalCommand = scanner.nextLine();

        if (finalCommand.equals("all")){
            for (Song current :
                    songsList) {
                System.out.println(current.getName());
            }
        } else {
            for (Song current :
                    songsList) {
                String currentTypeList = current.getTypeList();
                if (currentTypeList.equals(finalCommand)){
                    System.out.println(current.getName());
                }
            }
        }

    }
}