package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLoseGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());
        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;

        for (int loseGame = 1; loseGame <= countLoseGames; loseGame++) {
            if (loseGame % 2 == 0) {
                countHeadset++;
            }
            if (loseGame % 3 == 0) {
                countMouse++;
            }
            if (loseGame % 6 == 0) {
                countKeyboard++;
            }
            if (loseGame % 12 == 0) {
                countDisplay++;
            }
        }
        double totalPrice = (countHeadset * priceHeadset)
                + (countMouse * priceMouse)
                + (countKeyboard * priceKeyboard)
                + (countDisplay * priceDisplay);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}