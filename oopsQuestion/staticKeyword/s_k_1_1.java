class movies{
    String name;
    int ratting,moneyCollection,profit;
    String leadActor,leadActress;
    public movies(int ratting, int moneyCollection, int profit, String leadActor, String leadActress) {
        this.ratting = ratting;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }
    public static String videoType = "movies";
}
public class s_k_1_1{
    public static void main(String[] args) {
        movies superMan1 = new movies(1, 8900000, 8000, "Rachel Gupta", "Vaani");
        System.out.println(superMan1.videoType);
        System.out.println(movies.videoType);
    }
}