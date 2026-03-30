class RestaurantMenu{

    static String foodNames[] = {"Pizza","Burger","Pasta","Sandwich","Noodles","FriedRice","Biryani","Dosa"};
    static float foodPrices[] = {200f,150f,180f,120f,160f,170f,220f,100f};
    static byte foodRatings[] = {9,8,7,6,8,7,9,8};
    static String foodTypes[] = {"FastFood","FastFood","Italian","Snack","Chinese","Chinese","Indian","South"};

    public static void getFoodDetails(){

        for(int i=0;i<foodNames.length;i++){

            System.out.println("Food Name: "+foodNames[i]);
            System.out.println("Food Price: "+foodPrices[i]);
            System.out.println("Food Rating: "+foodRatings[i]);
            System.out.println("Food Type: "+foodTypes[i]);
            System.out.println("----------------------");

        }
    }
}