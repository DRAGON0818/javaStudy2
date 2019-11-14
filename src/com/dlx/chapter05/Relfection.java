package com.dlx.chapter05;


import java.lang.reflect.Field;
import java.util.ArrayList;

public class Relfection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee harry = new Employee("Harry Hacker", 3500, 1989, 1, 10);
        Class cl=harry.getClass();
        System.out.println(cl.getName());
        Field name = cl.getDeclaredField("name");
        name.setAccessible(true);
        Object v = name.get(harry);
        name.set(harry,"donglxa");
        System.out.println(harry.getName());
        System.out.println(v);
//        Field salary = cl.getDeclaredField("salary");
//        salary.setAccessible(true);
//        Object m = salary.getDouble("harry");
//        System.out.println(m);
        System.out.println(cl.getComponentType());
        System.out.println(char[].class.getComponentType());
        System.out.println(ArrayList.class.getComponentType());
        System.out.println(ArrayList.class.isArray());

}
}
