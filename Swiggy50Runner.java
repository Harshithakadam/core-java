class Swiggy50Runner{
  public static void main(String[] args){
    Swiggy50 s = new Swiggy50();

    double re;
    re = s.getFoodPriceByFoodName("Idli");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Dosa");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Biryani");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Poori");
    System.out.println(re);

    re = s.getFoodPriceByFoodName("Meals");
    System.out.println(re);

    System.out.println("------------------");

    re = s.getTotalAmountByPriceQuantityAndDiscount(100,3,10);
    System.out.println(re);
  }
}