package com.dlx.chapter11.PlatFrame;

import javax.swing.*;

/**
 * UIManager是"感观"框架的管理器类
 * UIManager.LookAndFellInfo是存储感观的内部存储类。
 */
public class PlatFrame extends JFrame {
    private JPanel jPanel;
    public PlatFrame(){
        System.out.println(UIManager.getLookAndFeel());
        jPanel = new JPanel();
        UIManager.LookAndFeelInfo[] installedLookAndFeels = UIManager.getInstalledLookAndFeels();
        System.out.println(installedLookAndFeels.length);
        for(UIManager.LookAndFeelInfo info:installedLookAndFeels)
        {
            makeButton(info.getName(),info.getClassName());
        }
        add(jPanel);
        pack();
    }


    //辅助类，用于添加按钮
    private void makeButton(String name,String className){
        JButton button=new JButton(name);
        jPanel.add(button);
        System.out.println(name+"+"+className);
        button.addActionListener(e->{
            try {
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                System.out.println(UIManager.getLookAndFeel());
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (InstantiationException instantiationException) {
                instantiationException.printStackTrace();
            } catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
                unsupportedLookAndFeelException.printStackTrace();
            }
        });
    }
}
