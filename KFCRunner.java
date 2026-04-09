class KFCRunner{
  public static void main(String[] args){
    KFC k = new KFC();

    double re;
    re = k.getFoodPriceByFoodName("Chicken Bucket");
    System.out.println(re);

    re = k.getFoodPriceByFoodName("Zinger Burger");
    System.out.println(re);

    re = k.getFoodPriceByFoodName("Popcorn Chicken");
    System.out.println(re);

    re = k.getFoodPriceByFoodName("Fries");
    System.out.println(re);

    re = k.getFoodPriceByFoodName("Pepsi");
    System.out.println(re);

    System.out.println("------------------");

    re = k.getTotalAmountByPriceQuantityAndDiscount(300,1,20);
    System.out.println(re);
  }
}