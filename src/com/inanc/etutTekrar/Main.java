package com.inanc.etutTekrar;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "NORMAL", 3.56, "WRAP");
        hamburger.addAddition("Tomato", 0.27);
        hamburger.addAddition("Lettuce", 0.75);
        hamburger.addAddition("Cheese", 1.13);
        hamburger.addAddition("Pickle", 0.25);
        hamburger.addAddition("Test", 5);
        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
        healthyBurger.addAddition("Eggs", 5.43);
        healthyBurger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger("DOUBLE", new Drink(DrinkType.COKE), new Chips(ChipsType.CURLY));
        deluxeBurger.addAddition("Deneme", 15);
        deluxeBurger.itemizeHamburger();
    }
}
