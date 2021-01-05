package com.company.object;

public class Pie implements Product{

    @Override
    public String name() {
        return "Пирожок ";
    }

    @Override
    public int price() {
        return 59;
    }
}
