import java.util.Scanner;

public class recersePair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = n-1; i>=0; i--){
            for(int j = n-1; j>=0;j--){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
