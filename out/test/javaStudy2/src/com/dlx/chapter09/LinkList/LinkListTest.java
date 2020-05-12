package com.dlx.chapter09.LinkList;

import java.util.*;

public class LinkListTest {
    public static void main(String[] args) {
        List<String> a=new LinkedList<>();
        a.add("AAAA");
        a.add("BBB");
        a.add("CCC");

        List<String> b = new LinkedList<>();
        b.add("DDD");
        b.add("EEE");
        b.add("FFF");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
        }
        System.out.println(a);

    }
}
