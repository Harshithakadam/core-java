class FlipKart1{

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
	public String search(String brand,String color){
	  String result="brand:"+brand+ "\ncolor:"+color;
	  return result;
	}
	public String search(String brand,String color,String oS){
	  String result="brand:"+brand+ "\ncolor:"+color+"\noS:"+oS;
	  return result;
	}
	public String search(String brand,String color,String oS,double price){
	  String result="brand:"+brand+ "\ncolor:"+color+"\noS:"+oS+" \nprice:"+price;
	  return result;
	}
	public String search(String brand,String color,String oS,double price,boolean isScreenTouch){
	  String result="brand:"+brand+ "\ncolor:"+color+"\noS:"+oS+" \nprice:"+price+"\nisAutomatic:"+isScreenTouch;
	  return result;
	}
	
}