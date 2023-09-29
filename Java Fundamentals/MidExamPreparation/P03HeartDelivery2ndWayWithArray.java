package JavaFundamentals.Excercises.MidExamPreparation;
import java.util.Arrays;
import java.util.Scanner;

public class P03HeartDelivery2ndWayWithArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] houses = Arrays.stream(scanner.nextLine() //"10@10@10@2"
                        .split("@")) //["10", "10", "10", "2"]
                .mapToInt(Integer::parseInt) //[10, 10, 10, 2]
                .toArray();
        int currentIndex = 0;
        String command = scanner.nextLine();

        while (!command.equals("Love!")) {
            int jumpLength = Integer.parseInt(command.split(" ")[1]);
            currentIndex += jumpLength;
            if (currentIndex > houses.length - 1) {
                currentIndex = 0;
            }
            if (houses[currentIndex] != 0) {
                houses[currentIndex] -= 2;
                if (houses[currentIndex] == 0) {
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