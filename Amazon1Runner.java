class Amazon1Runner{

  public static void main(String[] args){
   Amazon1 a1=new Amazon1();
   a1.login("Harshith@123","Harshu");
   System.out.println("----------------------");
   a1.login(12345678910l,345098);
   System.out.println("----------------------");
   System.out.println(a1.search("Sumsang"));
   System.out.println("----------------------");
   System.out.println(a1.search("Sumsang","washing machine"));
   System.out.println("----------------------");
   System.out.println(a1.search("Sumsang","washing machine","Electronic Machine"));
   System.out.println("----------------------");
   System.out.println(a1.search("Sumsang","washing machine","Electronic Machine",15000.00));
   System.out.println("----------------------");
   System.out.println(a1.search("Sumsang","washing machine","Electronic Machine",15000.00,true));
   System.out.println("----------------------");
  }
}