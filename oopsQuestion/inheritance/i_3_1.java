import java.util.ArrayList;
import java.util.Scanner;

// package inheritance;
class youTubeVideo{
    String song,artist;
    int views,likes,releasedYear;
    int n;
    public youTubeVideo(){};
    public youTubeVideo(String song, String artist, int views, int likes, int releasedYear, int n) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.releasedYear = releasedYear;
        this.n = n;
    }
    
}
class shortVideo extends youTubeVideo{
    int time,impression;

    public shortVideo(int time, int impression) {
        this.time = time;
        this.impression = impression;
    }

    public shortVideo(String song, String artist, int views, int likes, int releasedYear, int n) {
        super(song, artist, views, likes, releasedYear, n);
        // this.time = time;
        // this.impression = impression;
    }
    void display(){
        System.out.println(this.song);
        System.out.println(this.artist);
        System.out.println(this.views);
        System.out.println(this.likes);
        System.out.println(this.releasedYear);
        System.out.print(this.n);
    }
    void display1(){
        System.out.println(this.time);
        System.out.println(this.impression);
    }
}
public class i_3_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String song = scn.nextLine();
        String artist = scn.nextLine();
        scn.next();
        int views = scn.nextInt();
        int likes = scn.nextInt();
        int releasedYear = scn.nextInt();
        int n = scn.nextInt();
        ArrayList<String>arr = new ArrayList<>();
        for(int i =0 ; i<n; i++){
            String comment = scn.nextLine();
            arr.add(comment);
        }
        int time = scn.nextInt();
        int impression = scn.nextInt();
        shortVideo obj = new shortVideo(song, artist, views, likes, releasedYear, n);
        obj.display();
        for(int i = 0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        shortVideo obj2 = new shortVideo(time, impression);
        obj2.display1();
    }
}
