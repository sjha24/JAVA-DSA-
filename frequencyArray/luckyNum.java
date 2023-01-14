import java.util.Scanner;

public class luckyNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size; i++){
            arr[i] = scn.nextInt();
        }
        int[] freq = freQuecncyArr(arr);
        System.out.println(luckyInteger(freq));
    }
    public static int[] freQuecncyArr(int[]arr){
        int[] freq = new int[arr.length+1];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<= arr.length)
            freq[arr[i]]++;
        }
        return freq;
    }
    public static int luckyInteger(int[] freq){
        for(int i = freq.length-1;i>0; i--){
            if(freq[i] == i){
                return i;
            }
        }
        return -1;
    }
}