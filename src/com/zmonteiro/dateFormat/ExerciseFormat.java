package com.zmonteiro.dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExerciseFormat {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS:MMM");

    Date today = new Date();

        System.out.println(sdf.format(today));
        System.out.println(sdf2.format(today));
}
