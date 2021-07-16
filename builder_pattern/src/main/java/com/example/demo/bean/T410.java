package com.example.demo.bean;

import com.example.demo.util.Computer;

/**
 * 型号T410
 */
public class T410 extends Computer {
    /**
     * 显卡
     */
    private String graphicCard;

    public T410() {
        this.setType("ThinkPad T410i");
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "T410{" +
                "graphicCard='" + graphicCard + '\'' +
                '}';
    }
}
