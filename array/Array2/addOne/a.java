import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int res[] = addOneInArr(arr);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] addOneInArr(int arr[]){
        int i;
        for(i = arr.length -1; i>=0 && arr[i]==9 ; i--){
            arr[i] = 0;
        }
        if(i == -1){
            int res[] = new int[arr.length+1];
            res[0]++;
            return res;
        }
        arr[i]++;
        return arr;
    }
}
