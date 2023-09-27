package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startN = Integer.parseInt(scanner.nextLine());   //poke power
        int n = startN;
        int m = Integer.parseInt(scanner.nextLine());   //distance
        int y = Integer.parseInt(scanner.nextLine());   //exhaustion factor
        int targets = 0;
        while (n >= m){
            n -= m;
            targets ++;
            if (n == startN * 0.5 && y != 0){
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(targets);
    }
}

