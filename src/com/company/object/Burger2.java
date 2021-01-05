package com.company.object;

public class Burger2 implements Product{

    @Override
    public String name() {
        return "Бургер 2 ";
    }

    @Override
    public int price() {
        return 139;
    }
}
