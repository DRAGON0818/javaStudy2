package com.dlx.chapter06.innerClass;

import javax.swing.*;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock t=new TalkingClock(1000,true);
        t.start();

        TalkingClock m=new TalkingClock(1000,true);
        TalkingClock.TimePrinter timePrinter=m.new TimePrinter();
        JOptionPane.showMessageDialog(null,"ARE U QUIT?");
        System.exit(1);
    }

}
