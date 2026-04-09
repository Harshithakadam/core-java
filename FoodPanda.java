class FoodPanda {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Noodles"){
      price=90;
    }else if(foodName=="Fried Rice"){
      price=100;
    }else if(foodName=="Manchurian"){
      price=120;
    }else if(foodName=="Soup"){
      price=80;
    }else if(foodName=="Roll"){
      price=110;
    }else{
      price=0.0;
    }

    return price;
  }

  public double getTotalAmountByPriceQuantityAndDiscount(double price,int quantity,double discount){
    price=price*quantity;
    discount=price*(discount/100);
    return price-discount;
  }
}