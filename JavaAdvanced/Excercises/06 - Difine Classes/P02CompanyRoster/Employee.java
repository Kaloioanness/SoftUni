package JavaAdvanced.Excercises.DefiningClasses.P02CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String eMail;
    private int age;

    public Employee(String name, double salary, String position, String department, String eMail, int age) {
        this(name, salary, position, department);
        this.eMail = eMail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String ageString = String.valueOf(age);
        return String.format("%s %.2f %s %s", name, salary, eMail, ageString);
    }

    public double getSalary() {
        return salary;
    }


    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.eMail = "n/a";
        this.age = -1;
    }
}
