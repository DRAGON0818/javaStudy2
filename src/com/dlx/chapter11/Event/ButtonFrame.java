package com.dlx.chapter11.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame{
    private JPanel buttonPanel;
    private static final int WIDTH=300;
    private static final int HEIGHT=200;
    public ButtonFrame(){
        //setSize(WIDTH,HEIGHT);

        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton greenButton = new JButton("Green");

        buttonPanel = new JPanel();
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        add(buttonPanel);
        pack();

        ActionListener y = new ButtonListener(Color.yellow, buttonPanel);
        ActionListener g = new ButtonListener(Color.green, buttonPanel);
        ActionListener b = new ButtonListener(Color.blue, buttonPanel);

        yellowButton.addActionListener(y);
        blueButton.addActionListener(b);
        greenButton.addActionListener(g);

    }


}

class ButtonListener implements ActionListener{

    /** 可以在监听器中添加JPanel对象，也可以把监听器作为JPanel的内部类。两者都可以访问到需要的外围变量 **/
    public Color backGroundColor;
    public JPanel jPanel;

    public ButtonListener(Color c,JPanel p){
        this.backGroundColor=c;
        this.jPanel=p;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jPanel.setBackground(backGroundColor);
    }
}
