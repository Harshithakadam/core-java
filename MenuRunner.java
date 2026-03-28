class MenuRunner{

  public static void main(String[] args){
  
   Menu Ahmaravati =new Menu();
   Ahmaravati.getMenuDetails();
   Ahmaravati.checkFoodByFoodName("Masala Dosa");
   Ahmaravati.checkFoodByFoodName("Masur Dal");
   Ahmaravati.checkFoodByFoodName("Aloo Parata");
   Ahmaravati.checkFoodByFoodName("Chapati");
   Ahmaravati.checkFoodByFoodName("Polav");
   System.out.println("--------------------");
   double price=Ahmaravati.checkFoodPriceByFoodName("Masala Dosa");
   System.out.println(price);
   price=Ahmaravati.checkFoodPriceByFoodName("Aloo Parata");
   System.out.println(price);
   price=Ahmaravati.checkFoodPriceByFoodName("Masur Dal");
   System.out.println(price);
   price=Ahmaravati.checkFoodPriceByFoodName("Chapati");
   System.out.println(price);
   price=Ahmaravati.checkFoodPriceByFoodName("Polav");
   System.out.println(price);
  }
}