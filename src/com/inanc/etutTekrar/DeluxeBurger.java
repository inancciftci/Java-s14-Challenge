package com.inanc.etutTekrar;

public class DeluxeBurger extends Hamburger{
    private Drink drink;
    private Chips chips;

    public DeluxeBurger(String breadRollType, Drink drink, Chips chips) {
        super("DELUXE BURGER", "DOUBLE", 19.10, breadRollType);
        this.drink = drink;
        this.chips = chips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\n Deluxe Burger için ek malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getDrinkType() + "\n");
        builder.append("CIPS: " + chips.getChipsType() + "\n");
        super.itemizeHamburger();
    }
}
