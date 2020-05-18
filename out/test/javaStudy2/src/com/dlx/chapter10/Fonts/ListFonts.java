package com.dlx.chapter10.Fonts;

import java.awt.*;

public class ListFonts {
    public static void main(String[] args) {
        //获得当前环境的系统字体
        String[] availableFontFamilyNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String name:availableFontFamilyNames)
            System.out.println(name);
    }
}
