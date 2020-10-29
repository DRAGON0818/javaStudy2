package com.dlx.chapter8.pair2;

import com.dlx.chapter8.Pair;

import java.io.File;
import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 5),
                LocalDate.of(1815, 2, 4),
                LocalDate.of(2020, 11, 14),
                LocalDate.of(1995, 3, 4)
        };
        Pair<LocalDate> pair = ArrayAlg.minmax(birthdays);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        Manager ceo = new Manager();
        Manager cfo = new Manager();
        Pair<Manager> managerBuddies = new Pair<>(ceo, cfo);
        //Pair<Employee> employeeBuddies = managerBuddies;
        Pair p = managerBuddies;
        p.setFirst(new File(""));
    }
}

class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return  null;
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i])>0) min = a[i];
            if(max.compareTo(a[i])<0) max = a[i];
        }

        return new Pair<>(min, max);
    }
}
