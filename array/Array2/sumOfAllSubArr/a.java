import java.util.Scanner;

// package sumOfAllSubArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        sumOfSubArr(arr);
    }
    public static void sumOfSubArr(int arr[]){
        for(int st = 0; st<arr.length; st++){
            int sum = 0;
            for(int end = st; end<arr.length; end++){
                sum = sum+arr[end];
                System.out.print(sum+" ");
            }
        }
    }
}
