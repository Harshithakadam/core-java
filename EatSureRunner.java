class EatSureRunner{
  public static void main(String[] args){
    EatSure e = new EatSure();

    double re;
    re = e.getFoodPriceByFoodName("Thali");
    System.out.println(re);

    re = e.getFoodPriceByFoodName("Biryani");
    System.out.println(re);

    re = e.getFoodPriceByFoodName("Chapathi");
    System.out.println(re);

    re = e.getFoodPriceByFoodName("Rice");
    System.out.println(re);

    re = e.getFoodPriceByFoodName("Curd");
    System.out.println(re);

    System.out.println("------------------");

    re = e.getTotalAmountByPriceQuantityAndDiscount(200,2,10);
    System.out.println(re);
  }
}