package com.example.demo.serviceImpl;

import com.example.demo.service.Company;

import java.util.ArrayList;

/**
 * 树枝节点类
 */
public class ConcreteCompany implements Company {
    private ArrayList<Company> companyArrayList = new ArrayList<>();
    /**
     * 姓名
     */
    private String name;
    /**
     * 职位
     */
    private String position;
    /**
     * 薪水
     */
    private int salary;

    /**
     * 构造函数
     * @param name
     * @param position
     * @param salary
     */
    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
        this.companyArrayList.add(company);
    }

    public void remove(Company company) {
        this.companyArrayList.remove(company);
    }

    public ArrayList<Company> getChild() {
        return this.companyArrayList;
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
