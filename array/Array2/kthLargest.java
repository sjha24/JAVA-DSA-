import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class kthLargest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(kthLargestNum(arr, k));
    }
    public static int kthLargestNum(int arr[], int k){
        for(int i = 0; i<k; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-k];
    }
}
