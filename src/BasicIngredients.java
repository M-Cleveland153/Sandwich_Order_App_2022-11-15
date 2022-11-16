////      OBJECTS
//The HamburgerOrder object is piece of paper that the waitress used to...
//////record the customers order for a Basic Hamburger.
//The DeluxeBurgerOrder object is the piece of paper that the waitress used ...
//////to record the customer's order for a Deluxe Burger.
//The HealthyBurgerOrder object is the piece of paper that the waitress used ...
//////to record the customer's order for a Healthy Burger.
//The Price object is an object whose constructor takes the number of slices...
//////of cheese, the number of veggie toppings, and the number of condiment toppings.

////      PROCESS
// prompt the user for inputs: bread, protein, cheese, condiments, veggieToppings
// inputs are used to create price object.
// inputs and price object are used to construct an order objet (either
//____HamburgerOrder, DeluxeBurgerOrder, or HealthyBurgerOrder).
// Show the order breakdown.

////       METHODS
// get the price and additions (showing each addition name and its price and...
//____showing the total price.

import java.util.Scanner;

public class BasicIngredients {
    private String customerName;
    private String proteinType;
    private String bunType;

    private String cheeseType;
    private int cheeseCount;

    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;

    private String condiment1;
    private String condiment2;
    private String condiment3;

    private boolean isDeluxe;

    public BasicIngredients(String customerName, String bunType, boolean isDeluxe) {
        this.customerName = customerName;
        this.bunType = bunType;
        this.isDeluxe = isDeluxe;

        this.proteinType = "none";

        this.cheeseType = "none";
        this.cheeseCount = 0;

        this.topping1 = "none";
        this.topping2 = "none";
        this.topping3 = "none";
        this.topping4 = "none";

        this.condiment1= "none";
        this.condiment2= "none";
        this.condiment3= "none";
    }
//    public void finalConfirmation(String burgerType){
//        System.out.println("Thank you!! And let me read that back to you to make sure " +
//                "that I heard you correctly. \n" +
//                "I have a "+burgerType+" burger order for "+this.proteinType+" and "+this.cheeseCount+
//                " slices of "+this.cheeseType+" on "+this.bunType+".\n"+
//                "The veggie toppings I have written down are "+this.topping1+", "+this.topping2+", "
//                +this.topping3+", and "+this.topping4+". \nAnd for condiments: "+this.condiment1+", "
//                +this.condiment2+", and "+this.condiment3+".");
//    }
    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public void setCheeseCount(int cheeseCount) {
        this.cheeseCount = cheeseCount;
    }

    public void setToppings(){
        Scanner toppingScanner = new Scanner(System.in);
        System.out.println("If you like, I can add up to four veggies toppings. " +
                "We have lettuce, tomato, onion, carrots, steamed kale, pickles," +
                " and grilled peppers.");
        System.out.println("press 'Enter' after each topping that you type");
        this.setTopping1(toppingScanner.nextLine().toLowerCase());
        this.setTopping2(toppingScanner.nextLine().toLowerCase());
        this.setTopping3(toppingScanner.nextLine().toLowerCase());
        this.setTopping4(toppingScanner.nextLine().toLowerCase());
//        toppingScanner.close();
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public void setTopping4(String topping4) {
        this.topping4 = topping4;
    }
    public void setCondiments(){
        Scanner condimentScanner = new Scanner(System.in);
        System.out.println("Would you like ketchup, mayo, or mustard? \nPlease use the " +
                "next three lines to enter the condiments you would like.  \nEnter one " +
                "condiment per line please.  \nPress Enter three times if you don't want " +
                "any condiments.");
        this.setCondiment1(condimentScanner.nextLine().toLowerCase());
        this.setCondiment2(condimentScanner.nextLine().toLowerCase());
        this.setCondiment3(condimentScanner.nextLine().toLowerCase());
//        condimentScanner.close();
    }

    public void setCondiment1(String condiment1) {
        this.condiment1 = condiment1;
    }

    public void setCondiment2(String condiment2) {
        this.condiment2 = condiment2;
    }

    public void setCondiment3(String condiment3) {
        this.condiment3 = condiment3;
    }
//    public void getAllIngredients(){
//        System.out.println(this.getCustomerName());
//        System.out.println(this.getProteinType());
//        System.out.println(this.getBunType());
//        System.out.println(this.getCheeseType());
//        System.out.println(this.getCheeseCount());
//        System.out.println(this.getTopping1());
//        System.out.println(this.getTopping2());
//        System.out.println(this.getTopping3());
//        System.out.println(this.getTopping4());
//        System.out.println(this.getCondiment1());
//        System.out.println(this.getCondiment2());
//        System.out.println(this.getCondiment3());
//
//    }
    public double totalPrice() {
        double total = 0;
        total += Prices.priceFinder(this.getProteinType());
        total += Prices.priceFinder(this.getBunType());
        total += Prices.priceFinder(this.getCheeseType()) * this.getCheeseCount();
        total += Prices.priceFinder(this.getTopping1());
        total += Prices.priceFinder(this.getTopping2());
        total += Prices.priceFinder(this.getTopping3());
        total += Prices.priceFinder(this.getTopping4());
        total += Prices.priceFinder(this.getCondiment1());
        total += Prices.priceFinder(this.getCondiment2());
        total += Prices.priceFinder(this.getCondiment3());

        if(isDeluxe){
            total += Prices.priceFinder("chips");
            total += Prices.priceFinder(("drink"));
        }
        return total;
    }

    public void printOrderSummary() {
        System.out.println("Customer Name: "+this.getCustomerName());

        if(this.isDeluxe){
            System.out.println("Order type: Deluxe Burger (comes with chips and drink)");
        } else {
            System.out.println("Order type: The Basic Burger");
        }

        System.out.println(this.getProteinType() +": $"+ Prices.priceFinder(this.getProteinType()));
        System.out.println(this.getBunType()+": $"+ Prices.priceFinder(this.getBunType()));
        System.out.println(this.getCheeseType()+" price per slice: $"+ Prices.priceFinder(this.getCheeseType()));
        System.out.println("Number of Cheese slices: " + this.getCheeseCount());
        System.out.println(this.getTopping1()+": $"+ Prices.priceFinder(this.getTopping1()));
        System.out.println(this.getTopping2()+": $"+ Prices.priceFinder(this.getTopping2()));
        System.out.println(this.getTopping3()+": $"+ Prices.priceFinder(this.getTopping3()));
        System.out.println(this.getTopping4()+": $"+ Prices.priceFinder(this.getTopping4()));
        System.out.println(this.getCondiment1()+": $"+ Prices.priceFinder(this.getCondiment1()));
        System.out.println(this.getCondiment2()+": $"+ Prices.priceFinder(this.getCondiment2()));
        System.out.println(this.getCondiment3()+": $"+ Prices.priceFinder(this.getCondiment3()));

        if(this.isDeluxe){
            System.out.println("chips: $"+ Prices.priceFinder("chips"));
            System.out.println("drink: $"+ Prices.priceFinder("drink"));
        }

        System.out.println("Total Price: $"+ this.totalPrice());
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProteinType() {
        return proteinType;
    }

    public String getBunType() {
        return bunType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public int getCheeseCount() {
        return cheeseCount;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public String getCondiment1() {
        return condiment1;
    }

    public String getCondiment2() {
        return condiment2;
    }

    public String getCondiment3() {
        return condiment3;
    }

    public boolean isDeluxe() {
        return isDeluxe;
    }
}
