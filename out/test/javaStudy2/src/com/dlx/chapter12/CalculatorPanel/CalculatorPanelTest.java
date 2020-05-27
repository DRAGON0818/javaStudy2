package com.dlx.chapter12.CalculatorPanel;

import javax.swing.*;

public class CalculatorPanelTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setSize(400,300);
        JPanel panel = new CalculatorPanel();
        frame.add(panel);
        frame.setVisible(true);

    }
}
