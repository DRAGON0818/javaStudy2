package com.dlx.charater02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
    private static final Logger myLogger = Logger.getLogger("com.dlx.charater");
    public static void main(String[] args) {
        myLogger.setLevel(Level.INFO);
        myLogger.severe("VP:VG");
    }
}
