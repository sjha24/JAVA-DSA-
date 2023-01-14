import java.util.Scanner;

public class highestFreqEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxFreq(arr));
    }
    public static int getFreq(int arr[], int target){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==target)count++;
        }
        return count;
    }
    public static int maxFreq(int arr[]){
        int value = 0, maxFreq = 0;
        for(int i = 0;i<arr.length; i++){
            int currentFreq = getFreq(arr, arr[i]);
            if(currentFreq>maxFreq){
                value = arr[i];
                maxFreq = currentFreq;
            }
        }
        return value;
    }
}
