package com.dlx.chapter8.pair2;

import com.dlx.chapter8.Pair;

import java.time.LocalDate;

public class DateInterval extends Pair<LocalDate> {

    public DateInterval(){
        first=LocalDate.of(1995,11,23);
        second=LocalDate.of(2000,12,12);
    }

    public void setSecond(LocalDate localDate){
        if(first.compareTo(second)<0)
            super.setSecond(localDate);
    }
}
