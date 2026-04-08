class ElectricityBill {
    int billNo;
    String name;
    int units;
    double amount;
    String date;
    String address;
    long phone;
    boolean paid;
    double tax;
    String type;

    public static int m1(int billNo){ 
	System.out.println(billNo);
	return billNo; }
    public static String m2(String name){ 
	System.out.println(name);
	return name; }
    public static int m3(int units){ 
	System.out.println(units); 
	return units; }
    public static double m4(double amount){
	System.out.println(amount); 
	return amount; }
    public static String m5(String date){
	System.out.println(date);
	return date; }
    public static String m6(String address){
	System.out.println(address); 
	return address; }
    public static long m7(long phone){
	System.out.println(phone);
	return phone; }
    public static boolean m8(boolean paid){ 
	System.out.println(paid);
	return paid; }
    public static double m9(double tax){ 
	System.out.println(tax); 
	return tax; }
    public static String m10(String type){ 
	System.out.println(type);
	return type; }
}