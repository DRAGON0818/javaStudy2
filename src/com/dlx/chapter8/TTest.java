package com.dlx.chapter8;

import com.dlx.chapter8.pair2.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class TTest {
    public static void main(String[] args) {
        /*T<String> t = new T<>();
        t.setT("Nice");
        System.out.println(t.demo1("welcome"));
        System.out.println(t.getT());
        T.demo3(new Employee());;
        List<Integer> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(1);
        list.add(234);*/

        /*getElements(list);
        getElements(list1);
        getElements(list2);
        getElements(list3);

        getElements1(list);
        getElements1(list1);
        getElements1(list2);
        getElements1(list3);*/
        List<Integer> listInterger = new ArrayList<>();
        listInterger.add(1234);
        listInterger.add(22);
        print(listInterger);


        List<String> l = new ArrayList<>();
        l.add("Try");
        l.add("Again");
        print(l);

        Pair<String> stringPair = Pair.makePair(String::new);

        String[] arr = {"a", "b"};
        Object[] o = arr;
        System.out.println(o.getClass());
        o[0] = new Object();
    }

    /*
    public static void setElements(List<Integer> resource, List<? extends Number> numbers) {

        for (int i = resource.size() - 1; i >= 0; i--) {
            Number set = numbers.set(resource.size() - i - 1, resource.get(i));

        }
    }*/


    public static void printN(List<? super Integer> collection) {
        Iterator<? super Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
        }

    }

    public static void printNumbers(List<? extends Number> collection) {
        Iterator<? extends Number> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Number x = iterator.next();
            System.out.println(x.toString());
        }
    }

    public static void print(Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static void getElements(Collection<? extends Number> numbers) {

    }

    public static void getElements1(Collection<? super Number> numbers){

    }
}
