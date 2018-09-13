package java8.date;

import java.time.LocalTime;

/**
 * <pre>
 * </pre>
 *
 * @author jianwu6 [2018/9/13 10:36]
 */
public class TimeSample {

    public static void main(String[] args) {
        localTime();
    }

    private static void localTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
