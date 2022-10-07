package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
    }

    public void addTakeaway(){
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
