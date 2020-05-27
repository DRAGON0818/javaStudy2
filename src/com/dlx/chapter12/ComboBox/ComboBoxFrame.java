package com.dlx.chapter12.ComboBox;

import javax.swing.*;
import java.awt.*;

public class ComboBoxFrame extends JFrame {
    private JComboBox<String> faceCombo;
    private JLabel label;
    private static final int SIZE=24;

    public ComboBoxFrame(){
        label = new JLabel("The qucik brown fox jumps over the dog.");
        label.setFont(new Font("Serif", Font.PLAIN, SIZE));
        add(label, BorderLayout.CENTER);

        faceCombo = new JComboBox<>();
        faceCombo.setEditable(true);
        //faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");


        faceCombo.addActionListener(e -> {
            System.out.println(e.getSource());
            label.setFont(new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()),Font.PLAIN,SIZE
            ));
        });

        JPanel panel = new JPanel();
        panel.add(faceCombo);
        add(panel, BorderLayout.SOUTH);
        pack();
    }
}
