package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02Articles {
    private static class Article{
        String title;
        String content;
        String author;
        public Article(String title, String content,String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        public String toString(){
            return title + " - " + content + ": " + author;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArticle = scanner.nextLine().split(", ");

        Article article = new Article(firstArticle[0],firstArticle[1],firstArticle[2]);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            String commandName = command[0];
            String input = command[1];
            if (commandName.equals("Edit")){
                article.setContent(input);
            } else if (commandName.equals("ChangeAuthor")) {
                article.setAuthor(input);
            }else if (commandName.equals("Rename")) {
                article.setTitle(input);
            }
        }
        System.out.println(article);
    }
}
