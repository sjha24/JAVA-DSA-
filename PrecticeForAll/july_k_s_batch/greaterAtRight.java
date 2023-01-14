import java.util.Scanner;

public class greaterAtRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = printGraterThanMe(arr, arr[i],i);
            ans[i] = count;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int printGraterThanMe(int arr[], int target,int left) {
        int count = 0;
        for (int i = left+1; i < arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }
        return count;
    }
}