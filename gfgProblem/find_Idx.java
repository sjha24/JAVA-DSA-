import java.util.Scanner;

public class find_Idx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        int ans[] = findIndex(arr, n, key);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] findIndex(int arr[], int n, int key) {
        int res[] = new int[2];
        // int left = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                res[0] = i;
                // left = i;
                break;
            }else{
                res[0] = -1;
            }
        }
        // int right = left;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]==key){
                res[1] = i;
                // right = i;
                break;
            }else{
                res[1] = -1;
            }
        }
        // res[0] = left;
        // res[1] = right;
        return res;
    }
}
