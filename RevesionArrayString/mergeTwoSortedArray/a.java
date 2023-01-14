import java.util.Scanner;

// package mergeTwoSortedArray;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr1[] = new int[N];
        for(int i = 0; i<arr1.length;i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int arr2[] = new int[m];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int res[] = mergeTwoArray(arr1, arr2);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] mergeTwoArray(int arr1[], int arr2[]){
        int res[] = new int[arr1.length + arr2.length];
        int left = 0;
        int right = 0;
        int resultant = 0;
        while(left<arr1.length && right<arr2.length){
            if(arr1[left]<=arr2[right]){
                res[resultant] = arr1[left];
                left++;
                resultant++;
            }else{
                res[resultant] = arr2[right];
                right++;
                resultant++;
            }
        }
        while(left<arr1.length){
            res[resultant] = arr1[left];
            left++;resultant++;
        }
        while(right<arr2.length){
            res[resultant] = arr2[right];
            right++;resultant++;
        }
        return res;
    }
}
