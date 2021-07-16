package com.example.demo;

public class DrumBeater {

    public static void main(String args[]) {
        /**
         * 创建一个链
         */
        Player player = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));
        /**
         * 击鼓3下停止
         */
        player.handle(3);
    }
}
