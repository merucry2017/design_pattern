package com.example.demo.serviceImpl;

import com.example.demo.bean.T410;
import com.example.demo.bean.X201;
import com.example.demo.prototype.ComputerBuilder;

/**
 * 建造计算机的Director
 */
public class ComputerDirector {

    ComputerBuilder builder;
    /**
     * 构造T410型计算机
     */
    public T410 constructT410() {
        builder = new T410Builder();
        builder.buildCpu();;
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildGraphicCard();
        builder.buildMonitor();
        builder.buildOs();
        return (T410)builder.getResult();
    }
    /**
     * 构造X201型计算机
     */
    public X201 constructX201() {
        builder = new X201Builder();
        builder.buildCpu();;
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildGraphicCard();
        builder.buildMonitor();
        builder.buildOs();
        return (X201)builder.getResult();
    }
}
