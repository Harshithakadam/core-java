class Zomato{

  public double getFoodPriceByFoodName(String foodName){
    double price=0.0;
    if(foodName=="Aloo Parata"){
       price=70;
    }else if(foodName=="Fired rice"){
	   price=50;
	}else if(foodName=="gee rice"){
		price=70;
	}else if(foodName=="panner"){
		price=100;
	}else if(foodName=="chooley batorey"){
		price=120;
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