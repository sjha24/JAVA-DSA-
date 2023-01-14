import java.util.Scanner;

public class maxProSubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int maxProduct = Integer.MIN_VALUE;
        for(int st = 0; st<n; st++){
            int product = 1;
            for(int end = st; end<n; end++){
                product = product*arr[end];
                if(product>maxProduct)maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }
}
