import java.util.Scanner;

// package prefix_sufix_Arr;

public class storeMaxi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(storeWater(arr));
    }
    public static int storeWater(int myHeight[]){
        int N = myHeight.length;
        int prefix[] = new int[N];
        prefix[0] = myHeight[0];
        for(int i = 1; i<myHeight.length; i++){
            prefix[i] = Math.max(myHeight[i], prefix[i-1]);
        }
        int sufix[] = new int[N];
        sufix[N-1] = myHeight[N-1];
        for(int i = N-2; i>=0; i--){
            sufix[i] = Math.max(myHeight[i], sufix[i+1]);
        }
        int MaxStorewater = 0;
        for(int i = 0;i<myHeight.length; i++){
            MaxStorewater = MaxStorewater + Math.min(prefix[i], sufix[i])-myHeight[i];
        }
        return MaxStorewater;
    }
}
