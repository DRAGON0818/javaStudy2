package com.dlx.chapter06;

import java.lang.reflect.Method;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planes = new String[]{"Mercury", "Venus", "Earth", "Mars"};
        System.out.println(Arrays.toString(planes));
        System.out.println("Sorted in dicitionary order:");
        Arrays.sort(planes);
        System.out.println(Arrays.toString(planes));
        System.out.println("Sorted by length:");
        Arrays.sort(planes, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planes));
        System.out.println("Sorted by smt:");
        Arrays.sort(planes, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(planes));

        /*Timer t=new Timer(1000,event->{
            System.out.println(new Date());
        });
        t.start();*/
       /* Timer t=new Timer(1000,System.out::println);
        t.start();
        JOptionPane.showMessageDialog(null,"ARE YOU QUIT?");*/
        List<String> names = new ArrayList(Arrays.asList("donglxa", "dengchu", "zhouyu", "zhouming"));
        Stream<Person1> person1Stream = names.stream().map(Person1::new);
        List<Person1> collect = person1Stream.collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));
        Person1 p = new Person1();
        p.get(collect);/*Object 可以引用任意对象，但是Object[] 并不是*/

        List<Integer> numbers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Stream<Integer> integerStream = numbers.stream().map(Integer::new);
        List<Integer> integers = integerStream.collect(Collectors.toList());
        System.out.println(Arrays.toString(integers.toArray()));

        RunnableTest runnable = new RunnableTest();
        RunnableTest.repeat(10, () -> System.out.println("Hello,World"));
        RunnableTest.repeat(20, new Runnable() {
            @Override
            public void run() {
                System.out.println("Nice to meet you");
            }
        });
        System.out.println(runnable.toString());
        Class<? extends RunnableTest> aClass = runnable.getClass();
        Method[] methods = runnable.getClass().getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println(runnable.toString());
        IntConsumer ax = new IntComsumerT$1();
        repeat(10, ax);
        repeat(5, i -> System.out.println("C: " + (10 - i)));
        Person1[] person12 = new Person1[]{new Person1("donglxa"), new Person1("dengchu")
                , new Person1("maojinye"),new Person1("zhaoyan"),new Person1("achu")};
        Arrays.sort(person12,Comparator.comparing(Person1::getName));
        System.out.println("Sorted by directory:");
        for(Person1 p2:person12){
            System.out.println(p2.getName());
        }
        System.out.println("Sorted by length:");
        //Arrays.sort(person12,Comparator.comparing(Person1::getName,(s,t)->s.length()-t.length()).reversed());
        Arrays.sort(person12,Comparator.comparing(Person1::getName,Comparator.nullsLast(Comparator.reverseOrder())));
        for (Person1 p13:person12)
            System.out.println(p13.getName());
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }
}

class IntComsumerT$1 implements IntConsumer {
    @Override
    public void accept(int value) {
        System.out.println("Countdown: " + (9 - value));
    }
}
