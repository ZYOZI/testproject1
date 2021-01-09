package com.company;

public class Main {

    /**
     * ДЗ.
     * 1. static
     * 2. TODO 1 - Restaurant
     * 3. TODO 2 - Getters
     * 4. https://rutracker.org/forum/viewtopic.php?t=5104084
     */
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        restaurant.preparing(restaurant.getBurger1());
        restaurant.preparing(restaurant.getBurger2());
        restaurant.preparing(restaurant.getPie());
        restaurant.preparing(restaurant.getIceCream());

        restaurant.sell(restaurant.getBurger1());
        restaurant.sell(restaurant.getBurger2());
        restaurant.sell(restaurant.getPie());
        restaurant.sell(restaurant.getIceCream());


        System.out.println("В кассе у ресторана: "+restaurant.getFullPrice());

    }
}
