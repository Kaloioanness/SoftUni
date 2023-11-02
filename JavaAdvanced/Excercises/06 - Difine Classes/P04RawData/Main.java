package JavaAdvanced.Excercises.DefiningClasses.P04RawData;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Car>> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split(" ");
            String model = token[0];
            Tires[] tiresArr = new Tires[4];
            int engineSpeed = Integer.parseInt(token[1]);
            int enginePower = Integer.parseInt(token[2]);
            Engine engine = new Engine(engineSpeed,enginePower);

            int cargoWeight = Integer.parseInt(token[3]);
            String cargoType = token[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);

            for (int j = 1; j < 5; j++) {
                double tire1pressure = Double.parseDouble(token[j*2+3]);
                int tire1age = Integer.parseInt(token[j*2+4]);
                Tires tires = new Tires(tire1pressure,tire1age);
                tiresArr[j-1] = tires;
            }
            Car car = new Car(model,engine,cargo,tiresArr);
            cars.putIfAbsent(cargoType,new ArrayList<>());
            cars.get(cargoType).add(car);
        }
        String typeToSearch = scanner.nextLine();
        for (Map.Entry<String, List<Car>> entry : cars.entrySet()) {
            if (typeToSearch.equals("fragile")) {
                List<Car> fragileCars = entry.getValue().stream().filter(Car::isSmaller).collect(Collectors.toList());
                if (!fragileCars.isEmpty()) {
                    fragileCars.forEach(car -> System.out.println(car.getModel()));
                }
            } else if (typeToSearch.equals("flamable")) {
                List<Car> flamableCars = entry.getValue().stream().filter(Car::isFlamable).collect(Collectors.toList());
                if (!flamableCars.isEmpty()) {
                    flamableCars.forEach(car -> System.out.println(car.getModel()));
                }

            }
        }

    }
}
