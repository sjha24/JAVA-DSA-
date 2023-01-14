import java.util.Scanner;

public class mergeTwoSortedArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a1[] = new int[n];
        for(int i = 0; i<n; i++){
            a1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int a2[] = new int[m];
        for(int i = 0; i<m; i++){
            a2[i] = scn.nextInt();
        }
        mergeTwoSortedArray(a1, a2);
    }
    public static void mergeTwoSortedArray(int a1[], int a2[]){
        int ans[] = new int[a1.length+a2.length];
        int left = 0, right = 0,r = 0;
        while(left<a1.length && right<a2.length){
            if(a1[left]<a2[right]){
                ans[r] = a1[left];
                left++;r++;
            }else{
                ans[r] = a2[right];
                right++;r++;
            }
        }
        while(left<a1.length){
            ans[r] = a1[left];
            left++;r++;
        }
        while(right<a2.length){
            ans[r] = a2[right];
            right++;r++;
        }
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
