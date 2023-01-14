import java.util.Scanner;

public class lastOccurence{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int input = scn.nextInt();
        System.out.println(idxKey(arr, input));
    }
    public static int idxKey(int arr[], int input){
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]==input){
                return i;
            }
        }
        
        return -1;
    }
}