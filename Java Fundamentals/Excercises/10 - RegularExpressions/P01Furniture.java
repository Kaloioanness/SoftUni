package JavaFundamentals.Excercises.RegularExpressions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String regex = ">>(?<name>\\w+)<<(?<price>[0-9|0-9.0-9]+)!(?<quantity>[0-9]+)\\b";
        String text = scanner.nextLine();
        ArrayList<String> boughtF = new ArrayList<>();
        double result = 0.0;
        while (!text.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()){
                boughtF.add(matcher.group("name"));
                double currentPrice = Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
                result+=currentPrice;
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String nameOfF :
                boughtF) {
            System.out.println(nameOfF);
        }
        System.out.printf("Total money spend: %.2f",result);
    }
}
