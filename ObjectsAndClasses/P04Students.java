package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P04Students {
    private static class Students{
        String firstName;
        String lastName;
        double grade;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        public Students(String firstName, String lastName, double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
        public int compareTo(Students other){
            return Double.compare(other.grade,this.grade);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Students students1 = new Students(firstName,lastName,grade);
            students.add(students1);
        }

        Collections.sort(students,Students::compareTo);
        for (Students stud :
                students) {
            System.out.printf("%s %s: %.2f\n", stud.getFirstName(),stud.getLastName(),stud.getGrade());
        }
    }
}
