class FootballTeamRunner{
    public static void main(String[] args){
        FootballTeam realmadrid=new FootballTeam("Real Madrid","Bellingham","Carlo Ancelotti","Florentino Perez","white");
        realmadrid.display();
        System.out.println("------------------------------");
        FootballTeam barca=new FootballTeam("Barcelona","Pedri","Hansi Flick","Joan Laporta","blue,red");
        barca.display();
        System.out.println("------------------------------");
        FootballTeam manu=new FootballTeam("Man United","Bruno Fernandes","Erik Ten Hag","INEOS Group","red,black");
        manu.display();
        System.out.println("------------------------------");
        FootballTeam chelsea=new FootballTeam("Chelsea","Reece James","Enzo Maresca","Todd Boehly","blue");
        chelsea.display();
        System.out.println("------------------------------");
        FootballTeam city=new FootballTeam("Man City","Kevin De Bruyne","Pep Guardiola","Sheikh Mansour","sky blue");
        city.display();
        System.out.println("------------------------------");
        FootballTeam liverpool=new FootballTeam("Liverpool","Virgil Van Dijk","Arne Slot","FSG Group","red");
        liverpool.display();
        System.out.println("------------------------------");
        FootballTeam psg=new FootballTeam("PSG","Kylian Mbappe","Luis Enrique","QSI Group","blue,red");
        psg.display();
        System.out.println("------------------------------");
        FootballTeam juventus=new FootballTeam("Juventus","Dusan Vlahovic","Thiago Motta","Exor Group","black,white");
        juventus.display();
        System.out.println("------------------------------");
        FootballTeam acmilan=new FootballTeam("AC Milan","Theo Hernandez","Paulo Fonseca","RedBird Capital","red,black");
        acmilan.display();
        System.out.println("------------------------------");
        FootballTeam arsenal=new FootballTeam("Arsenal","Martin Odegaard","Mikel Arteta","Stan Kroenke","red,white");
        arsenal.display();
    }
}