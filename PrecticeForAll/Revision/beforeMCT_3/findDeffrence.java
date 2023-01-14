import java.util.Scanner;

public class findDeffrence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        findDeffrence2(arr, target);
    }
    public static void findDeffrence2(int arr[],int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if((arr[j]-arr[i]==target))
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
