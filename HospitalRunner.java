class HospitalRunner{
    public static void main(String[] args){
        Hospital aiims=new Hospital("AIIMS","M Srinivas","Jawaharlal Nehru","Delhi","multispecialty");
        aiims.display();
        System.out.println("------------------------------");
        Hospital apollo=new Hospital("Apollo","Sangita Reddy","Prathap Reddy","Chennai","multispecialty");
        apollo.display();
        System.out.println("------------------------------");
        Hospital fortis=new Hospital("Fortis","Ashutosh Raghuvanshi","Shivinder Singh","Gurgaon","cardiology");
        fortis.display();
        System.out.println("------------------------------");
        Hospital manipal=new Hospital("Manipal Hospital","Dilip Jose","TMA Pai","Bangalore","oncology");
        manipal.display();
        System.out.println("------------------------------");
        Hospital mayo=new Hospital("Mayo Clinic","Gianrico Farrugia","William Mayo","Minnesota","neurology");
        mayo.display();
        System.out.println("------------------------------");
        Hospital medanta=new Hospital("Medanta","Naresh Trehan","Naresh Trehan","Gurgaon","cardiac surgery");
        medanta.display();
        System.out.println("------------------------------");
        Hospital columbia=new Hospital("Columbia Asia","Nandakumar","Bart Maes","Bangalore","multispecialty");
        columbia.display();
        System.out.println("------------------------------");
        Hospital kims=new Hospital("KIMS","Bhaskar Rao","Bhaskar Rao","Hyderabad","orthopedics");
        kims.display();
        System.out.println("------------------------------");
        Hospital narayana=new Hospital("Narayana Health","Emmanuel Rupert","Devi Shetty","Bangalore","cardiac");
        narayana.display();
        System.out.println("------------------------------");
        Hospital lilavati=new Hospital("Lilavati","Padmaja Keskar","Lilavati Mehta","Mumbai","multispecialty");
        lilavati.display();
    }
}