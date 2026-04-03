class CarBrandRunner{
    public static void main(String[] args){
        CarBrand toyota=new CarBrand("Toyota","Koji Sato","Sakichi Toyoda","Japan","red,white");
        toyota.display();
        System.out.println("------------------------------");
        CarBrand bmw=new CarBrand("BMW","Oliver Zipse","Franz Josef Popp","Germany","blue,white");
        bmw.display();
        System.out.println("------------------------------");
        CarBrand mercedes=new CarBrand("Mercedes","Ola Kallenius","Karl Benz","Germany","silver,black");
        mercedes.display();
        System.out.println("------------------------------");
        CarBrand tesla=new CarBrand("Tesla","Elon Musk","Elon Musk","USA","red,silver");
        tesla.display();
        System.out.println("------------------------------");
        CarBrand tata=new CarBrand("Tata Motors","Shailesh Chandra","Jamsetji Tata","India","blue,white");
        tata.display();
        System.out.println("------------------------------");
        CarBrand hyundai=new CarBrand("Hyundai","Jaehoon Chang","Chung Ju-yung","South Korea","blue,silver");
        hyundai.display();
        System.out.println("------------------------------");
        CarBrand ford=new CarBrand("Ford","Jim Farley","Henry Ford","USA","blue,white");
        ford.display();
        System.out.println("------------------------------");
        CarBrand honda=new CarBrand("Honda","Toshihiro Mibe","Soichiro Honda","Japan","red,white");
        honda.display();
        System.out.println("------------------------------");
        CarBrand audi=new CarBrand("Audi","Gernot Dollner","August Horch","Germany","black,silver");
        audi.display();
        System.out.println("------------------------------");
        CarBrand mahindra=new CarBrand("Mahindra","Anish Shah","JC Mahindra","India","red,white");
        mahindra.display();
    }
}