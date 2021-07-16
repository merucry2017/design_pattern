package com.example.demo.prototype;

import com.example.demo.util.Computer;

/**
 * 计算机Builder
 */
public interface ComputerBuilder {
    /**
     * 建造CPU
     */
    void buildCpu();

    /**
     * 建造内存
     */
    void buildRam();

    /**
     * 建造硬盘
     */
    void buildHardDisk();

    /**
     * 建造显卡
     */
    void buildGraphicCard();

    /**
     * 建造显示器
     */
    void buildMonitor();

    /**
     * 建造操作系统
     */
    void buildOs();

    /**
     * 得到建造好的计算机
     * @return
     */
    Computer getResult();
}
