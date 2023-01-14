import java.util.Scanner;

public class maxNumConsecutive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1)count++;
            else count= 0;
        }
        System.out.println(count);
    }
}
