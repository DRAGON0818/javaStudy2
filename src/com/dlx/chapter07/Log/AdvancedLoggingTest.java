package com.dlx.chapter07.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvancedLoggingTest {
    private static final Logger myLogger = Logger.getLogger("com.fotile.myApp");
    public static void main(String[] args) {
        myLogger.setLevel(Level.FINER);
        myLogger.info("this is master");
        myLogger.log(Level.SEVERE, "severe error");
        myLogger.warning(()->{return "******";});

        System.out.println("=============");

        myLogger.logp(Level.SEVERE, AdvancedLoggingTest.class.getName(), "main", "logp method");
        System.out.println(myLogger.getLevel());

        //entering和exiting 需要设置处理器的记录级别。也在JDK/jre/lib/下logging.properties文件中配置
        myLogger.entering(AdvancedLoggingTest.class.getName(), "main", args);
        myLogger.info("message");
        myLogger.exiting(AdvancedLoggingTest.class.getName(),"main");
    }
}
