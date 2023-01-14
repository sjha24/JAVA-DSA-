import java.util.ArrayList;
import java.util.Scanner;
class YouTubeVideos{
    String song,artist;
    int views,likes,releasedYear,n;
    
    public YouTubeVideos(String song, String artist, int views, int likes) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        System.out.println("The song has just released");
    }
    public YouTubeVideos(String song, String artist, int views, int likes, int releasedYear) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.releasedYear = releasedYear;
        System.out.println("The song was released in" + releasedYear);
    }
}
public class c_o_3_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String song = scn.nextLine();
        String artist = scn.nextLine();
        int views = scn.nextInt();
        int likes = scn.nextInt();
        int releasedYear = scn.nextInt();
        int n = scn.nextInt();
        ArrayList<String>arr = new ArrayList<>();
        for(int i = 0; i<n+1; i++){
            String comment = scn.nextLine();
            arr.add(comment);
        }
        int k = scn.nextInt();
        if(k==1){
            YouTubeVideos obj1 = new YouTubeVideos(song, artist, views, likes);
        }else{
            YouTubeVideos obj2 = new YouTubeVideos(song, artist, views, likes, releasedYear);
        }
    }
}
