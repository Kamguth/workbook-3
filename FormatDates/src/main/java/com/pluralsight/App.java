package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        americanSystem(now);
        euSystem(now);
        System.out.println(americanSystemMonth(now));
        daySystem();
        clockSystem(now);
        detailSystem(now);
    }
//shows American calendar system pattern
    static void americanSystem (LocalDateTime now) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(now.format(format1));
    }
//shows European calendar system pattern
    static void euSystem(LocalDateTime now) {
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(now.format(format2));
    }
//shows American calendar system pattern while spelling out the month
    static String americanSystemMonth(LocalDateTime now) {
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return format3.format(now);

    }
//shows American calendar system pattern with emphasis on day of the week
    static void daySystem() {
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(format4));
    }
// displays local time zone
    static void clockSystem(LocalDateTime now) {
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.printf(now.format(format5) + " ß display in GMT time\n");
    }

    static void detailSystem(LocalDateTime now) {
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("H:mm 'on' dd MMM yyyy");
        System.out.println(format6.format(now) + " ß display in your local time zone");
    }
}
