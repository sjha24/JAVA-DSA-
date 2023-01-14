// package constructorOverLoading;
class movies{
    String name;
    int rating;
    long moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    
    public movies(int rating, long moneyCollection) {
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        System.out.println("Stored rating and money.");
    }
    
    public movies(int rating, long moneyCollection, int profit) {
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        System.out.println("Stored rating, money, profit are given.");
    }
    
    public movies(int rating, long moneyCollection, int profit, String leadActor) {
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        System.out.println("Stored rating, money, profit, lead actors are given.");
    }
}
public class c_o_1_1 {
    public static void main(String[] args) {
        movies superman1 = new movies(8, 900000);
        movies superman2 = new movies(8, 900000,8000);
        movies superman3 = new movies(8, 900000,8000,"Ranveer Singh");
    }
}
