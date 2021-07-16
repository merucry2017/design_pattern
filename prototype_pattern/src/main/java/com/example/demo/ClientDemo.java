package com.example.demo;

import com.example.demo.bean.Mail;

import java.util.Random;

public class ClientDemo {
    /**
     * 发送账单的数量，这个值从数据库中获取
     */
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        /**
         * 模拟发送邮件
         */
        int i = 0;
        /**
         * 定义一个邮件对象
         */
        Mail mail = new Mail("某商场五一抽奖活动","通知：满购100元可获抽奖机会。。。");
        mail.setTail("解释权归商城所有");
        while (i < MAX_COUNT) {
            /**
             * 克隆邮件
             */
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            /**
             * 发送邮件
             */
            sendMail(cloneMail);
            i++;
        }
    }

    /**
     * 发送邮件
     */
    public static void sendMail(Mail mail) {
        System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver());
        System.out.println(".....发送成功!");
    }

    /**
     * 获得指定长度的随机字符串
     */
    public static String getRandString(int maxLength) {
        String source = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
