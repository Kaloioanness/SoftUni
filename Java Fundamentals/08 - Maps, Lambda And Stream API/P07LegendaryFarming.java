package JavaFundamentals.Excercises.AssociativeArraysLambdaApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        String shards = "shards";
        String fragments = "fragments";
        String motes = "motes";
        hm.put(shards,0);
        hm.put(fragments,0);
        hm.put(motes,0);

        while (true){
            String input = scanner.nextLine().toLowerCase();
            String[] commands = input.split(" ");
            boolean isWinner = false;

            for (int i = 0; i < commands.length/2; i++) {
                int number = Integer.parseInt(commands[i * 2]);
                String material = commands[i * 2 + 1];

                if (hm.containsKey(material)) {
                    hm.put(material, hm.get(material) + number);
                    if (hm.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        isWinner = true;
                        hm.put(shards,hm.get(shards) - 250);
                        break;
                    }

                    if (hm.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        isWinner = true;
                        hm.put(fragments,hm.get(fragments) - 250);

                        break;

                    }
                    if (hm.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        isWinner = true;
                        hm.put(motes,hm.get(motes) - 250);

                        break;
                    }
                }
                if (!hm.containsKey(material)) {
                    hm.put(material, number);
                }

            }
            if (isWinner){
                break;
            }

        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.printf("%s: %d\n",entry.getKey(),entry.getValue());
        }
    }
}
