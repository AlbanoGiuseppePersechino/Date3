import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = dateTime.getYear();
        System.out.println("Year: " + year);

        Month month = dateTime.getMonth();
        System.out.println("Month: " + month);

        int day = dateTime.getDayOfMonth();
        System.out.println("Day: " + day);

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);
    }
}