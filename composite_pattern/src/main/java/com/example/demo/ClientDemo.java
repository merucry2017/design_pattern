package com.example.demo;

import com.example.demo.service.Company;
import com.example.demo.serviceImpl.ConcreteCompany;
import com.example.demo.serviceImpl.Employee;

public class ClientDemo {

    public static void main(String[] args) {
        /**
         * CEO
         */
        ConcreteCompany root = new ConcreteCompany("张三","CEO",100000);
        /**
         * 部门经理
         */
        ConcreteCompany developDep = new ConcreteCompany("李四","研发部经理",12000);
        ConcreteCompany salesDep = new ConcreteCompany("王五","销售部经理",12000);
        ConcreteCompany financeDep = new ConcreteCompany("赵六","财务部经理",12000);
        /**
         * 部门员工
         */
        Employee e1 = new Employee("A", "研发部", 3000);
        Employee e2 = new Employee("B", "研发部", 3000);
        Employee e3 = new Employee("C", "销售部", 3000);
        Employee e4 = new Employee("D", "销售部", 3000);
        Employee e5 = new Employee("E", "财务部", 3000);
        Employee e6 = new Employee("F", "财务部", 3000);

        // 生成树
        root.add(developDep);
        root.add(salesDep);
        root.add(financeDep);
        developDep.add(e1);
        developDep.add(e2);
        salesDep.add(e3);
        salesDep.add(e4);
        financeDep.add(e5);
        financeDep.add(e6);
        //显示公司层次
        System.out.println(root.getInfo());
        display(root);
    }

    private static void display(ConcreteCompany root) {
        for(Company c : root.getChild()) {
            if (c instanceof  Employee) {
                // 如果节点类型是叶子节点
                System.out.println(c.getInfo());
            } else {
                System.out.println("\n"+c.getInfo());
                display((ConcreteCompany)c);
            }
        }
    }
}
