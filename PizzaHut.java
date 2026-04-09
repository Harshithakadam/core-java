class PizzaHut {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Veg Pizza"){
      price=180;
    }else if(foodName=="Cheese Pizza"){
      price=200;
    }else if(foodName=="Paneer Pizza"){
      price=220;
    }else if(foodName=="Garlic Bread"){
      price=130;
    }else if(foodName=="Pasta"){
      price=150;
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