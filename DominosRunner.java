class DominosRunner{
  public static void main(String[] args){
    Dominos d = new Dominos();

    double re;
    re = d.getFoodPriceByFoodName("Pizza");
    System.out.println(re);

    re = d.getFoodPriceByFoodName("Garlic Bread");
    System.out.println(re);

    re = d.getFoodPriceByFoodName("Pasta");
    System.out.println(re);

    re = d.getFoodPriceByFoodName("Burger");
    System.out.println(re);

    re = d.getFoodPriceByFoodName("Fries");
    System.out.println(re);

    System.out.println("------------------");

    re = d.getTotalAmountByPriceQuantityAndDiscount(200,2,5);
    System.out.println(re);
  }
}