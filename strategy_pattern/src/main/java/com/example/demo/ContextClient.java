package com.example.demo;

/**
 * 环境角色
 */
public class ContextClient {
    private DiscountStrategy discountStrategy;
    /**
     * 构造函数
     */
    public ContextClient(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    /**
     * 调用策略模式，计算折扣额
     */
    public double contextCalDisc() {
        return discountStrategy.calculateDiscount();
    }

    public static void main(String[] args) {
        /**
         * 根据传入构造函数的类对象，调用不同的算法
         */
        ContextClient context0 = new ContextClient(new NoDiscountStrategy(48.5,20));
        System.out.println("0折扣:"+context0.contextCalDisc());
        ContextClient contextFix = new ContextClient(new FixDiscountStrategy(46,60));
        System.out.println("固定折扣:"+contextFix.contextCalDisc());
        ContextClient contextPer = new ContextClient(new PercentageDiscountStrategy(38,40));
        System.out.println("15%的折扣："+contextPer.contextCalDisc());
    }
}
