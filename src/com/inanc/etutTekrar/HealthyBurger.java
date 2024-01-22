package com.inanc.etutTekrar;

public class HealthyBurger extends Hamburger{
    private Addition healthyAddition1;
    private Addition healthyAddition2;
    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1 == null){
            healthyAddition1 = new Addition(name, price);

        } else if (healthyAddition2 == null) {
            healthyAddition2 = new Addition(name, price);
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder stringBuilder = new StringBuilder();
        if(healthyAddition1!=null) {
            stringBuilder.append("HealthyAddition1: " + getHealthyAddition1().getName() + "\n");
            setPrice(getPrice() + getHealthyAddition1().getPrice());
        }
        if(healthyAddition2!=null) {
            stringBuilder.append("HealthyAddition2: " + getHealthyAddition2().getName() + "\n");
            setPrice(getPrice() + getHealthyAddition2().getPrice());
        }

        System.out.println(stringBuilder);
        super.itemizeHamburger();
    }
}
