class Subway {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Sandwich"){
      price=150;
    }else if(foodName=="Salad"){
      price=120;
    }else if(foodName=="Wrap"){
      price=140;
    }else if(foodName=="Cookies"){
      price=60;
    }else if(foodName=="Juice"){
      price=70;
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