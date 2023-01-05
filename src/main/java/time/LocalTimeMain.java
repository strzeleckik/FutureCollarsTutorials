package time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime americaTime = LocalTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println(americaTime);

        System.out.println(time.minusHours(60));

        Duration duration = Duration.between(time, americaTime);
        System.out.println(duration);
    }
}
