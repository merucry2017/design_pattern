package com.example.demo;

/**
 * 对应访问者模式中的结构对象角色
 */
public class Computer {
    private Hardware cpu;
    private Hardware harddisk;
    public Computer() {
        this.cpu = new CPU("i7-6200");
        this.harddisk = new Harddisk("500G 7200转");
    }
    public void accept(ComputerVisitor computerVisitor) {
        cpu.accept(computerVisitor);
        harddisk.accept(computerVisitor);
    }
}
