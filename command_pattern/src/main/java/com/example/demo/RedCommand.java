package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class RedCommand extends JButton implements MyCommand {
    private JPanel jPanel;

    public RedCommand(String name, JPanel jPanel) {
        super(name);
        this.jPanel = jPanel;
    }

    /**
     * 构造函数
     */

    @Override
    public void execute() {
        jPanel.setBackground(Color.RED);
    }
}
