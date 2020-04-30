package com.dlx.chapter06.Comparator;

import java.util.Arrays;

/**
 * author donglxa
 * date 2020.3.23
 * 6.2.2
 */
public class StringLengthComparator {
    public static void main(String[] args) {
        String[] friend={"donglxa","denghcu","zhouyu","zhouming"};
        Arrays.sort(friend, new LengthComparator());
        System.out.println(Arrays.toString(friend));
    }
}
