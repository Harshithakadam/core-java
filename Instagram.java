class Instagram{

  public void login(String faceBook){
    System.out.println("Login using FaceBook:"+faceBook);
  }
  public void login(String userName,String psw){
    System.out.println("Login using userName:" +userName+" psw:"+psw);
  }
  public void login(String email,int psw){
    System.out.println("Login using email:"+email+" psw:"+psw);
  }
  public void login(long phoneNumber,String psw){
    System.out.println("Login using phoneNumber:"+phoneNumber+" psw:"+psw);
  }

}