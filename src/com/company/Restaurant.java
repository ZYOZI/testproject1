package com.company;

import com.company.object.*;

public class Restaurant {
    private int fullPrice;
    private Burger1 burger1 = new Burger1();
    private Burger2 burger2 = new Burger2();
    private Pie pie = new Pie();
    private IceCream iceCream = new IceCream();

    public Burger1 getBurger1() {
        return burger1;
    }

    public Burger2 getBurger2() {
        return burger2;
    }

    public Pie getPie() {
        return pie;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public void preparing(Product x) {
        String name = x.getName();
        this.printPreparing(name);
    }

    private void printPreparing(String name){
        System.out.println(name + "готовится");
    }

    public void sell(Product y) {
        int price = y.getPrice();
        String name = y.getName();
        this.fullPrice = fullPrice + y.getPrice();
        this.printInfoSell(name, price);
    }

    private void printInfoSell(String name, int price) {
        System.out.println(name + "продан за " + price);
    }

    public int getFullPrice() {
        return fullPrice;
    }
}
