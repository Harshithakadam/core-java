class Teacher {
    String name;
    int id;
    String subject;
    double salary;
    String school;
    long phoneNo;
    String email;
    int experience;
    char grade;
    boolean isPermanent;

    public static String showName(String name){ 
	System.out.println("Name: "+name); 
	return name; }
    public static int showId(int id){ 
	System.out.println("Id: "+id);
	return id; }
    public static String showSubject(String subject){ 
	System.out.println("Subject: "+subject);
	return subject; }
    public static double showSalary(double salary){ 
	System.out.println("Salary: "+salary);
	return salary; }
    public static String showSchool(String school){ 
	System.out.println("School: "+school); 
	return school; }
    public static long showPhone(long phoneNo){ 
	System.out.println("Phone: "+phoneNo);
	return phoneNo; }
    public static String showEmail(String email){ 
	System.out.println("Email: "+email); 
	return email; }
    public static int showExp(int experience){ 
	System.out.println("Experience: "+experience); 
	return experience; }
    public static char showGrade(char grade){ 
	System.out.println("Grade: "+grade); 
	return grade; }
    public static boolean showStatus(boolean isPermanent){ 
	System.out.println("Permanent: "+isPermanent); 
	return isPermanent; }
}