class Chocolate {

    // method without return type and with parameters
    public static void getChocolateDetails(String brand, String flavor) {
        System.out.println("Brand Name: " + brand);
        System.out.println("Flavor: " + flavor);
    }

    // method without return type and without parameters
    static String type = "Dark Chocolate";

    public static void displayChocolateDetails() {
        System.out.println("Type: " + type);
    }
}