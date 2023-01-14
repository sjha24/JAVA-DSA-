class profile{
    String name;
    int totalPost, totalReels,followers,following;
    String blueTic;
    char gender;
    public profile(String name, int totalPost, int totalReels, int followers, int following, String blueTic,
            char gender) {
        this.name = name;
        this.totalPost = totalPost;
        this.totalReels = totalReels;
        this.followers = followers;
        this.following = following;
        this.blueTic = blueTic;
        this.gender = gender;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.totalPost);
        System.out.println(this.totalReels);
        System.out.println(this.followers);
        this.following = following;
        this.blueTic = blueTic;
        this.gender = gender;
    }
}
public class instagram{
    public static void main(String[] args) {
        
    }
}