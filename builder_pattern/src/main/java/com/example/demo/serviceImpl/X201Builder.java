package com.example.demo.serviceImpl;

import com.example.demo.bean.X201;
import com.example.demo.prototype.ComputerBuilder;
import com.example.demo.util.Computer;

public class X201Builder implements ComputerBuilder {
    private X201 computer = new X201();
    @Override
    public void buildCpu() {
        computer.setCpu("i3-350");
    }

    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        /**
         * 无显卡
         */
    }

    @Override
    public void buildGraphicCard() {
        computer.setHardDisk("250GB 5400转");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("12英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows7 Home版");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
