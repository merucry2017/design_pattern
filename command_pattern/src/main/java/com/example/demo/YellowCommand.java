package com.example.demo;

import javax.swing.*;
import java.awt.*;

/**
 * 具体命令角色，让面板变为黄色的命令
 */
public class YellowCommand extends JButton implements MyCommand {
    private JPanel jPanel;

    /**
     * 构造函数
     * @param name
     * @param jPanel
     */
    public YellowCommand(String name, JPanel jPanel) {
        /**
         * 构造一个按钮控件
         */
        super(name);
        this.jPanel = jPanel;
    }

    @Override
    public void execute() {
        /**
         * 改变面板的背景颜色
         */
        jPanel.setBackground(Color.YELLOW);
    }
}
