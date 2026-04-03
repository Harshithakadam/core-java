class Bank{
    String bankName;
    String ceoName;
    static int workDays=6;
    String founderName;
    String countryName;
    String bankType;

    public Bank(){}

    public Bank(String bankName,String ceoName,String founderName,String countryName,String bankType){
        this.bankName=bankName;
        this.ceoName=ceoName;
        this.founderName=founderName;
        this.countryName=countryName;
        this.bankType=bankType;
    }

    public void display(){
        System.out.println("bankName:"+bankName);
        System.out.println("ceoName:"+ceoName);
        System.out.println("workDays:"+workDays);
        System.out.println("founderName:"+founderName);
        System.out.println("countryName:"+countryName);
        System.out.println("bankType:"+bankType);
    }
}