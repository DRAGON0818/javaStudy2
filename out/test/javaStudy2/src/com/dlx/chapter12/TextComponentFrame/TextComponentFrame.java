package com.dlx.chapter12.TextComponentFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextComponentFrame extends JFrame {
    private static final int ROWS=8;
    private static final int Columns=20;

    public TextComponentFrame(){
        JTextField textField = new JTextField();
        JPasswordField jPasswordField = new JPasswordField();
        //设置密码组件的回显字符
        //jPasswordField.setEchoChar('#');

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.add(new JLabel("User name:", SwingUtilities.RIGHT));
        northPanel.add(textField);
        northPanel.add(new JLabel("Password:", JLabel.RIGHT));
        northPanel.add(jPasswordField);

        add(northPanel, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea(ROWS, Columns);
        //设置文本域区域超过最大字符，能够换行
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel soutPanel = new JPanel();
        JButton insertButton = new JButton("Insert");
        soutPanel.add(insertButton);
        insertButton.addActionListener(event->{
            textArea.append("User name:" + textField.getText() + " Password: " + new String(jPasswordField.getPassword()) + "\n");
        });

        InputMap inputMap = northPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("I"),"insert");

        ActionMap map = northPanel.getActionMap();
        Action action=new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("User name:" + textField.getText() + " Password: " + new String(jPasswordField.getPassword()) + "\n");
            }
        };
        map.put("insert",action);

        add(soutPanel, BorderLayout.SOUTH);
        pack();
    }


}
