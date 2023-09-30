package JavaFundamentals.FinalExamPrep;
import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder modifyMessage = new StringBuilder(encryptedMessage);

        String command = scanner.nextLine();
        while(!command.equals("Decode")) {
            if (command.contains("Move")) {
                int countLetters = Integer.parseInt(command.split("\\|")[1]);

                String firstLetters = modifyMessage.substring(0, countLetters);

                modifyMessage.delete(0, countLetters);
                modifyMessage.append(firstLetters);
            } else if (command.contains("Insert")) {

                int index = Integer.parseInt(command.split("\\|")[1]);
                String textToInsert = command.split("\\|")[2];
                if (index >= 0 && index <= modifyMessage.length() - 1) {
                    modifyMessage.insert(index, textToInsert);
                }
            } else if (command.contains("ChangeAll")) {

                String textForChange = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];

                String currentMessage = modifyMessage.toString();
                currentMessage = currentMessage.replace(textForChange, replacement);
                modifyMessage = new StringBuilder(currentMessage);
            }

            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + modifyMessage);


    }
}
