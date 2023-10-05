package Lists;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> items = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < items.size() - 1; i++) {

            double currentNum = items.get(i);
            double nextNum = items.get(i+1);

            if (currentNum == nextNum){
                double sum = currentNum + nextNum;

                items.set(i, sum);
                items.remove(i + 1);
                i = - 1;

            }


        }
        DecimalFormat format = new DecimalFormat("0.#");
        for (double num :
                items) {
            System.out.print(format.format(num) + " ");
        }

    }
}