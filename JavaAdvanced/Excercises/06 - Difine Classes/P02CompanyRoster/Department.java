package JavaAdvanced.Excercises.DefiningClasses.P02CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
    List<Employee> employees;
    String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;       //име на сферата
        this.employees = new ArrayList<>();         //списък със служители в сферата
    }
    public double avSalary(){
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public List<Employee> getEmp(){
        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
    }

}
