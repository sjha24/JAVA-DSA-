import java.util.ArrayList;
import java.util.Scanner;

class youTubeVideo{
    String song,artist;
    int views,likes,releasedYear;
    int n;
    public youTubeVideo(){};
    public youTubeVideo(String song, String artist, int views, int releasedYear, int n) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.releasedYear = releasedYear;
        this.n = n;
    }
    private int impression;
    public int getImpression() {
        return impression;
    }
    public void setImpression(int impression) {
        this.impression = impression;
    }
    
    public youTubeVideo(int likes,int impression) {
        this.likes = likes;
        this.impression = impression;
    }
    void displayImp(){
        System.out.println(this.impression);
    }
    private int calculateRank(int likes , int impression){
        int sum = likes+impression;
        if(sum>10000){
            return 1;
        }else if(sum>5000 && sum<10000){
            return 2;
        }else if(sum>1000 && sum<5000){
            return 3;
        }else if(likes==0){
            return 4;
        }
        return 0;
    }
    public void printRank(){
        System.out.println(calculateRank(likes, impression));
    }
}
public class p_p_3_1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String song = scn.nextLine();
        String artist = scn.nextLine();
        int views = scn.nextInt();
        int likes = scn.nextInt();
        int releasedYear = scn.nextInt();
        int n = scn.nextInt();
        // scn.nextLine();
        ArrayList<String>arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            String comment = scn.nextLine();
            arr.add(comment);
        }
        scn.nextLine();
        int impression = scn.nextInt();
        youTubeVideo obj = new youTubeVideo(song, artist, views,releasedYear, n);
        youTubeVideo imp = new youTubeVideo(likes,impression);
        imp.displayImp();
        imp.printRank();
    }
}