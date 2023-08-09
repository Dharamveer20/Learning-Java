package com.company;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
public class DateInJava{
    public static void main(String[] args) {
//        LocalDate  d = LocalDate.now();
//        System.out.println(d); // output --> 2023-08-08
//
//        LocalTime t = LocalTime.now();
//        System.out.println(t); // output --> 18:44:47.257231100
//        // Yaha apn seconds ke saath nanoseconds bhi records kr rahe h to accuracy aur better ho jaata h.

        LocalDateTime dt = LocalDateTime.now(); // ye h mera date

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); // ye h mera format

        String myDate = dt.format(df);  // mere date ko format krdo
        System.out.println(myDate); // output --> 08/08/2023

        // We can even write anything inside the formatter and vo print ho jayega, Eg
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-MM-yy!!");
        String myDate1 = dt.format(df1);
        System.out.println(myDate1);  // Output --> 08-08-23!!


        // Some Formats are already present, eg
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE; // ye h mera format

        String myDate2 = dt.format(df2); // mere date ko format krdo
        System.out.println(myDate2); // output  --> 2023-08-08

        // There are lots of formatter present google krle.


//        System.out.println(dt);  // output --> 2023-08-08T18:45:50.480034900
//        Calendar c = Calendar.getInstance(); // c is the variable name
//        System.out.println(c.getTime()); // Output --> Tue Aug 08 17:10:55 IST 2023
//        System.out.println(c.get(Calendar.DATE)); // returns today's date
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR)); // return hour in 12 hour format
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)); // return hour in 24 hour format

//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime()); // Milliseconds passed after 1/1/1970.
//        System.out.println(d.getDate());  // aaj ka date.
//        System.out.println(d.getSeconds()); // second deta h current ongoing minute ka.
//        System.out.println(d.getMinutes()); // aaj ka kitna baje ka ongoing minute.
//        System.out.println(d.getYear()); // year passed since 1900. Output --> 123
//        System.out.println(1900 + d.getYear()); // for current ongoing year
        // aise hi getHours, etc h
    }
}
