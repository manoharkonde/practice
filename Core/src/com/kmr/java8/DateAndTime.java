package com.kmr.java8;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {
public static void main(String[] args) {
    
    System.out.println("==LocalDate==");
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate.getDayOfMonth());
    System.out.println(localDate.getDayOfYear());
    System.out.println(localDate.getDayOfWeek());
    System.out.println(localDate.getMonth());
    System.out.println(localDate.getYear());
    System.out.println(localDate.minusYears(8));
    System.out.println(localDate.plusYears(2));
    System.out.println(localDate.MIN);
    System.out.println(localDate.MAX);
    
    System.out.println("==LocalTime==");
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime.toString());   
    System.out.println(localTime.getHour());    
    System.out.println(localTime.getMinute());  
    System.out.println(localTime.getSecond());  
    System.out.println(localTime.MIDNIGHT);     
    System.out.println(localTime.NOON);
    
    System.out.println("==OffsetDateTime==");
    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    System.out.println(offsetDateTime.toString());
    offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
    
    System.out.println(offsetDateTime.toString()); 
    offsetDateTime = OffsetDateTime.now(ZoneId.of("Europe/Paris"));
    System.out.println(offsetDateTime.toString());
    
    System.out.println("==Instant==");
    Instant instant = Instant.now();
    System.out.println(instant.toString());
    System.out.println(instant.plus(Duration.ofDays(5)));
    
    
    System.out.println("==Period==");
    Period period = Period.ofDays(6);
    System.out.println(period.toString());    //P6D
     
    period = Period.ofMonths(6);
    System.out.println(period.toString());    //P6M
     
    period = Period.between(LocalDate.now(),
                LocalDate.now().plusDays(60));
    System.out.println(period.toString());
    
    System.out.println("==Date adjusters==");
    LocalDate date = LocalDate.of(2013, Month.MAY, 15);
    LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println(endOfMonth.toString());  
            
    System.out.println("==Clock===");
    Clock clock = Clock.systemDefaultZone();
    System.out.println(clock); 
    
}
}
