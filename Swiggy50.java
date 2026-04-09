class Swiggy50 {

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;

    if(foodName=="Idli"){
      price=30;
    }else if(foodName=="Dosa"){
      price=50;
    }else if(foodName=="Biryani"){
      price=150;
    }else if(foodName=="Poori"){
      price=40;
    }else if(foodName=="Meals"){
      price=120;
    }else{
      price=0.0;
    }

    return price;
  }

  public double getTotalAmountByPriceQuantityAndDiscount(double price,int quantity,double discount){
    double totalamount=0.0;
    price=price*quantity;
    discount=price*(discount/100);
    totalamount=price-discount;
	return totalamount;
  }
}