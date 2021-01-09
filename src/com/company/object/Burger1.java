package com.company.object;

public class Burger1 implements Product{
    private String name = "Бургер 1 ";
    private int price = 49;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
