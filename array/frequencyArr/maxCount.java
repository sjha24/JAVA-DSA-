import java.util.Scanner;

// package frequencyArr;

public class maxCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxFrq(arr));
    }

    public static int getFreq(int arr[], int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target)count++;
        }
        return count;
    }
    public static int maxFrq(int arr[]){
        int value = 0, maxFrequency = 0;
        for(int i = 0; i<arr.length; i++){
            int currentFrq = getFreq(arr, arr[i]);
            if(currentFrq>maxFrequency){
                value = arr[i];
                maxFrequency = currentFrq;
            }
        }
        return value;
    }
}
