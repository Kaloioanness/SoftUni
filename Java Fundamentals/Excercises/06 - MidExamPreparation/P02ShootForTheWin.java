package JavaFundamentals.Excercises.MidExamPreparation;
import java.util.Arrays;
import java.util.Scanner;

public class P2ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countShotTargets = 0;
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);
            if (shotIndex >= 0 && shotIndex <= targets.length - 1) {
                int shotTarget = targets[shotIndex];
                for (int i = 0; i <=  targets.length - 1; i++) {
                    int currentTarget = targets[i];
                    if (i != shotIndex && currentTarget != -1) {
                        if (currentTarget > shotTarget) {
                            currentTarget -= shotTarget;
                        } else {
                            currentTarget += shotTarget;
                        }
                        targets[i] = currentTarget;
                    }
                }
                targets[shotIndex] = -1;
                countShotTargets++;
            }
            input = scanner.nextLine();
        }
        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}