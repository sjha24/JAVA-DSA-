import java.util.Scanner;

// package mergeTwoSortedArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        int res[] = merge(arr1,arr2);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] merge(int arr1[], int arr2[]){
        int res[] = new int[arr1.length + arr2.length];
        int first = 0, second = 0, resultant = 0;
        while(first<arr1.length && second<arr2.length){
            if(arr1[first]<arr2[second]){
                res[resultant] = arr1[first];
                first++;
                resultant++;
            }else{
                res[resultant] = arr2[second];
                second++;
                resultant++;
            }
        }
        while(first<arr1.length){
            res[resultant] = arr1[first];
            first++;
            resultant++;
        }
        while(second<arr2.length){
            res[resultant] = arr2[second];
            second++;
            resultant++;
        }
        return res;
    }
}
