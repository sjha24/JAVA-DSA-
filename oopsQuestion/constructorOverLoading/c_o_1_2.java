// package constructorOverLoading;
class movies{
    String name;
    int rating;
    long moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    
    public movies(int rating, long moneyCollection, int profit, String leadActor, String leadActress) {
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        System.out.println("Lead actor has the main role.");
    }
    public movies(String leadActress,String leadActor, int rating, long moneyCollection, int profit) {
        this.leadActress = leadActress;
        this.leadActor = leadActor;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        System.out.println("Lead actress has the main role.");
    }
}
public class c_o_1_2 {
    public static void main(String[] args) {
        movies Superman1 = new movies(8, 900000, 8000, "Rachel Gupta", "Disha");
        movies Superman2 = new movies("Vanni Gupta", "Prince Narula", 9, 1900000, 28000);
    }
}
