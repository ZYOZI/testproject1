package com.company;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        restaurant.preparing(restaurant.burger1);
        restaurant.preparing(restaurant.burger2);
        restaurant.preparing(restaurant.pie);
        restaurant.preparing(restaurant.iceCream);

        restaurant.sell(restaurant.burger1);
        restaurant.sell(restaurant.burger2);
        restaurant.sell(restaurant.pie);
        restaurant.sell(restaurant.iceCream);

        System.out.println("В кассовом ящике у ресторана: "+restaurant.fullPrice());

    }
}
