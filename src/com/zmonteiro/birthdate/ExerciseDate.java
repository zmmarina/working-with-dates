package com.zmonteiro.birthdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExerciseDate {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Date birthDate = sdf.parse("16/02/1987");
    long millis = birthDate.getTime();

        if(birthDate.after(sdf.parse("15/05/2010"))){
        System.out.println("Your birthdate is after 15/05/2010");
    }
        if(birthDate.before(sdf.parse("15/05/2010"))){
        System.out.println("Your birthdate is before 15/05/2010");
    } else{
        System.out.println("You were born on 15/05/2010");
    }
}
