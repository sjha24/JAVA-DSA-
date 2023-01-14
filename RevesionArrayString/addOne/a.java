import java.util.Scanner;

// pacage addOne;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        AddOne(arr);
       
    }
    public static void AddOne(int arr[]){
        int i = arr.length-1;
        while(i>=0){
            if(arr[i]==9)arr[i] = 0;
            else{
                arr[i]++;
                break;
            }
            i--;
        }
        if(i==-1){
            arr = new int[arr.length +1];
            arr[0] = 1;
        }
        for(int idx = 0; idx<arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }
    }
}
