package com.dlx.charater07.ExceptionTest;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTrace {
    public static void main(String[] args) {
        Throwable e=new Throwable();
        System.out.println(e.getStackTrace());
        StringWriter out=new StringWriter();
        e.printStackTrace(new PrintWriter(out));
        String description = out.toString();
        System.out.println(description);
    }
}
