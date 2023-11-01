package JavaAdvanced.Excercises.DefiningClasses.P01OpinionPoll;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            if (age > 30) {
                Person person = new Person();
                person.name = name;
                person.age = age;
                people.add(person);
            } else {
                Person person = new Person();
                person.name = name;
                person.age = age;
            }
        }
        Collections.sort(people, Comparator.comparing(Person::getName));


        for (Person person :
                people) {
        printCars(person);
        }
    }
    private static void printCars(Person person) {
        System.out.printf("%s - %d\n", person.name,person.age);
    }
}
