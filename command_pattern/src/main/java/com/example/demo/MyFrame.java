package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JPanel jPanel;
    private YellowCommand btnYellow;
    private RedCommand btnRed;
    private ExitCommand btnExit;

    public MyFrame() throws HeadlessException {
        super("命令模式");
        jPanel = new JPanel();
        this.add(jPanel);
        /**
         * 实例化具体命令
         */
        btnYellow = new YellowCommand("黄色", jPanel);
        btnRed = new RedCommand("红色", jPanel);
        btnExit = new ExitCommand("退出");
        /**
         * 将按钮控件添加到面板
         */
        jPanel.add(btnYellow);
        jPanel.add(btnRed);
        jPanel.add(btnExit);
        /**
         * 添加监听对象
         */
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
        btnExit.addActionListener(this);
        /**
         * 设置窗体
         */
        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        MyCommand obj = (MyCommand)actionEvent.getSource();
        obj.execute();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
