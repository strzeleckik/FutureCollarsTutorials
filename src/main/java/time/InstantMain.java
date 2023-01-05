package time;

import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Instant oneHourLater = now.plusSeconds(3600);
        System.out.println(now.toEpochMilli());
        Instant fromTimestamp = Instant.ofEpochMilli(now.toEpochMilli());

        System.out.println(oneHourLater);
        System.out.println(fromTimestamp);
    }
}
