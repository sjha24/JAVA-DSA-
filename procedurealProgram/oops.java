import java.util.Scanner;

public class oops{
    public static void main(String[] args) {
        // System.out.println("I am asspirant of IAS officer");
        Scanner scn = new Scanner(System.in);
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long n = scn.nextLong();
        long a[] = new long[n];
        for(long i = 0; i<n; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        for(long i = 0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(min+""+max);
    }
}