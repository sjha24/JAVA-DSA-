// package overRiding;
class movies{
    public String name;
    public int ratting,moneyCollection,profit;
    public String leadActor,leadActress;
   movies(){};
    public movies(String name, int ratting, int moneyCollection, int profit, String leadActor, String leadActress) {
        this.name = name;
        this.ratting = ratting;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }
    void displayRatting(){
        System.out.println(this.ratting);
        System.out.println("This is the function of movies class.");
    }
}
class commercialMovies extends movies{

    public commercialMovies() {
    }

    public commercialMovies(String name, int ratting, int moneyCollection, int profit, String leadActor,
            String leadActress) {
        super(name, ratting, moneyCollection, profit, leadActor, leadActress);
    }
    void display(){
        System.out.println(this.moneyCollection);
        System.out.println(this.profit);
        System.out.println(this.leadActor);
    }
}
public class o_1_1 {
    public static void main(String[] args) {
        commercialMovies obj = new commercialMovies("London Dreams 2",10, 9000, 8850, "Rannvijay Singha, Rachel Gupta, Prince Narula", "Prajakta");
        obj.display();
        obj.displayRatting();
    }
}
