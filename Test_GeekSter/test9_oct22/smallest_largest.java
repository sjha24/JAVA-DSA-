import java.util.Scanner;

public class smallest_largest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int s1 = HalfSum(arr); 
        int s2 = SecHalfSum(arr);
        if(s1<s2){
            System.out.print(s1);
        }else{
            System.out.print(s2);
        }
    }
    public static int HalfSum(int arr[]){
        int sum1 = 0;
        int N = arr.length;
        for(int i = 0; i<N/2; i++){
            sum1 = sum1+arr[i];
        }
        return sum1;
    }
    public static int SecHalfSum(int arr[]){
        int sum2 = 0;
        int n = arr.length;
        for(int i = n/2; i<arr.length; i++){
            sum2 = sum2+arr[i];
        }
        return sum2;
    }
}
