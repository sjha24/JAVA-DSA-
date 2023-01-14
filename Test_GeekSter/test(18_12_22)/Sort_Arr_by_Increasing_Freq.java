import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Sort_Arr_by_Increasing_Freq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int ans[] = Sort_Arr_by_Increasing_Frequency(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] Sort_Arr_by_Increasing_Frequency(int arr[]){
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = arr.length;
        
        for(int i = 0 ;i<n;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i]) + 1);
            }
            else{
                hash.put(arr[i],1);
            }
        }
        Integer[] sort = new Integer[n];
        for(int i =0;i<n;i++){
            sort[i] = arr[i];
        }
        Arrays.sort(sort,new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                if(hash.get(a)==hash.get(b)){
                    return b.compareTo(a);
                }
                return hash.get(a) - hash.get(b);
            }
        });
        for(int i = 0 ;i< n;i++)
            arr[i] = sort[i];
        return arr;
    }
}