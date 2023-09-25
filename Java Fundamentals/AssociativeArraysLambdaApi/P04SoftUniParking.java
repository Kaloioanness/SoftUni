package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(" ");
            String command = commands[0];
            switch (command){
                case "register":
                    String name = commands[1];
                    String number = commands[2];
                    if (hm.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s\n",hm.get(name));
                    }else {
                        hm.put(name, number);
                        System.out.printf("%s registered %s successfully\n", name, number);
                    }
                    break;
                case "unregister":
                    String named = commands[1];
                    if (hm.containsKey(named)) {
                        hm.remove(named);
                        System.out.printf("%s unregistered successfully\n",named);
                    }else {
                        System.out.printf("ERROR: user %s not found\n",named);
                    }
            }
        }
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());
        }
    }
}
