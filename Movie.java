class Movie{

public static void displayMovieName(String name){
    System.out.println("Movie Name: " + name);
}

static long collection = 250000000l;

public static void displayCollection(){
    System.out.println("Box Office Collection: " + collection);
}

public static String displayDirector(String director){
    System.out.println("Director:" + director);
    return director;
}

static double rating = 8.7;

public static double displayRating(){
    System.out.println("Movie Rating: " + rating);
    return rating;
}

}