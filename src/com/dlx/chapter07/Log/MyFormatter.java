package com.dlx.chapter07.Log;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {
    @Override
    public String getHead(Handler h) {
        return super.getHead(h) + " :donglxa head\n";
    }

    @Override
    public String getTail(Handler h) {
        return super.getTail(h)+" :donglxa tail\n";
    }

    @Override
    public String format(LogRecord record) {
        String message = record.getMessage();
        return message + " :donglxa message\n";
    }
}
