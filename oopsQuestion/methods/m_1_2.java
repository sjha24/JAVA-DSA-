// package function;
class movie{
    String name;
    int rating;
    long moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    public movie(String name, int rating, long moneyCollection, int profit, String leadActor, String leadActress) {
        this.name = name;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }
    boolean checkHit(int rating){
        if(rating>5)return true;//System.out.println("true");
        else return false;//System.out.println("false");
    }
}
public class m_1_2{
    public static void main(String[] args) {
        movie batman1 = new movie("Batman 1", 8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha");
        movie batman2 = new movie("Batman 2", 9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia");
        movie batman3 = new movie("Batman 3", 10, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha dhupia");
        System.out.println(batman1.checkHit(8));
        System.out.println(batman2.checkHit(9));
        System.out.println(batman3.checkHit(4));
    }
}
