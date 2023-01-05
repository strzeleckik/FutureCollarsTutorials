package time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        LocalDate firstDayOfYear = LocalDate.of(2021, Month.JANUARY, 1);
        System.out.println(firstDayOfYear);
        LocalDate firstDay = LocalDate.ofYearDay(2020, 256);
        System.out.println(firstDay);


        LocalDate birthday = LocalDate.of(1950, Month.AUGUST, 12);

        int age = LocalDate.now().getYear() - birthday.getYear();

        System.out.println(age);

        Period period = Period.between(birthday, dateNow);

        System.out.println(period);
    }
}
