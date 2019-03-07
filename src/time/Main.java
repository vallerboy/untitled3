package time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
            LocalDateTime localDateTime = LocalDateTime.now();
        //yyyy - rok
        //yy - dwie cyfry roku
        //MM - miesiac
        //dd - dzien
        //mm - minuty
        //ss - sekundy
        //HH - formatu  czasu 24h
        //hh - format czasu 12h

       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
       // System.out.println(localDateTime.format(formatter));



        //Date data = new Date();
        //System.out.println(data.toString());
    }
}
