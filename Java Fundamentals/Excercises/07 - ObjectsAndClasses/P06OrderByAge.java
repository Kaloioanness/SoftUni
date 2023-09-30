package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06OrderByAge {
    private static class Person{
        String name;
        String ID;
        int age;
        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        public int compareTo(Person other){
            return Integer.compare(this.age,other.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] data = input.split(" ");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);
            Person person = new Person(name,ID,age);
            personList.add(person);
            input = scanner.nextLine();
        }
        Collections.sort(personList, Person::compareTo);
        for (Person el :
                personList) {
            System.out.printf("%s with ID: %s is %d years old.\n",el.getName(),el.getID(),el.getAge());
        }
    }
}
