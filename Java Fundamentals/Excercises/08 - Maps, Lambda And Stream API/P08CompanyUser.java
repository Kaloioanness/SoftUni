package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P08CompanyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> hm = new LinkedHashMap<>();

        while (!input.equals("End")){
            String[] inputs = input.split(" -> ");
            String company = inputs[0];
            String code = inputs[1];
            if (!hm.containsKey(company)){
                hm.put(company,new ArrayList<>());

            }
            if (!hm.get(company).contains(code)){
                hm.get(company).add(code);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
            String currentName = entry.getKey();
            System.out.println(currentName);
            for (String el :
                    entry.getValue()) {
                System.out.printf("-- %s\n",el);
            }
        }

    }
}
