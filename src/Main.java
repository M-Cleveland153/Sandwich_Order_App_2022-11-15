import java.util.Scanner;

//SEE THE PROJECT SUMMARY AND DESCRIPTION AT TOP OF MAIN
public class Main {
//    PROJECT SUMMARY AND DESCRIPTION
//    There are five classes other than Main:
//  1. Prices
//	2. WaiterQs (which is short for waiter questions)
//	3. IngredInstantiator
//	4. BasicIngredients
//	5. HealthyIngredients
//
//    The first three (i.e. Prices, WaiterQs, and IngredInstantiator) do NOT have constructors.  They contain only
//    static methods.
//
//    The Prices class has one static method "priceFinder(String item)"that takes an item name (string) parameter
//    and returns the price (type double) of the item.
//
//    The WaiterQs class has nine static void methods that each simply call System.out.println() to either prompt the
//    user for input or to confirm what the user has already input. *Note: The scanner (java.util.Scanner) that is
//    handling the input for the these questions from WaiterQs is instantiated in Main.main().  No scanner is found in
//    the WaiterQs class.
//
//    The IngredInstantiator class has one static method that takes three parameters (customer name, burger type, and
//    bun type) and returns an object of type BasicIngredients which is a parent of the child class HealthyIngredients.
//    Depending on the burger type input, this method will instantiate either a BasicIngredients object with
//    isDeluxe==false, a BasicIngredients object with isDeluxe==true, or a HealthyIngredients object (isDeluxe==false).
//
//    I learned that a method defined to return objects of a particular parent class will also be able to return
//    objects of a child class of that parent.
//
//
//
//    The classes BasicIngredients and HealthyIngredients have only instance methods.
//
//
//
//    The BasicIngredients class has the following methods:
//              **simple setters for protein type, cheese type, cheese count, topping# (1-4), condiment# (#1-3)
//              **simple getters for each field
//              **setToppings(): bundles the four simple toppings setters with a Scanner instantiator statement and a
//              prompt from the waiter.  NOTE: for some reason, closing this scanner causes problems. So it is never
//              closed.
//              **setCondiments(): bundles the three simple condiments setters with a Scanner instantiator statement
//              and a prompt from the waiter. NOTE: for some reason, closing this scanner causes problems. So it is
//              never closed.
//              **totalPrice(): calls Price.priceFinder() for each relevant object field via the "this" keyword and
//              returns the total price.
//              **printOrderSummary(): utilizes Price.priceFinder to generate a list of ingredients and their prices
//              which is output via a series of System.out.println statements.
//
//
//
//    The child HealthyIngredients class extends the parent class BasicIngredients and then adds two fields, topping5
//    and topping6 (both strings), and setters and getters for each. In order to accommodate these new fields, the class
//    also overrides two methods: "setToppings()" and "printOrderSummary()"
//
//
//
//
//            Main.main()
//    Main contains no if-statements, for loops, or while loops.
//    Main mostly calls a series of static methods and instance methods.
//
//    The four variables and objects that Main initiates are:
//
//      *customerName
//      *int burgerType
//      *BasicIngredients ingredients
//      *Scanner(System.in)
//
//    Main.main() creates a Scanner to handle input for all input except for the inputs prompted by the methods
//    setToppings and setCondiments.
//    After receiving customer name, burger type (basic, deluxe, or healthy), and bun type from the user, it calls
//    IngredInstantiator.ingredInstantiator() which returns a BasicIngredients object.  From then on, ingredient fields
//    are updated by instance methods that are called on that object.

    public static void main(String[] args) {

        String customerName;
        String burgerType;
        BasicIngredients ingredients;

        Scanner scanner = new Scanner(System.in);

        WaiterQs.waiterIntro();
        WaiterQs.customerName();
        customerName = scanner.nextLine().toLowerCase();
        System.out.println("Thank you " + customerName);

        WaiterQs.burgerType();
        burgerType = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Alright, a "+ burgerType +" it is!!");

        WaiterQs.bunType(burgerType);
        String bunType = scanner.nextLine().toLowerCase();

        ingredients = IngredInstantiator.ingredInstantiator(
                customerName,burgerType,bunType);

        //INGREDIENTS OBJECT INSTANTIATED

        ingredients.printOrderSummary();

        WaiterQs.protein();
        ingredients.setProteinType(scanner.nextLine().toLowerCase());
        System.out.println(ingredients.getProteinType() + ". Got it.");

        ingredients.printOrderSummary();

        WaiterQs.cheeseType();
        ingredients.setCheeseType(scanner.nextLine().toLowerCase());
        WaiterQs.cheeseCount(ingredients);
        ingredients.setCheeseCount(scanner.nextInt());
//        scanner.nextLine();
        WaiterQs.cheeseConfirmation(ingredients);

        ingredients.printOrderSummary();

        ingredients.setToppings();

        ingredients.printOrderSummary();

        ingredients.setCondiments();

        ingredients.printOrderSummary();
        WaiterQs.waitTime();

        scanner.close();

    }
}