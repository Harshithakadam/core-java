class FlipKart1Runner{

  public static void main(String[] args){
   FlipKart1 f1=new FlipKart1();
   f1.login("Harshith@123","Harshu");
   System.out.println("----------------------");
   f1.login(12345678910l,345098);
   System.out.println("----------------------");
   System.out.println(f1.search("HP"));
   System.out.println("----------------------");
   System.out.println(f1.search("HP","Silver"));
   System.out.println("----------------------");
   System.out.println(f1.search("HP","Silver","Windows"));
   System.out.println("----------------------");
   System.out.println(f1.search("HP","Silver","Windows",35000.00));
   System.out.println("----------------------");
   System.out.println(f1.search("HP","Silver","Windows",35000.00,false));
   System.out.println("----------------------");
  }
}