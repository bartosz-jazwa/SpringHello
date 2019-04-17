package com.jazwa.zajspring;

public class Item {
    private String name;
    private Integer price;
    private String desc;

    public Item(String name, Integer price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
