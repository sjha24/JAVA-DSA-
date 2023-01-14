import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(squareRoot(n));
    }
    public static int squareRoot(int n){
        int left = 0, right = n;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid * mid == n)return mid;
            else if(mid*mid<n){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right;
    }
}