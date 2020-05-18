package com.dlx.chapter09.SortAndShuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<49;i++){
             numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> list = numbers.subList(0, 6);
        list.sort(Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(numbers);
        int i = Collections.binarySearch(numbers, 99);
        System.out.println(i);
        numbers.toArray();

    }
}
