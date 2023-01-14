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
    public void printTempRank(){
        System.out.println("Method of youtubeVideo class.");
    }
}
class shortVideo extends youTubeVideo{
    
    public shortVideo() {
    }

    public shortVideo(String song, String artist, int views, int releasedYear, int n) {
        super(song, artist, views, releasedYear, n);
    }

    public void printTempRank(int views,int likes){
        System.out.println("Method of shortVideo class.");
        int val = (views+likes)/100;
        System.out.println(val);
    }
}
public class o_3_2{
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
        shortVideo obj = new shortVideo(song, artist, views, releasedYear, n);
        obj.printTempRank(views, likes);
    }
}