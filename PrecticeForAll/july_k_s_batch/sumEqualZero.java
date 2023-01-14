import java.util.Scanner;

public class sumEqualZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(isSumEqualZero(arr));
    }
    public static boolean isSumEqualZero(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length;j++){
                if(arr[i]+arr[j] == 0)return true;
            }
        }
        return false;
    }
}
