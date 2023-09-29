package JavaFundamentals.Excercises.MidExamPreparation;
import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeStudents = Integer.parseInt(scanner.nextLine());
        int secondEmployeeStudents = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeStudents = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = firstEmployeeStudents + secondEmployeeStudents + thirdEmployeeStudents;
        int totalHours = 0;

        while (studentsCount > 0) {
            totalHours++;
            if (totalHours % 4 == 0) {
                continue;
            }
            studentsCount -= studentsPerHour;
        }

        System.out.printf("Time needed: %dh.", totalHours);
    }
}