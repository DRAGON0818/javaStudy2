package com.dlx.chapter09.TreeSetTest;

import java.util.*;

public class TreeTest {
    public static void main(String[] args) {
        SortedSet<Item> parts=new TreeSet<>();
        parts.add(new Item("Toaset",6534));
        parts.add(new Item("Toaser",5534));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts+"#####");

        /**
         * NavigableSet接口增加了便于定位元素和反向遍历的方法。
         */
        NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription+"#####");
        Iterator<Item> iterator = sortByDescription.iterator();
        while(iterator.hasNext())
        {
            Item next = iterator.next();
            System.out.println(next);
        }
    }
}
