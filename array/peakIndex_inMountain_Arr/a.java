import java.util.Scanner;

// package peakIndex_inMountain_Arr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i,arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(peakIndex_inMountain(arr));
        

    }
    public static int peakIndex_inMountain(int arr[]){
        int peak = 0;
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peak = i;
            }
        }
        return peak;
    }
}
//https://drive.google.com/drive/folders/1UfscSvllHyXPlIGK4WxyoMDF-z_jUJD4