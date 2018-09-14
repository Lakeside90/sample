package java8.date;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * </pre>
 *
 * @author jianwu6 [2018/9/13 10:36]
 */
public class TimeSample {

    public static void main(String[] args) throws InterruptedException {
        localTime();
    }

    private static void localTime() throws InterruptedException {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //23:59:59
        LocalTime localTime1 = LocalTime.of(23, 59, 59);
        System.out.println(localTime1);

        TimeUnit.MILLISECONDS.sleep(2000);

        LocalTime localTime2 = LocalTime.now();
        long seconds = ChronoUnit.SECONDS.between(localTime, localTime2);
        System.out.println("between: " + seconds);
    }
}
