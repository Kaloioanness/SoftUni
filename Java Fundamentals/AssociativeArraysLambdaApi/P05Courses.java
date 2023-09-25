package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> studCount = new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<String>>  courseName = new LinkedHashMap<>();
        String commands = scanner.nextLine();
        while (!commands.equals("end")){
            String[] command = commands.split(" : ");
            String name = command[0];
            String stud = command[1];
            if (studCount.containsKey(name)){
                studCount.put(name,studCount.get(name)+1);
                courseName.get(name).add(stud);


            }else {
                studCount.put(name,1);
                courseName.put(name,new ArrayList<>());
                courseName.get(name).add(stud);
            }
            commands = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : courseName.entrySet()) {
            String currentName = entry.getKey();

            System.out.printf("%s: %d\n",currentName,studCount.get(currentName));
            for (String el :
                    entry.getValue()) {
                System.out.printf("-- %s\n",el);
            }

        }
    }
}
