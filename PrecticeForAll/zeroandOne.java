import java.util.Scanner;

public class zeroandOne{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Zero_one(arr);
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Zero_one(int[]arr){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(i<count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

    }
}