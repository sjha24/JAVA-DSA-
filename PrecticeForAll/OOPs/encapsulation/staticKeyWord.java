class movie{
    String name;
    String gener;
    double ratting;
    int duration;
    static String language = "Hindi";
    static int numberOFmovie;

    movie(String name){
        this.name = name;
        // this.numberOFmovie++;
        movie.numberOFmovie++;
    }
}
public class staticKeyWord {
    public static void main(String[] args) {
       movie m1 = new movie("Avenger");
       movie m2 = new movie("Avenger age of altron");
       movie m3 = new movie("Avenger infinity war");
       movie m4 = new movie("Avenger end game");
       movie m5 = new movie("Avenger king dynasty");
       movie m6 = new movie("Avenger secreate war");

       m1.language = "English";
       
    //    System.out.println(m1.numberOFmovie);//not better
       System.out.println(movie.numberOFmovie);//better :-> accessing static properties using class name(its a class properties) even if no object is there.
    //    System.out.println(m6.numberOFmovie);
       System.out.println(movie.numberOFmovie);
    //    System.out.println(m6.language);
       System.out.println(movie.language);
    }
}
