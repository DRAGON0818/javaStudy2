package com.dlx.chapter8.pair3;
import com.dlx.chapter8.Pair;
import com.dlx.chapter8.pair2.DateInterval;
import java.time.LocalDate;

public class pair3Test {
    public static void main(String[] args) {
        Pair<LocalDate> pair = new DateInterval();
        PairAlg.swap(pair);
        System.out.println(pair.getFirst()+" "+ pair.getSecond());
    }
}

class PairAlg {
    /* ?通配符 和 限定符功能在一定上是一样的。只是？的get方法只能赋给Object，set方法不能被调用！！！！！，不过可以使用set（null） */
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }

}
