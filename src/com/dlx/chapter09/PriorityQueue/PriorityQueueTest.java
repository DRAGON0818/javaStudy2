package com.dlx.chapter09.PriorityQueue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> queue = new PriorityQueue<>();
        queue.add(LocalDate.of(1907, 12, 9));
        queue.add(LocalDate.of(1815, 12, 12));
        queue.add(LocalDate.of(1903, 12, 3));
        queue.add(LocalDate.of(1910, 6, 22));
        System.out.println("Iterating over elements");
        Iterator<LocalDate> iterator = queue.iterator();
        iterator.forEachRemaining(e -> System.out.println(e));
        System.out.println("######################");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
