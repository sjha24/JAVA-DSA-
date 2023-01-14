import java.util.Scanner;

public class sumArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = CalculateSum(arr);
        System.out.println(ans);
    }
    public static int CalculateSum(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
