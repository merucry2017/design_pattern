package com.example.demo;

/**
 * 代表计算机的各种硬件，对应访问模式中的抽象元素角色
 */
public abstract class Hardware {
    String type;

    public Hardware(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * 运转
     */
    public abstract void run();
    /**
     * 接受计算机访问者
     */
    public abstract void accept(ComputerVisitor computerVisitor);
}
