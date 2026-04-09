class EatSure {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Thali"){
      price=200;
    }else if(foodName=="Biryani"){
      price=180;
    }else if(foodName=="Chapathi"){
      price=40;
    }else if(foodName=="Rice"){
      price=60;
    }else if(foodName=="Curd"){
      price=30;
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