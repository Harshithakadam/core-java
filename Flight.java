class Flight {
    String name;
    String source;
    String destination;
    int seats;
    double price;
    String airline;
    long flightNo;
    String time;
    boolean delayed;
    int duration;

    public static String m1(String name){
	System.out.println(name);
	return name; }
    public static String m2(String source){ 
	System.out.println(source);
	return source; }
    public static String m3(String destination){
	System.out.println(destination); 
	return destination; }
    public static int m4(int seats){
	System.out.println(seats);
	return seats; }
    public static double m5(double price){ 
	System.out.println(price);
	return price; }
    public static String m6(String airline){
	System.out.println(airline);
	return airline; }
    public static long m7(long flightNo){
	System.out.println(flightNo); 
	return flightNo; }
    public static String m8(String time){ 
	System.out.println(time); 
	return time; }
    public static boolean m9(boolean delayed){
	System.out.println(delayed);
	return delayed; }
    public static int m10(int duration){ 
	System.out.println(duration);
	return duration; }
}