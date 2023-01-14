import java.util.ArrayList;
import java.util.Scanner;

// package constructor;
class youTubeVideos{
    String song,artist;
    int views,likes,releasedYear;
    int n;
    public youTubeVideos(String song, String artist, int views, int likes, int releasedYear, int n) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.releasedYear = releasedYear;
        this.n = n;
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
public class youTubeVideo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String song = scn.nextLine();
        String artist = scn.nextLine();
        int views = scn.nextInt();
        int likes = scn.nextInt();
        int releasedYear = scn.nextInt();
        int n = scn.nextInt();
        ArrayList<String>arr = new ArrayList<>();
        for(int i =0 ;i<n+1; i++){
            String comment = scn.nextLine();
            arr.add(comment);
        }
        youTubeVideos obj = new youTubeVideos(song,artist,views,likes,releasedYear, n);
        obj.display();
        for(int i = 0;i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
