package com.dlx.chapter06;

public class Temp  implements Person,Student{

    public static void main(String[] args) {
        System.out.println(Integer.compare(3,4));
        String a="xxx";
        String b="yyy";
        System.out.println(a.compareToIgnoreCase(b));
    }

    @Override
    public String getName() {
        return Person.super.getName();
    }

    @Override
    public String getAge() {
        return "23";
    }
}
