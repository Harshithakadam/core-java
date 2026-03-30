class TrainDetails {
    static byte ratings[] = {4,5,3,4,5,4,5,4,5,9,8,2,3,6,7};
	static short mileage[] = {40,45,50,42,48,52,89,46,12,25,90,48,92,95,16};
	static int prices[] = {800000,900000,1000000,1100000,1200000,320000,800000,900000,1000000,1100000,1200000,320000,1000000,1100000,1200000};
    static long regNumbers[] = {560001001L,560001002L,560001003L,560001004L,560001005L,560001001L,560001002L,560001003L,560001004L,560001005L,560001005L,560001005L,560001005L};
	 
    public static void main(String[] args){
        for(int i = 0; i < ratings.length; i++) {
			if(i%2==0){
            System.out.println(ratings[i]);
			}
        }
        for(int i = 0; i < mileage.length; i++) {
			if(i%2==0){
            System.out.println(mileage[i]);
		    }
        }
        for(int i = 0; i < prices.length; i++) {
			if(i%2==0){
            System.out.println(prices[i]);
			}
        }
        for(int i = 0; i < regNumbers.length; i++) {
			if(i%2==0){
            System.out.println(regNumbers[i]);
			}
        }
	}
}	