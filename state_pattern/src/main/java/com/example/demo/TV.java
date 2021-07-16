package com.example.demo;

public class TV {
    /**
     * 可以观看的频道
     */
    public final static Channel CCTV1 = new CCTV1();
    public final static Channel CCTV2 = new CCTV2();
    public final static Channel CCTV3 = new CCTV3();
    /**
     * 当前频道
     */
    private Channel channel;
    /**
     * 设置频道
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
    /**
     * 播放CCTV1频道
     */
    public void disCCTV1() {
        this.setChannel(CCTV1);
        this.channel.display();
    }
    /**
     * 播放CCTV2频道
     */
    public void disCCTV2() {
        this.setChannel(CCTV2);
        this.channel.display();
    }
    /**
     * 播放CCTV3频道
     */
    public void disCCTV3() {
        this.setChannel(CCTV3);
        this.channel.display();
    }
}
