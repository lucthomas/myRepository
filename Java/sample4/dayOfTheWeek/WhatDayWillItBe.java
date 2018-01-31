// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        Day birthday = new Day(1989, 7, 1);
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900
        int weekday;
        int countDays;
        int Sunday = 0;
        int Monday = 1;
        int Tuesday = 2;
        int Wednesday = 3;
        int Thursday = 4;
        int Friday = 5;
        int Saterday = 6;

        // January 1, 1900 was a Monday
        
        Day firstDay = new Day(1900,1,1);
        
        // Compute the number of days from that day until the birthday
        
        countDays = birthday.daysFrom(firstDay);
        
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
      
        weekday = (Monday + countDays)%7;

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
