package org.example.models;

public class HealthyBurger extends Hamburger{
private String healthyExtra1Name, healthyExtra2Name;
private double healthyExtra1Price, healthyExtra2Price;
    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra1Name = healthyExtra1Name;
    }
    public void addHealthyAddition2(String name, double price){

        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Added Ingredients: " + healthyExtra1Name + " " + healthyExtra2Name);
        double newPrice = super.getPrice() + healthyExtra1Price + healthyExtra2Price;
        super.setPrice(newPrice);
        return newPrice;
    }
}
