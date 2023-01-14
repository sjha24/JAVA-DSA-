import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class maxArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int val = scn.nextInt();
            arr.add(val);
        }
        System.out.println(maxVal(arr));
    }
    public static int maxVal(ArrayList<Integer>arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }
        return max;
    }
}
