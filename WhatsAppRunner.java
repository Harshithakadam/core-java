class WhatsAppRunner{

  public static void main(String[] args){
  
     System.out.println("-------First time method calling---------");
	 String status=WhatsApp.validateAndRegisterUser(1234567890l,"Harshitha@123","03-03-2004","Harshitha Kadam","Harshitha_Kadam");
     System.out.println(status);
  
  }

}