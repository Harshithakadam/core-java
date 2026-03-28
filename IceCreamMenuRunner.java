class IceCreamMenuRunner{

  public static void main(String[] args){
  
  IceCreamMenu ice1=new IceCreamMenu();
  ice1.getIceCreamDeseart();
  ice1.IceCreamFlavours("Mango");
  ice1.IceCreamFlavours("Butter scotch");
  ice1.IceCreamFlavours("WatterMelon");
  ice1.IceCreamFlavours("peach");
  System.out.println("-------------First Object-----------------");
  
  IceCreamMenu ice2=new IceCreamMenu();
  ice2.IceCreamFlavours("Cherry");
  ice2.IceCreamFlavours("Chocolate");
  ice2.IceCreamFlavours("Pineapple");
  ice2.IceCreamFlavours("Lychee");
  System.out.println("-------------Second Object-----------------");
  
  IceCreamMenu ice3=new IceCreamMenu();
  ice3.IceCreamFlavours("Mango");
  ice3.IceCreamFlavours("Strawberry");
  ice3.IceCreamFlavours("Red velvat");
  ice3.IceCreamFlavours("Kiwi");
  System.out.println("-------------Third Object-----------------");
  
  IceCreamMenu ice4=new IceCreamMenu();
  ice4.IceCreamFlavours("Red velvat");
  ice4.IceCreamFlavours("Mango");
  ice4.IceCreamFlavours("Butter scotch");
  ice4.IceCreamFlavours("Salted Charamel");
  System.out.println("-------------Fourth Object-----------------");
  
  IceCreamMenu ice5=new IceCreamMenu();
  ice5.IceCreamFlavours("Butter scotch");
  ice5.IceCreamFlavours("Kiwi");
  ice5.IceCreamFlavours("Kasata");
  ice5.IceCreamFlavours("Mango");
  System.out.println("-------------Fifth Object-----------------");
  }
}