package JavaAdvanced.Excercises.DefiningClasses.P07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //1 компания
    private Company company;
    //1 кола
    private Car car;
    //списък с родители
    private List<Parent> parents;
    //списък с деца
    private List<Child> children;
    //списък с покемони
    private List<Pokemon> pokemons;

    public Person () {
        //company = null
        //car = null
        //parents = празен списък
        this.parents = new ArrayList<>();
        //children = празен списък
        this.children = new ArrayList<>();
        //pokemons = празен списък
        this.pokemons = new ArrayList<>();
    }
    public Person(Company company, Car car, List<Parent> parents, List<Child> children, List<Pokemon> pokemons) {
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemons = pokemons;
    }

    //setter
    public void setCompany(Company company) {
        this.company = company;
    }

    //getter for pokemons
    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //JavaAdvanced.Excercises.DefiningClasses.P07Google.Company:
        //JavaAdvanced.Excercises.DefiningClasses.P07Google.vehicle.car.JavaOOP.Excercises.L03Inheritance.P04NeedForSpeed.Car:
        //Trabant 30
        //JavaAdvanced.Excercises.DefiningClasses.P07Google.Pokemon:
        //Electrode Electricity
        //Parents:
        //Children:
        builder.append("JavaAdvanced.Excercises.DefiningClasses.P07Google.Company:").append("\n");
        if (company != null) {
            builder.append(company).append("\n");
        }
        builder.append("JavaAdvanced.Excercises.DefiningClasses.P07Google.vehicle.car.JavaOOP.Excercises.L03Inheritance.P04NeedForSpeed.Car:").append("\n");
        if (car != null) {
            builder.append(car).append("\n");
        }

        builder.append("JavaAdvanced.Excercises.DefiningClasses.P07Google.Pokemon:").append("\n");
        for (Pokemon pokemon : pokemons) {
            builder.append(pokemon).append("\n");
        }

        builder.append("Parents:").append("\n");
        for (Parent parent : parents) {
            builder.append(parent).append("\n");
        }

        builder.append("Children:").append("\n");
        for (Child child : children) {
            builder.append(child).append("\n");
        }

        return builder.toString();
    }
}