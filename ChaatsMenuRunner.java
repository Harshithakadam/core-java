class ChaatsMenuRunner {

    public static void main(String[] args) {

        ChaatsMenu c1 = new ChaatsMenu();
        c1.getChaatsMenu();
        c1.chaatsItems("Pani Puri");
        c1.chaatsItems("Bhel Puri");
        c1.chaatsItems("Samosa");
        c1.chaatsItems("Pizza");
        System.out.println("------ First Object ------");

        ChaatsMenu c2 = new ChaatsMenu();
        c2.chaatsItems("Sev Puri");
        c2.chaatsItems("Dahi Puri");
        c2.chaatsItems("Kachori");
        c2.chaatsItems("Burger");
        System.out.println("------ Second Object ------");

        ChaatsMenu c3 = new ChaatsMenu();
        c3.chaatsItems("Aloo Tikki");
        c3.chaatsItems("Papdi Chaat");
        c3.chaatsItems("Ragda Pattice");
        c3.chaatsItems("Sandwich");
        System.out.println("------ Third Object ------");

        ChaatsMenu c4 = new ChaatsMenu();
        c4.chaatsItems("Vada Pav");
        c4.chaatsItems("Pani Puri");
        c4.chaatsItems("Bhel Puri");
        c4.chaatsItems("Noodles");
        System.out.println("------ Fourth Object ------");

        ChaatsMenu c5 = new ChaatsMenu();
        c5.chaatsItems("Samosa");
        c5.chaatsItems("Kachori");
        c5.chaatsItems("Sev Puri");
        c5.chaatsItems("Fried Rice");
        System.out.println("------ Fifth Object ------");
    }
}