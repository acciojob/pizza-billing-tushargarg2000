package com.driver;

public class Pizza {

    private int totalPrice;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int basePrice;

    private int toppingPrice;

    private int paperBagPrice;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isPaperBagAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg==true){
            basePrice = 300;
            toppingPrice = 70;
        }else{
            basePrice = 400;
            toppingPrice = 120;
        }
        cheesePrice = 80;
        paperBagPrice = 20;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+basePrice+"\n";

    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){

        if(isCheeseAdded==false){

            //Cheese is not added
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;

        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            totalPrice = totalPrice + toppingPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            isPaperBagAdded = true;
            totalPrice = totalPrice + paperBagPrice;

        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated = true;

            if(isCheeseAdded)
                bill = bill + "Extra Cheese Added: "+cheesePrice+"\n";

            if(isToppingsAdded)
                bill = bill + "Extra Toppings Added: "+toppingPrice+"\n";

            if(isPaperBagAdded)
                bill = bill + "Paperbag Added: "+paperBagPrice+"\n";

            bill = bill + "Total Price: "+totalPrice+"\n";
        }
        return this.bill;
    }
}
