package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05VehicleCatalogue {
    private static class Catalog {
        String type;
        String model;
        String color;
        int horsePower;
        public Catalog(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }
        public String getType() {return type;}

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumCar = 0.0;
        double sumTruck = 0.0;
        int numCars = 0;
        int numTrucks = 0;
        List<Catalog> catalogs = new ArrayList<>();
        while (!input.equals("End")){
            String[] data = input.split(" ");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);
            Catalog catalog = new Catalog(type,model,color,horsePower);
            catalogs.add(catalog);
            input = scanner.nextLine();
            if (type.equals("car")){
                sumCar += horsePower;
                numCars += 1;
            }else {
                sumTruck += horsePower;
                numTrucks += 1;
            }
        }
        String input2 = scanner.nextLine();

            while (!input2.equals("Close the Catalogue")) {
                for (int i = 0; i < catalogs.size(); i++) {
                    Catalog el = catalogs.get(i);
                    String currentType = el.getType();
                    if (input2.equals(el.model))
                        if (currentType.equals("car")) {
                            System.out.println("Type: Car");
                            System.out.printf("Model: %s\n", el.model);
                            System.out.printf("Color: %s\n", el.color);
                            System.out.printf("Horsepower: %d\n", el.horsePower);
                        } else if(currentType.equals("truck")) {
                            System.out.println("Type: Truck");
                            System.out.printf("Model: %s\n", el.model);
                            System.out.printf("Color: %s\n", el.color);
                            System.out.printf("Horsepower: %d\n", el.horsePower);
                        }
                }
                input2 = scanner.nextLine();
            }
            if (numCars > 0) {
                System.out.printf("Cars have average horsepower of: %.2f.\n", sumCar / numCars);
            }else {
                System.out.println("Cars have average horsepower of: 0.00.");
            }
            if (numTrucks > 0){
                   System.out.printf("Trucks have average horsepower of: %.2f.\n",sumTruck/numTrucks);

            }else {
                System.out.println("Trucks have average horsepower of: 0.00.");

            }
    }
}
