package Java8Function.DateTimeAPIClasses;

import java.time.*;
import java.util.Locale;

public class NewDateTimeAPI {

    public static void main(String[] args) {

        //TODO WE CAN MAKE THE CUSTOM TIME TO ALL
        //TODO WE HAVE 24 ZONE PRIME ACCORDING TO UTC
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate customDate=LocalDate.of(2026,2,12);
        System.out.println("customDate==> "+customDate);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);




    }
}
