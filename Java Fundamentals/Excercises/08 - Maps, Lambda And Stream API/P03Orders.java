package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<String, Double> productsPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!input[0].equals("buy")){
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);
            if (productsQuantity.containsKey(name)){
                productsQuantity.put(name,productsQuantity.get(name)+quantity);
                productsPrice.put(name,price);
            }
            if (!productsQuantity.containsKey(name)){
                productsQuantity.put(name,quantity);
                productsPrice.put(name,price);
            }



            input = scanner.nextLine().split(" ");
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            String productName = entry.getKey();
            double sum = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f\n",productName,sum);
        }

    }
}
