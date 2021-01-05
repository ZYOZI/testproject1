package com.company.object;

public class IceCream implements Product{

    @Override
    public String name() {
        return "Мак-флури ";
    }

    @Override
    public int price() {
        return 129;
    }
}
