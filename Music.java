class Music{
  String singerName;
  String songName;

  public Music(){}
  public Music(String singerName,String songName){
	this.singerName=singerName;
    this.songName=songName;
  }
  public void display(){
   System.out.println("singerName:"+singerName);
   System.out.println("songName:"+songName);
  }
}