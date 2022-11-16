public class WaiterQs {
    public static void waiterIntro(){
        System.out.println("Hi welcome to Bill's!!  My name is" +
                " Michael and I will be serving you today.");
    }
    public static void customerName(){
        System.out.println("What name should I use for this order?");
    }
    public static void burgerType(){
        System.out.println("OK. Which burger would you like?" +
                " basic, deluxe, or healthy?");
    }
//    public static void bunType(String burgerType){
    public static void bunType(String burgerType){
//        if(burgerType == "healthy"){
        if(burgerType.equals("healthy")){
            System.out.println("Since you are ordering a healthy burger, please enter" +
                    " organic rye for your bun type now");
        } else {
            System.out.println("What kind of bun would you like?  We have GMO white, "+
                    "organic rye, and organic wheat.");
        }
    }
    public static void protein(){
        System.out.println("And what will by your protein of choice today?" +
                " \nWe have CAFO beef, grass-fed beef, and grass-fed organic beef." +
                " \nWe also have some soybean patties (enter \"soybean patty\") in the freezer.");
    }
    public static void cheeseType(){
        System.out.println("What type of cheese would you like on your burger? We have " +
                "provolone, cheddar, and pepper jack.");
    }
    public static void cheeseCount(BasicIngredients ingredients){
        System.out.println("And how many slices of " +ingredients.getCheeseType()+
                " would you like?");
    }
    public static void cheeseConfirmation(BasicIngredients ingredients){
        System.out.println("OK. "+ingredients.getCheeseCount()+ " slices of "
                + ingredients.getCheeseType()+"." +
                "Sounds great!! All of our cheese is grass fed and organic ;)");
    }
    public static void waitTime(){
        System.out.println("Thank you!! Your order will be ready in about 15 minutes.");
    }

}
