package SoftUni.MapsLambdaAndStreamAPI;

import java.text.DecimalFormat;
import java.util.*;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> counts = new TreeMap<>();
        for (Double num: nums) {
            if (!counts.containsKey(num)){
                counts.put(num, 0);
            }
            counts.put(num,counts.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d\n",df.format(entry.getKey()),entry.getValue());
        }
    }
}