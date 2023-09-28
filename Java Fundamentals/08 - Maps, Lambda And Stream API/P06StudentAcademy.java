package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,Double> studentsGrade = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> studentsCount = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsCount.containsKey(studentName)){
                studentsCount.put(studentName,0);
                studentsGrade.put(studentName,0.0);
            }
            studentsCount.put(studentName, studentsCount.get(studentName)+1);
            studentsGrade.put(studentName, studentsGrade.get(studentName)+grade);
        }
        for (Map.Entry<String, Double> entry : studentsGrade.entrySet()) {
            String currentName = entry.getKey();
            double averageGrade = entry.getValue() / studentsCount.get(currentName);
            if (averageGrade >= 4.5){
                System.out.printf("%s -> %.2f\n",currentName,averageGrade);
            }
        }
    }
}
