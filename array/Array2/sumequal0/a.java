import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();            
        }
        System.out.print(isSum0(arr));
    }
    public static boolean isSum0(int arr[]){
        int sum = 0;
        for(int start = 0; start<arr.length; start++){
            for(int end = start ; end<arr.length; end++){
                sum = sum+arr[end];
                if(sum == 0)return true;
            }
        }
        return false;
    }
}