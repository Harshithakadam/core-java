class BookStore{

    static String bookNames[] = {"Java","Python","C++","SQL","HTML","CSS","JavaScript","Spring"};
    static float bookPrices[] = {450.5f,500.5f,400.5f,350.5f,300.5f,250.5f,600.5f,700.5f};
    static byte bookRatings[] = {8,9,7,8,6,7,9,10};
    static int bookPages[] = {300,250,280,200,150,170,320,400};

    public static void getBookDetails(){

        for(int i=0;i<bookNames.length;i++){

            System.out.println("Book Name: "+bookNames[i]);
            System.out.println("Book Price: "+bookPrices[i]);
            System.out.println("Book Rating: "+bookRatings[i]);
            System.out.println("Book Pages: "+bookPages[i]);
            System.out.println("----------------------");

        }
    }
}