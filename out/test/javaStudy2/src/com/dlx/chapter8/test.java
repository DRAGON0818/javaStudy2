package com.dlx.chapter8;

import com.dlx.chapter8.pair2.DateInterval;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class test {
    public static void main(String[] args) throws NoSuchMethodException {
        DateInterval dateInterval = new DateInterval();
        Pair<LocalDate> pair = dateInterval;
        pair.setSecond(LocalDate.of(1995, 11, 18));
//        System.out.println("first的值为:" + dateInterval.getFirst());
//        System.out.println("second的值为:" + dateInterval.getSecond());
//        Class<? extends DateInterval> dateClass = dateInterval.getClass();
//        System.out.println(dateClass.getName());
//        Method setSecondObject = dateClass.getMethod("setSecond", Object.class);
//        System.out.println(setSecondObject.getReturnType());
//        Method[] methods = dateClass.getMethods();
//        for (Method method : methods) {
//            System.out.print(Modifier.toString(method.getModifiers()) + " " + method.getReturnType() + " " + method.getName()+"(");
//            Class<?>[] parameterTypes = method.getParameterTypes();
//            for(Class paramType : parameterTypes){
//                System.out.print(paramType.toString()+" ");
//            }
//            System.out.println(")");
//        }

        JSlider jSlider = new JSlider();
        Dictionary<Integer, Component> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel(new ImageIcon("nine,gif")));
        labelTable.put(2, new JLabel(new ImageIcon("ten.gif")));
        /*
           setLaberTable无法保证会对Dictionary对象做什么操作，可能用字符串替换所有的关键字，这就破坏了关键字类型整形（Integer）的承诺。
         */
        jSlider.setLabelTable(labelTable);

        Pair<Integer> p = new Pair<>();
        System.out.println(p.getClass().getName());

   

    }
}

