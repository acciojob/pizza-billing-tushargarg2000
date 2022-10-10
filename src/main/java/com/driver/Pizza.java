package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private Boolean isExtraCheeseAdded;

    private int extraToppingsPrice;
    private Boolean isExtraToppingsAdded;

    private int takeawayBagPrice;
    private Boolean isTakeawayRequired;

    private Boolean isBillCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakeawayRequired = false;
        this.isBillCreated = false;
        this.extraCheesePrice = 80;
        this.takeawayBagPrice = 20;
        if(isVeg){
            this.price = 300;
            this.extraToppingsPrice = 70;
        }else{
            this.price = 400;
            this.extraToppingsPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            this.price = this.price + this.extraCheesePrice;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            this.price = this.price + this.extraToppingsPrice;
            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeawayRequired){
            this.bill = this.bill + "Paperbag Added: " + this.takeawayBagPrice + "\n";
            this.price = this.price + this.takeawayBagPrice;
            this.isTakeawayRequired = true;
        }
    }

    public String getBill(){
        if(!isBillCreated){
            this.bill = this.bill + "Total Price: " + this.price + "\n";
            this.isBillCreated = true;
        }
        return this.bill;
    }
}
