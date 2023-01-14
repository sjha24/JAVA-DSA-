import java.util.Scanner;

// package checkChar;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        checkChar(arr);
    }
    public static void checkChar(int arr[]){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                arr[i] = 1;
            }else if(arr[i] == 0){
                arr[i] = 0;
            }else{
                arr[i] = -1;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}