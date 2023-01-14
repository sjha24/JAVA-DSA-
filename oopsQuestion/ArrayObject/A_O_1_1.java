import java.io.*;
import java.util.*;

class movies{
    public String name , lead_actor , lead_actress;
    public int rating , money_collection , profit;
    
    movies(String name , int rating , int money_collection , int profit , String lead_actor , String lead_actress){
        this.name = name;
        this.rating = rating;
        this.money_collection = money_collection;
        this.profit = profit;
        this.lead_actor = lead_actor;
        this.lead_actress = lead_actress;
    }
    
    void display(){
        System.out.println(this.name);
        System.out.println(this.rating);
        System.out.println(this.money_collection);
        System.out.println(this.profit);
        System.out.println(this.lead_actor);
        System.out.println(this.lead_actress);
    }
}

public class A_O_1_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        movies[]arr = new movies[n];
        
        for(int idx = 0 ; idx < n ; idx++){
            String name = scn.nextLine();
            int rating = scn.nextInt();
            int money_collection = scn.nextInt();
            int profit = scn.nextInt();
            scn.nextLine();
            String lead_actor = scn.nextLine();
            String lead_actress = scn.nextLine();
            
            movies obj = new movies(name,rating,money_collection,profit,lead_actor,lead_actress);
            arr[idx] = obj;
        }
        
        for(movies objt : arr){
             objt.display();
        }
    }
}