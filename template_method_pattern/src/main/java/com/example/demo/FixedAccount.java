package com.example.demo;

/**
 * 具体模板类，定期账户
 */
public class FixedAccount extends Account {
    protected String getAccountType() {
        return "一年定期";
    }
    protected double getInterestRate() {
        return 0.0325D;
    }
}
