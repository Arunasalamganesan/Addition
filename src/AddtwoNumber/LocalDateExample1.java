package AddtwoNumber;

import java.time.LocalDate;

public class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(7);
        LocalDate tomorrow = yesterday.plusDays(30);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tommorow date: "+tomorrow);
        LocalDate r = LocalDate.now();
        System.out.println(r);

        System.out.println("add the new line in that");
    }
}