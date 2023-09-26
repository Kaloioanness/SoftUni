package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.time.LocalDate;

public class Try{
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997, 3, 22);
        birthday.plusMonths(4).plusDays(2);
        System.out.println(birthday);
    }
}
