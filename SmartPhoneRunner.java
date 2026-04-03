class SmartPhoneRunner{
    public static void main(String[] args){
        SmartPhone iphone=new SmartPhone("Apple","iPhone 15","A16 Bionic","Apple Inc","black,white");
        iphone.display();
        System.out.println("------------------------------");
        SmartPhone samsung=new SmartPhone("Samsung","Galaxy S24","Snapdragon 8 Gen3","Samsung Electronics","phantom black");
        samsung.display();
        System.out.println("------------------------------");
        SmartPhone oneplus=new SmartPhone("OnePlus","12R","Snapdragon 8 Gen2","BBK Electronics","iron gray");
        oneplus.display();
        System.out.println("------------------------------");
        SmartPhone mi=new SmartPhone("Xiaomi","Mi 14","Snapdragon 8 Gen3","Xiaomi Corp","black,white");
        mi.display();
        System.out.println("------------------------------");
        SmartPhone oppo=new SmartPhone("Oppo","Reno 11","Dimensity 8200","BBK Electronics","blue,black");
        oppo.display();
        System.out.println("------------------------------");
        SmartPhone vivo=new SmartPhone("Vivo","V29","Snapdragon 778G","BBK Electronics","emerald green");
        vivo.display();
        System.out.println("------------------------------");
        SmartPhone google=new SmartPhone("Google","Pixel 8","Google Tensor G3","Alphabet Inc","obsidian black");
        google.display();
        System.out.println("------------------------------");
        SmartPhone nokia=new SmartPhone("Nokia","G42","Snapdragon 480+","HMD Global","purple,grey");
        nokia.display();
        System.out.println("------------------------------");
        SmartPhone motorola=new SmartPhone("Motorola","Edge 40","Dimensity 8020","Lenovo Group","eclipse black");
        motorola.display();
        System.out.println("------------------------------");
        SmartPhone realme=new SmartPhone("Realme","12 Pro","Snapdragon 7s Gen2","Realme Corp","navigator beige");
        realme.display();
    }
}