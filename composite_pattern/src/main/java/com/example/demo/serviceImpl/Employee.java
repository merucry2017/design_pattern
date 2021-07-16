package com.example.demo.serviceImpl;

import com.example.demo.service.Company;

/**
 * 叶子节点类
 */
public class Employee implements Company {
    private String name;
    private String position;
    private int salary;

    /**
     * 构造函数
     */
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info += "\t职位：" + this.position;
        info += "\t薪水：" + this.salary;
        return info;
    }
}
