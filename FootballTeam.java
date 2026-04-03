class FootballTeam{
    String clubName;
    String captainName;
    static int noOfPlayers=11;
    String coachName;
    String ownerName;
    String jerseyColor;

    public FootballTeam(){
	}

    public FootballTeam(String clubName,String captainName,String coachName,String ownerName,String jerseyColor){
        this.clubName=clubName;
        this.captainName=captainName;
        this.coachName=coachName;
        this.ownerName=ownerName;
        this.jerseyColor=jerseyColor;
    }

    public void display(){
        System.out.println("clubName:"+clubName);
        System.out.println("captainName:"+captainName);
        System.out.println("noOfPlayers:"+noOfPlayers);
        System.out.println("coachName:"+coachName);
        System.out.println("ownerName:"+ownerName);
        System.out.println("jerseyColor:"+jerseyColor);
    }
}