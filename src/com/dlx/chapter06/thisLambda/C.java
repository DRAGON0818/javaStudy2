package com.dlx.chapter06.thisLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.function.Predicate;

public class C {
    public static void main(String[] args) {
        B[] b = new B[5];
        b[0]=new B(1);
        b[1] = new B(20);
        b[2] = new B(3);
        b[3] = new B(2);
        b[4] = new B(15);

        Arrays.sort(b,B::compareTo);
        System.out.println(b);
        Arrays.stream(b).forEach(System.out::println);
        Predicate<Object> a = Predicate.isEqual(111);
        System.out.println(a);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(555555);
        list.add(111);
        list.add(2345);
        list.removeIf(a);
        System.out.println(list);

        Person[] person = new Person[6];
        for (int i = 0; i < person.length; i++) {
            Person p = new Person();
            p.setName("donglxa"+Math.random());
            p.setMiddleName("zhouyu" + Math.random());
            p.setLastName("gaomm" + Math.random());
            p.setAge(i);
            person[i] = p;
        }
        person[1].setMiddleName(null);
        person[3].setMiddleName(null);
        Arrays.stream(person).forEach(e->{
            System.out.println(e.getMiddleName()+"，"+e.getLastName());
        });
        Arrays.sort(person, Comparator.comparing(Person::getMiddleName, (s,t)->{return s.length()-t.length();}));
        System.out.println("**************");
        Arrays.stream(person).forEach(person1 -> System.out.println(person1.getMiddleName()+", "+person1.getLastName()));
        System.out.println("**************");
    }
}
