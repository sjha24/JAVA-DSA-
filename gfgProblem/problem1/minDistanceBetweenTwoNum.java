import java.util.Scanner;

public class minDistanceBetweenTwoNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(minDist(arr, n, x, y));
    }
    public static int minDist(int arr[], int n, int x, int y){
        int minDistanceX = 0;
        int minDistanceY = 0;
        boolean flag = false;
        for(int i = 0;i<n; i++){
            if(arr[i]==x){
                flag = true;
                minDistanceX = i;
                break;
            }
            if(flag != true){
                return -1;
            }
        }
        flag = false;
        for(int i = 0; i<n; i++){
            if(arr[i]==y){
                flag = true;
                minDistanceY = i;
                break;
            }
            if(flag != true)return -1;
        }
        // for(int i = 0; i<arr.length; i++){
            // if((arr[i] == x && arr[i]==y)==false)return -1;
        // }
        return minDistanceY;
    }
}