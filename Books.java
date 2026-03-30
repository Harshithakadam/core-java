class Books{
	
	//method without returntype and with parameters
	public static void displayBrand(String brand){
		System.out.println("Book Brand:"+brand);
	}
	//method without returntype and without parameters
	static float price=40.5f;
	public static void displayPrice(){
		System.out.println("Book Price:"+price);
	}
	//method with returntype and with parameters
	public static int displayPages(int pages){
		System.out.println("Book Pages:"+pages);
		return pages;
	}
	//method with returntype and without parameters
	 static byte ratings=7;
	public static byte displayRatings(){
		System.out.println(" Book Ratings:"+ratings);
		return ratings;
	}
}