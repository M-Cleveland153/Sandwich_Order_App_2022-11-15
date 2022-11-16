public class IngredInstantiator {
//    public static BasicIngredients ingredInstantiator(String customerName,
//                                                      String burgerType,
//                                                      boolean isDeluxe,
//                                                      String bunType){
    public static BasicIngredients ingredInstantiator(String customerName,
                                                      String burgerType,
                                                      String bunType){

        BasicIngredients ingredients;
        // 3-14 5:04pm. Let basic = 1, deluxe = 2, and healthy = 3

//        if(burgerType == "basic"){
        if(burgerType.equals("basic")){
            ingredients = new BasicIngredients(customerName, bunType, false);
//        } else if (burgerType == "deluxe"){
        } else if (burgerType.equals("deluxe")){
            ingredients = new BasicIngredients(customerName, bunType,true);
        } else {
            ingredients = new HealthyIngredients(customerName, bunType, false);
        }
        return ingredients;
    }
    //        switch(burgerType){
//            case "basic":
//                BasicIngredients ingredients =
//                        new BasicIngredients(customerName, bunType, false);
//                break;
//            case "deluxe":
//                ingredients = new BasicIngredients(customerName, bunType,true);
//                break;
//            case "healthy":
//                ingredients = new HealthyIngredients(customerName, bunType, false);
//                break;
//        }
//        return ingredients ; //ERROR: cannot resolve symbol ingredients
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//        BasicIngredients ingredients;
//        if(burgerType == "basic"){
//            ingredients = new BasicIngredients(customerName, bunType, false);
//        } else if (burgerType == "deluxe"){
//            ingredients = new BasicIngredients(customerName, bunType,true);
//        } else if (burgerType == "healthy") {
//            ingredients = new HealthyIngredients(customerName, bunType, false);
//        }
//        return ingredients; //error for ingredients here " 'ingredients' might not have
//                            // been initialized.
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//        switch(burgerType){
//            case "basic":
//                BasicIngredients ingredients =
//                        new BasicIngredients(customerName, bunType, false);
//                break;
//            case "deluxe":
//                ingredients = new BasicIngredients(customerName, bunType,true);
//                break;
//
//        }
//        return ingredients ; //ERROR: cannot resolve symbol ingredients
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
}
