package com.example.demo;

/**
 * 具体折扣类
 */
public class NoDiscountStrategy extends DiscountStrategy {
    /**
     * 构造函数
     *
     * @param price
     * @param number
     */
    public NoDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
