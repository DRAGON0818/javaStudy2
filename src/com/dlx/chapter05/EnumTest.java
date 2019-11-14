package com.dlx.chapter05;
import java.util.*;

/**
 * This program demonstrates enumerated types.
 * @version 1.0 2004-05-24
 * @author Cay Horstmann
 */
public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
        Size[] values = Size.values();
        System.out.println(Arrays.toString(values));
        System.out.println(values.getClass());
        try {
            Class s=Class.forName("com.dlx.chapter05.Size");
            System.out.println(s.getName());
            System.out.println(int.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("ss".getClass()=="x".getClass());
    }
}

enum Size
{
    //枚举类成员
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    //构造器
    private Size(String abbreviation) { this.abbreviation = abbreviation; }
    //成员方法
    public String getAbbreviation() { return abbreviation; }
    //成员属性
    private String abbreviation;
}
