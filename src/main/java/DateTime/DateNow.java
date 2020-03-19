package DateTime;

import java.util.Calendar;
import java.util.Date;

public class DateNow {
    public static void main(String[] args) {

        long millis = System.currentTimeMillis();
        Date now = new Date(millis);
//        System.out.println(now);

        Calendar convertCalendarToDate = Calendar.getInstance();
        Date date = convertCalendarToDate.getTime();
        System.out.println(date);

        convertCalendarToDate.setTime(now);
        System.out.println("Week: "+ convertCalendarToDate.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Day: "+ convertCalendarToDate.get(Calendar.DAY_OF_YEAR));

    }
}
