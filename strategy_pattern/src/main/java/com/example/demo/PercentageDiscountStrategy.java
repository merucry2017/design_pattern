package com.example.demo;

/**
 * 具体折扣，折扣百分比为15%
 */
public class PercentageDiscountStrategy extends DiscountStrategy {
    /**
     * 构造函数
     *
     * @param price
     * @param number
     */
    public PercentageDiscountStrategy(double price, int number) {
        super(price, number);
    }

    /**
     * 实现策略方法
     * @return
     */
    @Override
    public double calculateDiscount() {
        return getNumber() * getPrice() * 0.15;
    }
}
