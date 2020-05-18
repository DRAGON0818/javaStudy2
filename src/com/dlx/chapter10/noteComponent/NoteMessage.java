package com.dlx.chapter10.noteComponent;

import javax.swing.*;
import java.awt.*;

public class NoteMessage {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame jFrame=new NoteFrame();
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setTitle("Note A Message");
            jFrame.setVisible(true);
            //ContentPane 是框架的"内容面板"
            Container contentPane = jFrame.getContentPane();
            System.out.println(contentPane);
            //output：javax.swing.JPanel[null.contentPane,0,0,300x200,layout=javax.swing.JRootPane$1,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]
        });
    }
}

class NoteFrame extends JFrame{
    public NoteFrame(){
        add(new NoteComponent());
        //调整窗口大小，考虑到其组件的首选大小
        pack();
    }
}

/**
 * java中，所有的绘图都必须使用Graphics对象，包括绘制图案，图像和文本
 * 在JComponent中有一个paintComponent（Graphics g）方法可以来覆盖绘制
 * paintComponent方法不需要人为调用，程序需要重新绘图时，会自动调用。
 * 人为重新绘制，需要调用repaint()方法。
 */
class NoteComponent extends JComponent{
    public static final int MESSAGER_X=20;
    public static final int MESSAGE_Y=20;
    private static final int WIDTH=300;
    private static final int HEIGHT=200;

    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Note a messagye",MESSAGER_X,MESSAGE_Y);
    }

    //这个方法需要覆盖，返回的是这个组件的首选大小
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

}
