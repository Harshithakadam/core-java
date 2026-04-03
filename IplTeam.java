class IplTeam{

  String teamName;
  String captainName;
  static int noOfPlayers=11;
  String coachName;
  String ownerName;
  String jerseyColor;
  
  public IplTeam(){
  
  }
  public IplTeam(String teamName,String captainName,String coachName,String ownerName,String jerseyColor){
    this.teamName=teamName;
	this.captainName=captainName;
	this.coachName=coachName;
	this.ownerName=ownerName;
	this.jerseyColor=jerseyColor;
  }
  public void display(){
  
   System.out.println("teamName:"+teamName);
   System.out.println("captainName:"+captainName);
   System.out.println("noOfPlayers:"+noOfPlayers);
   System.out.println("coachName:"+coachName);
   System.out.println("ownerName:"+ownerName);
   System.out.println("jerseyColor:"+jerseyColor);
  }
}