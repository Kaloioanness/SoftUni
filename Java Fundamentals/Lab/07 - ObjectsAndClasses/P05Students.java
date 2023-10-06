package ObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    private static class Student{
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student (String firstName, String lastName, String age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }
        public String getHomeTown() {
            return this.homeTown;
        }
        public String getAge() {
            return this.age;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            String firstName = command[0];
            String lastName = command[1];
            String age = command[2];
            String homeTown = command[3];
            Student student = new Student(firstName,lastName,age,homeTown);
            students.add(student);
            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Student el :
                students) {
            String currentStud = el.getHomeTown();
            if (currentStud.equals(cityName)){
                System.out.printf("%s %s is %s years old\n",el.getFirstName(),el.getLastName(),el.getAge());
            }
        }
    }
}
