class VegMenuRunner {

    public static void main(String[] args) {

        VegMenu v1 = new VegMenu();
        v1.getVegMenu();
        v1.vegItems("Paneer");
        v1.vegItems("Dal");
        v1.vegItems("Chapati");
        v1.vegItems("Pizza");
        System.out.println("------ First Object ------");

        VegMenu v2 = new VegMenu();
        v2.vegItems("Veg Biryani");
        v2.vegItems("Fried Rice");
        v2.vegItems("Paneer");
        v2.vegItems("Noodles");
        System.out.println("------ Second Object ------");

        VegMenu v3 = new VegMenu();
        v3.vegItems("Dal");
        v3.vegItems("Chapati");
        v3.vegItems("Paneer");
        v3.vegItems("Burger");
        System.out.println("------ Third Object ------");

        VegMenu v4 = new VegMenu();
        v4.vegItems("Veg Biryani");
        v4.vegItems("Fried Rice");
        v4.vegItems("Chapati");
        v4.vegItems("Sandwich");
        System.out.println("------ Fourth Object ------");

        VegMenu v5 = new VegMenu();
        v5.vegItems("Paneer");
        v5.vegItems("Dal");
        v5.vegItems("Pizza");
        v5.vegItems("Fried Rice");
        System.out.println("------ Fifth Object ------");
    }
}