package com.dlx.chapter12.CalculatorPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JPanel {

    private JButton display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel(){
        setLayout(new BorderLayout());

        result = 0;
        lastCommand = "=";
        start = true;

        display = new JButton("0");
        display.setEnabled(true);
        add(display, BorderLayout.NORTH);

        InsertAction insert = new InsertAction();
        CommandAction commandAction = new CommandAction();

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", commandAction);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", commandAction);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", commandAction);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", commandAction);
        addButton("+", commandAction);

        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton jButton = new JButton(label);
        jButton.addActionListener(listener);
        panel.add(jButton);
    }

    private class InsertAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + command);
        }
    }

    private class CommandAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                }
                else lastCommand=command;
            }
            else{
                calculate(Double.parseDouble(display.getText()));
                lastCommand=command;
                start=true;
            }
        }
    }

    public void calculate(double x){
        if (lastCommand.equals("+")) {
            result += x;
        }
        else if(lastCommand.equals("-")) result-=x;
        else if(lastCommand.equals("*")) result*=x;
        else if(lastCommand.equals("/")) result/=x;
        else if(lastCommand.equals("=")) result=x;
        display.setText(""+result);
    }

}


