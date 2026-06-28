package com.itheima.test6;

public class Phone {
    private String brank;//品牌
    private int price;//价格
    private String color;//颜色

    public Phone() {
    }

    public Phone(String brank, int price, String color) {
        this.brank = brank;
        this.price = price;
        this.color = color;
    }

    public String getBrank() {
        return brank;
    }

    public void setBrank(String brank) {
        this.brank = brank;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
