package com.dlx.chapter12.JSlider;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class JSliderFrame extends JFrame {

    private JPanel sliderPanel;
    private JTextField textField;
    private ChangeListener listener;

    public JSliderFrame() {
        sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridBagLayout());

        listener = e ->{
            JSlider source = (JSlider) e.getSource();
            textField.setText("" + source.getValue());
        };

        JSlider slider = new JSlider();
        addSlider(slider, "Plain");

        slider = new JSlider();
        //通过显示标尺trick 来对滑动条进行装饰
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Ticks");

        slider = new JSlider();
        slider.setPaintTicks(true);
        //强制滑动条对齐标尺 snapToTrick
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider,"Snap to ticks");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(false);
        addSlider(slider, "No track");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setInverted(true);
        addSlider(slider, "Inverted");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        addSlider(slider,"Labels");

        slider = new JSlider(SwingUtilities.VERTICAL, 0, 100, 50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
//        slider.setSnapToTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        addSlider(slider,"Vertical");

        slider = new JSlider();
        slider.setPaintTicks(true);
        //设置标尺标记标签是否开启
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        Dictionary<Integer, Component> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel("A"));
        labelTable.put(20, new JLabel("B"));
        labelTable.put(40, new JLabel("C"));
        labelTable.put(60, new JLabel("D"));
        labelTable.put(80, new JLabel("E"));
        labelTable.put(100, new JLabel("F"));

        slider.setLabelTable(labelTable);
        addSlider(slider, "Custom labels");

        textField = new JTextField(20);
        add(sliderPanel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);pack();
    }

    public void addSlider(JSlider s, String description) {
        s.addChangeListener(listener);
        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(description));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = sliderPanel.getComponentCount();
        gbc.anchor = GridBagConstraints.WEST;
        sliderPanel.add(panel, gbc);
    }
}
