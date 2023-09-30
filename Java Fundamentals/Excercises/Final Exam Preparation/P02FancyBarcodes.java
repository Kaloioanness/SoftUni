package JavaFundamentals.FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([\\@][\\#]+)(?<text>[A-Z][A-Za-z|0-9]{4,}[A-Z])+([\\@][\\#]+)";
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.matches()){
                String realBarcode = matcher.group("text");
                StringBuilder sb = new StringBuilder();
                int count = 0;
                for (int j = 0; j < realBarcode.length(); j++) {
                    char ch = realBarcode.charAt(j);
                    if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9'){
                        sb.append(ch);
                        count += 1 ;
                    }
                }
                if (count < 1){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + sb.toString());
                }

            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
