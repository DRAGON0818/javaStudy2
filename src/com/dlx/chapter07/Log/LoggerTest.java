package com.dlx.chapter07.Log;
import java.util.logging.Logger;

public class LoggerTest {
    static final Logger chapter_07 = Logger.getLogger("com.fotile.dlx.Chapter07");

    public static void main(String[] args) {
        /**
         * 全局日志记录记录器
         */
        Logger.getGlobal().warning("Tired");
        System.out.println("!234");
        //Logger.getGlobal().setLevel(Level.OFF);//将会取消所有的日志
        /**
         * 通过Logger.getLogger("")获得自定义日志记录器，未被引用的日志处理器可能会被GC清理，所以建议将用一个静态敞亮存储一个日志记录器的引用
         */
        System.out.println(chapter_07.getName()+","+chapter_07.getFilter());
    }
}
