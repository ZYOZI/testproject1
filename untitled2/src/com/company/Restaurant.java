package com.company;

import com.company.object.*;

public class Restaurant {
    private int fullPrice;
    Burger1 burger1 = new Burger1();
    Burger2 burger2 = new Burger2();
    Pie pie = new Pie();
    IceCream iceCream = new IceCream();

    public void preparing(Product x){
        String name = x.name();
        System.out.println(name+"готовится");
    }

    public void sell(Product y){
        int price = y.price();
        String name = y.name();
        this.fullPrice = fullPrice + y.price();
        System.out.println(name+"продан за "+price);
    }

    public int fullPrice() {
        return fullPrice;
    }
}
