class ElectronicsStore{

    static String itemNames[] = {"Laptop","Mobile","Tablet","Camera","Speaker","TV","Monitor","Printer"};
    static float itemPrices[] = {65000f,30000f,20000f,45000f,5000f,55000f,15000f,8000f};
    static byte itemRatings[] = {9,8,7,8,7,9,8,6};
    static String brands[] = {"Dell","Samsung","Apple","Canon","JBL","Sony","LG","HP"};

    public static void getItemDetails(){

        for(int i=0;i<itemNames.length;i++){

            System.out.println("Item Name: "+itemNames[i]);
            System.out.println("Item Price: "+itemPrices[i]);
            System.out.println("Item Rating: "+itemRatings[i]);
            System.out.println("Brand: "+brands[i]);
            System.out.println("----------------------");

        }
    }
}