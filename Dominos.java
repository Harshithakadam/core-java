class Dominos{

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;
    if(foodName=="Pizza"){
       price=200;
    }else if(foodName=="Garlic Bread"){
	   price=120;
	}else if(foodName=="Pasta"){
		price=150;
	}else if(foodName=="burger"){
		price=100;
	}else if(foodName=="fries"){
		price=80;
	}else{
		price=0.0;
	}
	return price;
  }
  public double getTotalAmountByPriceQuantityAndDiscount(double price,int quantity,double discount){
	  double totalAmount=0.0;
	  price=price*quantity;
	  discount=price*(discount/100);
	  totalAmount=price-discount;
	  return totalAmount;
  }
 
}