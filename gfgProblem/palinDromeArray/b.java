import java.util.Scanner;

// package palinDromeArray;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        if(isPalindrome(arr)==false){
            System.out.println("Not Palindrome Num");
        }else{
            System.out.println("Palindrome Num");
        }
    }
    public static boolean isPalindrome(int arr[]){
        for(int num : arr){
            String val = String.valueOf(num);
            int i = 0;
            int j = val.length()-1;
            while(i<=j){
                if(val.charAt(i) != val.charAt(j))
                return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
