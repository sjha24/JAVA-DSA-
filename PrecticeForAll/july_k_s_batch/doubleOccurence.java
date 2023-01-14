import java.util.Scanner;
//not correct
public class doubleOccurence{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int arr2[] = new int[n];
        for(int i = 0; i<n; i++){
            arr2[i] = scn.nextInt();
        }
        for(int i = 0; i<n; i++){
            boolean result = isAvilabel(arr1, arr2[i]);
            if(result==true){
                int count = getOccurencr(arr2, arr2[i],i);
                if(count>1){
                    System.out.println(count+" <-- "+arr1[i]);
                    int val = arr2[i];
                    // System.out.print(val+" ");
                }
            }
        }
    }
    public static boolean isAvilabel(int arr1[], int target){
        for(int i = 0; i<arr1.length;i++){
            if(arr1[i] == target)return true;
        }
        return false;
    }
    public static int getOccurencr(int arr2[],int target,int left){
        int count = 0;
        for(int i = left; i<arr2.length; i++){
            if(arr2[i]==target){
                count++;
            }
        }
        return count;
    }
}