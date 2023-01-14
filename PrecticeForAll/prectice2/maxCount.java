import java.util.Scanner;

public class maxCount {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(printMaxCountValue(arr));            
    }
    public static int CountOccurence(int[] arr , int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static int printMaxCountValue(int[]arr){
        int value = 0; int mostFrequentValue = 0;
        for(int i = 0; i<arr.length; i++){
            int currentFrequency = CountOccurence(arr, arr[i]);
            if(currentFrequency>mostFrequentValue){
                value = arr[i];
                mostFrequentValue = currentFrequency;
            }
        }
        return value;
    }
}
