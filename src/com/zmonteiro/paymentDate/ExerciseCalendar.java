package com.zmonteiro.paymentDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExerciseCalendar {

    Scanner sc = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter due date (dd/MM/yyyy): ");
    Date dueDate = sdf.parse(sc.next());
        cal.setTime(dueDate);
        cal.add(Calendar.DATE, 10);

        System.out.println(cal);

       if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
        cal.add(Calendar.DATE, 2);
    } else if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
        cal.add(Calendar.DATE, 1);
    }

    Date now = new Date();
    Date paymentDate = cal.getTime();

        System.out.println("You have " + howManyDays(paymentDate, now) + " days until the last day for payment.");
}

public static int howManyDays (Date d1, Date d2){
        long diff = d1.getTime() - d2.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}