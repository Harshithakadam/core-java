class HeadPhone{
	
	//method without returntype and with parameters
	public static void displayHeadPhoneBrand(String brand){
		System.out.println("Head Phone Brand:"+brand);
	}
	//method without returntype and without parameters
	static float price=2000.5f;
	public static void displayHeadPhonePrice(){
		System.out.println("Head Phone Price:"+price);
	}
	//method with returntype and with parameters
	public static String displayHeadPhoneColour(String colour){
		System.out.println("Head Phone colour:"+colour);
		return colour;
	}
	//method with returntype and without parameters
	 static byte ratings=9;
	public static byte displayHeadPhoneRatings(){
		System.out.println("Head Phone Ratings:"+ratings);
		return ratings;
	}
}