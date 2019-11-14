package com.dlx.chapter02;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageViewerTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jFrame = new ImageViewerFrame();
            jFrame.setTitle("ImageView");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
            double x=0x1.0p-4;
            System.out.println(x);

        });
    }

}

class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    private JLabel jLabel;
    private JFileChooser chooser;

    public ImageViewerFrame() {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        jLabel = new JLabel();
        this.add(jLabel);

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("OPEN");
        menu.add(openItem);
        openItem.addActionListener(event -> {
            int result = chooser.showOpenDialog(null);
            if (result==JFileChooser.APPROVE_OPTION){
                String name=chooser.getSelectedFile().getPath();
                jLabel.setIcon(new ImageIcon(name));
            }
        });

        JMenuItem exitItem=new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(e -> System.exit(0));
    }

}
