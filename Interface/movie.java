interface Movie{
    //by default :- public ,static, final ,100% abstraction;
    String industry = "Bollywood";
    void viewShow();
    void bookShow();
}
class pvr implements Movie{
    public void viewShow(){
        System.out.println("You can view the todays show");
    }
    public void bookShow(){
        System.out.println("You can Book My Todays Show");
    }
}
public class movie{
    public static void main(String[] args) {
        pvr PVR = new pvr();
        PVR.viewShow();
        PVR.bookShow();
        System.out.println(Movie.industry);

    }
}