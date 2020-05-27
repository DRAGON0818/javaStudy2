package com.dlx.chapter12.MenuFrame;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.CopyOption;

public class MenuFrame extends JFrame {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    private Action saveAction;
    private Action saveAsAction;
    private JCheckBoxMenuItem readOnlyItem;
    private JPopupMenu popupMenu;

    class TestAction extends AbstractAction {

        public TestAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getValue(Action.NAME) + " selected");
        }
    }

    public MenuFrame() {
        setSize(WIDTH, HEIGHT);
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new TestAction("New"));

        JMenuItem openItem = fileMenu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("o"));

        fileMenu.addSeparator();

        saveAction = new TestAction("Save");
        JMenuItem saveItem = fileMenu.add(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("s"));

        saveAsAction = new TestAction("Save As");
        fileMenu.add(saveAsAction);
        fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        readOnlyItem = new JCheckBoxMenuItem("Read-Only");
        readOnlyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saveOk = !readOnlyItem.isSelected();
                saveAction.setEnabled(saveOk);
                saveAsAction.setEnabled(saveOk);
            }
        });

        ButtonGroup group = new ButtonGroup();

        JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
        insertItem.setSelected(true);
        JRadioButtonMenuItem overtype = new JRadioButtonMenuItem("Overtype");

        group.add(insertItem);
        group.add(overtype);

        Action cutAction = new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));
        Action copyAction = new TestAction("Copy");
        copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));
        Action pasteAction = new TestAction("Paste");
        pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);

        JMenu optionMenu = new JMenu("Options");
        optionMenu.add(readOnlyItem);
        optionMenu.addSeparator();
        optionMenu.add(insertItem);
        optionMenu.add(overtype);

        editMenu.addSeparator();
        editMenu.add(optionMenu);

        JMenu help = new JMenu("Help");
        help.setMnemonic('H');

        JMenuItem indexMenu = new JMenuItem("Index");
        indexMenu.setMnemonic('I');
        help.add(indexMenu);

        Action aboutAction = new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY, new Integer('A'));
        help.add(aboutAction);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(help);

        popupMenu = new JPopupMenu();
        popupMenu.add(cutAction);
        popupMenu.add(copyAction);
        popupMenu.add(pasteAction);

        JPanel panel = new JPanel();
        panel.setComponentPopupMenu(popupMenu);
        add(panel);
    }
}
