package com.dlx.chapter09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Set 和 Map的区别在域Map是用于存储“键/值”的映射结构
 * Set 是无序容器，TreeSet也是通过Comparable或者Comparator维护一个排序，和map有一点类似，键和值是一样的。
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        System.out.println(set);

    }
}
