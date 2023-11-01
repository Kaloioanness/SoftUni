package JavaAdvanced.Excercises.DefiningClasses.P02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            String email = "n/a";
            int age = -1;
            if (tokens.length > 4) {
                if (tokens[4].contains("@")) {
                    email = tokens[4];
                } else {
                    age = Integer.parseInt(tokens[4]);
                }
            }
            if (tokens.length > 5) {
                age = Integer.parseInt(tokens[5]);
            }
            Employee employee = new Employee(name,salary,position,department,email,age);
            departments.putIfAbsent(department,new Department(department));
            departments.get(department).addEmployee(employee);

        }
        Department highestAv = departments.entrySet().stream().max(Comparator.comparingDouble(entry -> entry.getValue().avSalary())).orElseThrow().getValue();
        System.out.printf("Highest Average Salary: %s\n",highestAv.getDepartmentName());
        highestAv.getEmp().forEach(employee -> System.out.println(employee.toString()));
    }
}
