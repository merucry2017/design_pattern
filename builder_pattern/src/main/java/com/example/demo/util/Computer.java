package com.example.demo.util;

/**
 * 计算机抽象类
 */
public abstract class Computer {
    /**
     * 型号
     */
    private String type;
    /**
     * CPU
     */
    private String cpu;
    /**
     * 内存
     */
    private String ram;
    /**
     * 硬盘
     */
    private String hardDisk;
    /**
     * 显示器
     */
    private String monitor;
    /**
     * 操作系统
     */
    private String os;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
