package com.example.demo;

public class PlayerD extends Player {

    /**
     * 构造函数
     */
    public PlayerD(Player successor) {
        this.setSuccessor(successor);
    }

    /**
     * 实现handle方法
     * @param i
     */
    @Override
    public void handle(int i) {
        if (i == 4) {
            System.out.println("PlayerD 喝酒！");
        } else {
            System.out.println("PlayerD 把花向下传");
            next(i);
        }
    }
}
