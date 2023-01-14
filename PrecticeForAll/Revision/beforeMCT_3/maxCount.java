import java.util.Scanner;

public class maxCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        PrintMaxCountOccurence(arr);
    }
    public static void PrintMaxCountOccurence(int arr[]){
        int val = 0, mostOccurence = 0;
        for(int i = 0; i<arr.length; i++){
            int CurrentcountOccurence = countOccurence(arr, arr[i]);
            if(CurrentcountOccurence>mostOccurence){
                val = arr[i];
                mostOccurence = CurrentcountOccurence;
            }
        }
        System.out.println(val);
    }
    public static int countOccurence(int arr[],int target){
        int count = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
