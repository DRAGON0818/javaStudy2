package com.dlx.chapter06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class TimerTest {

    public static void main(String[] args) {
        //ActionListener actionListener=new TimerPrinter();
        Timer t=new Timer(1000, (e)->{

                Toolkit.getDefaultToolkit().beep();
                System.out.println("At the time is" + new Date());
        });
        t.start();
        JOptionPane.showConfirmDialog(null,"Are u quit?");
        System.exit(0);
    }

}

class TimerPrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
    }
}
