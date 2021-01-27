package com.company.object;

public class Burger1 implements Product{

    @Override
    public String name() {
        return "Бургер 1 ";
    }

    @Override
    public int price() {
        return 49;
    }
}
