// package function;
class movie{
    String name;
    int rating;
    long moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    // public movie(){};
    public movie(String name, int rating, long moneyCollection, int profit, String leadActor, String leadActress) {
        this.name = name;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.rating);
        System.out.println(this.moneyCollection);
        System.out.println(this.profit);
        System.out.println(this.leadActor);
        System.out.println(this.leadActress);
    }
    
}
public class f1_3 {
    public static void main(String[] args) {
        movie batman1 = new movie("Batman 1", 8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha");
        batman1.display();
        movie batman2 = new movie("Batman 2", 9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia");
        batman2.display();
        movie batman3 = new movie("Batman 3", 10, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha dhupia");
        batman3.display();
    }
}
