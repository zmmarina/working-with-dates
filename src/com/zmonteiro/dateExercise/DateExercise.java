package com.zmonteiro.dateExercise;

import java.time.LocalDateTime;
import java.time.Month;

public class DateExercise {


    LocalDateTime date = LocalDateTime.of(2010, Month.MAY, 15, 10, 00, 00);
    LocalDateTime future = date.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(future);
}
