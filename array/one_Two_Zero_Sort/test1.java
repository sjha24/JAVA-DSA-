import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        reverseArr(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArr(int[]arr){
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0;i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int j = 0 ; j<count0; j++){
            arr[j] = 0;
            j++;
        }
        for(int j = 0; j<count1; j++){
            arr[j] = 1;
            j++;
        }
        for(int j = 0; j<count2; j++){
            arr[j] = 2;
            j++;
        }
    }
}