package com.inanc.burgerCompany;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        super.addHamburgerAddition1("chips", 0);
        super.addHamburgerAddition2("coke", 0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("You can't add any extras to Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("You can't add any extras to Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("You can't add any extras to Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("You can't add any extras to Deluxe Burger.");
    }
}
