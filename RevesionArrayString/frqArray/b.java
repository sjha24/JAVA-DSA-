import java.util.Scanner;

// package frqArray;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int frq[] =  new int[n+1];
        for(int i =0; i<arr.length; i++){
            frq[arr[i]]++;
        }
        int Missing = 0, repeating = 0;
        for(int i = 0; i<arr.length; i++){
            if(frq[i]<1) Missing = i;
            else if(frq[i]>1)repeating = i;
            System.out.println(frq[i]);
        }
        System.out.println(repeating+"<--repeating Ele");
        System.out.println(Missing);
    }
}
