class Hospital{
    String hospitalName;
    String directorName;
    static int noOfDoctors=200;
    String founderName;
    String cityName;
    String specialization;

    public Hospital(){
	}

    public Hospital(String hospitalName,String directorName,String founderName,String cityName,String specialization){
        this.hospitalName=hospitalName;
        this.directorName=directorName;
        this.founderName=founderName;
        this.cityName=cityName;
        this.specialization=specialization;
    }

    public void display(){
        System.out.println("hospitalName:"+hospitalName);
        System.out.println("directorName:"+directorName);
        System.out.println("noOfDoctors:"+noOfDoctors);
        System.out.println("founderName:"+founderName);
        System.out.println("cityName:"+cityName);
        System.out.println("specialization:"+specialization);
    }
}