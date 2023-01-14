// package sumPair;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        pair(arr, target);
    }
    public static void pair(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(arr[j]==arr[j+1])continue;
                else if((arr[i]+arr[j])==target)
                System.out.print(arr[i]+" "+arr[j]);
            }
            System.out.println();