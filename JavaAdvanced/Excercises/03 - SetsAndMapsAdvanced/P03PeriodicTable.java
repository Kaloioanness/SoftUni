package JavaAdvanced.Excercises.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> chemEl = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (String el :
                    elements) {
                if (!chemEl.contains(el)){
                    chemEl.add(el);
                }
            }
        }
        for (String s : chemEl) {
            System.out.print(s + " ");
        }
    }
}
