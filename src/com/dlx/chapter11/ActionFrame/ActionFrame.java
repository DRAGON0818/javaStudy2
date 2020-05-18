package com.dlx.chapter11.ActionFrame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionFrame extends JFrame{

    private JPanel panel;
    private static final int WIDTH=300;
    private static final int HEIGHT = 200;

    public ActionFrame(){
        setSize(WIDTH, HEIGHT);
        panel=new JPanel();

        Action yellow = new ColorAction(panel,"Yellow", Color.YELLOW,new ImageIcon("yellow.gif"));
        Action blue = new ColorAction(panel,"Blue", Color.BLUE, new ImageIcon("blue.gif"));
        Action red = new ColorAction(panel,"Red", Color.RED, new ImageIcon("red.gif"));

        panel.add(new JButton(yellow));
        panel.add(new JButton(blue));
        panel.add(new JButton(red));

        add(panel);

        /**
         * inputmap+actionmap 实现键和监听的绑定
         */
        InputMap inputMap = panel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);//获得组件的输入映射
        inputMap.put(KeyStroke.getKeyStroke("Y"), "panel.Yellow");
        inputMap.put(KeyStroke.getKeyStroke("B"), "panel.Blue");
        inputMap.put(KeyStroke.getKeyStroke("R"), "panel.Red");

        ActionMap map = panel.getActionMap();
        map.put("panel.Yellow",yellow);
        map.put("panel.Blue", blue);
        map.put("panel.Red", red);
    }

}

/**
 * Action接口是动作接口，是ActionListener的子接口，用于监听各类动作（1.按钮 2.键盘 3.菜单选择）
 * 其中包含了ActionListener的actionPerformed方法。
 * 以及对动作的描述putValue/getValue方法,动作是否启用isEnable/setEnable方法
 *
 *  JDK提供了一个AbstractAction方法，实现了Action的默认方法
 *
 */
class ColorAction extends AbstractAction{

    JComponent component;

    public ColorAction(JComponent component,String name, Color c, Icon icon){
        this.component=component;
        putValue(Action.NAME,name);
        putValue(Action.SMALL_ICON,icon);
        putValue(Action.SHORT_DESCRIPTION,"Set panel color to "+name.toLowerCase());
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
        component.setBackground((Color)color);
    }
}
