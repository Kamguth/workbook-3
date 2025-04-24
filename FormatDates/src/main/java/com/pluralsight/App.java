package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) {
        //initializing local date method
        LocalDateTime now = LocalDateTime.now();

        //system types
        americanSystem(now);
        euSystem(now);
        System.out.println(americanSystemMonth(now));
        daySystem();
        clockSystem(now);
        detailedSystem(now);
    }
//shows American calendar system pattern
    static void americanSystem (LocalDateTime now) {
        DateTimeFormatter americanSystem1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(now.format(americanSystem1));
    }
//shows European calendar system pattern
    static void euSystem(LocalDateTime now) {
        DateTimeFormatter euSystem1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(now.format(euSystem1));
    }
//shows American calendar system pattern while spelling out the month
    static String americanSystemMonth(LocalDateTime now) {
        DateTimeFormatter americanSystemMonth1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return americanSystemMonth1.format(now);

    }
//shows American calendar system pattern with emphasis on day of the week
    static void daySystem() {
        DateTimeFormatter daySystem1 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(daySystem1));
    }
// displays local time zone
    static void clockSystem(LocalDateTime now) {
        DateTimeFormatter clockSystem1 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.printf(now.format(clockSystem1) + " ß display in GMT time\n");
    }
//displays local time and date in military format
    static void detailedSystem(LocalDateTime now) {
        DateTimeFormatter detailedSystem1 = DateTimeFormatter.ofPattern("H:mm a dd MMM yyyy");
        System.out.println(detailedSystem1.format(now) + " ß display in your local time zone");
    }
}
