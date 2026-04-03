class CarBrand{
    String brandName;
    String ceoName;
    static int noOfSeats=5;
    String founderName;
    String countryName;
    String brandColor;

    public CarBrand(){
	}

    public CarBrand(String brandName,String ceoName,String founderName,String countryName,String brandColor){
        this.brandName=brandName;
        this.ceoName=ceoName;
        this.founderName=founderName;
        this.countryName=countryName;
        this.brandColor=brandColor;
    }

    public void display(){
        System.out.println("brandName:"+brandName);
        System.out.println("ceoName:"+ceoName);
        System.out.println("noOfSeats:"+noOfSeats);
        System.out.println("founderName:"+founderName);
        System.out.println("countryName:"+countryName);
        System.out.println("brandColor:"+brandColor);
    }
}