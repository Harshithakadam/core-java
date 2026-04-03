class SmartPhone{
    String brandName;
    String modelName;
    static int noOfCameras=3;
    String processorName;
    String ownerCompany;
    String color;

    public SmartPhone(){
	}

    public SmartPhone(String brandName,String modelName,String processorName,String ownerCompany,String color){
        this.brandName=brandName;
        this.modelName=modelName;
        this.processorName=processorName;
        this.ownerCompany=ownerCompany;
        this.color=color;
    }

    public void display(){
        System.out.println("brandName:"+brandName);
        System.out.println("modelName:"+modelName);
        System.out.println("noOfCameras:"+noOfCameras);
        System.out.println("processorName:"+processorName);
        System.out.println("ownerCompany:"+ownerCompany);
        System.out.println("color:"+color);
    }
}