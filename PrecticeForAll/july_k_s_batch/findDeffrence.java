import java.util.Scanner;

public class findDeffrence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int dif = scn.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(Math.abs(arr[i]-arr[j])==dif){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
