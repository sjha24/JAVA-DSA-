import java.util.Scanner;

public class addOne{
    public static Scanner Scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = Scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ;i<arr.length; i++){
            arr[i] = Scn.nextInt();
        }
        int[] res = AddOne(arr);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] AddOne(int[] arr){
        int i;
        for(i = arr.length-1;i>=0 && arr[i]==9;i--){
            arr[i] = 0;
        }
        if(i == -1){
            int[]res = new int[arr.length+1];
            res[0] = 1;
            return res;
        }
        arr[i]++;
        return arr;
    }
}