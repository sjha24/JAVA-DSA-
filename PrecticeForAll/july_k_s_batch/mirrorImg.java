import java.util.Scanner;

public class mirrorImg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int arr2[] = new int[n];
        for(int i = 0; i<m; i++){
            arr2[i] = scn.nextInt();
        }
        getNetZero(arr1, arr2);
    }
    public static void getNetZero(int arr1[] ,int arr2[]){
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i]+arr2[j]==0){
                    System.out.println(arr1[i]+" ");
                }
            }
        }
    }
}
