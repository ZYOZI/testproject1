package com.company.object;

public class Burger2 implements Product {
    private String name = "Бургер 2 ";
    private int price = 139;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
