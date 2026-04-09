class UberEatsRunner{
  public static void main(String[] args){
    UberEats u = new UberEats();

    double re;
    re = u.getFoodPriceByFoodName("Burger");
    System.out.println(re);

    re = u.getFoodPriceByFoodName("Fries");
    System.out.println(re);

    re = u.getFoodPriceByFoodName("Pizza");
    System.out.println(re);

    re = u.getFoodPriceByFoodName("Sandwich");
    System.out.println(re);

    re = u.getFoodPriceByFoodName("Wrap");
    System.out.println(re);

    System.out.println("------------------");

    re = u.getTotalAmountByPriceQuantityAndDiscount(120,2,10);
    System.out.println(re);
  }
}