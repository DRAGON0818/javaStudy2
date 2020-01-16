package com.dlx.chapter8.pair1;

import com.dlx.chapter8.Pair;

import java.time.LocalDate;
import java.util.Arrays;

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> minmax = ArrayAlg.minmax(words);
        System.out.println("min=" + minmax.getFirst());
        System.out.println("max=" + minmax.getSecond());
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println(ArrayAlg.getMiddle(words));

        LocalDate[] birthdays = {
                LocalDate.of(1906, 1, 23),
                LocalDate.of(2005, 11, 18),
                LocalDate.of(1987, 01, 03),
                LocalDate.of(1995, 11, 18)
        };
        Pair<LocalDate> minMax = ArrayAlg.getMinMax(birthdays);
        System.out.println(minMax.getFirst());
        System.out.println(minMax.getSecond());
    }
}

class ArrayAlg {
    public static <T extends Comparable> Pair<T> getMinMax(T[] t) {
        if (t == null || t.length == 0)
            return null;
        T min = t[0];
        T max = t[0];
        for (T temp : t) {
            if (min.compareTo(temp) > 0) min = temp;
            if (max.compareTo(temp) < 0) max = temp;
        }
        return new Pair<>(min, max);
    }

    public static Pair<String> minmax(String[] strings) {
        if (strings == null || strings.length == 0) return null;
        String min = strings[0];
        String max = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (min.compareTo(strings[i]) > 0) min = strings[i];
            if (max.compareTo(strings[i]) < 0) max = strings[i];
        }
        return new Pair<>(min, max);
    }

    /**
     * @param a
     * @param <T>
     * @return 泛型方法可以定义在普通类中，也可以定义在泛型类中
     * 类型变量<T> 定义在修饰符之后，返回值之前。
     */
    public static <T extends Comparable> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}
