package com.dlx.chapter01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int x = 8;
        int fourthBitFromRight = (x & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight);
        String greeting = "\u03C0 \uD835\uDD6B";
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
        byte[] b = new byte[]{(byte)0x9A,(byte)0x6C};
        System.out.println(b);
        System.out.println( Arrays.toString(b));
        String s = new String(b, "UTF-16");
        System.out.println(s);
        byte ssss=(byte)0xff;
        System.out.println(ssss);

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
