package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoll {
    private static class Person{
        String name;
        int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        public int getAge(){
            return this.age;
        }
        public String getName(){
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int currentAge = Integer.parseInt(input[1]);
            Person person = new Person(input[0],Integer.parseInt(input[1]));
            personList.add(person);
        }
        for (Person el :
                personList) {
            if (el.getAge() > 30){
                System.out.printf("%s - %d\n",el.getName(),el.getAge());
            }
        }
    }
}
