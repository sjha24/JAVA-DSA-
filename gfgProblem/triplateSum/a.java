import java.util.Scanner;

// package triplateSum;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        if(triplateSum(arr)==true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static boolean triplateSum(int arr[]){
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            int left = i + 1, right = arr.length-1;
            while(left<right){
                if(arr[i]+arr[left]+arr[right]==0){
                    right--;
                    return true;
                }else{
                    left++;
                }
            }
        }
        return false;
    }
}
