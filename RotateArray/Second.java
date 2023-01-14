import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter Num of rotation-->");
        int k = scn.nextInt();
        k = k % size;
        for(int i = 0; i<k; i++){
            Rotate_arr(arr);

        }
        //print--
       
        for(int i = 0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rotate_arr(int[]arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
