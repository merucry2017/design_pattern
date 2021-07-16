package com.example.demo;

/**
 * 具体折扣类,折扣值为1
 */
public class FixDiscountStrategy extends DiscountStrategy {
    /**
     * 构造函数
     *
     * @param price
     * @param number
     */
    public FixDiscountStrategy(double price, int number) {
        super(price, number);
    }

    /**
     * 实现策略方法
     * @return
     */
    @Override
    public double calculateDiscount() {
        return getNumber() * 1;
    }
}
