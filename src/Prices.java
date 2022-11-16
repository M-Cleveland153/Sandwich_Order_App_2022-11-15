public class Prices {
//    private double chips;
//    private double drink;
//    private double organicRye;
//    private double organicWheat;
//    private double whiteGMO;
//    private double cafoBeef;
//    private double grassfedBeef;
//    private double grassfedOrganicBeef;
//    private double soybeanPatty;
//    private double cheese;
//    private double condiment; //ketchup, mayo, mustard
//    private double lettuce;
//    private double tomato;
//    private double onion;
//    private double carrots;
//    private double steamedKale;
//    private double pickles;
//    private double grilledPeppers;

    public static double priceFinder(String item) {
        switch (item){
            case "chips":
                return 1.50;
            case "drink":
                return 2.00;
            case "organic rye":
                return .25;
            case "organic wheat":
                return .40;
            case "gmo white":
                return .10;
            case "cafo beef":
                return 1.00;
            case "grass-fed beef":
                return 2.00;
            case "grass-fed organic beef":
                return 3.00;
            case "soybean patty":
                return 1.25;
            case "cheddar": case "pepper jack": case "provolone":
                return 2.25;
            case "ketchup":
                return .15;
            case "mayo":
                return .25;
            case "mustard":
                return .20;
            case "lettuce":
                return .25;
            case "tomato":
                return .25;
            case "onion":
                return .25;
            case "carrots":
                return .25;
            case "steamed kale":
                return .50;
            case "pickles":
                return .25;
            case "grilled peppers":
                return .75;
            default:
                return 0;



        }
    }
}
