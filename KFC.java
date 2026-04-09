class KFC {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Chicken Bucket"){
      price=300;
    }else if(foodName=="Zinger Burger"){
      price=150;
    }else if(foodName=="Popcorn Chicken"){
      price=200;
    }else if(foodName=="Fries"){
      price=90;
    }else if(foodName=="Pepsi"){
      price=60;
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