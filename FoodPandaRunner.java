class FoodPandaRunner{
  public static void main(String[] args){
    FoodPanda f = new FoodPanda();

    double re;
    re = f.getFoodPriceByFoodName("Noodles");
    System.out.println(re);

    re = f.getFoodPriceByFoodName("Fried Rice");
    System.out.println(re);

    re = f.getFoodPriceByFoodName("Manchurian");
    System.out.println(re);

    re = f.getFoodPriceByFoodName("Soup");
    System.out.println(re);

    re = f.getFoodPriceByFoodName("Roll");
    System.out.println(re);

    System.out.println("------------------");

    re = f.getTotalAmountByPriceQuantityAndDiscount(90,4,10);
    System.out.println(re);
  }
}