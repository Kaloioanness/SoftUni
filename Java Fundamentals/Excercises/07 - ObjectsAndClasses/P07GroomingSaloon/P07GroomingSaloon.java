package JavaFundamentals;

public class P07GroomingSaloon {
    public static void main(String[] args) {

        GroomingSalon salon = new GroomingSalon(20);
        Pet dog = new Pet("Rocky", 5, "Haru");
        System.out.println(dog);
        salon.add(dog);
        System.out.println(salon.remove("Rocky"));
        System.out.println(salon.remove("Pufa"));

        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");

        salon.add(cat);
        salon.add(bunny);

        Pet pet = salon.getPet("Bella", "Mia");
        System.out.println(pet);
        System.out.println(salon.getCount());

        System.out.println(salon.getStatistics());
    }
}