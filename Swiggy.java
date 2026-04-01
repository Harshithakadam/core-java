class Swiggy{

   public String login(String userName,String psw){
	  System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
	  return null;
    }
	public boolean login(long phonrNumber,int otp){
	  System.out.println("invoking login using phonrNumber:"+phonrNumber+" and otp:"+otp);
	  return true;
    }
	public String foodOrder(String name){
	  String result="Name:"+name;
	  return result;
	}
	public String foodOrder(String name,String cuisine){
	  String result="Name:"+name+ "\ncuisine:"+cuisine;
	  return result;
	}
	public String foodOrder(String name,String cuisine,float ratimgs){
	  String result="Name:"+name+ "\ncuisine:"+cuisine+"\nratimgs:"+ratimgs;
	  return result;
	}
	public String foodOrder(String name,String cuisine,float ratimgs,double price){
	  String result="Name:"+name+ "\ncuisine:"+cuisine+"\nratimgs:"+ratimgs+" \nprice:"+price;
	  return result;
	}
	public String foodOrder(String name,String cuisine,float ratimgs,double price,int deliveryIn){
	  String result="Name:"+name+ "\ncuisine:"+cuisine+"\nratimgs:"+ratimgs+" \nprice:"+price+"\ndeliveryIn:"+deliveryIn+"mins";
	  return result;
	}
	
}