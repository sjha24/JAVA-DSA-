// package wraperClass;
class movie{
    private String name;
    String gener;
    // double rating;
    // double duration;
    private static String Language = "Hindi";
    private static int numberOfMovies = 0;
    public movie(String name){
        this.numberOfMovies++;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getgener(){
        return this.gener;
    }
    public void setgener(String gener){
        this.gener = gener;
    }
    public static String getLanguage(){
        return movie.Language;
    }
    public static void setLanguage(String Language){
        movie.Language = Language;
    }
    public static int getNumberOfMovies(){
        return movie.numberOfMovies;
    }
    public static void setNumberOfMovies(int numberOfMovie){
        movie.numberOfMovies = numberOfMovie;
    }
    public void nonStaticFun(){
        // after object creation;
        //non static member accessible;
        System.out.println(this.name);
        System.out.println(this.gener);
        System.out.println(this.getName());
        System.out.println(this.getgener());
        // static member also accessible;
        System.out.println(movie.Language);
        System.out.println(movie.numberOfMovies);
        System.out.println(movie.getLanguage());
        System.out.println(movie.getNumberOfMovies());
    }
    public static void staticFun(){
        //before object creation;
        // no this keyword inside static;
        // System.out.println(this.name);
        //static member accessible;
        System.out.println(movie.Language);
        System.out.println(movie.numberOfMovies);
        System.out.println(movie.getLanguage());
        System.out.println(movie.getNumberOfMovies());
    }
}
public class main {
    public static void main(String[] args) {
        // movie m1 = new movie("Avenger");
        // System.out.println(movie.numberOfMovies);
        // movie m2 = new movie("Avenger age of Ultron");
        // System.out.println(movie.numberOfMovies);
        // movie m3 = new movie("Avenger Infinity War");
        // System.out.println(movie.numberOfMovies);
        // movie m4 = new movie("Avenger End Game");
        // System.out.println(movie.numberOfMovies);
        // movie m5 = new movie("Avenger King Dynisty");
        // System.out.println(movie.numberOfMovies);
        // movie m6 = new movie("Avenger Seceret War");
        // System.out.println(movie.numberOfMovies);

        // // System.out.println(m1.numberOfMovies);
        // // System.out.println(m2.numberOfMovies);
        // System.out.println(movie.numberOfMovies);
        // m1.Language = "English";
        // System.out.println(m2.Language);

        //access static properties using class name
        //even is no object is there.
        // System.out.println(movie.numberOfMovies);
        // System.out.println(movie.Language);
        movie.staticFun();
        movie.setLanguage("Hindi");
        // System.out.println(movie.getLanguage());
        // System.out.println(movie.getNumberOfMovies());
        movie av = new movie("avenger");
        av.setName("Young Avenger");
        // System.out.println(av.getName());
        // av.setLanguage("English");
        // System.out.println(av.getLanguage());
        av.nonStaticFun();
    }
}
