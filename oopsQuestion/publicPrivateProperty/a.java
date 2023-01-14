import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int likes = scn.nextInt();
       int impression = scn.nextInt();
       System.out.println(calculateRank(likes, impression));
    }
    public static int calculateRank(int likes , int impression){
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
        return -1;
    }
}
