package com.dlx.chapter12.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame {
    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;
    private static final int Default_size=36;

    public RadioButton(){
        label = new JLabel("The quck brown fox jumps over the lazy dog");
        label.setFont(new Font("Serif", Font.PLAIN, Default_size));
        add(label, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Small", 8);
        addRadioButton("Medium", 12);
        addRadioButton("Large",18);
        addRadioButton("Extra",36);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();

    }

    public void addRadioButton(String name, int size) {
        boolean selected = size == Default_size;
        JRadioButton button = new JRadioButton(name, selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listener = e -> {
            label.setFont(new Font("Serif", Font.PLAIN, size));
            ButtonModel selection = group.getSelection();
            System.out.println(selection);
        };
        button.addActionListener(listener);

    }
}
