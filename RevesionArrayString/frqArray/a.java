import java.util.Scanner;

// package frqArray;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int frq[] = new int[size+1];
        for(int i = 0; i<arr.length; i++){
            frq[arr[i]]++;
        }
        int repeating = 0, Missing = 0;
        for(int i = 0; i<arr.length; i++){
            if(frq[i]>1) repeating = i;
            else if(frq[i]<1)Missing = i;
        }
        System.out.println(repeating);
        System.out.println(Missing);
    }
}
