import java.util.Scanner;
class movie{
    String Name;
    int Ratting;
    long MoneyCollection;
    int profit;
    String LeadActor;
    String LeadActress;

    public movie(String Name, int Ratting, long MoneyCollection, long profit, 
    String LeadActor, String LeadActress){
        this.Name = Name;
        this.Ratting = Ratting;
        this.MoneyCollection = MoneyCollection;
        this.profit = profit;
        this.LeadActor = LeadActor;
        this.LeadActress = LeadActress;
    }
    public void displayMovie(){
        System.out.println(this.Ratting);
        System.out.println(this.MoneyCollection);
        System.out.println(this.LeadActor);
        System.out.println(this.profit);
        System.out.println(this.LeadActor);
        System.out.println(this.LeadActress);
    }
}
public class classAndObj1 {
    public static void main(String[] args) {
        
        movie batman1 = new movie("Batman 1", 8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha");
        movie batman2 = new movie("Batman 2", 9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia");
        movie batman3 = new movie("Batman 3", 10, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha Dhupia");

        batman1.displayMovie();
        batman2.displayMovie();
        batman3.displayMovie();
    }
}
