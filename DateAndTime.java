import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {


    public static void main(String args[])
    {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        int dd=ld.getDayOfMonth();
        int mm=ld.getMonthValue();
        int yy=ld.getYear();

        System.out.println(dd+"/"+mm+"/"+yy);

        int h=lt.getHour();
        int m= lt.getMinute();
        int s= lt.getSecond();

        System.out.println(h+"/"+m+"/"+s);


        LocalDate dt1 = LocalDate.of(1996, Month.AUGUST,25);
        System.out.println(dt1.plusMonths(6));





    }
}
