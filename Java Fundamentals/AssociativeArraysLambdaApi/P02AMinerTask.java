package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> resourcesCount = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resourcesCount.containsKey(resource)){
                resourcesCount.put(resource, resourcesCount.get(resource) + quantity);
            }else {
                resourcesCount.put(resource, quantity);
            }
            resource = scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : resourcesCount.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(),entry.getValue());
        }
    }
}
