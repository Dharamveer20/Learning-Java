package com.company;
import java.util.*;

public class DateInJava{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()); // Milliseconds passed after 1/1/1970.
        System.out.println(d.getDate());  // aaj ka date.
        System.out.println(d.getSeconds()); // second deta h current ongoing minute ka.
        System.out.println(d.getMinutes()); // aaj ka kitna baje ka ongoing minute.
        System.out.println(d.getYear()); // year passed since 1900. Output --> 123
        System.out.println(1900 + d.getYear()); // for current ongoing year
        // aise hi getHours, etc h






    }
}
