package java8.date;

import java.time.LocalDate;

/**
 * <pre>
 * </pre>
 *
 * @author jianwu6 [2018/9/14 11:01]
 */
public class DateSample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth().getValue());

        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println(tomorrow);

    }
}
