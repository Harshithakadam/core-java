class Mobile{

public static void displayMobileBrand(String brand){
    System.out.println("Mobile Brand: " + brand);
}

static float price = 25000.0f;

public static void displayMobilePrice(){
    System.out.println("Mobile Price: " + price);
}

public static String displayMobileColour(String colour){
    System.out.println("Mobile Colour: " + colour);
    return colour;
}

static byte ratings = 9;

public static byte displayMobileRatings(){
    System.out.println("Mobile Ratings: " + ratings);
    return ratings;
}

}