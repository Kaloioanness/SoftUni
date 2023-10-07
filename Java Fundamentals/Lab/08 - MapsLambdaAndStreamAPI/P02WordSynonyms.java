package SoftUni.MapsLambdaAndStreamAPI;

import java.util.Scanner;
import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!hashMap.containsKey(word)){
                hashMap.put(word,new ArrayList<>());
            }
            hashMap.get(word).add(synonym);


        }
        for (Map.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
            System.out.printf("%s - %s\n",entry.getKey(),String.join(", ",  entry.getValue()));
        }
    }

}