class movie1{
    private String name;
    private String gener;
    private double ratting;
    private int duration;
    private static String language = "Hindi";
    private static int numberOFmovie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public double getRatting() {
        return ratting;
    }

    public void setRatting(double ratting) {
        this.ratting = ratting;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        movie.language = language;
    }

    public static int getNumberOFmovie() {
        return numberOFmovie;
    }

    public static void setNumberOFmovie(int numberOFmovie) {
        movie.numberOFmovie = numberOFmovie;
    }
    public void nonStaticFun(){
        //non static member accessible
        System.out.println(this.name);
        System.out.println(this.duration);
        System.out.println(this.gener);
        System.out.println(this.ratting);
        
        //static member also accessible
        System.out.println(this.numberOFmovie);
        System.out.println(this.language);
        System.out.println(this.getNumberOFmovie());
        System.out.println(this.getLanguage());
        System.out.println(movie1.getLanguage());
        System.out.println(movie1.getNumberOFmovie());
    }
    public static void staticFun(){
        
        // System.out.println(this.name);//not static member not accessible in static function
        System.out.println(movie1.language);
        System.out.println(movie1.numberOFmovie);
        System.out.println(movie1.getLanguage());
        System.out.println(movie1.getNumberOFmovie());
    }
}
public class staticKey2 {
    public static void main(String[] args) {
       movie1.setLanguage("English");
       System.out.println(movie1.getLanguage());
       movie1.setNumberOFmovie(2);
       System.out.println(movie1.getNumberOFmovie());

       movie1 m = new movie1();
       m.setName("Avenger");
       System.out.println(m.getName());
    }
}
