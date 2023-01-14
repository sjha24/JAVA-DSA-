import java.util.Scanner;

public class CheckCharacterstic{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        checkCharacterstic(arr);
    }
    public  static void checkCharacterstic(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                arr[i] = 1;
            }else if(arr[i]==0){
                arr[i] = 0;
            }else if(arr[i]<0){
                arr[i] = -1;
            }
            System.out.print(arr[i]+" ");
        }
    } 
}