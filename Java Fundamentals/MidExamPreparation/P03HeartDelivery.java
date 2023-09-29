package JavaFundamentals.Excercises.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scanner.nextLine() //"10@10@10@2"
                        .split("@")) //["10", "10", "10", "2"]
                .map(Integer::parseInt) //[10, 10, 10, 2]
                .collect(Collectors.toList());
        int currentIndex = 0;
        String command = scanner.nextLine();

        while (!command.equals("Love!")) {
            int jumpLength = Integer.parseInt(command.split(" ")[1]);
            currentIndex += jumpLength;
            if (currentIndex > houses.size() - 1) {
                currentIndex = 0;
            }
            if (houses.get(currentIndex) != 0) {
                houses.set(currentIndex, houses.get(currentIndex) - 2);
                if (houses.get(currentIndex) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        boolean isFailed = false;
        int countFailedHouse = 0;

        for (int house : houses) {
            if (house != 0) {
                isFailed = true;
                countFailedHouse++;
            }
        }
        if (isFailed) {
            System.out.printf("Cupid has failed %d places.%n", countFailedHouse);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}
