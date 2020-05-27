package com.dlx.chapter12.border;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BorderFrame extends JFrame {
    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;

    public BorderFrame(){
        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        //边框用BorderFactory工厂模式创建，BorderFactory.createXXXXXBevelBorder()。
        addRadioButton("Lowered bevel", BorderFactory.createLoweredBevelBorder());
        addRadioButton("Raised bevel", BorderFactory.createRaisedBevelBorder());
        addRadioButton("Etched", BorderFactory.createEmptyBorder());
        addRadioButton("Line", BorderFactory.createLineBorder(Color.BLUE));
        addRadioButton("Matte", BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
        addRadioButton("Empty", BorderFactory.createEmptyBorder());

        Border etchedBorder = BorderFactory.createEtchedBorder();
        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "Border types");
        buttonPanel.setBorder(titledBorder);

        setLayout(new GridLayout(2, 1));
        add(buttonPanel);
        add(demoPanel);
        pack();
    }

    public void addRadioButton(String name, Border b){
        JRadioButton button = new JRadioButton(name);
        button.addActionListener(e -> demoPanel.setBorder(b));
        group.add(button);
        buttonPanel.add(button);
    }

}
