package com.dlx.charater03;

import com.dlx.charater04.ConstructorTest;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class FirstSimple {
    public static strictfp void main(String[] args) {
        System.out.println(0b1_000_000);
        double x = 0x234;
        if (Double.isNaN(x)) {
            System.out.println("hello");
        } else {
            System.out.println(x);
        }
        System.out.println(2.0 - 1.9);
        System.out.println("he" + "\t" + "ss");
        System.out.println(0x1.0p16);
        System.out.println(Character.isJavaIdentifierPart('`'));
        StrictMath.abs(-1);
        int w = 's';
        System.out.println(w);
        float float_one = 1234567812345L;
        System.out.println(float_one);
        System.out.println(1.452e2);

        System.out.println(Math.round(2.5));

        System.out.println((byte) 300);// byte只有8位  -128~127  所有300取低八位   为44
        int l = 2;
        l += 3.5;
        System.out.println(l);
        System.out.println((-10004) >> 3);
        System.out.println((-10004) >>> 3);
        System.out.println(Integer.toBinaryString(10004));
        System.out.println(Integer.toBinaryString(-10004));
        System.out.println(Integer.toBinaryString(536869661));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(0x1FFFFB1D);
        System.out.println(~6);//  (6)b=0000 0110    (~6)b= 1111 1001   这是补码    原码是 10000111 = -7
        System.out.println(String.join("/", "S", "M", "X"));


        System.out.println("\u0022+\u0022");//""+""=null
        //\u000a System.out.println("annotation !");//print success！  转译u 会在编译前处理
        System.out.println('\u0022');

        //String.charAt 是获得代码单元，1个辅助字符由两个代码单元组成 例如𝕆
        String unicode_test = "hello\uD835\uDD46";
        System.out.println(unicode_test);
        System.out.println(unicode_test.length());
        System.out.println(unicode_test.codePointCount(0, unicode_test.length()));
        System.out.println(unicode_test.charAt(5));
        System.out.println(unicode_test.charAt(0));
        System.out.println(unicode_test.charAt(6));
        int[] ints = unicode_test.codePoints().toArray();
        for (int i : ints) {
            System.out.println(i);
        }
        System.out.println(unicode_test.codePointAt(0));


        try {
            Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
            String path = System.getProperty("user.dir");
            System.out.println(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(new int[] {3,4}));//声明并初始化了一个匿名的数组
        System.out.println("" instanceof Object);
    }
}
