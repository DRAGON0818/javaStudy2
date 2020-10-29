package com.dlx.chapter07.Log;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
    /*未被引用的日志记录器，可能会被GC回收，所以需要用static final存储这个引用*/
    static final Logger chapter_07 = Logger.getLogger("com.fotile.dlx.Chapter07");

    public static void main(String[] args) throws IOException {
        /**
         * 全局日志记录记录器，配置文件 : jdk/jre/lib/logging.properties
         */
        Logger global = Logger.getGlobal();
        global.info("1234");
        global.fine("22222");
        global.severe("2345");
        global.finest("xxxxx");

        global.logp(Level.SEVERE,LoggerTest.class.getName(),"main","2345");
        //Logger.getGlobal().setLevel(Level.OFF);//将会取消所有的日志
        /**
         * 通过Logger.getLogger("")获得自定义日志记录器，未被引用的日志处理器可能会被GC清理，所以建议将用一个静态常亮存储一个日志记录器的引用
         */


        System.out.println(chapter_07.getName());
        chapter_07.setLevel(Level.ALL);
        chapter_07.entering("com.dlx.chapter07.Log.LoggetTest","main",new Object[]{});
        /**
         * 日志还可以绑定资源包（ResearchBundle），用于在不同国家上输出
         * Logger a=new Logger.getLogger(loggerName,"资源包")
         */

        /**
         * 日志处理器会把记录发送到ConsoleHandle，用于在控制台打印（System.err）
         * 日志记录器是“原始日志记录器”的子类。
         * 所以在默认情况下，日志记录器把记录发送到自己的处理器和父处理器；
         * 处理器也有级别
         *
         * log4j 提供了最强大的记录日志的方式
         *
         */
        Logger logger = Logger.getLogger("com.mycompany.myapp");
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);

        /**
         * FileHandler默认的输出在C盘当前用户目录下，java0.log文件
         * 以下的日志输出为XML格式：
         * <?xml version="1.0" encoding="UTF-8" standalone="no"?>
         * <!DOCTYPE log SYSTEM "logger.dtd">
         * <log>
         * <record>
         *   <date>2019-11-15T16:46:36</date>
         *   <millis>1573807596325</millis>
         *   <sequence>1</sequence>
         *   <logger>com.mycompany.myapp</logger>
         *   <level>SEVERE</level>
         *   <class>com.dlx.chapter07.Log.LoggerTest</class>
         *   <method>main</method>
         *   <thread>1</thread>
         *   <message>GG</message>
         * </record>
         * </log>
         */
        FileHandler fileHandler = new FileHandler();
        logger.addHandler(fileHandler);
        fileHandler.setLevel(Level.INFO);
        logger.severe("GG");
        System.out.println(System.getProperty("user.dir"));
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        consoleHandler.setFormatter(new MyFormatter());
        logger.addHandler(consoleHandler);
        logger.severe("GG");
    }
}
