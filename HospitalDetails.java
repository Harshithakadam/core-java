class HospitalDetails{

    static String doctorNames[] = {"Ravi","Kiran","Anu","Megha","Rahul","Priya","Suresh","Divya"};
    static String departments[] = {"Cardio","Neuro","ENT","Dental","Ortho","Skin","Eye","General"};
    static byte experience[] = {5,7,10,4,6,8,9,3};
    static float fees[] = {500f,600f,700f,300f,450f,550f,650f,350f};

    public static void getDoctorDetails(){

        for(int i=0;i<doctorNames.length;i++){

            System.out.println("Doctor Name: "+doctorNames[i]);
            System.out.println("Department: "+departments[i]);
            System.out.println("Experience: "+experience[i]);
            System.out.println("Fees: "+fees[i]);
            System.out.println("----------------------");

        }
    }
}