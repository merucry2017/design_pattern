package com.example.demo;

public class CPU extends Hardware {
    public CPU(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为"+type+"的CPU正在运转");
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visitCPU(this);
    }
}
