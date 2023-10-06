package ObjectsAndClasses.P07Students2Point0;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String firstName = scanner.next();
            if (firstName.equals("end")) {
                break;
            }

            String lastName = scanner.next();

            int age;
            String hometown;

            // Check if a student with the same first name and last name exists
            boolean studentExists = false;
            for (Student student : students) {
                if (student.firstName.equals(firstName) && student.lastName.equals(lastName)) {
                    studentExists = true;
                    age = scanner.nextInt();
                    hometown = scanner.next();
                    student.age = age;
                    student.hometown = hometown;
                    break;
                }
            }

            if (!studentExists) {
                age = scanner.nextInt();
                hometown = scanner.next();
                students.add(new Student(firstName, lastName, age, hometown));
            }
        }

        String cityFilter = scanner.next();

        Map<String, Integer> lastKnownAgeMap = new HashMap<>();

        for (Student student : students) {
            if (student.hometown.equals(cityFilter)) {
                lastKnownAgeMap.put(student.firstName + " " + student.lastName, student.age);
            }
        }

        for (Map.Entry<String, Integer> entry : lastKnownAgeMap.entrySet()) {
            String studentName = entry.getKey();
            int lastKnownAge = entry.getValue();
            System.out.println(studentName + " is " + lastKnownAge + " years old");
        }

        scanner.close();
    }
}