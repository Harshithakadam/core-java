class PizzaHutRunner{
  public static void main(String[] args){
    PizzaHut p = new PizzaHut();

    double re;
    re = p.getFoodPriceByFoodName("Veg Pizza");
    System.out.println(re);

    re = p.getFoodPriceByFoodName("Cheese Pizza");
    System.out.println(re);

    re = p.getFoodPriceByFoodName("Paneer Pizza");
    System.out.println(re);

    re = p.getFoodPriceByFoodName("Garlic Bread");
    System.out.println(re);

    re = p.getFoodPriceByFoodName("Pasta");
    System.out.println(re);

    System.out.println("------------------");

    re = p.getTotalAmountByPriceQuantityAndDiscount(180,2,15);
    System.out.println(re);
  }
}