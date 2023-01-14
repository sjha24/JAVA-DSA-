import java.util.Scanner;

class influencer{
   String name;
   int total_posts,total_Reels;
   boolean blueTic;
   int followers,following;
   String category;
   char gender;
public influencer(String name, int total_posts, int total_Reels, boolean blueTic, int followers , int following,
        String category, char gender) {
    this.name = name;
    this.total_posts = total_posts;
    this.total_Reels = total_Reels;
    this.blueTic = blueTic;
    this.followers = followers;
    this.following = following;
    this.category = category;
    this.gender = gender;
    }
    void checkVeriFied(boolean blueTic){
        if(blueTic == true)System.out.println( "Already Verified");
        else System.out.println("Needs Verification");
    }
}
    
public class m_2_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int total_post = scn.nextInt();
        int total_Reels = scn.nextInt();
        boolean blueTic = scn.nextBoolean();
        int followers = scn.nextInt();
        int following = scn.nextInt();
        String category = scn.next();
        char gender = scn.next().charAt(0);
        influencer obj = new influencer(name, total_post, total_Reels, blueTic, followers, following, category, gender);
        obj.checkVeriFied(blueTic);
    }   
}
