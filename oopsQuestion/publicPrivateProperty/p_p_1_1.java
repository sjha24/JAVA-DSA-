// package publicPrivateProperty;
class movies{
    public String name;
    public int ratting,moneyCollection,profit;
    public String leadActor,leadActress;
    private int views,likes;
   
    public movies(String name, int ratting, int moneyCollection, int profit, String leadActor, String leadActress,
            int views, int likes) {
        this.name = name;
        this.ratting = ratting;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        this.views = views;
        this.likes = likes;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    void display(){
        System.out.println(this.ratting);
        System.out.println(this.moneyCollection);
        System.out.println(this.profit);
        System.out.println(this.leadActor);
        System.out.println(this.leadActress);
    }
    void displayView(){
        System.out.println(this.views);
    }
    void displayLikes(){
        System.out.println(this.likes);
    }
}
public class p_p_1_1 {
    public static void main(String[] args) {
        movies superman1 = new movies("Superman 1", 8, 90000, 1000, "Rachel Gupta and Prince Narula", "Aarushi", 10000, 500);
        superman1.display();
        superman1.displayView();
        superman1.displayLikes();
    }
}
