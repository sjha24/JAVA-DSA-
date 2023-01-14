import java.util.Scanner;

public class equlibrium {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        prefiSufixSum(arr);
    }

    public static void prefiSufixSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int prefixSum = 0;
            for (int j = i - 1; j >= 0; j--) {
                prefixSum += arr[j];
            }
            int sufixSum = 0;
            for(int j = i + 1; j<arr.length; j++){
                sufixSum += arr[j];
            }
            if(prefixSum == sufixSum){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
