import java.util.Arrays;
import java.util.Scanner;

class influence{
    String name;
    int totalPosts,toataReels;
    boolean blueTic;
    int follower,following;
    String category;
    char gender;
    public influence(String name, int totalPosts, int toataReels, boolean blueTic, int follower, int following,
            String category, char gender) {
        this.name = name;
        this.totalPosts = totalPosts;
        this.toataReels = toataReels;
        this.blueTic = blueTic;
        this.follower = follower;
        this.following = following;
        this.category = category;
        this.gender = gender;
    }
    static String influenceType = "Best Influencer"; 
    void display(){
        System.out.println(this.name);
        System.out.println(this.totalPosts);
        System.out.println(this.toataReels);
        System.out.println(this.blueTic);
        System.out.println(this.follower);
        System.out.println(this.following);
        System.out.println(this.category);
        System.out.println(this.gender);
        System.out.println(influenceType);
    }
}
public class s_k_2_1 {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String name = scn.nextLine();
        int totalPosts = scn.nextInt();
        int toataReels = scn.nextInt();
        boolean blueTic = scn.nextBoolean();
        int follower = scn.nextInt();
        int following = scn.nextInt();
        String category = scn.next();
        char gender = scn.next().charAt(0);
        influence obj = new influence(name, totalPosts, toataReels, blueTic, follower, following, category, gender);
        obj.display();
    }
}
