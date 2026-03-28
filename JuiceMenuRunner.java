class JuiceMenuRunner {

    public static void main(String[] args) {

        JuiceMenu j1 = new JuiceMenu();
        j1.getJuiceMenu();
        j1.juiceFlavours("Mango");
        j1.juiceFlavours("Apple");
        j1.juiceFlavours("Orange");
        j1.juiceFlavours("Grapes");
        System.out.println("------ First Object ------");

        JuiceMenu j2 = new JuiceMenu();
        j2.juiceFlavours("Pineapple");
        j2.juiceFlavours("Watermelon");
        j2.juiceFlavours("Mango");
        j2.juiceFlavours("Kiwi");
        System.out.println("------ Second Object ------");

        JuiceMenu j3 = new JuiceMenu();
        j3.juiceFlavours("Apple");
        j3.juiceFlavours("Orange");
        j3.juiceFlavours("Lychee");
        j3.juiceFlavours("Cherry");
        System.out.println("------ Third Object ------");

        JuiceMenu j4 = new JuiceMenu();
        j4.juiceFlavours("Mango");
        j4.juiceFlavours("Pineapple");
        j4.juiceFlavours("Watermelon");
        j4.juiceFlavours("Peach");
        System.out.println("------ Fourth Object ------");

        JuiceMenu j5 = new JuiceMenu();
        j5.juiceFlavours("Orange");
        j5.juiceFlavours("Apple");
        j5.juiceFlavours("Banana");
        j5.juiceFlavours("Mango");
        System.out.println("------ Fifth Object ------");
    }
}