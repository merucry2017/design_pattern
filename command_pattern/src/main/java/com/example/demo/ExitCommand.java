package com.example.demo;

import javax.swing.*;

public class ExitCommand extends JButton implements MyCommand {
    /**
     * 构造函数
     */
    public ExitCommand(String name) {
        super(name);
    }
    @Override
    public void execute() {
        /**
         * 系统退出
         */
        System.exit(0);
    }
}
