import java.util.Scanner;

class influncer{
    String name;
    int total_post,totalReels;
    boolean blueTick;
    int followers,following;
    String category;
    char gender;
    public influncer(String name, int total_post, int totalReels, boolean blueTick, int followers, int following,
            String category, char gender) {
        this.name = name;
        this.total_post = total_post;
        this.totalReels = totalReels;
        this.blueTick = blueTick;
        this.followers = followers;
        this.following = following;
        this.category = category;
        this.gender = gender;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.total_post);
        System.out.println(this.totalReels);
        System.out.println(this.blueTick);
        System.out.println(this.followers);
        System.out.println(this.following);
        System.out.println(this.category);
        System.out.println(this.gender);
    }
}
public class A_O_2_1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        influncer[]arr = new influncer[n];
        for(int i = 0; i<n; i++){
            String name = scn.nextLine();
            int total_post = scn.nextInt();
            int totalReels = scn.nextInt();
            boolean blueTick = scn.nextBoolean();
            int followers = scn.nextInt(); 
            int following = scn.nextInt();
            scn.nextLine();
            String category = scn.nextLine();
            char gender = scn.next().charAt(0);

            influncer obj = new influncer(name, total_post, totalReels, blueTick, followers, following, category, gender);
            arr[i] = oboj;
        }
        for(influncer ob :arr){
            ob.display();
        }

    }
}