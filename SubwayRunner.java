class SubwayRunner{
  public static void main(String[] args){
    Subway s = new Subway();

    double re;
    re = s.getFoodPriceByFoodName("Sandwich");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Salad");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Wrap");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Cookies");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Juice");
    System.out.println(re);

    System.out.println("------------------");

    re = s.getTotalAmountByPriceQuantityAndDiscount(150,2,5);
    System.out.println(re);
  }
}