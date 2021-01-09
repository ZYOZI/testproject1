package com.company.object;

public class Pie implements Product{
    private String name = "Пирожок ";
    private int price = 59;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
