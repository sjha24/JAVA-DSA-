import java.util.Scanner;

public class ProductofElementsExceptItself {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans[] = ProductofElementsExceptItsIdx(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] ProductofElementsExceptItsIdx(int arr[]){
        int product = 1;
        int cnt = 0;
        int idx = 0;
        int ans[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] !=0 ){
                product *= arr[i];
            }else{
                cnt++;
                idx=i;
            }
            if(cnt>1){
                return ans;
            }
        }
        if(cnt==1){
            ans[idx] = product;
            return ans;
        }
        for(int i = 0; i<arr.length; i++){
            ans[i] = product / arr[i];
        }
        return ans;
    }
}
