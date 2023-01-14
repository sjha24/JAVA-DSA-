import java.util.Scanner;

public class maxProductSubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        maxProduct(arr);
    }
    public static void maxProduct(int arr[]){
        int maxPro = Integer.MIN_VALUE;
        for(int st = 0; st<arr.length; st++){
            int product = 1;
            for(int end = st; end<arr.length;end++){
                product = product * arr[end];
                maxPro = Math.max(maxPro, product);
            }
        }
        System.out.println(maxPro);
    }
}
