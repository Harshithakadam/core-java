class SwiggyRunner{

  public static void main(String[] args){
   Swiggy s1=new Swiggy();
   s1.login("Harshith@123","Harshu");
   System.out.println("----------------------");
   s1.login(12345678910l,345098);
   System.out.println("----------------------");
   System.out.println(s1.foodOrder("Dominos"));
   System.out.println("----------------------");
   System.out.println(s1.foodOrder("Dominos","Italian"));
   System.out.println("----------------------");
   System.out.println(s1.foodOrder("Dominos","Italian",9.5f));
   System.out.println("----------------------");
   System.out.println(s1.foodOrder("Dominos","Italian",9.5f,700.00));
   System.out.println("----------------------");
   System.out.println(s1.foodOrder("Dominos","Italian",9.5f,700.00,20));
   System.out.println("----------------------");
  }
}