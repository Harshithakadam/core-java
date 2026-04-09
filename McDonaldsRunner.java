class McDonaldsRunner{
  public static void main(String[] args){
    McDonalds m = new McDonalds();

    double re;
    re = m.getFoodPriceByFoodName("Burger");
    System.out.println(re);

    re = m.getFoodPriceByFoodName("Fries");
    System.out.println(re);

    re = m.getFoodPriceByFoodName("McPuff");
    System.out.println(re);

    re = m.getFoodPriceByFoodName("Wrap");
    System.out.println(re);

    re = m.getFoodPriceByFoodName("Coke");
    System.out.println(re);

    System.out.println("------------------");

    re = m.getTotalAmountByPriceQuantityAndDiscount(100,3,10);
    System.out.println(re);
  }
}