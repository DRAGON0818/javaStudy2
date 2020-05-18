package com.dlx.chapter10.SizedFrame;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args) {
        JFrame jFrame=new SizedFrame();
        jFrame.setTitle("sizedJFrame");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        setSize(width/2,height/2);
        //由平台选择一个合适的位置
        setLocationByPlatform(true);

        Image img=new ImageIcon("icon.gif").getImage();
        setIconImage(img);


    }
}
