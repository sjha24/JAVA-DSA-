import java.util.Scanner;

public class findRepeatingMissing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 1;i<=arr.length; i++){
            if(Missing(arr, i)==true)System.out.println(i+" <--Missing");
        }
        for(int i = 0;i<arr.length; i++){
            if(repeating(arr, i)==true)System.out.println(i+" <--repeating");
        }
       
    }
    public static boolean repeating(int arr[], int target){
        int countOccurence = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target)countOccurence++;
        }
        if(countOccurence>1)return true;
        else return false;
    }
    public static boolean Missing(int arr[], int target){
        int countOccurence = 0;
        for(int i = 0;i<arr.length; i++){
            if(arr[i]==target)countOccurence++;
        }
        if(countOccurence<1)return true;
        else return false;
    }
}
