class UberEats {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Burger"){
      price=120;
    }else if(foodName=="Fries"){
      price=80;
    }else if(foodName=="Pizza"){
      price=180;
    }else if(foodName=="Sandwich"){
      price=140;
    }else if(foodName=="Wrap"){
      price=130;
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