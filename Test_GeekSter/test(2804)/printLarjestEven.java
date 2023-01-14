import java.util.Scanner;

public class printLarjestEven {
    public static Scanner Scn = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = checkPrime(arr);
        System.out.print(ans);
    }

    public static int checkPrime(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                 max=arr[i];
            }             
        }
        if(max%2==1) 
        {
            return -1;
        }
        return max;
    }
}