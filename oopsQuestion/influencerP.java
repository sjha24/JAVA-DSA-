import java.util.Scanner;

class influencer{
    String name;
    int posts,reels,followers,following;
    boolean blueTic;
    String category;
    char gender;
    public influencer(String name, int posts, int reels, int followers, int following ,boolean blueTic, String category, char gender) {
        this.name = name;
        this.posts = posts;
        this.reels = reels;
        this.followers = followers;
        this.following = following;
        this.blueTic = blueTic;
        this.category = category;
        this.gender = gender;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.posts);
        System.out.println(this.reels);
        System.out.println(this.blueTic);
        System.out.println(this.followers);
        System.out.println(this.following);
        System.out.println(this.category);
        System.out.println(this.gender);
    }   
}
public class influencerP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int total_post = scn.nextInt();
        int total_reels = scn.nextInt();
        boolean blueTic = scn.nextBoolean();
        int followers = scn.nextInt();
        int following = scn.nextInt();
        String category = scn.next();
        char gender = scn.next().charAt(0);
        influencer obj = new influencer(name, total_post, total_reels, followers,following ,blueTic, category, gender);
        obj.display();
    }
}
