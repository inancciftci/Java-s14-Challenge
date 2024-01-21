package com.inanc.burgerCompany;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    // itemizeHamburger overRide

    @Override
    public double itemizeHamburger() {
        double result = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            result += this.healthyExtra1Price;
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            result += this.healthyExtra2Price;
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
        }
        System.out.println("Healthy Burger Total is: " + result);
        return result;
    }
}
