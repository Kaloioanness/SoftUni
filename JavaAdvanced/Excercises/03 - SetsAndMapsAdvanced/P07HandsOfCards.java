package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();
        while (!input.equals("JOKER")){
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] pAndT = tokens[1].split(", ");
            map.putIfAbsent(name,new ArrayList<>());
            for (int i = 0; i < pAndT.length; i++) {
                String current = pAndT[i];
                if (map.get(name).contains(current)){
                    map.get(name).remove(current);
                }
                map.get(name).add(current);
            }
            input = scanner.nextLine();
        }


        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            int powerRate = 0;
            int typeRate = 0;
            int sum = 0;
            String named = entry.getKey();
            for (String s :
                    entry.getValue()) {
                char power = s.charAt(0);
                switch (power) {
                    case '2':
                        powerRate = 2;
                        break;
                    case '3':
                        powerRate = 3;
                        break;
                    case '4':
                        powerRate = 4;
                        break;
                    case '5':
                        powerRate = 5;
                        break;
                    case '6':
                        powerRate = 6;
                        break;
                    case '7':
                        powerRate = 7;
                        break;
                    case '8':
                        powerRate = 8;
                        break;
                    case '9':
                        powerRate = 9;
                        break;
                    case '1':
                        powerRate = 10;
                        break;
                    case 'J':
                        powerRate = 11;
                        break;
                    case 'Q':
                        powerRate = 12;
                        break;
                    case 'K':
                        powerRate = 13;
                        break;
                    case 'A':
                        powerRate = 14;
                        break;
                }
                char type = s.charAt(s.length()-1);
                switch (type){
                    case 'S':
                        typeRate = 4;
                        break;
                    case 'H':
                        typeRate = 3;
                        break;
                    case 'D':
                        typeRate = 2;
                        break;
                    case 'C':
                        typeRate = 1;
                        break;
                }
                sum += powerRate * typeRate;

            }
            System.out.printf("%s: %d\n",named,sum);
        }
    }
}
