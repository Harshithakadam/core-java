class NonVegMenuRunner {

    public static void main(String[] args) {

        NonVegMenu n1 = new NonVegMenu();
        n1.getNonVegMenu();
        n1.nonVegItems("Chicken");
        n1.nonVegItems("Mutton");
        n1.nonVegItems("Fish");
        n1.nonVegItems("Beef");
        System.out.println("------ First Object ------");

        NonVegMenu n2 = new NonVegMenu();
        n2.nonVegItems("Prawns");
        n2.nonVegItems("Egg Curry");
        n2.nonVegItems("Chicken");
        n2.nonVegItems("Fish");
        System.out.println("------ Second Object ------");

        NonVegMenu n3 = new NonVegMenu();
        n3.nonVegItems("Mutton");
        n3.nonVegItems("Chicken");
        n3.nonVegItems("Prawns");
        n3.nonVegItems("Duck");
        System.out.println("------ Third Object ------");

        NonVegMenu n4 = new NonVegMenu();
        n4.nonVegItems("Fish");
        n4.nonVegItems("Egg Curry");
        n4.nonVegItems("Chicken");
        n4.nonVegItems("Crab");
        System.out.println("------ Fourth Object ------");

        NonVegMenu n5 = new NonVegMenu();
        n5.nonVegItems("Chicken");
        n5.nonVegItems("Mutton");
        n5.nonVegItems("Fish");
        n5.nonVegItems("Prawns");
        System.out.println("------ Fifth Object ------");
    }
}