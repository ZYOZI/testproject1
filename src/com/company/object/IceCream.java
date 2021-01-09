package com.company.object;

public class IceCream implements Product{
    private String name = "Мак-Флури ";
    private int price = 114;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
