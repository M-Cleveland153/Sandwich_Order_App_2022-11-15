import java.util.Scanner;

public class HealthyIngredients extends BasicIngredients{
    private String topping5;
    private String topping6;

    public HealthyIngredients(String customerName, String bunType, boolean isDeluxe) {
        super(customerName, bunType, isDeluxe);
        this.topping5 = "none";
        this.topping6 = "none";
    }

    @Override
    public void setToppings() {
        System.out.println("If you like, I can add up to six veggies toppings " +
                "since you have a HealthyBurger. \nWe have lettuce, tomato, onion, " +
                "carrots, steamed kale, pickles, and grilled peppers.");
        System.out.println("press 'Enter' after each topping that you type");
        Scanner toppingScanner = new Scanner(System.in);
        this.setTopping1(toppingScanner.nextLine().toLowerCase());
        this.setTopping2(toppingScanner.nextLine().toLowerCase());
        this.setTopping3(toppingScanner.nextLine().toLowerCase());
        this.setTopping4(toppingScanner.nextLine().toLowerCase());
        this.setTopping5(toppingScanner.nextLine().toLowerCase());
        this.setTopping6(toppingScanner.nextLine().toLowerCase());
//        toppingScanner.close();
    }

//    @Override
//    public void finalConfirmation(String burgerType) {
//        System.out.println("Thank you!! And let me read that back to you to make sure " +
//                "that I heard you correctly. \n" +
//                "I have a "+burgerType+" burger order for "+this.getProteinType()+" and "+this.getCheeseCount()+
//                " slices of "+this.getCheeseType()+" on "+this.getBunType()+".\n"+
//                "The veggie toppings I have written down are "+this.getTopping1()+", "+this.getTopping2()+", "
//                +this.getTopping3()+", "+this.getTopping4()+", "+this.topping5+", and "+this.topping6+". " +
//                "\nAnd for condiments: "+this.getCondiment1()+", "
//                +this.getCondiment2()+", and "+this.getCondiment3()+".");
//    }

//    @Override
//    public void getAllIngredients() {
//        System.out.println(this.getCustomerName());
//        System.out.println(this.getProteinType());
//        System.out.println(this.getBunType());
//        System.out.println(this.getCheeseType());
//        System.out.println(this.getCheeseCount());
//        System.out.println(this.getTopping1());
//        System.out.println(this.getTopping2());
//        System.out.println(this.getTopping3());
//        System.out.println(this.getTopping4());
//        System.out.println(this.getTopping5());
//        System.out.println(this.getTopping6());
//        System.out.println(this.getCondiment1());
//        System.out.println(this.getCondiment2());
//        System.out.println(this.getCondiment3());
//    }

    @Override
    public void printOrderSummary() {
        System.out.println("Customer Name: "+this.getCustomerName());
        System.out.println("Order type: Healthy Burger");
        System.out.println(this.getProteinType() +": $"+ Prices.priceFinder(this.getProteinType()));
        System.out.println(this.getBunType()+": $"+ Prices.priceFinder(this.getBunType()));
        System.out.println(this.getCheeseType()+" price per slice: $"+ Prices.priceFinder(this.getCheeseType()));
        System.out.println("Number of Cheese slices: " + this.getCheeseCount());
        System.out.println(this.getTopping1()+": $"+ Prices.priceFinder(this.getTopping1()));
        System.out.println(this.getTopping2()+": $"+ Prices.priceFinder(this.getTopping2()));
        System.out.println(this.getTopping3()+": $"+ Prices.priceFinder(this.getTopping3()));
        System.out.println(this.getTopping4()+": $"+ Prices.priceFinder(this.getTopping4()));
        System.out.println(this.getTopping5()+": $"+ Prices.priceFinder(this.getTopping5()));
        System.out.println(this.getTopping6()+": $"+ Prices.priceFinder(this.getTopping6()));
        System.out.println(this.getCondiment1()+": $"+ Prices.priceFinder(this.getCondiment1()));
        System.out.println(this.getCondiment2()+": $"+ Prices.priceFinder(this.getCondiment2()));
        System.out.println(this.getCondiment3()+": $"+ Prices.priceFinder(this.getCondiment3()));
        System.out.println("Total Price: $"+ this.totalPrice());
    }

    public void setTopping5(String topping5) {
        this.topping5 = topping5;
    }

    public void setTopping6(String topping6) {
        this.topping6 = topping6;
    }

    public String getTopping5() {
        return topping5;
    }

    public String getTopping6() {
        return topping6;
    }
}
