import java.util.Scanner;

public class addOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int carry = 1;
        for(int i = arr.length-1; i>=0; i--){
            int ans = arr[i]+carry;
            arr[i] = ans%10;
            carry = ans/10;
        }
        if(carry != 0){
            System.out.print(carry+" ");
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}