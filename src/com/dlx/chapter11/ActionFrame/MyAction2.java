package com.dlx.chapter11.ActionFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyAction2 extends JFrame {

    public MyAction2(){
        JPanel jPanel = new JPanel();
        myAction yellowAction = new myAction(jPanel, "yellow", Color.yellow);
        JButton yellow = new JButton(yellowAction);
        myAction greenAction = new myAction(jPanel, "green", Color.green);
        JButton green = new JButton(greenAction);
        jPanel.add(yellow);
        jPanel.add(green);
        add(jPanel,BorderLayout.SOUTH);

        //获得控件的InputMap对象和ActionMap对象   绑定KeyStroke，来确定键的监听
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("Y"),"panel.yellow");
        inputMap.put(KeyStroke.getKeyStroke("G"),"panel.green");

        ActionMap actionMap=jPanel.getActionMap();
        actionMap.put("panel.yellow", yellowAction);
        actionMap.put("panel.green",greenAction);
    }
}

class myAction extends AbstractAction{

    private JComponent jComponent;
    public myAction(JComponent component, String name, Color c){
        this.jComponent=component;
        putValue(Action.SHORT_DESCRIPTION,"set panel to "+name.toUpperCase());
        putValue(Action.NAME,name);
        putValue("color",c);
    }
    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object color = getValue("color");
        jComponent.setBackground((Color)color);
    }
}
