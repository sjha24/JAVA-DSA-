import java.util.Scanner;

public class productArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int product = 1;
        for(int i = 0; i<arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
