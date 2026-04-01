class Amazon1{

   public String login(String userName,String psw){
	  System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
	  return null;
    }
	public boolean login(long phonrNumber,int otp){
	  System.out.println("invoking login using phonrNumber:"+phonrNumber+" and otp:"+otp);
	  return true;
    }
	public String search(String brand){
	  String result="brand:"+brand;
	  return result;
	}
	public String search(String brand,String productName){
	  String result="brand:"+brand+ "\nproductName:"+productName;
	  return result;
	}
	public String search(String brand,String productName,String catogary){
	  String result="brand:"+brand+ "\nproductName:"+productName+"\ncatogary:"+catogary;
	  return result;
	}
	public String search(String brand,String productName,String catogary,double price){
	  String result="brand:"+brand+ "\nproductName:"+productName+"\ncatogary:"+catogary+" \nprice:"+price;
	  return result;
	}
	public String search(String brand,String productName,String catogary,double price,boolean isAutomatic){
	  String result="brand:"+brand+ "\nproductName:"+productName+"\ncatogary:"+catogary+" \nprice:"+price+"\nisAutomatic:"+isAutomatic;
	  return result;
	}
	
}