package com.dlx.chapter01;

import java.io.Console;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int x = 24;
        int fourthBitFromRight = (x & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight);
        String greeting = "\u03C0 \uD835\uDD46";
        System.out.println(greeting);
        int n = greeting.length();
        System.out.println(n);
        int size = greeting.codePointCount(0, greeting.length());
        System.out.println(size);
        char xx='马';
        int ss=xx;
        System.out.println(ss);
        String test="马";
        byte[] bytes = test.getBytes("UTF-16");
        printHex("UTF-16LE",bytes);
        byte[] b = new byte[]{(byte)0x21,(byte)0x22};
        System.out.println(b);
        System.out.println( Arrays.toString(b));
        String s = new String(b, "UTF-16");
        System.out.println(s);
        byte ssss=(byte)0xff;
        System.out.println(ssss);

        System.out.println(1<<3);
        String text="我累了\u1D546啊啊";
        int[] ints = text.codePoints().toArray();
        System.out.println(Arrays.toString(ints)+":~~~~~~");
        System.out.println(text.codePoints().toArray().length);
        System.out.println(text);
        System.out.println("码点数量："+text.codePointCount(0,text.length()));
        System.out.println(text.length());
        for(int i=0;i<text.length();i++){
            System.out.println(i+":"+text.codePointAt(text.offsetByCodePoints(0,i)));
        }
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(3));
        System.out.println(text.charAt(4));
        System.out.println(text.length());
    }

    private static void printHex(String type, byte[] data) {
        System.out.println(data.length);
        StringBuilder builder = new StringBuilder();
        builder.append("type:").append(type).append(":   ");
        byte temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp = (byte)(data[i] & 0xFF);
            System.out.println("temp:"+temp);
            builder.append("0x").append(Integer.toHexString(temp).toUpperCase()).append(" ");
        }

        System.out.println(builder.toString());
    }
}
