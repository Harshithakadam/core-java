class Menu{

  public void getMenuDetails(){
     System.out.println("invoking getMenuDetails");
  }
  public void checkFoodByFoodName(String foodName){
    System.out.println("invoking checkFoodByFoodName");
    if(foodName=="Aloo Parata"){
	   System.out.println("Available");
	}
	else if(foodName=="Masala Dosa"){
	  System.out.println("Available");
	}
	else if(foodName=="choley Batturey"){
	  System.out.println("Available");
	}
	else if(foodName=="Polav"){
	  System.out.println("Available");
	}
	else if(foodName=="Paneer Butter Masala"){
	  System.out.println("Available");
	}
	else{
	   System.out.println("Not Available");
	}
  }
   public double  checkFoodPriceByFoodName(String foodName){
    System.out.println("invoking checkFoodPriceByFoodName:"+foodName);
    double foodPrice=0.0;
	if(foodName=="Aloo Parata"){
	   foodPrice=90.0;
	}
	else if(foodName=="Masala Dosa"){
	  foodPrice=40.0;
	}
	else if(foodName=="choley Batturey"){
	  foodPrice=90.0;
	}
	else if(foodName=="Polav"){
	  foodPrice=60.0;
	}
	else if(foodName=="Paneer Butter Masala"){
	 foodPrice=90.0;
	}
	else{
	   System.out.println(foodName+"is Not Available");
	}
	 return foodPrice;
  }
}
 
  
