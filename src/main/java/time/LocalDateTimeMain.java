package time;

import java.time.*;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime localDateTime =
                LocalDateTime.of(2021, Month.JANUARY, 2, 11, 11, 11);

        LocalDateTime combineDateAndTime =
                LocalDateTime.of(LocalDate.now(), LocalTime.now());

        System.out.println(now);


    }
}
