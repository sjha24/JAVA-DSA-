import java.util.Scanner;

public class print_d_c {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scn.nextInt();
        int count = 0;
        int n = 0;
        // int ans1 = n;
        pritNum(count, n , num);
        // int ans = count;
        // System.out.println(ans);
        // System.out.println(ans1);
    }
    public static void pritNum(int count, int n,int num){
        for(int i = num;i>0;i/=10){
            n = i%10;
            int ans = n;
            count++;
            System.out.println(ans);
        }
        System.out.print("count--> "+ count);
    }
}
