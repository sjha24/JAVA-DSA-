import java.util.ArrayList;
import java.util.Scanner;

class YouTubeVideo{
    String song,artist;
    int views,likes,releasedYear,n;
    public YouTubeVideo(String song, String artist, int views, int likes, int releasedYear,int n) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.releasedYear = releasedYear;
        this.n = n;
        // this.comments = comments;
    }
    void display(){
        System.out.println(this.song);
        System.out.println(this.artist);
        System.out.println(this.views);
        System.out.println(this.likes);
        System.out.println(this.releasedYear);
        System.out.print(this.n);
    }
}
public class youTube {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String song = scn.nextLine();
        // String artist = scn.nextLine();
        // int views = scn.nextInt();
        // int likes = scn.nextInt();
        // int releasedYear = scn.nextInt();
        int n = scn.nextInt();
        // YouTubeVideo obj = new YouTubeVideo(song, artist, views, likes, releasedYear,n);
        // obj.display();
        ArrayList<String>arr = new ArrayList<>();
        for(int i = 0; i<n+1; i++){
            String comment = scn.nextLine();
            arr.add(comment);
        }
        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

    }
}
