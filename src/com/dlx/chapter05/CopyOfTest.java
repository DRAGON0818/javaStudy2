package com.dlx.chapter05;

import java.lang.reflect.*;
import java.util.*;

/**
 * IDEA生成javadoc   在TOols下 Generate javadoc
 */

/**
 * 泛型数组代码
 * This program demonstrates the use of reflection for manipulating arrays.
 * @version 1.2 2012-05-04
 * @author Cay Horstmann
 */
public class CopyOfTest
{
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3 };
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a)+Array.getLength(a));

        String[] b = { "Tom", "Dick", "Harry" };
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);

    }

    /**
     * 存在运行时报错，因为返回的是Object[]对象，可能存在类型转换错误“ClassCastException”
     * This method attempts to grow an array by allocating a new array and copying all elements.
     * @param a the array to grow
     * @param newLength the new length
     * @return a larger array that contains all elements of a. However, the returned array has
     * type Object[], not the same type as a
     */
    public static Object[] badCopyOf(Object[] a, int newLength) // not useful
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * This method grows an array by allocating a new array of the same type and
     * copying all elements.
     * @param a the array to grow. This can be an object array or a primitive
     * type array
     * @param newLength the new array's length
     * @return a larger array that contains all elements of a.
     */
    public static Object goodCopyOf(Object a, int newLength)
    {
        Class cl = a.getClass();//获得类对象
        if (!cl.isArray()) return null;//确认这是一个数组
        Class componentType = cl.getComponentType();//获得数组的类型
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
